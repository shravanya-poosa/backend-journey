package expression_calculator;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepCalculating = true;
        ArrayList<String> history = new ArrayList<>();

        while (keepCalculating) {
            try {
                System.out.println("\nPress 1 to Solve an Expression (e.g., 2+3*4-1), 2 to Exit, 3 for History:");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter your expression: ");
                        String expression = input.next();

                        String[] pieces = expression.split("(?=[-+*/])|(?<=[-+*/])");
                        ArrayList<String> list = new ArrayList<>(Arrays.asList(pieces));

                        for (int i = 0; i < list.size(); i++) {
                            String current = list.get(i);

                            if (current.equals("*") || current.equals("/")) {
                                int num1 = Integer.parseInt(list.get(i - 1));
                                int num2 = Integer.parseInt(list.get(i + 1));
                                int result = 0;

                                if (current.equals("*")) {
                                    result = num1 * num2;
                                } else {
                                    result = num1 / num2;
                                }

                                list.set(i - 1, String.valueOf(result));
                                list.remove(i + 1);
                                list.remove(i);
                                i--;
                            }
                        }

                        int total = Integer.parseInt(list.get(0));
                        for (int i = 1; i < list.size(); i++) {
                            String current = list.get(i);

                            if (current.equals("+")) {
                                total = total + Integer.parseInt(list.get(i + 1));
                                i++;
                            } else if (current.equals("-")) {
                                total = total - Integer.parseInt(list.get(i + 1));
                                i++;
                            }
                        }

                        System.out.println("Your total is: " + total);
                        history.add(expression + " = " + total);
                        break;

                    case 2:
                        keepCalculating = false;
                        System.out.println("You chose to exit ");
                        break;

                    case 3:
                        System.out.println("Here's your history ");
                        for (String page : history) {
                            System.out.println(page);
                        }
                        break;

                    default:
                        System.out.println("Error: You can only choose between 1, 2, and 3 ");
                }

            } catch (InputMismatchException e) {
                System.out.println("You are allowed to only enter valid numbers or options.");
                input.next();
            } catch (Exception e) {
                System.out.println("Error: Invalid mathematical expression.");
            }
        }

        input.close();
    }
}


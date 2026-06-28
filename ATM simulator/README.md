# Java ATM Simulator

A console-based ATM simulator built in Java, featuring PIN verification, balance management, and menu-driven banking operations.

## Features
- PIN-based access control before allowing any account operations
- Check balance, deposit, and withdraw funds
- Balance persists correctly across multiple operations in a session
- Insufficient balance handling during withdrawals
- Input validation with exception handling for invalid menu choices

## How it works
- PIN is verified once at the start of the program
- A menu-driven loop lets the user repeatedly choose between checking balance, depositing, withdrawing, or exiting
- Deposit and withdraw operations are handled by separate static methods that return updated balance values
- The withdraw method returns a String to handle both successful transactions and an "insufficient balance" case

## How to run
javac Main.java
java Main

## What I learned
- Calling methods across multiple classes, passing arguments, and using return values correctly
- Managing state (balance) that persists correctly across a loop
- String comparison using .equals() instead of == for text values
- Structuring nested if/while/switch/try-catch blocks correctly
- Why methods need a single, consistent return type, and how to work around needing multiple possible outcomes (numbers vs. messages)

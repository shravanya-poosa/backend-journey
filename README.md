# Java Expression Calculator

A console-based calculator built in Java that evaluates full mathematical expressions 
(e.g., `2+3*4-1`) with correct operator precedence, built to practice core Java logic, 
string parsing, and exception handling.

## Features
- Evaluates multi-operator expressions with proper precedence (multiplication/division 
  resolved before addition/subtraction)
- Calculation history tracking within a session
- Input validation with custom error handling for invalid expressions and non-numeric input
- Menu-driven loop for repeated calculations without restarting the program

## How it works
- Splits the input expression into numbers and operators using regex
- First pass resolves all `*` and `/` operations
- Second pass resolves remaining `+` and `-` operations
- Results are parsed back into a running total

## How to run
javac Main.java
java Main

## What I learned
- How switch-case fall-through works (and the bug it causes when you forget `break`)
- Using regex lookahead/lookbehind to split a string while keeping the delimiters
- Structuring exception handling for both input-type errors and logic errors separately


# Currency Converter – Project Explanation

## Overview

The Currency Converter is a simple Java-based console application that allows users to convert money between different currencies. The program provides a menu-driven interface where users can choose a conversion type, enter an amount, and receive the converted value instantly. It supports conversions between **USD (US Dollar), INR (Indian Rupee), and EUR (Euro)** using predefined exchange rates.

The main objective of this project is to demonstrate how Java can be used to build interactive applications that process user input, perform calculations, and handle errors efficiently. This project helps beginners understand the fundamentals of Java programming and real-world application development.

---

## Working of the Project

1. The program displays a menu containing available currency conversion options.
2. The user selects a choice from the menu.
3. The program validates the entered choice.
4. If the choice is invalid, an exception is generated and an error message is displayed.
5. If the choice is valid, the user enters the amount to be converted.
6. The program performs the required currency conversion using predefined exchange rates.
7. The converted amount is displayed to the user.
8. If the user selects Exit, the program terminates.

---

## Concepts Used

### 1. Classes and Objects

The program is written inside a class named `CurrencyConverter`. Classes are the basic building blocks of Object-Oriented Programming in Java.

### 2. Main Method

The execution of the program starts from the `main()` method.

```java
public static void main(String args[])
```

### 3. Scanner Class

The Scanner class is used to take input from the user through the keyboard.

```java
Scanner sc = new Scanner(System.in);
```

### 4. Variables

Variables are used to store user choices, currency amounts, and conversion results.

```java
int ch;
double amt, res;
```

### 5. Conditional Statements

The program uses `if` statements to validate user input and control program flow.

```java
if(ch < 1 || ch > 5)
```

### 6. Switch Case

The switch statement helps execute different conversion operations based on the user's selection.

```java
switch(ch)
```

### 7. Arithmetic Operations

Currency conversion is performed using multiplication and division operators.

```java
res = amt * 83.50;
res = amt / 83.50;
```

### 8. Exception Handling

The program uses `try-catch` blocks to handle invalid choices and prevent program crashes.

```java
try
{
    // code
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
```

### 9. Throw Keyword

The `throw` statement is used to generate a custom exception when the user enters an invalid menu option.

```java
throw new Exception("Invalid Choice");
```

### 10. Input Validation

The program checks whether the user enters a valid menu option before performing any operation.

---

## Features

* Simple menu-driven interface.
* Supports multiple currency conversions.
* Easy to use and understand.
* Handles invalid menu choices using exception handling.
* Demonstrates real-world use of Java programming concepts.
* Beginner-friendly project for learning Java fundamentals.

---

## Learning Outcomes

By completing this project, you will learn:

* Java program structure
* User input handling
* Variables and data types
* Conditional statements
* Switch-case statements
* Arithmetic calculations
* Exception handling
* Input validation
* Console-based application development

This project serves as a strong foundation for building more advanced financial and utility applications in Java.

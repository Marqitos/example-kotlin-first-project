# Kotlin console example

- My First Project with Kotlin

This project will introduce you to Hyperskill projects.
Practice Kotlin coding to build a program that can automate your account management routine.

## What you'll learn

Once you choose a project, we'll provide you with a study plan that includes all the necessary topics from your course to get it built.
Here’s what awaits you:

## Stage (1/3): Print the prices

- Introduction to Kotlin
- Basic literals: numbers, strings and characters
- Writing first program
- Standard output

## Stage (2/3): Measuring total income

- Values and variables
- Constants and val variables
- Data types
- Arithmetic operations
- Properties of basic types

## Stage (3/3): Calculate net income

- Comments
- Invoking functions
- Standard input with Java Scanner
- Increment and decrement
- Type conversion
- Reading data with readln
- When different types meet: type coercion
- Integers in action

### Theory

This stage is the last stage in this project, which means that when you complete it, you will also complete the project itself.

You have likely already noticed that each stage is provided with examples of how the program should work in the Examples section.
There may be one, two, or even more examples, depending on the complexity of the program.

The program typically operates in a loop since it often requires user input.
It presents some information, retrieves some from the user, and then repeats this process.

In examples, every input is represented by a greater-than symbol followed by a space (`> `).

That said, let's review this example:

```console
What's your name?
> Bob
Hello, Bob!
```

This example demonstrates that the program should initially show the message 'What's your name?' and then request input from the user.
Upon receiving the response 'Bob', the program will display the final message 'Hello, Bob!'.

### Description

In the final stage, let's calculate the shop's net income.
To do this, you need to retrieve staff and other expenses from the user input and subtract them from the income you calculated in the previous stage.

You don't need to change the previous functionality of your program, but rather expand it by adding both inputs and calculating the net income.

### Objectives

In this stage, your program should:

1. Print the item names, what you earned for each of them, and total earnings as before.
2. Ask users for staff expenses with the `Staff expenses:` string and for other expenses with the `Other expenses:` string.
3. Calculate and print the net income as shown below. Replace `0.0` with the actual net income:

```console
Net income: $0.0
```

### Examples

The greater-than symbol followed by a space (`> `) represents the user input.
Note that it's not part of the input: It is just used to separate the user input from the output of your program in the stage examples.
You don't need to print the `>` sign!

**Example 1:** the user inputs 2000 for staff expenses and 205 for other expenses accordingly:

```console
Earned amount:
Bubblegum: $202
Toffee: $118
Ice cream: $2250
Milk chocolate: $1680
Doughnut: $1075
Pancake: $80

Income: $5405

Staff expenses:
> 2000
Other expenses:
> 205
Net income: $3200
```

**Example 2:** the user inputs 5203 for staff expenses and 400 for other expenses accordingly:

```console
Earned amount:
Bubblegum: $202
Toffee: $118
Ice cream: $2250
Milk chocolate: $1680
Doughnut: $1075
Pancake: $80

Income: $5405
Staff expenses:
> 5203
Other expenses:
> 400
Net income: $-198
```

# Assignment 5 — Strategy Pattern

## Project Information

* **Course:** Software Design Patterns
* **Assignment:** #5 — Strategy Pattern
* **Language:** Java
* **JDK Version:** 17
* **IDE:** IntelliJ IDEA

## Project Description

This project demonstrates the Strategy design pattern using a simple calculator.

The Strategy pattern is a behavioral design pattern that allows an algorithm to be selected and changed at runtime. Instead of using conditional statements to perform different mathematical operations, the calculator delegates the operation to a strategy object.

## Implemented Strategies

The project includes three mathematical operations:

* **AddStrategy** — adds two numbers.
* **SubtractStrategy** — subtracts the second number from the first.
* **MultiplyStrategy** — multiplies two numbers.

All strategies implement the common `OperationStrategy` interface.

## Project Structure

```text
Assignment5_StrategyPattern/
├── src/
│   └── strategy/
│       ├── OperationStrategy.java
│       ├── AddStrategy.java
│       ├── SubtractStrategy.java
│       ├── MultiplyStrategy.java
│       ├── Calculator.java
│       └── Main.java
└── README.md
```

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is configured.
3. Open `Main.java`.
4. Run the `main()` method.
5. Check the output in the Run console.

### Expected Output

```text
Addition: 25.0
Subtraction: 15.0
Multiplication: 100.0
```

## Design Pattern Components

### 1. Strategy Interface

`OperationStrategy` defines the common `execute()` method for all mathematical operations.

### 2. Concrete Strategies

`AddStrategy`, `SubtractStrategy`, and `MultiplyStrategy` implement different mathematical algorithms.

### 3. Context

`Calculator` stores a reference to an `OperationStrategy` object and delegates calculations to it. The `setStrategy()` method allows the strategy to be changed at runtime.

### 4. Client

`Main` creates the calculator, selects strategies, and demonstrates switching between operations.

## Clean Code Principles

The project applies the following principles:

1. **Meaningful Names:** Class and method names clearly describe their purpose.
2. **Single Responsibility Principle:** Each strategy implements only one mathematical operation.
3. **Polymorphism:** All strategies implement the same interface.
4. **Encapsulation:** Each operation's implementation is contained in its own class.
5. **Open/Closed Principle:** New operations can be added by implementing `OperationStrategy` without modifying the existing strategy classes or the `Calculator` class.

## Adding a New Strategy

To add a new mathematical operation:

1. Create a new class implementing `OperationStrategy`.
2. Implement the `execute()` method.
3. Pass an instance of the new class to the calculator or use `setStrategy()` to switch to it.

For example, a division strategy can be added without modifying the existing addition, subtraction, or multiplication strategies.

## Strategy vs. State

The Strategy pattern allows the client to choose between interchangeable algorithms. In this project, the client selects a mathematical operation.

The State pattern, in contrast, changes an object's behavior depending on its internal state. Since the calculator switches between algorithms selected by the client rather than reacting to internal state transitions, the Strategy pattern is appropriate.

## Conclusion

This project demonstrates how the Strategy pattern makes code more flexible and easier to extend. Each mathematical operation is implemented in a separate class, and the calculator can switch between operations at runtime without using conditional statements to select an algorithm.



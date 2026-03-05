# Java Playground

A repository dedicated to refining Java programming skills with a focus on clean code principles, software architecture, logic optimization, and test automation strategies.

## Project Overview

### 1. OOP Calculator Engine
**Architecture:** Strategy Design Pattern
**Status:** Completed

A modular, extensible calculator application designed to demonstrate enterprise-level software architecture. This project refactors traditional procedural logic into a decoupled object-oriented model.

**Key Technical Implementations:**
* **Strategy Design Pattern:** Utilizes the `MathOperation` interface to decouple operation logic from the execution engine, allowing for runtime algorithm selection.
* **SOLID Principles:** Strictly adheres to the **Open/Closed Principle**; new operations can be integrated without modifying the core `CalculatorEngine` class.
* **Robust Unit Testing:** Features a comprehensive test suite using **JUnit 5**, implementing the **AAA (Arrange, Act, Assert)** pattern and covering edge cases such as division by zero.
* **Error Handling:** Implements precise exception handling to ensure application stability during invalid inputs.

### 2. FizzBuzz Refactored
**Focus:** Logic Optimization
**Status:** Completed

An optimized implementation of the classic FizzBuzz algorithmic problem. This solution addresses common performance and readability pitfalls found in naive implementations.

**Key Technical Implementations:**
* **Complexity Reduction:** Replaces nested conditional structures (`if-else` hell) with streamlined string concatenation logic.
* **Maintainability:** structured to allow easy modification of conditions without rewriting the core loop.
* **Code Standards:** Follows strict Java naming conventions and clean code practices.

## Technologies Used

* **Language:** Java Development Kit (JDK) 21
* **Build Tool:** Maven
* **Testing Framework:** JUnit 5 (Jupiter)
* **IDE:** IntelliJ IDEA
* **Version Control:** Git

## Getting Started

### Prerequisites
* Java 21 or higher installed.
* Maven installed (optional, if running via IDE).

### Installation & Execution
1.  Clone the repository to your local machine.
2.  Open the project directory in **IntelliJ IDEA**.
3.  **To run the Calculator:** Navigate to `com.bahaa.calculator.MainApp` and execute the main method.
4.  **To run Tests:** Right-click on `CalculatorEngineTest` and select "Run".

---
**Author:** Bahaa Essam

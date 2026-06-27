# Decorator Design Pattern in Java

This repository provides a classic implementation of the **Decorator Design Pattern** in Java. The Decorator pattern is a structural pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class.

[![Java](https://img.shields.io/badge/Language-Java-blue.svg?style=for-the-badge&logo=java)](https://www.java.com)
[![Pattern](https://img.shields.io/badge/Pattern-Structural-green.svg?style=for-the-badge)]()

---

## 🎯 What is the Decorator Pattern?

The Decorator pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality. It follows the **Open/Closed Principle**, meaning classes should be open for extension but closed for modification.

### The Problem It Solves

Imagine you have a class and you want to add new features to it. You could use inheritance, but this can lead to a large number of subclasses, especially if you need to combine features in various ways (e.g., Coffee with Milk, Coffee with Sugar, Coffee with Milk and Sugar). This "class explosion" makes the design rigid and hard to manage.

### The Solution

The Decorator pattern solves this by using composition instead of inheritance. You "wrap" a core object with one or more decorator objects.

1.  **Component:** The abstract interface for objects that can be decorated.
2.  **ConcreteComponent:** The core object we want to decorate. It implements the `Component` interface.
3.  **Decorator:** An abstract class that also implements the `Component` interface. It contains a reference to a `Component` object (the object it wraps).
4.  **ConcreteDecorator:** Implements the `Decorator`. It adds new responsibilities to the component it is decorating.

---

## 📂 Project Structure

This project demonstrates the pattern using the famous **Starbuzz Coffee** example. We have different types of beverages, and we want to add condiments (like milk, mocha, whip) to them.

```
src
├── Beverage.java             // The abstract Component.
├── Espresso.java             // A ConcreteComponent.
├── HouseBlend.java           // Another ConcreteComponent.
├── CondimentDecorator.java   // The abstract Decorator.
├── Milk.java                 // A ConcreteDecorator.
├── Mocha.java                // Another ConcreteDecorator.
├── Whip.java                 // Another ConcreteDecorator.
└── StarbuzzCoffee.java       // The Main/Client class to test the implementation.
```

### How It Works

- Both `Beverage` (the component) and `CondimentDecorator` (the decorator) share the same supertype, `Beverage`.
- A decorator holds a reference to the `Beverage` it is wrapping.
- When we request the cost or description, the decorator adds its own contribution and then delegates the call to the `Beverage` it wraps.
- This allows us to chain decorators together (e.g., wrapping a `HouseBlend` in `Mocha`, and then wrapping that in `Whip`).

---

## 🚀 How to Run

1.  **Clone the repository (if it's on GitHub):**

    ```bash
    git clone https://github.com/nouran-Omar/Decorator-Design-Pattern.git
    cd Decorator-Design-Pattern
    ```

2.  **Navigate to the source directory:**

    ```bash
    cd src
    ```

3.  **Compile all Java files:**

    ```bash
    javac *.java
    ```

4.  **Run the `StarbuzzCoffee` class:**
    ```bash
    java StarbuzzCoffee
    ```

### Expected Output

The output will show the description and total cost for each decorated beverage, demonstrating how the costs and descriptions are combined dynamically.

```
Espresso $1.99

House Blend Coffee, Mocha, Whip $1.44

House Blend Coffee, Mocha, Mocha, Whip $1.64
```

---

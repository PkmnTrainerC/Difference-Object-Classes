
Week 1 Discussion

# Difference-Objects-Classes

## Definitions 

In Java, a **class** is a blueprint that describes a set of objects—what *data* they hold and what *behaviors* (methods) they can perform. It is a static description that exists in source code and bytecode; by itself, a class does nothing until the program creates objects from it. Classes can encapsulate state via instance fields, share behavior and constants via `static` members, define constructors to control initialization, and act as types in variable declarations and method signatures (Oracle, 2025).

An **object** is a concrete runtime entity created from a class using `new`. Each object has its own copy of the class’s instance fields (state) and a unique identity/address in memory, even when two objects share the same field values. Objects respond to messages (method calls), maintain invariants across method executions, and participate in relationships such as composition, inheritance (through their class), and polymorphism at runtime (Bloch, 2018).

**Conceptual differences:**

- **Blueprint vs. instance:** A class specifies *what objects of that type are like*; an object is a realized instance with live state.
- **Static vs. dynamic:** Class definitions are loaded once; objects are created and garbage‑collected over time.
- **Shared vs. per‑instance members:** `static` fields and methods belong to the class itself; non‑static fields belong to each object.
- **Type vs. value:** The class provides the type checked by the compiler; an object is a value manipulated at runtime via references.
- **Reusability vs. variability:** The class captures reusable behavior; objects capture variable state and identity.

This repository contains a tiny program that demonstrates those differences by defining a `Car` class (the blueprint) and constructing multiple `Car` objects with distinct states. The program shows how changing one object’s fields does not affect another, how `static` members are shared, and how each object has a unique identity (`System.identityHashCode`).

## How to compile & run

Using `javac` and `java`:

```bash
cd Difference-Objects-Classes/src
javac Main.java Car.java
java Main
```

### Expected sample output

```
Cars built: 2
Car a -> make=Honda, model=Civic, year=2018, miles=50000
Car b -> make=Toyota, model=Corolla, year=2020, miles=25000
After driving car a...
Car a miles: 50050
Car b miles: 25000
Identity a != b: true
```

## References 

Bloch, J. (2018). *Effective Java* (3rd ed.). Addison‑Wesley.

Oracle. (2025). *Classes and objects (The Java® Tutorials)*. https://docs.oracle.com/javase/tutorial/java/javaOO/

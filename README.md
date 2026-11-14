# Campus Cafe Inventory Management

A beginner-friendly Java console application to manage cafe inventory. It supports adding products, displaying products, calculating stock value and average price, restocking products, and duplicating products.

## Questions and Answers

### 1. What did you predict for Warmup.java, and what did it actually print? Explain the lines that surprised you.

I predicted that the program would print the values after type conversion and execute only the matching switch case. However, the actual output was `7 5.0 -126`, followed by `Two` and `Three`. The surprising part was that converting 130 to a byte resulted in -126 because of narrowing conversion, and the switch printed both "Two" and "Three" because there was no `break` statement.

### 2. What is the difference between the static variable totalProducts and the instance variable name?

The `static` variable `totalProducts` belongs to the class, so it is shared by all Product objects. The instance variable `name` belongs to each individual object, meaning every product can have its own name.

### 3. What does the copy constructor do, and why does changing p2.name not change p1.name?

A copy constructor creates a new object by copying the values of an existing object. When `p2` is created from `p1`, it gets its own `name` field, so changing `p2.name` does not affect `p1.name`.

### 4. Why does Java force you to write (int) average when converting a double to an int, and what happens to the decimal part?

Java requires an explicit cast `(int)` because converting a `double` to an `int` may lose information. The decimal part is truncated, not rounded, so for example, converting `12.75` to an integer gives `12`.

## Technologies Used

- Java
- Standard JDK
- `java.util.Scanner`

## How to Compile and Run

Compile the Java files:

```bash
javac Product.java Main.java Warmup.java
```

Run the inventory application:

```bash
java Main
```

Run the warmup program:

```bash
java Warmup
```

# 🧮 Magic Squares (Java)

A simple Java program that constructs and verifies **Magic Squares** — square matrices in which the sum of every row, column, and diagonal equals the same constant.

---

## 📂 Project Structure
```
Magic-Squares-main/
└── MagicSquare.java
```

---

## 🧩 Overview
The `MagicSquare` class enables users to:
- 🧠 Create an *n × n* magic square.
- ➕ Insert numbers sequentially in row-major order.
- ⚖️ Automatically compute the *magic constant* each row, column, and diagonal should equal.
- ✅ Verify if the square is truly “magic,” meaning all rows, columns, and diagonals sum to the same total.

---

## 🧠 Core Class: `MagicSquare`

### Constructor
```java
public MagicSquare(int n)
```
Creates an empty *n × n* magic square.

### Methods
| Method | Description |
|--------|--------------|
| `void add(int x)` | Inserts `x` into the next available cell (row-major order). |
| `boolean isMagical()` | Checks if the square satisfies the magic square condition. |
| `String toString()` | Returns a formatted string representation of the square. |

### Helper Methods
- `getConstant()` — Calculates the theoretical magic constant.  
- `isMagicalRows()` / `isMagicalColumns()` / `isMagicalDiagonals()` — Validate each dimension individually.

---

## 🧪 Example Usage
```java
public class Main {
    public static void main(String[] args) {
        MagicSquare square = new MagicSquare(3);

        // Fill the 3x3 magic square
        int[] values = {8, 1, 6, 3, 5, 7, 4, 9, 2};
        for (int v : values) {
            square.add(v);
        }

        System.out.println(square);
        System.out.println("Is magic? " + square.isMagical());
    }
}
```

### Sample Output
```
8 1 6
3 5 7
4 9 2
Is magic? true
```

---

## ⚙️ How to Run

1. Ensure **Java (JDK 8+)** is installed.  
2. Save both `MagicSquare.java` and (optionally) `Main.java` in the same folder.  
3. Compile and run:
   ```bash
   javac MagicSquare.java Main.java
   java Main
   ```

---

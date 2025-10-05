Magic Squares (Java)

A simple Java program that constructs and verifies Magic Squares — square matrices in which the sum of every row, column, and diagonal equals the same constant.

📂 Project Structure
Magic-Squares-main/
└── MagicSquare.java

🧩 Overview

The MagicSquare class allows you to:

Create an n × n magic square.

Insert numbers in row-major order.

Automatically calculate the magic constant each row, column, and diagonal should equal.

Verify if the square is indeed “magic” — that is, if all rows, columns, and diagonals sum to the same value.

🧠 Core Class: MagicSquare
Constructor
public MagicSquare(int n)


Creates an empty n × n square.

Methods
Method	Description
void add(int x)	Inserts x in the next available position (row-major order).
boolean isMagical()	Checks if the square is a valid magic square.
String toString()	Returns a readable string representation of the square.

The class also includes helper methods:

getConstant() — Calculates the theoretical magic constant.

isMagicalRows(), isMagicalColumns(), isMagicalDiagonals() — Validate rows, columns, and diagonals individually.

🧪 Example Usage
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

Output
8 1 6
3 5 7
4 9 2
Is magic? true

⚙️ How to Run

Ensure Java (JDK 8+) is installed.

Save MagicSquare.java and (optionally) Main.java in the same folder.

Compile and run:

javac MagicSquare.java Main.java

java Main

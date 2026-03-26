// =============================================
// CHECKED vs UNCHECKED EXCEPTION
// =============================================

// 🔹 Definition:
// Java exceptions are divided into 2 types:

// 1. Checked Exceptions (Compile-time)
// 2. Unchecked Exceptions (Runtime)

// =============================================
// 1️⃣ CHECKED EXCEPTIONS
// =============================================

// 🔹 Definition:
// Exceptions that are checked at COMPILE TIME

// 👉 Compiler forces you to handle them

// =============================================
// 🔹 EXAMPLES
// =============================================

// IOException
// SQLException
// FileNotFoundException
// ClassNotFoundException

// =============================================
// 🔹 CODE EXAMPLE
// =============================================

import java.io.*;

public class EH03 {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt"); // ❗ Checked Exception
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

// 👉 If you DON'T handle → COMPILE ERROR

// =============================================
// 🔹 ALTERNATIVE (throws)
// =============================================


/* 
class Demo {
    void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
    }
}
*/

// =============================================
// 🔹 WHY USED?
// =============================================

// ✔ Forces developer to handle risky operations
// ✔ Used for external resources (file, DB, network)

// =============================================
// 2️⃣ UNCHECKED EXCEPTIONS
// =============================================

// 🔹 Definition:
// Exceptions that occur at RUNTIME

// 👉 Compiler does NOT force handling

// =============================================
// 🔹 EXAMPLES
// =============================================

// ArithmeticException
// NullPointerException
// ArrayIndexOutOfBoundsException
// NumberFormatException

// =============================================
// 🔹 CODE EXAMPLE
// =============================================

/* 
public class EH03 {
    public static void main(String[] args) {

        int a = 10 / 0;   // ❗ Runtime error

        System.out.println("This will not run");
    }
}
    */

// 👉 No compile error → crash at runtime

// =============================================
// 🔹 OPTIONAL HANDLING
// =============================================
/* 
public class HandleUnchecked {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Handled runtime error");
        }
    }
}
*/
// =============================================
// 🔹 MAIN DIFFERENCE TABLE
// =============================================

// Feature              Checked              Unchecked
// --------------------------------------------------------
// Time                 Compile-time         Runtime
// Handling             Mandatory            Optional
// Compiler check       Yes                  No
// Example              FileNotFound         NullPointer
// Package              java.io, java.sql    java.lang

// =============================================
// 🔹 HIERARCHY (VERY IMPORTANT)
// =============================================

// Throwable
//   |
//   |-- Exception
//   |     |
//   |     |-- Checked Exceptions
//   |
//   |-- RuntimeException
//         |
//         |-- Unchecked Exceptions

// =============================================
// 🔹 KEY POINT
// =============================================

// ✔ RuntimeException → Unchecked
// ✔ Other Exceptions → Checked

// =============================================
// 🔹 INTERVIEW QUESTIONS
// =============================================

// Q1: Difference?
// 👉 Checked → compile-time
// 👉 Unchecked → runtime

// Q2: Which must be handled?
// 👉 Checked

// Q3: Is RuntimeException checked?
// 👉 NO

// Q4: Can we handle unchecked?
// 👉 YES (optional)

// =============================================
// 🔹 SHORT REVISION
// =============================================

// ✔ Checked → handle compulsory
// ✔ Unchecked → handle optional
// ✔ RuntimeException → unchecked

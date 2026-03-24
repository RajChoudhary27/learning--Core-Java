
public class EH02 {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int x=a/b;
            System.out.println(x);
            int[] arr={1,2,3};
            System.out.println(arr[4]);
        } 
        catch(ArithmeticException x)
        {
            System.out.println("Arithmetic exception occurs...");
        }
        catch(ArrayIndexOutOfBoundsException x)
        {
            System.out.println("Array index out of bound Exception");
        }
        catch (Exception e) {
            System.out.println("Parent most exception class..");
        }
    }    
}

// =============================================
// MULTIPLE CATCH BLOCK IN JAVA
// =============================================

// 🔹 Definition:
// A try block can be followed by multiple catch blocks
// to handle different types of exceptions separately.

// 👉 Simple:
// "Different exception → different catch block"

//=============================================
// 🔹 REAL LIFE ANALOGY
// =============================================

// ATM Machine:
// - Wrong PIN → specific message
// - No balance → different message
// - Server down → general message

// =============================================
// EXCEPTION FLOW IN TRY BLOCK
// =============================================

// 🔹 Statement:
// If an exception occurs in try block,
// then the remaining lines in try block are NOT executed.

// 👉 Simple:
// "Exception aaya → try block turant stop ho jata hai"

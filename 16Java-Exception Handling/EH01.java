public class EH01 {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        int k=0;

        try {
            k=i/j;
            System.out.println("Result :- "+k);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong...");
        }
 System.out.println("Continue..........");
    
    }
}

/*
🔹 1. Exception kya hota hai?
👉 Exception = runtime error (program chalate time aane wali problem)
Example:
int a = 10 / 0;   // ArithmeticException

👉 Program crash ho jata hai ❌

🔹 2. Exception Handling kya hai?
👉
Exception Handling = error ko handle karna taaki program crash na ho
👉 Matlab:
Error aaye ✔️
Program rukna nahi chahiye ✔️

🔹 3. Exception Handling kyu zaroori hai?
👉 Without handling:
Program abruptly terminate ho jata hai
👉 With handling:
Graceful execution hota hai
User-friendly output milta hai
***********************************************************************************
🔹 5. Types of Exceptions
✅ 1. Checked Exception
👉 Compile time pe check hota hai

Examples:
IOException
SQLException
FileReader fr = new FileReader("abc.txt"); // must handle

👉 Handle karna compulsory hai ⚠️

✅ 2. Unchecked Exception (Runtime)
👉 Runtime pe aata hai
Examples:
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException

👉 Handle optional hai

✅ 3. Errors
👉 System related (handle nahi karte)
Example:
OutOfMemoryError
*/

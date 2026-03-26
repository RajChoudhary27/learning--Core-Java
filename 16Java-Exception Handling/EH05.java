class CustomException extends Exception{

    public CustomException(String x)
    {
        super(x);
    }
}
public class EH05 {
    public static void main(String[] args) {
       try {
           int a=0;
           int b=0;
           int c=a/b;
           if(c==0)
           {
            throw new CustomException ("Kuch to gadbad hai...");
           }

       } catch (Exception e) {
        System.out.println(e.getMessage());
       } 
    }
}


// =============================================
// CUSTOM EXCEPTION IN JAVA
// =============================================

// 🔹 Definition:
// Custom Exception = User-defined exception
// (Apni khud ki exception class banana)

// 👉 Simple:
// "Default exceptions enough nahi → apni exception banao"

// =============================================
// 🔹 WHY CUSTOM EXCEPTION?
// =============================================

// ✔ Better error messages
// ✔ Business logic handling
// ✔ Clean & readable code
// ✔ Real-world applications (bank, login, etc.)

// Example:
// - Invalid Age
// - Insufficient Balance
// - Invalid Password

// =============================================
// 🔹 DIFFERENCE (VERY IMPORTANT)
// =============================================

// Checked Custom Exception:
// - extend Exception
// - must handle (try-catch or throws)

// Unchecked Custom Exception:
// - extend RuntimeException
// - optional handling

// =============================================
// 🔹 IMPORTANT POINTS
// =============================================

// ✔ Always extend Exception or RuntimeException
// ✔ Use constructor to pass message
// ✔ Use throw to trigger exception
// ✔ Use try-catch to handle

// =============================================
// 🔹 INTERVIEW QUESTIONS
// =============================================

// Q1: What is custom exception?
// 👉 User-defined exception

// Q2: How to create?
// 👉 Extend Exception or RuntimeException

// Q3: Difference?
// 👉 Checked vs Unchecked same as normal

// Q4: Why use?
// 👉 Business logic clarity

// =============================================
// 🔹 SHORT REVISION
// =============================================

// ✔ Create class
// ✔ Extend Exception / RuntimeException
// ✔ Constructor with message
// ✔ throw to use
// ✔ catch to handle
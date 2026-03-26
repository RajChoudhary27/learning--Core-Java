public class EH04 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        try {
            int x=a/b;
            if(x==0)
                throw new Exception("i dont want answer 0..");
        } catch (Exception e) {
            System.out.println("System genereted message..."+e);
        }
    }
}


// =============================================
// THROW KEYWORD IN JAVA
// =============================================

// 🔹 Definition:
// 'throw' is used to EXPLICITLY (manually) throw an exception

// 👉 Simple:
// "Jab tum khud exception generate karte ho → throw"

// =============================================
// 🔹 WHY USE THROW?
// =============================================

// ✔ Custom validation
// ✔ Business logic
// ✔ Manual error control

// Example:
// - Invalid age
// - Wrong input
// - Bank balance low

//  =============================================
// 🔹 IMPORTANT POINTS
// =============================================

// ✔ 1. 'throw' → single exception throw karta hai
// ✔ 2. Object banana padta hai (new keyword)
// ✔ 3. Checked exception → handle or declare (throws)
// ✔ 4. Unchecked → direct throw allowed


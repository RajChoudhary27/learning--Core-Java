enum Status                                            //✅ Enum ek special class hai..Automatically extend karta hai java.lang.Enum..Tum isme methods, constructor bhi bana sakte ho
                                                      
{
   Running ,Failed,Pending, Sucess;  //Object hai
}
public class Enum1 {
    public static void main(String[] args) {
        int i=5;
        Status s=Status.Sucess;
        System.out.println(s);

        System.out.println(s.ordinal());   //📌 Index position batata hai

        //For printing all status
        Status[] ss=Status.values();
        for(Status k: ss) {
           System.out.println(k);
            
        }
    }
}

/*
🔷 1. What is enum in Java?
👉 enum (Enumeration) is a special class in Java used to define a fixed set of constants.

👉 Benefits:
Type safety ✅
Readability ✅
Fixed values only ✅
Error kam hote hain ✅

📌 Important:
Automatically extends Enum class
Cannot extend any other class

🔷 Limitations of Enum
❌ Inheritance support nahi karta
❌ Dynamic values add nahi kar sakte
❌ Fixed set hota hai
*/

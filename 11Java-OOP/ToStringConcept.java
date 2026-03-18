/*Default toString */
class Student{
    
}
/* Custom toString */
class Student1{
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
public class ToStringConcept {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s);
        // Output -> Student@7ad041f3

        /* Custom Tostring */
        Student1 s1=new Student1(1,"Raj");
        System.out.println(s1);
        
        /*HashCode Concept */
        String s2 = "Raj";
        String s3 = "Raj";
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
/*
Java me har class indirectly Object class ko inherit karti hai.
👉 Matlab:
class Student { }

Internally:
class Student extends Object { }

👉 Isliye har class me ye methods already hote hain:
toString()         hashCode()        equals()

🎯 Why use toString()?
✔ Debugging easy
✔ Object readable ban jata hai
✔ Logging me use hota hai
******************************************************************************
🔢 3. hashCode() Method
hashCode() ek integer return karta hai jo object ka unique identity number hota hai

🎯 Why use hashCode()?
✔ Used in HashMap, HashSet
✔ Fast searching
✔ Performance improvement
*/

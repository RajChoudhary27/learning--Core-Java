class A{
    void display(){
        System.out.println("Hello..Object created");
    }
}
public class AnonymousObj {
    public static void main(String[] args) {

    A obj=new A(); //creating an object of class A
    obj.display(); //calling the method using the object

    //or we can directly call the method without creating an object
    new A().display(); //creating an anonymous object and calling the method

    
    
}
}

//Dono mai difference ye hai ki pehle wale mai humne ek reference variable obj banaya hai jo class A ke object ko refer kar raha hai, aur dusre wale mai humne koi reference variable nahi banaya hai, balki directly class A ke object ko create karke uske method ko call kar diya hai. Anonymous object ka use tab hota hai jab hume sirf ek baar kisi method ko call karna hota hai aur hume us object ko future me use nahi karna hota hai.

//new A() direct anonymous hai isme apan same name A  se multiple baar use kar sakte hai but obj se apan sirf ek baar use kar sakte hai kyuki obj ek reference variable hai jo class A ke object ko refer kar raha hai, aur agar hum obj ko dubara use karna chahte hain to hume usse ek naye object se assign karna padega. Isliye, anonymous object ka use tab hota hai jab hume sirf ek baar kisi method ko call karna hota hai aur hume us object ko future me use nahi karna hota hai.
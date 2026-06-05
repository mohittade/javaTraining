
class A{
    void greet(){
        System.out.println("hi from A.");
    }
}


class B extends A{
    void greet(){
        System.out.println("hi from B.");
        super.greet(); // This will call the greet method of class A
    }
}



public class Poly2 {


    public static void main(String[] args) {
        B obj = new B();
        obj.greet(); // This will call the greet method of class B due to method overriding

       
    }




}
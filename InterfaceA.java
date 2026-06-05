

interface A{
    void pay();


    default void display(){
        System.out.println("hi from A.");
    }





}

interface B{
    void pay();
    default void display(){
        System.out.println("hi from B.");
    }
}


 class upi implements A,B{
    public void pay(){
        System.out.println("Paying using UPI");

    }

        public void display() {

        System.out.println("hi from upi.");
        A.super.display(); 
        B.super.display(); 
            
        }


   
   // Call the default method from interface B

 }

public class InterfaceA {



    public static void main(String[] args) {
        B payment = new upi();
        payment.pay();
        payment.display();
    }
    
}

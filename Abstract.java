
// Abstract class definition
abstract class animal {
    // Abstract method (does not have a body)

      int no_of_Legs;
      String color;
      String mode_of_eating;

     void eat(){
        System.out.println("Animal eats food");

}

abstract void speach();

}



abstract class bird extends animal {



   abstract void beak();



abstract void type_of_feathers();



abstract  void displayname();

    // Providing implementation for the abstract method
    void speach() {
        System.out.println("Bird says: Chirp!");   
    }

    void fly() {
        System.out.println("Bird flies high!");
    }
}






class peacock extends bird {
    // Providing implementation for the abstract method
    void speach() {
        System.out.println("Peacock says: Mayura!");   
    }

    void beak() {
        System.out.println("Peacock has a strong beak.");
    }

    void type_of_feathers() {
        System.out.println("Peacock has colorful feathers.");
    }

    void displayname() {
        System.out.println("This is a Peacock.");
    }
}

class rabbit extends animal {
    // Providing implementation for the abstract method
    void speach() {
        System.out.println("Rabbit says: Squeak!");   
    }


    void jump() {
            System.out.println("Rabbit jumps high!");
        }
}


public class Abstract {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated
        // AbstractClass obj = new AbstractClass(); // This will cause a compile-time error

        // However, we can create an instance of a subclass that extends the abstract class
        rabbit s = new rabbit();
        s.eat();
        s.color="white";
        System.out.println("Color of rabbit is: "+s.color);
        s.jump(); // This will call the method in the rabbit class
    
        s.speach(); // This will call the implemented method in the subclass



        peacock k = new peacock();
        k.eat();
        k.speach(); 

        k.displayname();
        k.beak();
        k.type_of_feathers();
    }
}
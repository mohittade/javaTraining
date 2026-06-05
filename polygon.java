public class polygon {


      static void add(int a, int b){
        System.out.println("The sum is: " + (a + b));

      }


      

       static void add(double a, double b){
        System.out.println("The sum is: " + (a + b));

      }

       static void add(int a, int b, int c){
        System.out.println("The sum is: " + (a + b + c));

      }

       static void add(double a, double b, double c){
        System.out.println("The sum is: " + (a + b + c));

      }


      static void add(int a, int b, int c, int d){
        System.out.println("The sum is: " + (a + b + c + d));

      }

       static void add(double a, double b, double c, double d){
        System.out.println("The sum is: " + (a + b + c + d));

      }
    public static void main(String[] args) {



        add(1, 2);
        add(1.5, 2.5);
        add(1, 2, 3);
        add(1.5, 2.5, 3.5);
        add(1, 2, 3, 4);
        add(1.5, 2.5, 3.5, 4.5);
        
    }
    
}

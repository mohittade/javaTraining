public class Cinemabook {
    


public static void main (String[] args) {

   //empty seats are denoted by 0 and occupied seats are denoted by 1
  int seats[] = {1, 0, 0, 0, 0, 1, 0, 0, 1, 0};

  

      //find most consecutive empty seats give seat number us 
      int max=0;
      for(int i=0; i<seats.length; i++){
          if(seats[i] == 0){
              int count=0;
              for(int j=i; j<seats.length; j++){
                  if(seats[j] == 0){
                      count++;
                  }else{
                      break;
                  }
              }
              max = count>max?count:max;
          }
      }
      System.out.println("Maximum consecutive empty seats: " + max);

        
  }







}

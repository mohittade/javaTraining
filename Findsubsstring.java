
import java.util.HashMap;

public class Findsubsstring {






    public static void main(String[] args){
   
         //had to find the longest substring with at most k distinct characters
          String s ="aabcbabad";


          int k=2;

        int l=0;

          int max=0;

          //use HashMap to store the characters and their count

          HashMap<Character,Integer> map = new HashMap<>();



          for(int r=0;r<s.length();r++){


            char c = s.charAt(r);
           map.put(c,map.getOrDefault(c,0)+1);

           if(map.size()<=k){

            max=max<r-l+1?r-l+1:max;
            
           }

              while(map.size()>k){
                if(map.get(s.charAt(l))==1){
                    map.remove(s.charAt(l));


                }else{
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);

                
                
              }


              l++;
        


          }  

    }


    System.out.println(max);
}
}

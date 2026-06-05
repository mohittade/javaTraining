import java.util.HashMap;
import java.util.HashSet;


public class Substring {

    public static void main(String[] args) {

        //find the longest substring without repeating characters

        String s = "abbbbcabcbb";

        int l = 0;

        int max = 0;

        HashSet<Character> map = new HashSet<>();




        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            while (map.contains(c)) {
                map.remove(s.charAt(l));
                l++;
            }

            map.add(c);
            max = max < r - l + 1 ? r - l + 1 : max;

        }
        System.out.println("Length of longest substring without repeating characters is: " + max);
    }
}
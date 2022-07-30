// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-Given an array of strings, return a new array without the strings that are equal to 
// the target string. One approach is to count the occurrences of the target string, make 
// a new array of the correct length, and then copy over the correct strings.
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
// Git-hub repository: https://github.dev/006Darsh/java-Assaignment-1
import java.util.*;
public class Darsh1_6 {
    public static String[] wordsWithout(String[] x, String y) {
        int  notarget = 0;
      
        for (int i = 0; i < x.length; i++)
        {
          if ( x[i].equals(y) ) notarget++;
        }
        String[] result = new String[x.length - notarget];
        for (int i = 0; i < x.length - notarget; i++)
        { 
          result[i] = "0";                                         
        }                                                      
        for (int i = 0; i < x.length; i++)
        {
          if ( !x[i].equals(y) ){
            int j = 0;                            
            while ( !result[j].equals("0") ){  
              j++;                              
            }                                  
            result[j] = x[i];
          } 
        }
        return result;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        String s1;
        System.out.println("Enter the array of String");
        for(int i=0;i<5;i++)
        {
            s[i] = sc.next();
        }
        System.out.println("Enter the target String");
        s1 = sc.next();
        String[] s2  = wordsWithout(s,s1);
        System.out.println(Arrays.toString(s2));
        sc.close();
    }
}

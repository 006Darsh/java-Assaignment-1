
import static java.lang.Math.min;

public class Darsh1_5 {
   
    Darsh1_5(String x,String y)
    {
         // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i=0; i<len-1; i++) 
        {
             String aSub = a.substring(i, i+2);//taking substrings of both strings.
             String bSub = b.substring(i, i+2);
             if (aSub.equals(bSub)) 
             {  // Use .equals() with strings
               count++;
             }
        }
        System.out.println("stringMatch(\""+x+"\", \""+y+"\") --> "+count);
    }
}

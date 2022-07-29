
import java.util.*;
import static java.lang.Math.min;

public class Darsh1_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1=sc.next();
        System.out.println("Enter second string : ");
        String s2=sc.next();
        int c=substringcheck(s1,s2);
        System.out.println(c);
        sc.close();
    }
     static int substringcheck(String x,String y)
    {
        int count=0;
        int MINL=min(x.length(),y.length());
        for(int i=0;i<MINL-1;i++)
        {
            String z=x.substring(i,i+2);
            String t=y.substring(i,i+2);
            if(z.equals(t))
            {
                count++;
            }
        }
        return count;
    }
}

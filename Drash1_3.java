
import java.util.*;
public class Drash1_3 
{
    public static boolean check(int a,int b)
    {
        int r1,r2;
        r1 = a%10;
        r2 = b%10;
        boolean p=true;
        if(r1 == r2)
        {
            p=true;
        }
        else if(r1!=r2)
        {
            p=false;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a,b;
        a = s.nextInt();
        System.out.print("\nEnter the second number :");
        b = s.nextInt();
        boolean p =check(a, b);
        System.out.print("lastDigit("+a+","+b+") --> "+p);    
        s.close();
    }
}

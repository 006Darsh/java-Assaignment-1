
import java.util.*;
public class Darsh1_3 
{
    Darsh1_3(int a,int b)
    {
        int r1,r2;
        r1 = a%10;
        r2 = b%10;//taking remainder of both numbers.
        boolean p=true;
        if(r1 == r2)
        {
            p=true;//checking if the remainders are same the both have same last digit.
        }
        else if(r1!=r2)
        {
            p=false;
        }
        System.out.println("lastDigit("+a+","+b+") --> "+p);
    }
}

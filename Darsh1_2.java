
import java.util.*;
public class Darsh1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String A=sc.nextLine();
        checkstartwithOZ(A);
        sc.close();
    }
    static void checkstartwithOZ(String a)
    {
        if(a.charAt(0)=='O' || a.charAt(0)=='o')
        {
            System.out.print(a.charAt(0));
        }
        if(a.charAt(1)=='z' || a.charAt(1)=='Z')
        {
            System.out.print(a.charAt(1));
        }
    }
}
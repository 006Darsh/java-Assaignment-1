// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-Given two non-negative int values, return true if they have the same last digit, such 
// as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 
// 10 is 7.
// lastDigit(7, 17) → true
// lastDigit(6, 17) → false
// lastDigit(3, 113) → true
// Git-hub repository: https://github.dev/006Darsh/java-Assaignment-1
import java.util.*;
public class Darsh1_3main {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a,b;
        a = s.nextInt();
        System.out.print("\nEnter the second number :");
        b = s.nextInt();
        Darsh1_3 d3 = new Darsh1_3(a, b);  
        s.close();
    }
}

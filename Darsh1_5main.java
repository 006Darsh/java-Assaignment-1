// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-Given 2 strings, a and b, return the number of the positions where they contain the 
// same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", 
// and "az" substrings appear in the same place in both strings.
// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0
// Git-hub repository: https://github.dev/006Darsh/java-Assaignment-1
import java.util.*;
public class Darsh1_5main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string : ");
        String s1=sc.next();
        System.out.println("Enter second string : ");
        String s2=sc.next();
        Darsh1_5 d5=new Darsh1_5(s1,s2);
        sc.close();
    }
}

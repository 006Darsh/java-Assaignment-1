
// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-Given an array of strings, return a new array without the strings that are equal to 
// the target string. One approach is to count the occurrences of the target string, make 
// a new array of the correct length, and then copy over the correct strings.
// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
// Git-hub repository: https://github.com/006Darsh/java-Assaignment-1
import java.util.*;
public class Darsh1_6main {
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
        Darsh1_6 d6 = new Darsh1_6(s,s1);
        sc.close();
    }
}


// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-Given a string, return a string made of the first 2 chars (if present), however include 
// first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"
// Git-hub repository: https://github.com/006Darsh/java-Assaignment-1
import java.util.*;
public class Darsh1_2main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String A=sc.nextLine();
        Darsh1_2 d2 = new Darsh1_2(A);//calling constructor of clASS file.
        sc.close();
    }
}

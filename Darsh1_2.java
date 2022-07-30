
import java.util.*;
public class Darsh1_2 {
    Darsh1_2(String a){//making an constructor of class file.
        if(a.charAt(0)=='O' || a.charAt(0)=='o')
        {
            System.out.print(a.charAt(0));//Checking that 'o' is at first bit or not.
        }
        if(a.charAt(1)=='z' || a.charAt(1)=='Z')//Checking that 'z' is at 2nd bit or not.
        {
            System.out.print(a.charAt(1));
        }
    }
}

// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-Display numbers in a pyramid pattern.
//                 1
//               1 2 1
//             1 2 4 2 1
//           1 2 4 8 4 2 1
//         1 2 4 8 16 8 4 2 1
//      1 2 4 8 16 32 16 8 4 2 1
//   1 2 4 8 16 32 64 32 16 8 4 2 1
// 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 
// Git-hub repository: https://github.dev/006Darsh/java-Assaignment-1
import java.util.*;

public class Darsh1_7main {
    public static void main(String[] args)
        {
            int nrow;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number one less than the number rows you want in pyramid :");
            nrow = s.nextInt();
            Darsh1_7 d7 = new Darsh1_7(nrow);
        }
}

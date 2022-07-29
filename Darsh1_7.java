
import java.util.*;

public class Darsh1_7 {
    private static final String string = " ";
        public static void main(String[] args)
        {
            int n=0,nrow;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number one less than the number rows you want in pyramid :");
            nrow = s.nextInt();
            for (int r=0;r<=nrow;r++) 
            {
                for (int c=1;c<=nrow-r;c++) 
                {
                    System.out.printf("%4s", string);
                }
                for (int c=0;c<=r;c++) 
                {
                    n = (int) Math.pow(2, c);
                    System.out.printf("%4d", n);
                }
                for (int c=r-1;c>=0;c--) 
                {
                    n = (int) Math.pow(2, c);
                    System.out.printf("%4d", n);
                }
                System.out.println();
            }
            s.close();
        }
}

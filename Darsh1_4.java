
import java.util.*;
import java.util.Arrays;
public class Darsh1_4 {
    public static boolean check(int a[],int n)
    {
        boolean p=false;
        
        for(int i=0;i<n;i++)
        {
            if(i==n-1 || i==n-2 || (i==n-3 && a[i]!=1))
            {
                p=false;
            }
            else
            {
                if(a[i] == 1)
                {
                    if(a[i+1] == 2)
                    {
                        if(a[i+2] == 3)
                        {
                            p=true;
                            
                        }
                    }
                }
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the no of elements you want to be in array :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array :");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        boolean p = check(arr,n);
        if(p =true)
        {
            System.out.println("array("+Arrays.toString(arr)+") -->" +p);
        }
        else{
            System.out.println("array("+Arrays.toString(arr)+") -->"+p);
        }
        s.close();
    }
}

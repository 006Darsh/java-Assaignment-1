import java.util.Arrays;
public class Darsh1_4 {
    Darsh1_4(int a[],int n)
    {
        boolean p=false;
        
        for(int i=0;i<n;i++)
        {
            if(i==n-1 || i==n-2 || (i==n-3 && a[i]!=1))
            {
                p=false;//checkif that as the array is at last 3 places and not got 1 yet the give false value.
                break;
            }
            else
            {
                if(a[i] == 1)//checks if the curent element if 1 or not
                {
                    if(a[i+1] == 2)//if passes for above the checks that currrent element is 2 or not
                    {
                        if(a[i+2] == 3)//if passes for above the checks that currrent element is 3 or not if yes its true the gives value true to p.
                        {
                            p=true;//
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("array("+Arrays.toString(a)+") -->" +p);
    }
    
}

import java.util.Arrays;
public class Darsh1_4 {
    Darsh1_4(int a[],int n)
    {
        boolean p=false;
        
        for(int i=0;i<n;i++)
        {
            if(i==n-1 || i==n-2 || (i==n-3 && a[i]!=1))
            {
                p=false;
                break;
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
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("array("+Arrays.toString(a)+") -->" +p);
    }
    
}

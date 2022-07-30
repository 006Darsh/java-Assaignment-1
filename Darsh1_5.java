
import static java.lang.Math.min;

public class Darsh1_5 {
   
    Darsh1_5(String x,String y)
    {
        int count=0;
        int MinLength=min(x.length(),y.length());
        for(int i=0;i<MinLength-1;i++)
        {
            String z=x.substring(i,i+2);
            String t=y.substring(i,i+2);
            if(z.equals(t))
            {
                count++;
            }
        }
        System.out.println("stringMatch(\""+x+"\", \""+y+"\") --> "+count);
    }
}


public class Darsh1_8 {
    Darsh1_8(int nstd,int nque,String[] ans,String key)
    {
        int marks[] = new int[nstd];
        char[] c = key.toCharArray();
        for(int i=0;i<nstd;i++)
        {
            marks[i]=0;
            char[] c2 = ans[i].toCharArray();
            for(int j=0;j<nque;j++)
            {
                if(c2[j]==c[j])
                {
                    marks[i]++;
                }
            }
        } 
        for(int i=0;i<nstd;i++)
        {
            System.out.println("Marks scored by student "+(i+1)+" :"+marks[i]);
        }
    }
    
}

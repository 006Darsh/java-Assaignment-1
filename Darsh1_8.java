
public class Darsh1_8 {
    Darsh1_8(int nstd,int nque,String[] ans,String key)
    {
        int marks[] = new int[nstd];
        char[] c = key.toCharArray();//gives the key to a new string
        for(int i=0;i<nstd;i++)//moves until que of all student be checked
        {
            marks[i]=0;
            char[] c2 = ans[i].toCharArray();//gives the ans given by student to a new string
            for(int j=0;j<nque;j++)
            {
                if(c2[j]==c[j])//compares the key and the ans of the student and increases the marks
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

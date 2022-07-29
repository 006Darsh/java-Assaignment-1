import java.util.*;

public class Darsh1_8 {
    public static int[] checkansthroughkey(int nstd,int nque,String[] ans,String key)
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
        return marks;
    }
    public static void main(String[] args) {
        int nstd,nque;
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the no of Students taken the exams :");
        nstd = s.nextInt();
        System.out.print("Enter the no of question in the exams :");
        nque = s.nextInt();
        String[] ans = new String[nstd];
        System.out.println("Enter the Answers given by the Student :");
        for(int i=0;i<nstd;i++)
        {
            System.out.print("Student "+(i+1)+" :");
            ans[i] = s.next();
        }
        //System.out.println();
        String key;
        System.out.print("Enter the key to the Questions of exam :");
        key = s.next();
        int marks[] = checkansthroughkey(nstd, nque, ans, key);
        for(int i=0;i<nstd;i++)
        {
            System.out.println("Marks scored by student "+(i+1)+" :"+marks[i]);
        }
        s.close();
    }
}

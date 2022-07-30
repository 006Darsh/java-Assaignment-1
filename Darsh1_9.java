import java.util.*;
public class Darsh1_9 {
    // public static void sudokucheck(int)
    // {

    // }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] sudoku = new char[9][9];
        System.out.print("Enter the sudoku you want to be checked :\n");
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                sudoku[i][j] = s.next().charAt(0);
            }
        }
    }
}

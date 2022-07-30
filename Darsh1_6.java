import java.util.*;
public class Darsh1_6 
{
    Darsh1_6(String[] words, String target) 
    {
          int found = 0;
          for (int i = 0; i < words.length; i++) 
          {
              if (words[i].equals(target))
              {
                   found++;//checking if any string in the string array is same as the target string.
              }
          }
          found = words.length - found;//removing the length of the string same as target.
          int place = 0;
          String[] str = new String[found];//making a new array for the remaining elements of original array.
          for (int j = 0; j < words.length; j++) 
          {
              if (!words[j].equals(target)) 
              {
                   str[place] = words[j];//string element not equal to target are placed in new array.
                   place++;
              }
          }
          System.out.println(Arrays.toString(str));
    }
}

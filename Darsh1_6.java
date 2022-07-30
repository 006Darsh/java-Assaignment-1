import java.util.*;
public class Darsh1_6 {
    Darsh1_6(String[] x, String y) {
        int  notarget = 0;
      
        for (int i = 0; i < x.length; i++)
        {
          if ( x[i].equals(y) ) notarget++;
        }
        String[] result = new String[x.length - notarget];
        for (int i = 0; i < x.length - notarget; i++)
        { 
          result[i] = "0";                                         
        }                                                      
        for (int i = 0; i < x.length; i++)
        {
          if ( !x[i].equals(y) ){
            int j = 0;                            
            while ( !result[j].equals("0") ){  
              j++;                              
            }                                  
            result[j] = x[i];
          } 
        }
        System.out.println(Arrays.toString(result));;
      }
}
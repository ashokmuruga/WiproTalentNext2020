import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        boolean[][] array = {{true, false, true},
                             {false, true, false}
                             };
        int rows_length = array.length;
        int columns_length = array[0].length;
        
        for (int i = 0; i < rows_length; i++) {
            for (int j = 0; j < columns_length; j++) {
                
                if (array[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }
                
            }
            System.out.println();
        }    
    }
    }

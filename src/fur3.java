//Nicholas Vadivelu
//Problem 3: Cyclopian Cash

import java.util.*;
import java.lang.Math.*;

public class fur3
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] array = new int[scan.nextInt()];
    for (int i = 0; i < array.length; i++)
      array[i] = scan.nextInt();
    Arrays.sort(array);
    //if ((array.length+1)%2 != 0)
    //{
      double print = Math.round((double)(array[array.length/2] + array[array.length/2 - 1])/2.0*10)/10.0;
      System.out.println(Double.toString(print));
    //} else
      //System.out.println(array[array.length/2]);
    scan.close();
  }
}
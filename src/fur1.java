//Nicholas Vadivelu
//Problem 1: Cyclopian Air
import java.util.Scanner;

public class fur1
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] array = new int[scan.nextInt()];
    int max = 0;
    array[0] = scan.nextInt();
    for (int i = 1; i < array.length; i++)
    {
      array[i] = scan.nextInt();
      if (array[i]*array[i-1] > max)
        max = array[i]*array[i-1];
    }
    if (array[array.length-1]*array[0] > max)
      max = array[array.length-1]*array[0];
    System.out.println(max);
    scan.close();
  }
}
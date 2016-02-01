//Sorting :)
import java.util.*;

public class a4b1
{
  public static void shell(int[] a) {
    int increment = a.length / 2;
    while (increment > 0) {
      for (int i = increment; i < a.length; i++) {
        int j = i;
        int temp = a[i];
        while (j >= increment && a[j - increment] > temp) {
          a[j] = a[j - increment];
          j = j - increment;
        }
        a[j] = temp;
      }
      if (increment == 2) {
        increment = 1;
      } else {
        increment *= (5.0 / 11);
      }
    }
  }
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++)
    {
      nums[i] = scan.nextInt();
    }
    shell (nums);
    for (int i = 0; i < n; i++)
    {
      System.out.println(nums[i]);
    }
  }
}
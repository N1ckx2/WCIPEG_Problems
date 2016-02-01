import java.util.Scanner;

public class acmtryouts0a
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int[] out = new int[t];
    int n, test, test1;
    int[] f;
    for (int i = 0; i < t; i++)
    {
      n = scan.nextInt();
      for (int j = 0; j < n; j++)
      {
        test = scan.nextInt();
        if (test > out[i] || j == 0)
          out[i] = test;
      }
    }
    for (int i = 0; i < out.length; i++)
      System.out.println(out[i]);
  }
}
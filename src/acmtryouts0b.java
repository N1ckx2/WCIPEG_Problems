//B: Interleaving Leaves
import java.util.*;

public class acmtryouts0b
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    for (int r = 0; r < t; r++)
    {
      int n = scan.nextInt();
      String x = scan.next();
      String y = scan.next();
      for (int i = 0; i < 2*n; i++)
      {
        if (i%2 == 0)
        {
          System.out.print(y.charAt(n-(i/2)-1));
        } 
        else
        {
          System.out.print(x.charAt(n-(i/2)-1));
        }
      }
      System.out.println();
    }
  }
}
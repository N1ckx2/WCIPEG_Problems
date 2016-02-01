//1030. Triple Fat Ladies
import java.util.*;

public class a3
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int tests = scan.nextInt();
    long[] k = new long[tests];
    long ending = 0;
    for (int i = 0; i < tests; i++)
    {
      k[i] = scan.nextInt();
    }
    for (int i = 0; i < tests; i++)
    {
      while (true)
      {
        ending = (k[i]*k[i]*k[i])%1000;
        if (ending == 888)
        {
          System.out.println(k[i]);
          break;
        }
        else
        {
          k[i]++;
        }
      }
    }
  }
}
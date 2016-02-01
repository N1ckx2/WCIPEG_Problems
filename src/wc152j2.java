import java.util.*;

public class wc152j2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int[] rocks = new int[n];
    int total = 0;
    for (int i = 0 ; i < n; i++)
    {
      rocks[i] = scan.nextInt();
      if (rocks[i] <= m)
        total += rocks[i];
    }
    
    scan.close();
    
    System.out.println(total);
  }
}
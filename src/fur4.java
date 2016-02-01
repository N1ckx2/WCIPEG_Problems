import java.util.*;

public class fur4
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int ages[] = new int[num];
    for (int i = 0; i < num; i++)
      ages[i] = scan.nextInt();
    Arrays.sort(ages);
    num = scan.nextInt();
    int[] queries = new int[num];
    for (int i = 0; i < num; i++)
      queries[i] = scan.nextInt();
    scan.close();
    
    for(int i = 0; i < num; i++)
      System.out.println(ages[queries[i]-1]);
    
  }
}
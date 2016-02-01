import java.util.Scanner;

public class ccc04j2
{
private static int lcm (int a, int b)
  {
    //declare variables
    int lcm = 1;
    boolean isLCM = false;
    
    //find lcm
    if (a >= 0 && b >= 0)
    {
      while (lcm%a != 0 || lcm%b != 0)
      {
        lcm++;
      }
    }
    else
      lcm = 0;
    //return lcm
    return lcm;
  }
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int year1 = scan.nextInt();
    int year2 = scan.nextInt();
    int inc = lcm(lcm(4, 3), 5);
    scan.close();
    
    for (int i = year1; i <= year2; i+= inc)
      System.out.println("All positions change in year " + i);
  }
}
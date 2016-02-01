import java.util.Scanner;
import java.lang.Math.*;

public class ccc04j1
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int squares = scan.nextInt();
    int len = 0;
    scan.close();
    for (int i = 0; i <= Math.sqrt(squares); i++)
    {
      if (squares >= Math.pow(i, 2))
        len = i;
    }
    System.out.println("The largest square has side length " + len + ".");
  }
}

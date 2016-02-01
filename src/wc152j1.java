import java.util.*;

public class wc152j1
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int cases = scan.nextInt();
    String output = "A long time ago in a galaxy ";
    for (int i = 0; i < cases-1; i++)
      output = output + "far, ";
    output = output + "far away...";
    System.out.println(output);
    scan.close();
  }
}
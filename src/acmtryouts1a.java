//A: Rock Paper Scissors Fox
import java.util.*;

public class acmtryouts1a
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] plays = new String[n];
    for (int i = 0; i < n; i++)
    {
      plays[i] = scan.next();
    }
    for (int i = 0; i < n; i++)
    {
      if (plays[i].equals("Scissors"))
      {
        System.out.println("Rock");
      }
      else if (plays[i].equals("Paper"))
      {
        System.out.println("Scissors");
      }
      else if (plays[i].equals("Rock"))
      {
        System.out.println("Paper");
      }
      else if (plays[i].equals("Fox"))
      {
        System.out.println("Foxen");
      }
      else if (plays[i].equals("Foxen"))
      {
        break;
      }
    }
  }
}
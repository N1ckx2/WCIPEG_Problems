//Round 2: Round Numbers
import java.util.Scanner;

public class wc95p2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
    int k = scan.nextInt(), one = 0, zero = 0, round = 0;
    String binary = "";
    
    for (int i = 1; i <= k; i++)
    {
      binary = Integer.toBinaryString(i);
      for (int j = 0; j < binary.length(); j++)
      {
        if (binary.charAt(j) == '1')
          one++;
        else if (binary.charAt(j) == '0')
          zero++;
      }
      if (zero >= one)
        round++;
      zero = 0;
      one = 0;
    }
    
    System.out.println("There are " + round + " round numbers less than or equal to " + k + ".");
  }
}
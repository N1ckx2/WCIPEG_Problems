import java.util.Scanner;

public class acmtryouts3b
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int[] num = new int[t];
    String text = "";
    scan.nextLine();
    for (int i = 0; i < t; i++)
    {
      text = scan.nextLine();
      for (int j = 0; j < text.length()-1; j++)
      {
        if (text.charAt(j) == '<' && text.charAt(j+1) == '3')
          num[i]++;
      }
    }
    
    for (int i = 0; i < num.length; i++)
    {
      for (int k = -1; k < num[i]; k++)
      {
        if (k == num[i]-1)
          System.out.print("<3");
        else
          System.out.print("<3 ");
      }
      System.out.println();
    }
    scan.close();
  }
}
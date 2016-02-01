import java.util.Scanner;
public class a1
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.nextLine();
    String[] words = new String[n];
    for (int i = 0; i < n; i++)
    {
      words[i] = scan.nextLine();
      if (words[i].charAt(1) == ' ')
      {
        int g = (words[i].charAt(0) - 48)+1;
        words[i] = Integer.toString(1+i) + words[i].substring(1, g) + words[i].substring(g+1);
      }
      else 
      {
        int g = (words[i].charAt(0) - 48)*10 + (words[i].charAt(1) - 48) + 2;
        words[i] = Integer.toString(i+1) + words[i].substring(2, g) + words[i].substring(g+1);
      }
    }
    for (int i = 0; i < n; i++)
      System.out.println(words[i]);
  }
}
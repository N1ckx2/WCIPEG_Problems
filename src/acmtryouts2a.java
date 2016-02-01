import java.util.Scanner;

public class acmtryouts2a
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int world = 0,  level = 0, counter = 1;
    String holder;
    int[] output = new int[t];
    for (int i = 0; i < t; i++)
    {
      holder = scan.next();
      world = holder.charAt(0)-48;
      level = holder.charAt(2)-48;
      while (world < 8 || level < 4)
      {
        counter++;
        if (level == 4)
        {
          level = 1;
          world++;
        } else if (world == 1 && level == 2)
        {
          level = 1;
          world = 4;
        } else if (world == 4 && level == 2)
        {
          level = 1;
          world = 8;
        } else if (level == 4)
        {
          level = 1;
          world++;
        } else
        {
          level++;
        }
      }
      output[i] = counter;
      counter = 1;
    }
    
    for (int i : output)
    {
      System.out.println(i);
    }
  }
}
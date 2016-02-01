import java.util.*;

public class p108ex7 
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int cases = scan.nextInt();
    int[] array = new int[cases];
    for (int i = 0 ; i < cases; i++)
      array[i] = scan.nextInt();
    scan.close();
    
    for (int i = 0 ; i < cases; i++)
    {
      if (array[i] >= 0 && array[i] <= 30)
        System.out.println("38");
      else if (array[i] > 30 && array[i] <= 50)
        System.out.println("55");
      else if (array[i] > 50 && array[i] <= 100)
        System.out.println("73");
      else if (array[i] > 100)
      {
        int amount = 73;
        if (array[i] % 50 != 0)
          amount += 24;
        amount += ((array[i]-100)/50)*24;
        System.out.println(amount);
      }
    }
  }
}
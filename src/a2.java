//3378. Mirrored Pairs
import java.util.*;

public class a2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    List<Boolean> trues =  new ArrayList<Boolean>();
    String input = "";
    do
    {
      input = scan.nextLine();
      if (input.equals("pq") || input.equals("qp") || input.equals("bd") || input.equals("db"))
      {
        trues.add(true);
      }
      else if (input.equals(""))
      {}
      else
      {
        trues.add(false);
      }
    } while (!input.equals("  "));
    System.out.println("Ready");
    for (int i = 0; i < trues.size()-1; i++)
    {
      if (trues.get(i))
      {
        System.out.println("Mirrored pair");
      }
      else
      {
        System.out.println("Ordinary pair");
      }
    }
  }
}
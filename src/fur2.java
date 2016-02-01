//Nicholas Vadivelu
//Problem 2: Cyclopian Suits

import java.util.*;

public class fur2
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int[] sizes = new int[scan.nextInt()];
    int cur = 0, max = 0, num = 0;
    List<Integer> wotnum = new ArrayList<Integer>();
    List<Integer> numnum = new ArrayList<Integer>();
    for (int i = 0; i < sizes.length; i++)
      sizes[i] = scan.nextInt();
    
    Arrays.sort(sizes);
    wotnum.add(sizes[0]);
    numnum.add(1);
    for (int i = 1; i < sizes.length; i++)
    {
      if (sizes[i] == sizes[i-1])
      {
        numnum.set(cur, numnum.get(cur) + 1);
      }
      else
      {
        wotnum.add(sizes[i]);
        numnum.add(1);
        cur++;
      }
    }
    for (int i = 0; i < numnum.size(); i++)
    {
      if (numnum.get(i) > max)
        max = numnum.get(i);
    }
    for (int i = 0; i < numnum.size(); i++)
    {
      if (numnum.get(i) == max)
        num++;
    }
    System.out.println(num);
    for (int i = 0; i < wotnum.size(); i++)
    {
      if (numnum.get(i) == max)
        System.out.println(wotnum.get(i));
    }
    
    scan.close();
  }
}
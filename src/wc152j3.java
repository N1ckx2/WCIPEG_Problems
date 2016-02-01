import java.util.*;
import java.lang.Math.*;

public class wc152j3
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int s = scan.nextInt();
    int e = scan.nextInt();
    int r = scan.nextInt();
    int[] weapon = new int[4];
    int numDanger = 0;
    Trooper[] trooper = new Trooper[s];
    Point[] ewok = new Point[e];
    
    for (int i = 0; i < s; i++)
      trooper[i] = new Trooper(scan.nextInt()-1, scan.nextInt(), scan.nextInt());
    for (int i = 0 ; i < e; i++)
      ewok[i] = new Point (scan.nextInt(), scan.nextInt());
    
    for (int i = 0 ; i < e; i++)
    {
      for (int j = 0; j < s; j++)
      {
        if (ewok[i].distance(trooper[j].location) <= r)
        {
          weapon[trooper[j].weapon]++;
        }
      }
      int numWep = 0;
      for (int j = 0; j < 4; j++)
      {
        if (weapon[j] > 0)
          numWep ++;
      }
      if (numWep >= 2)
        numDanger++;
      weapon = new int[4];
      numWep = 0;
      
    }
    
    System.out.println(numDanger);  
    scan.close();
  }
}

class Point
{
  public int x, y; //x and y value 
  
  //Constructor with x and y
  public Point(int xx, int yy)
  {
    x = xx;
    y = yy;
  }
  
  public double distance (Point p)
  {
    return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y-p.y), 2));
  }
}

class Trooper
{
  public Point location;
  public int weapon;
  public Trooper (int w, int x1, int y1)
  {
    location = new Point(x1, y1);
    weapon = w;
  }
}
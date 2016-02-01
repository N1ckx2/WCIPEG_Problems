import java.util.*;

public class q3
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int rows = scan.nextInt();
    int[][] grid = new int[rows][rows];
    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < rows; j++)
      {
        grid[i][j] = scan.nextInt();
      }
    }
    int t = scan.nextInt();
    int[][] xy = new int[t][2];
    for (int i = 0; i < t; i++)
    {
      xy[i][0] = scan.nextInt();
      xy[i][1] = scan.nextInt();
    }
        scan.close();
        
    for (int i = 0; i < t; i++)
    {
      int out = 0;
      for (int j = 0; j < rows; j++)
      {
        out+= grid[xy[i][0]-1][j] + grid[j][xy[i][1]-1];
      }
      System.out.println(out);
    }

  }
}
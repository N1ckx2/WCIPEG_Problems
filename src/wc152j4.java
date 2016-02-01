import java.util.Scanner;

public class wc152j4
{
  static char[][] map;
  static int checker = 0;
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int num = 0;
    int h = scan.nextInt();
    int w = scan.nextInt();
    map = new char[h][w];
    String[] grid = new String[h];
    for (int i = 0 ; i < h; i++)
    {
      grid[i] = scan.next();
      for (int c = 0; c < w; c++)
        map[i][c] = grid[i].charAt(c);
    }
    scan.close();
    
    for (int r = 0; r < h; r++)
    {
      for (int c = 0; c < w; c++)
      {
        if(map[r][c] == '.')
        {
          int[] dir = {0, 1};
          boolean check = true;
          if(go(r, c, dir, -1, -1))
          {
            num++;
            check = false;
          }
          dir[1] = -1;
          if (check)
          {
            if(go(r, c, dir, -1, -1))
            {
              num++;
              check = false;
            }
          }
          dir[0] = -1;
          dir[1] = 0;
          if (check)
          {
            if(go( r, c, dir, -1, -1))
            {
              num++;
              check = false;
            }
          }
          
          dir[0] = 1;
          if (check)
          {
            if(go( r, c, dir, -1, -1) && check)
            {
              num++;
              check = false;
            }
          }
        }
      }
    }
    System.out.println(num);
  }
  //direction
  /*
   * [1, 0] = down --> after / = [0, -1]  after \ = [0, 1]
   * [-1, 0] = up --> after / = [0, 1] after \ = [0, -1]
   * [0, 1] = right --> after / = [-1, 0]  after \ = [1, 0]
   * [0, -1] = left --> after / = [0, -1] after \ = [-1, 0]
   */
  
  private static boolean go(int row, int col, int[] dir, int sr, int sc)
  {
    if (checker > 150)
    {
      checker = 0;
      return false;
    }
    else
      checker++;
    int[] nu = new int[2];
    if (row < 0 || col < 0 || row >= map.length || col >= map[0].length) return false;
    
    else if (row == sr && col == sc)
      return true;
    else if (sc == -1 && sr == -1)
    {
      checker = 0;
      sc = col;
      sr = row;
    }
    if (map[row][col] == '.')
    {
        return go(row+dir[0], col+dir[1], dir, sr, sc);
    }
    else if (map[row][col] == '#')
      return false;
    else if (map[row][col] == '/')
    {
      nu[0] = dir[1]*-1;
      nu[1] = dir[0]*-1;
      return go(row+nu[0], col+nu[1], nu, sr, sc);
    }
    
    else if (map[row][col] == '\\' )
    {
      nu[0] = dir[1];
      nu[1] = dir[0];
      return go(row+nu[0], col+nu[1], nu, sr, sc);
    }
    
    else if (map[row][col] == 'X')
    {
      return true;
    }
    
    return false;
  }
}
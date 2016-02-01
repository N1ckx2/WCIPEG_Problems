import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-28.
 */
public class ccc98s1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0 ; i < n ; i++){
            String str = " " + scan.nextLine() + " ";
            for (int j = 0 ; j < str.length() ; j++) {
                if (str.charAt(j) == ' ' && j < str.length() - 5){
                    if (str.substring(j+1).indexOf(" ") == 4)
                    {
                        if (j == 0)
                            System.out.print("**** ");
                        else if (j == str.length()-1)
                            System.out.print(" ****");
                        else
                            System.out.print(" **** ");
                        j+=5;
                    } else if (str.charAt(j) != ' ' || (j != 0 && j !=str.length() -1)) {
                        System.out.print(str.charAt(j));
                    }
                } else if (str.charAt(j) != ' ' || (j != 0 && j !=str.length() -1)) {
                    System.out.print(str.charAt(j));
                }
            }
            if (i != n-1)
                System.out.println("\n");
        }
    }
}

import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-28.
 */
public class CCC96S3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0 ; i < n ; i++) {
            String max = "";
            String min = "";
            int len = scan.nextInt();
            int num = scan.nextInt();
            System.out.println("The bit patterns are");
            for (int j = 0; j < num ; j++) {
                max = max + "1";
                min = "1" + min;
            }
            for (int j = num; j < len ; j++) {
                max = max + "0";
                min = "0" + min;
            }
            int maxi = Integer.parseInt(max, 2);
            int mini = Integer.parseInt(min, 2);
            for (int x = maxi ; x >= mini ; x--){
                String str = Integer.toBinaryString(x);
                int counter = 0;
                for (int y = 0; y < str.length() ; y++){
                    if (str.charAt(y) == '1')
                        counter++;
                }
                while (str.length() < len)
                    str = "0" + str;
                if (counter == num)
                    System.out.println(str);
            }
            System.out.println("Done looping");
            System.out.println();
        }
    }
}

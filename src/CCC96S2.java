import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-28.
 */
public class CCC96S2 { //48 = 0
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0 ; i < num ; i++){
            String val = scan.next();
            String fin = val;
            while (val.charAt(0) == '0'){
                val = val.substring(1);
            }
            while (val.length() > 2) {
                int back = 2;
                int end = val.charAt(val.length()-1) - '0';
                val = val.substring(0, val.length()-1);
                while (val.charAt(val.length()-back) == '0'){
                    back++;
                }
                int last = Integer.parseInt(val.substring(val.length()-back, val.length()));
                val = val.substring(0, val.length()-back);
                int addon = last - end;
                if (addon < 10)
                    val = val + "0" + Integer.toString(addon);
                else
                    val = val + Integer.toString(addon);
                System.out.println(val);
            }
            int value = Integer.parseInt(val);
            if (value % 11 == 0){
                System.out.println("The number " + fin + " is divisible by 11.");
            } else {
                System.out.println("The number " + fin + " is not divisible by 11.");
            }
        }
    }
}

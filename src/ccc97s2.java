import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-29.
 */
public class ccc97s2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int m = 0 ; m < n; n++){
            int num = scan.nextInt();
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for (int i = 1; i <= num/2 ; i++) {
                if (num % i == 0) {
                    nums.add(i);
                }
            }
            nums.add(num);
            boolean isNasty = false;
            for (int i = 1 ; i < nums.size() && !isNasty; i++) {
                for (int j = 1 ; j < nums.size()  && !isNasty; j++) {
                    for (int x = 1 ; x < nums.size()  && !isNasty; x++) {
                        for (int y = 1 ; y < nums.size()  && !isNasty; y++) {
                            isNasty = nums.get(i) - nums.get(j) == nums.get(x) + nums.get(y);
                        }
                    }
                }
            }
            if (isNasty) {
                System.out.println(num + " is nasty");
            } else {
                System.out.println(num + " is not nasty");
            }
        }
    }
}

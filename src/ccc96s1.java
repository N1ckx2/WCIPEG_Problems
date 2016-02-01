import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-28.
 */
public class ccc96s1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i =0 ; i < num ; i++){
            int val = scan.nextInt();
            int sum = 0;
            for (int j = 1 ; j < val ; j++) {
                if (val%j == 0) sum+=j;
            }
            if (sum == val){
                System.out.println(val + " is a perfect number.");
            } else if (sum > val) {
                System.out.println(val + " is an abundant number.");
            } else if (sum < val){
                System.out.println(val + " is a deficient number.");
            }
        }
    }
}

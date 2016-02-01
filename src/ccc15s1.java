import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-29.
 */
public class ccc15s1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0 ; i < n ; i ++){
            int x = scan.nextInt();
            if (x == 0){
                nums.remove(nums.size()-1);
            } else {
                nums.add(x);
            }
        }
        for (int i = 0 ; i < nums.size() ; i++) {
            sum+=nums.get(i);
        }
        System.out.println(sum);
    }
}

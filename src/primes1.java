import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-30.
 */
public class primes1 {
    private static boolean isPrime (int num){
        boolean prime = true;
        for (int i = 2; i <= num/2 ; i++){
            if (num%i==0)
                prime = false;
        }
        return prime;
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int j = 0;
        int i = 2;
        while (j < n) {
            if (isPrime(i)) {
                System.out.println(i);
                j++;
            }
            i++;
        }
    }
}

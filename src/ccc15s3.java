import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-29.
 */
public class ccc15s3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[] gates = new boolean[scan.nextInt()+1];
        int numPlanes = scan.nextInt();
        int dockedPlanes = 0;
        for (int i = 0 ; i < numPlanes ; i++) {
            int gate = scan.nextInt();
            int start = dockedPlanes;
            for (int j = gate; j >= 1; j--){
                if (!gates[j]){
                    dockedPlanes++;
                    gates[j] = true;
                    j = 0;
                }
            }
            if (dockedPlanes == start)
                i = numPlanes;
        }
        System.out.println(dockedPlanes);
    }
}

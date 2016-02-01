import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-29.
 */
public class ccc97s1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int t = 0 ; t < n ; t++){
            int ss = scan.nextInt();
            int vs = scan.nextInt();
            int os = scan.nextInt();
            scan.nextLine();
            String[] subjects = new String[ss];
            String[] verbs = new String[vs];
            String[] objects = new String[os];
            String[] sentences = new String[ss*vs*os];
            for (int i = 0 ; i < ss ; i++) {
                subjects[i] = scan.nextLine();
            }
            for (int i = 0 ; i < vs ; i++) {
                verbs[i] = scan.nextLine();
            }
            for (int i = 0 ; i < os ; i++) {
                objects[i] = scan.nextLine();
            }
            for (int s = 0, i = 0; s < ss ; s++) {
                for (int v = 0 ; v < vs ; v++) {
                    for (int o = 0 ; o < os ; o++) {
                        sentences[i++] = subjects[s] + " " + verbs[v] + " " + objects[o] + ".";
                    }
                }
            }
            for (int i =0 ; i < sentences.length;i++) {
                System.out.println(sentences[i]);
            }
        }
    }
}

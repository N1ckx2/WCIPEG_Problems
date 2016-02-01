import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-29.
 */
public class ccc15s2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int numJerseys = scan.nextInt();
        int numAthletes = scan.nextInt();
        char[] jerseys = new char[numJerseys];
        for (int i = 0 ; i < numJerseys ; i++){
            jerseys[i] = scan.next().charAt(0);
        }
        Athlete[] athlete = new Athlete[numAthletes];
        for (int i = 0 ; i < numAthletes ; i++) {
            athlete[i] = new Athlete(scan.next().charAt(0), scan.nextInt());
        }
        int numSatisfied = 0, doneCount = 0;
        for (int i = 0 ; i < numAthletes && doneCount < numJerseys; i++) {
            try {
                if (athlete[i].isOk(jerseys[athlete[i].num])) {
                    numSatisfied++;
                    jerseys[athlete[i].num] = 'X';
                    doneCount++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {}
        }
        System.out.println(numSatisfied);
    }
}
class Athlete{
    char size;
    int num;
    public Athlete(char s, int n){
        size = s;
        num = n-1;
    }
    public boolean isOk (char s) {
        return (toInt(s) >= toInt(size));
    }
    public static int toInt (char s) {
        int num = 0;
        if (s == 'S') num = 0;
        else if (s == 'M') num = 1;
        else if (s == 'L') num = 2;
        else num = -1;
        return num;
    }
}
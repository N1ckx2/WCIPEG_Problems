import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-30.
 */
public class ccc12s3 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] readings = new int[n];
        readings[0] = scan.nextInt();
        int lowest = readings[0], highest = readings[0];
        for (int i = 1 ; i < n ; i++) {
            readings[i] = scan.nextInt();
            lowest = Math.min(readings[i], lowest);
            highest = Math.max(readings[i], highest);
        }
        int[] freqs = new int[highest+1];
        for (int i = 0; i < readings.length ; i++){
            freqs[readings[i]]++;
        }
        ArrayList<Integer> highFreq = new ArrayList<Integer>();
        ArrayList<Integer> highFreqPos = new ArrayList<Integer>();
        highFreq.add(0);
        highFreqPos.add(0);
        for (int i = 0; i < freqs.length ; i++){
            if (freqs[i] > highFreq.get(0)) {
                highFreq.clear();
                highFreqPos.clear();
                highFreq.add(freqs[i]);
                highFreqPos.add(i);
            } else if (freqs[i] == highFreq.get(0)){
                highFreq.add(freqs[i]);
                highFreqPos.add(i);
            }
        }
        if (highFreq.size() == 2){
            System.out.println(Math.abs(highFreqPos.get(0) - highFreqPos.get(1)));
        } else if (highFreq.size() > 2) {
            int higher = 0;
            higher = Math.abs(highFreqPos.get(0) - highFreqPos.get(1));
            for (int i = 0 ; i < highFreq.size() ; i++) {
                for (int j = 0 ; j < highFreq.size() ; j++){
                    higher = Math.max(Math.abs(highFreqPos.get(i) - highFreqPos.get(j)), higher);
                }
            }
            System.out.println(higher);
        } else if (highFreq.size() == 1) {
            ArrayList<Integer> highFreq2 = new ArrayList<Integer>();
            ArrayList<Integer> highFreqPos2 = new ArrayList<Integer>();
            highFreq2.add(0);
            highFreqPos2.add(0);
            for (int i = 0; i < freqs.length ; i++){
                if (freqs[i] > highFreq2.get(0) && freqs[i] != highFreq.get(0)) {
                    highFreq2.clear();
                    highFreqPos2.clear();
                    highFreq2.add(freqs[i]);
                    highFreqPos2.add(i);
                } else if (freqs[i] == highFreq2.get(0) && freqs[i] != highFreq.get(0)){
                    highFreq2.add(freqs[i]);
                    highFreqPos2.add(i);
                }
            }
            int higher = Math.abs(highFreqPos.get(0) - highFreqPos2.get(0));
            for (int i = 0 ; i < highFreqPos2.size() ; i++){
                higher = Math.max(Math.abs(highFreqPos.get(0) - highFreqPos2.get(i)), higher);
            }
            System.out.println(higher);
        }
    }
}

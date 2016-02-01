import java.util.Scanner;

/**
 * Created by Nicholas on 2016-01-28.
 */
public class ccc99s2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String str = scan.nextLine() ;//+ " "
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ' && j < str.length() - 8) {
                    //if (n == 4)
                        //System.out.println(str.substring(j+9) + j);
                    if ((str.substring(j).length() > 9)){
                        if ("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890".indexOf(str.charAt(j+9)) != -1) {
                            continue;
                        }
                    }
                    if (str.charAt(j + 3) == '/' && str.charAt(j + 6) == '/') {
                        int dd = Integer.parseInt(str.substring(j + 1, j + 3));
                        int mm = Integer.parseInt(str.substring(j + 4, j + 6));
                        int yy = Integer.parseInt(str.substring(j + 7, j + 9));
                        if (dd <= 31 && dd >= 1 && mm <= 12 && mm >= 1) {
                            if (yy >= 25) {
                                str = str.substring(0, j + 7) + (1900 + yy) + str.substring(j + 8); //might cause out of bounds
                            } else if (yy < 25) {
                                str = str.substring(0, j + 7) + (2000 + yy) + str.substring(j + 9); //might cause out of bounds
                            }
                        }
                    } else if (str.charAt(j + 3) == '.' && str.charAt(j + 6) == '.') {
                        int yy = Integer.parseInt(str.substring(j + 1, j + 3));
                        int mm = Integer.parseInt(str.substring(j + 4, j + 6));
                        int dd = Integer.parseInt(str.substring(j + 7, j + 8));
                        if (dd <= 31 && dd >= 1 && mm <= 12 && mm >= 1) {
                            if (yy >= 25) {
                                str = str.substring(0, j + 1) + (1900 + yy) + str.substring(j + 3); //might cause out of bounds
                            } else if (yy < 25) {
                                str = str.substring(0, j + 1) + (2000 + yy) + str.substring(j + 9); //might cause out of bounds
                            }
                        }
                    }
                } if (str.charAt(j) == ' ' && str.substring(j + 1).indexOf(" ") != -1 && !(str.charAt(j + 3) == '/' && str.charAt(j + 6) == '/') && !(str.charAt(j + 3) == '/' && str.charAt(j + 6) == '/')) {
                    int start = j;
                    int end = str.substring(j + 1).indexOf(" ") + j;
                    String s = str.substring(start+1, end+1);
                    if ("JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember".indexOf(s) != -1) {
                        int dd = 0;
                        int yy = 0;
                        //try {
                        String s2 = str.substring(str.substring(j+1).indexOf(" "), str.substring(j).indexOf(","));
                        try {
                        dd = Integer.parseInt(s2);
                        yy = Integer.parseInt(str.substring(str.substring(j+1).indexOf(",") + 1, str.substring(j).indexOf(",") + 3));
                        } catch (NumberFormatException e) {
                           continue;
                        }
                        if (dd <= 31 && dd >= 1) {
                            if (yy >= 25) {
                                str = str.substring(0, j + 1) + (1900 + yy) + str.substring(j + 3); //might cause out of bounds
                            } else if (yy < 25) {
                                str = str.substring(0, j + 1) + (2000 + yy) + str.substring(j + 9); //might cause out of bounds
                            }
                        }
                    }
                }
            }
            System.out.println(str);
        }
    }
}

package Algorythm.Day1;

import java.io.IOException;
import java.util.Scanner;

public class Algo_String04_StringFactorio {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        String no2 = scanner.next();
        int nn = 0;
        for(int i = 0; i < no; i++) {
            // charAt은 아스키코드값으로 변환하므로 -'0'이나 -48을 해줘야 한다.
            nn += no2.charAt(i) - '0';
        }
        System.out.println(nn);
    }
}

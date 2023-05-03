package Algorythm.Day2;

import java.io.IOException;
import java.util.Scanner;

public class Algo_String07_StringRoof {
    public static void main(String[] args) throws IOException {
        // 2675번
        // 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
        // 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
        Scanner scanner = new Scanner(System.in);
        int tempStartInt = scanner.nextInt();
        for (int k = 0; k < tempStartInt; k++) {
            String temp2 = "";
            int tempInt = scanner.nextInt();
            String temp = scanner.next();
            for (int i = 0; i < temp.length(); i++) {
                for (int j = 0; j < tempInt; j++) {
                    temp2 += temp.charAt(i);
                }
            }
            System.out.println(temp2);
        }
    }
}

package Algorythm.Day2;

import java.io.IOException;
import java.util.Scanner;

public class Algo_String06_StringDistinctToString {
    public static void main(String[] args) throws IOException {
        // 2675번
        // 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
        // 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
        String temp = new Scanner(System.in).next();
        String temp2 = "";
        for(int i = 0; i < temp.length(); i++) {
            for(int j = 0; j < temp.length(); j++) {
                temp2 += temp.charAt(i);
            }
        }
        System.out.println(temp2);
    }
}

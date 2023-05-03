package Algorythm.Day2;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algo_String08_StringWordCheck {
    public static void main(String[] args) throws IOException {
        // 1152번
        // 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
        // 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
        String t = new Scanner(System.in).nextLine();
        int tt = (t.trim().length() - t.trim().replace(" ", "").length()) + 1;
        System.out.println(tt);

        // -------------------------------------------------------------------------------------------
        // StringTokenizer : t에 공백을 기준으로 나눈 토큰들을 t 에 저장한다
        StringTokenizer stringTokenizer = new StringTokenizer(t, " ");
        // countTokens() 는 토큰의 개수를 반환한다
        System.out.println(stringTokenizer.countTokens());
    }
}

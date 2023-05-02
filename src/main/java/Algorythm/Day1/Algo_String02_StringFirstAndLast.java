package Algorythm.Day1;

import java.io.IOException;
import java.util.Scanner;

public class Algo_String02_StringFirstAndLast {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testNo = scanner.nextInt();
        for(int i = 0; i < testNo; i++) {
            String sc = scanner.next();
            System.out.println(sc.charAt(0)+""+sc.charAt(sc.length()-1));
        }
    }
}

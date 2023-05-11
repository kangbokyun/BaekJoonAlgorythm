package Algorythm.Day8;

import java.io.IOException;
import java.util.Scanner;

public class DoubleArray_02_2566 {
    public static void main(String[] args) throws IOException {
        // 2차원 배열 내 최댓값과 배열 좌표 찾기
        Scanner sc = new Scanner(System.in);
        int[][] doubleArray = new int[9][9];
        int max = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                doubleArray[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(max < doubleArray[i][j]) {
                    max = doubleArray[i][j];
                }
            }
        }
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(max == doubleArray[i][j]) {
                    System.out.println(max);
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}

package Algorythm.Day4;

import java.io.IOException;
import java.util.Scanner;

public class Array_01_10807 {
	public static void main(String[] args) throws IOException {
		// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] arrA = new int[a];
		for(int i = 0; i < a; i++) {
			arrA[i] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		int c = 0;
		for(int i = 0; i < arrA.length; i++) {
			if(arrA[i] == b) {
				c++;
			}
		}
		System.out.println(c);
	}
}

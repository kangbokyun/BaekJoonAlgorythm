package Algorythm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		// 2차원 배열 세로읽기
		Scanner sc = new Scanner(System.in);
		String[] doubleArray = new String[5];

		for(int i = 0; i < 5; i++) {
			doubleArray[i] = sc.next();
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j < 5 && doubleArray[j].trim().length() < 5) {
					System.out.print(doubleArray[j].charAt(i));
					break;
				}
			}
		}
	}
}
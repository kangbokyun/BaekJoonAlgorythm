package Algorythm.Day4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Array_03_10818 {
	public static void main(String[] args) throws IOException {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int b = arr[i]; arr[i] = arr[j]; arr[j] = b;
//				}
//			}
//		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " +  arr[a - 1]);
	}
}

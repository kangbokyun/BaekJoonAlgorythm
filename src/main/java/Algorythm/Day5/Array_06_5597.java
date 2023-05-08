package Algorythm.Day5;

import java.io.IOException;
import java.util.Scanner;

public class Array_06_5597 {
    public static void main(String[] args) throws IOException {
        // X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
        // 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
//		int[] n = new int[28];
//		int[] v = new int[2];
//		for(int i = 0; i < n.length; i++) {
//			n[i] = sc.nextInt();
//		}
//		Arrays.sort(n);
//		int cnt = 0; int add = 1;
//		for(int i = 0; i < 30; i++) {
//			if((i + add) != n[i]) { v[cnt] = (i + add); cnt++; add++; }
//			if(n.length - 1 == i) { break; }
//		}
//		for(int i = 0; i < v.length; i++) {
//			System.out.println(v[i]);
//		}
        //=============================================================================
        boolean[] isTrue = new boolean[31];
        for(int i = 1; i <= 28; i++) {
            isTrue[sc.nextInt()] = true;
        }
        for(int i = 1; i <= 30; i++) {
            if(!isTrue[i]) {
                System.out.println(i);
            }
        }
    }
}

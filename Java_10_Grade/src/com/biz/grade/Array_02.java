package com.biz.grade;

import java.util.Random;

public class Array_02 {

	/*
	 * 1. main() method에서
	 * 	정수형 배열 intKor, intEng 를 50개씩 선언
	 * 2. 1 ~ 100까지 임의의 숫자를 만들어
	 * 	intKor, intEng 배열 요소에 저장한 후
	 * 3. 그림과 같이 console에 표시
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] intKor = new int[50];
		int[] intEng = new int[50];
		int intKorTotal = 0;
		int intEngTotal = 0;
		
		System.out.println("---------------------------");
		System.out.println("Kor\tEng");
		System.out.println("---------------------------");
		
		for(int i = 0 ; i < intEng.length ; i++) {
			intKor[i] = rnd.nextInt(100) + 1 ;
			intEng[i] = rnd.nextInt(100) + 1 ;
			
			System.out.printf("%3d\t%3d\n", intKor[i], intEng[i]);
			intKorTotal += intKor[i];
			intEngTotal += intEng[i];
		}
		System.out.println("---------------------------");
		System.out.printf("%3d\t%3d\n", intKorTotal, intEngTotal);
		System.out.println("===========================");
	}
}

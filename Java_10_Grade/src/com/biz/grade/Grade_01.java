package com.biz.grade;

import java.util.Scanner;

/*
 * 1. main() method에서 정수형 배열 intKor를 5개 선언
 * 2. 키보드에서 점수를 입력 받아, 정수로 변환한 후 intKor에 저장하시오
 * 3. 2번을 5번 반복하여 intKor 배열에 5개의 점수를 저장하시오
 *  
 */
public class Grade_01 {

	public static void main(String[] args) {

		// 정수형 배열 intKor를 5개 생성
		// 정수형 배열을 선언하겠다.. 키워드(명령어)
		// 	배열의 이름
		//		정수형 배열 5개를 생성
		int[] intKor = new int[5];
		
		// Scanner 클래스를 사용하겠다
		//		scan 객체로 선언하겠다
		//			Scanner를 시스템과 연결하라
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i < intKor.length; i++) {
			System.out.print((i+1) + "번째 값을 입력 >> ");
			String strKor = scanner.nextLine();
			intKor[i] = Integer.valueOf(strKor);
		}
		//System.out.println("intKor에 입력된 값 : ");
		for (int i = 0; i < intKor.length; i++) {
			
			//System.out.print("[" + i + "]" + intKor[i] + " ");
			System.out.println("intKor[" + (i) +"]에 입력된 값 : " +intKor[i]);
		}
	}
}

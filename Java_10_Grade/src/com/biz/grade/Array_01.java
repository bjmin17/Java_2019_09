package com.biz.grade;

import java.util.Random;

public class Array_01 {

	/*
	 * 1. main() method에서
	 * 		정수형 배열 intNum를 50개 선언
	 * 2. 1 ~ 100까지 임의의 숫자를 만들어 배열 요소에 저장
	 * 3. 배열 요소의 전체 합계와 평균을 구하여 console에 표시
	 */
	
	public static void main(String[] args) {
		
		int[] intNum = new int[50];
		Random rnd = new Random();
		
		// rnd 객체를 사용해서 intNum 배열 50개에
		// 각각 숫자를 채워넣기
		// 1 ~ 100까지 임의의 수를 만들어서...
		int intSum = 0;
		int intAvg = 0;
		
		// i 값이 0 (intNum.legnth -1)
		// i 값이 intNum.length - 1 보다 작으면
		// intNum[i] = rnd.nextInt(100) + 1 코드를 실행하라
		// 그 동안에 i 값은 1씩 증가한다.
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) + 1 ;
			intSum += intNum[i];
		}
		
		intAvg = intSum / intNum.length;
		System.out.println("합계\t평균");
		System.out.printf("%d\t%d\n", intSum, intAvg);
		
	}
}

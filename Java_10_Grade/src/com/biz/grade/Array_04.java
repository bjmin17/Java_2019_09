package com.biz.grade;

import java.util.Random;

public class Array_04 {

	/*
	 * 1. main() method에서
	 * 	정수형 배열 intNum를 50개 선언
	 * 2. 1 ~ 100까지 임의의 숫자를 만들어 배열 요소에 저장
	 * 3. 배열에 저장된 값들 중에
	 * 	소수들의 리스트를 console에 표시
	 */
	public static void main(String[] args) {
		int[] intNum = new int[50];
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) + 1 ;
		}
		
		int num = 0 ;
		System.out.println("소수 리스트");
		for(int i = 0 ; i < intNum.length ; i++) {
			for(num = 2; num < intNum[i] ; num++) {
				if(intNum[i] % num == 0) break;
			}
			if ( num >= intNum[i])
				if(intNum[i] > 1 )
					System.out.print(intNum[i] + " ");
		}
	}
}

package com.biz.grade;

import java.util.Random;

public class Array_03 {

	/*
	 * 1. main() method에서
	 * 	정수형 배열 intNum를 50개 선언
	 * 2. 1 ~ 100까지 임의 숫자를 만들어 배열 요소에 저장
	 * 3. 배열 요소 중에서 짝수만 console에 표시
	 * 4. 해당 요소가 배열의 몇 번째인지 같이 표시
	 */
	public static void main(String[] args) {
		
		int[] intNum = new int[50];
		Random rnd = new Random();
		int intSum = 0;
		
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) + 1; // 배열과 연산은 같이 쓰기보다는 나눠 쓰는게 좋음
		}
		
		// 배열에 저장된 요소들 중에
		// 짝수들의 리스트를 보여라
		for(int i = 0 ; i < intNum.length ; i++) {
			if(intNum[i] % 2 == 0) {
				//System.out.print(intNum[i] + " ");
				System.out.println((i+1) + "번째 값 : " + intNum[i]);
			}
		}
		// 배열에 저장된 요소들 중에
		// 짝수들의 합은 얼마인가?
		for(int i = 0 ; i < intNum.length ; i++) {
			if(intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}
		System.out.println("짝수들의 합 : " + intSum);
	}
}

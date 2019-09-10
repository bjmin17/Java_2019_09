package com.biz.string.exec;

import java.util.Random;

public class StringEx_05 {

	public static void main(String[] args) {

		/*
		 * 임의의 난수 10개를 생성하는 반복문에서
		 * 생성된 난수의 3번째 숫자들의 합을 구하시오.
		 * (시작위치는 0부터 이다)
		 */
		
		Random rnd = new Random();
		int sum = 0;
		
		for(int i = 0 ; i < 10 ; i ++) {
			int rNum = rnd.nextInt();
			if(rNum < 0) rNum *= -1;
			String strNum = rNum + "";
			String[] s = strNum.split("");
			sum = sum + Integer.valueOf(s[3]);
			//sum = Integer.valueOf(strNum.substring(3,4));
			System.out.println(rNum);
		}
		System.out.println("s[3] 숫자들의 합 : " + sum);
	}
}

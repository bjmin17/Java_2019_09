package com.biz.string.exec;

import java.util.Collections;

public class StringEx_03 {

	/*
	 * strNation에 담긴 문자열을
	 * 역순으로 콘솔에 표시하시오
	 * aeroK fo cilbupeR
	 */
	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		
		String[] s = strNation.split("");

		for(int i = s.length - 1 ; i > -1 ; i--) {
				System.out.print(s[i]);
		}
		System.out.println();
		
		
//		for(int i = 0 ; i < s.length ; i++) {
//			for(int j = i+1 ; j < s.length ; j++) {
//				String _Temp = s[i];
//				s[i] = s[j];
//				s[j] = _Temp;
//			}
//			System.out.print(s[i]);
//		}
		
		
	}
}

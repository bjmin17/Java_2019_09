package com.biz.grade.util;

public class LineMake {

	public static String make(String str, int length) {
		
		String s = "";
		for(int i = 0 ; i < length ; i++) {
			s += str;
		}
		return s;// static 뒤를 String형으로 바꿔주기,, s 가 String형이라서
	}
}

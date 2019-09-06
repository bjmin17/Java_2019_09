package com.biz.collections.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set_03 {

	public static void main(String[] args) {
		
		Set<Integer> intSet = new TreeSet<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			intSet.add(rnd.nextInt(10));
		}
		System.out.println(intSet);//[2, 3, 4, 5, 6, 8] 중복 값 제외되고 나온 값 실행할때마다 바뀜
		
		Set<String> strSet = new TreeSet<String>();
		
		/*
		 * 문자열을 TreeSet에 저장할 때
		 * 문자열의 자릿수(길이)가 일정하지 않으면
		 * 원하는대로 정렬이 이루어지지 않을 수 있다.
		 */
		for(int i = 0 ; i < 10 ; i++) {
			// 문자열로 정렬하면 우리가 의도하는 대로 정렬이 안됨 02d로 자릿수 맞춰주면 정상적으로 나옴//[05, 07, 17, 18, 41, 45, 46, 52, 58, 96]
			strSet.add(String.format("%02d", rnd.nextInt(100))); //[20, 26, 29, 44, 65, 71, 8, 81, 83, 85]
		}
		System.out.println(strSet);
		
		
	}
}

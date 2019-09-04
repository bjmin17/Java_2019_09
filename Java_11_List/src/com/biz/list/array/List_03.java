package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

public class List_03 {

	public static void main(String[] args) {
		
		// 1번 : 일반적인 코딩 방식
		// ArrayList<Integer> nums = new ArrayList<Integer>(); 이거 안 씀
		
		// 2번 : 객체지향의 패턴을 중요시 준수하는 코딩 방식
		// 선언은 List로 생성은 ArrayList로,, 자료형 저장하기 위한 규칙을 만듦
		// primitive(기본형) 변수들을 리스트로
		// 저장하기 위해서 선언하는 명령문들
		List<Integer> nums = new ArrayList<Integer>();
		List<String> sts = new ArrayList<String>();
		List<Long> longs = new ArrayList<Long>();
		List<Float> floats = new ArrayList<Float>();
		List<Double> doubles = new ArrayList<Double>();
		List<Character> chars = new ArrayList<Character>();
		List<Boolean> bools = new ArrayList<Boolean>();
		
		
		
	}
}

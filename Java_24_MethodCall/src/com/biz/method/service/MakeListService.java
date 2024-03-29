package com.biz.method.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeListService {

	Random rnd = new Random();
	List<Integer> intList;
	
	
	public List<Integer> getListAll(){
		
		int num1 = rnd.nextInt();
		int num2 = rnd.nextInt();
		int num3 = rnd.nextInt();
		int num4 = rnd.nextInt();
		int num5 = rnd.nextInt(); 
		
		intList = new ArrayList<Integer>();
		intList.add(num1);
		intList.add(num2);
		intList.add(num3);
		intList.add(num4);
		intList.add(num5);
		
		return intList;
	}
	
	/*
	 * 호출하는 곳에서 어떤 정수값을 파라메터로 주입해주면
	 * 		==> getListAll(10)
	 * 
	 * length 매개변수에 값을 받고
	 * 		==> length에 저장된 값이 10이다.
	 * 
	 * 정수개수만큼 임의의 정수를 생성하여 intList를 생성하여
	 * 		==> 10개의 정수를 생성하고 intList에 추가
	 * 
	 * 호출한 곳으로 return 하도록 작성
	 * 		==> 정수값이 10개 담긴 intList를 return하라
	 */
	public List<Integer> getListAll(int length) {
		
		intList = new ArrayList<Integer>();
		for(int i = 0 ; i < length ; i++) {
			int num = rnd.nextInt();
			intList.add(num);
		}
		return intList;
		
	}
	
}

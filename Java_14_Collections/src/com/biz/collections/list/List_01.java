package com.biz.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {
		
		// 정수형 숫자를 담을 list를 만듦
		// 선언과 초기화를 동시에 수행
		List<Integer> intList = new ArrayList<Integer>();
		
		// 선언과 초기화를 별도로 수행
		List<String> strList;
		strList = new ArrayList<String>();
		
		intList = new LinkedList<Integer>();
		strList = new LinkedList<String>();
		/*
		 * List 인터페이스로 선언한 객체는 ArrayList, LinkedList 클래스로 
		 * 초기화, 생성하여 사용할 수 있다.
		 */
		
		/*				추가/삭제	get(index)로 조회할때
		 * ArrayList	달팽이		치타
		 * LinkedList	치타		달팽이
		 */
		
	}
}

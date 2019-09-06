package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {

	public static void main(String[] args) {
		
		/*
		 * Collection 프레임워크는 
		 * 		List, Set과는 다른 형식의 데이터 구조이다.
		 * List,Set은 한 가지 type만을 리스트로 포함하는 구조인데
		 * Map은 2가지 type의 자료를 한 묶음의 리스트로 포함하며
		 * 	Key, Value 라는 독특한 구조를 가지고 있다.
		 */
		Map<String, String> strMap = new HashMap<String, String>();
		
		// Map에 데이터 추가,,, Set과는 다르게 add가 아닌 put사용
		// Key는 일종의 index, value는 값
		strMap.put("1", "홍길동");
		strMap.put("3", "성춘향");
		strMap.put("2", "이몽룡");
		strMap.put("5", "장길산");
		strMap.put("9", "임꺽정");
		//{1=홍길동, 2=이몽룡, 3=성춘향, 5=장길산, 9=임꺽정}
		System.out.println(strMap.get("9"));// 임꺽정, (어떤 특정한 위치, [4]가 아닌 데이터 중 key 값이 9인 항목을 찾아서 value를 알려줌
		// index(숫자)가 아닌 값으로 내용을 찾음,,,, <연상리스트>
		
	}
	
}

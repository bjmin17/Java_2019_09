package com.biz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("장보고");
		
		System.out.println(strList);//[홍길동, 이몽룡, 성춘향, 임꺽정, 장길산, 장보고]
		
		// strList 자체를 정렬해서
		// 다시 strList에 저장해준다.
		// Collections 하려면 반드시 List 인터페이스로 선언해야한다.
		Collections.sort(strList); // strList 자체를 정렬함
		System.out.println(strList);//[성춘향, 이몽룡, 임꺽정, 장길산, 장보고, 홍길동]
		
		// list에 담긴 값을 지 맘대로 뒤섞기
		Collections.shuffle(strList);
		System.out.println(strList);// [홍길동, 이몽룡, 성춘향, 장길산, 장보고, 임꺽정] 실행마다 바뀜
		
		
	}
}

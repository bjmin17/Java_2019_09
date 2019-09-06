package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

import com.biz.collections.model.GradeVO;

public class Map_04 {

	public static void main(String[] args) {
		
		/*
		 * Map 데이터 구조
		 * 데이터를 저장할 때 key, value의 쌍(pair)으로 put을 하며
		 * 데이터를 조회(찾기)할때 key 값만으로
		 * 빠르고 쉽게 찾을 수 있다.
		 * 데이터가 어떤 위치(index)에 있는지 몰라도
		 * 내용으로 검색하는 연상검색 기능을 구현한다.
		 */
		// 이번에는 특이하게 GradeVO라는 클래스를 씀
		Map<String, GradeVO> grades = new HashMap<String, GradeVO>();
		
		GradeVO vo = new GradeVO();
		vo.setStrName("홍길동");
		vo.setIntKor(90);
		vo.setIntEng(95);
		vo.setIntMath(77);
		grades.put("홍길동", vo); // list에서는 add로 추가했었음
		
		vo = new GradeVO();
		
		vo.setStrName("이몽룡");
		vo.setIntKor(11);
		vo.setIntEng(22);
		vo.setIntMath(33);
		grades.put("이몽룡", vo);
		
		vo = new GradeVO();
		
		vo.setStrName("성춘향");
		vo.setIntKor(44);
		vo.setIntEng(55);
		vo.setIntMath(66);
		grades.put("성춘향", vo);
		
		
		System.out.println("성춘향의 성적 : " + grades.get("성춘향"));//성춘향의 성적 : GradeVO [strName=성춘향, intKor=44, intEng=55, intMath=66]
		System.out.println("성춘향의 성적 : " + grades.get("성춘향").toString());	//성춘향의 성적 : GradeVO [strName=성춘향, intKor=44, intEng=55, intMath=66]	
		
	}
}

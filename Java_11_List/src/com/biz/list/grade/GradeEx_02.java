package com.biz.list.grade;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.service.GradeService;
import com.biz.list.service.GradeServiceImp_02;

public class GradeEx_02 {

	public static void main(String[] args) {
		
		// GradeService interface로 gs 객체를 정의하고
		// 				GradeServiceImp01()을 이용해서
		//				gs 객체를 생성
		//GradeService gs = new GradeServiceImp_01();
		GradeService gs = new GradeServiceImp_02();
		
		// List interface로 nums 객체를 정의하고 
		// 					ArrayList()를 이용해서 
		//					nums 객체를 생성하는 코드
		List<Integer> nums = new ArrayList<Integer>();
		
		gs.input(10);
		gs.total();
		gs.view(); // 학번 국어 영어 수학 총점 평균 석차 00001	 69	 89	 76	234	 78	  0
		
	}
}

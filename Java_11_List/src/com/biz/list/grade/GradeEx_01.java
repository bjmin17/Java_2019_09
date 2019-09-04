package com.biz.list.grade;

import com.biz.list.service.GradeServiceImp_01;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		GradeServiceImp_01 gs = new GradeServiceImp_01();
		gs.input(10);
		gs.view(); // 학번 국어 영어 수학 총점 평균 석차 00001	 76	 66	 68	  0	  0	  0
		gs.total();
		
	}
}

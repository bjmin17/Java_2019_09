package com.biz.grade;

import com.biz.grade.service.GradeService;

public class Grade_03 {

	public static void main(String[] args) {
		
		// GradeService 클래스가 뭔가 일을 할 수 있도록
		// 준비하는 단계
		// GradeService 클래스의 생성자에게
		// 정수 5를 보내서 멤버 배열 변수들을 
		// 생성할 수 있도록 한다.
		GradeService gs = new GradeService(5);
		gs.input();
		gs.view();
		
	}
}

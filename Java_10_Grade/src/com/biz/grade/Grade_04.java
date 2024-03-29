package com.biz.grade;

import com.biz.grade.service.GradeServiceV2;
import com.biz.grade.service.GradeServiceV3;

public class Grade_04 {

	public static void main(String[] args) {
		
		GradeServiceV3 gs = new GradeServiceV3(3);
		
		gs.input(); // 과목점수 입력
		gs.view(); // 입력된 점수 확인
		
		// gs.intputKor() method는 private으로 제한되어 있어서
		// 외부에서 method를 직접 호출할 수 없다.
		// gs.inputKor(0);
		gs.sort(); // 총점을 기준으로 내림차순 정렬
		gs.view(); // 정렬 후 점수 확인
	}
}

package com.biz.grade.service;

import java.util.Map;
import java.util.Set;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.util.LineMake;
/*
 * ========================================================
 * 학번 이름 국어 영어 수학 총점 평균 석차
 * ========================================================
 * 
 * ========================================================
 */
public class GradeServiceV1 {

	Map<String, StudentVO> stdList;
	Map<String, ScoreVO> scList;
	
	public GradeServiceV1() {
		// 기본생성자
	}
	
	public GradeServiceV1(Map<String,ScoreVO> scList) {
		// scList를 호출한 곳으로부터 받는 생성자
		this.scList = scList;
	}
	
	public GradeServiceV1(Map<String,ScoreVO> scList, Map<String, StudentVO> stdList) {
		// scList와 stdList를 호출한 곳으로부터 받는 생성자
		this.scList = scList;
		this.stdList = stdList;
	}
	
	public void setScList(Map<String,ScoreVO> scList) {
		this.scList = scList;
	}
	
	public void setStdList(Map<String,StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	public void list() {
		int length = 70;
		System.out.println(LineMake.make("=", length));
		System.out.println("성적일람표");
		System.out.println(LineMake.make("=", length));
		System.out.println("학번\t이름\t전화번호\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println(LineMake.make("-", length));
		
		//scList로부터 keySet을 뽑아냄
		Set<String> keys = scList.keySet();
		for(String key : keys) {
			ScoreVO scVO = scList.get(key);
			// StudentVO 의 학번을 추출해옴
			/*
			 * scVO의 학번(num)을 key값으로 하여
			 * stdList로부터 학생정보(StudentVO)를 추출하여
			 * 학생정보의 이름(name)부분을 list에 같이 표기
			 */
			StudentVO stVO = stdList.get(scVO.getNum());
			System.out.print(scVO.getNum() + "\t");
			
			// stVO로부터 학번을 가져와서 입력해줌
			// 전화번호 넣으려면 이름 뒤에 추가해주면 됨
			System.out.print(stVO.getName() + "\t");
			System.out.print(stVO.getTel() + "\t");
			System.out.printf("%4d\t", scVO.getKorScore());
			System.out.printf("%4d\t", scVO.getEngScore());
			System.out.printf("%4d\t", scVO.getMathScore());
			System.out.printf("%4d\t", scVO.getSumScore());
			System.out.printf("%5.2f\t", scVO.getAverage());
			System.out.printf("%5d\n", scVO.getRank());
		}
		
		System.out.println(LineMake.make("=", length));
	}
	
	
}

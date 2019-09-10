package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.string.domain.StudentVO;

public class StudentServiceV1 implements StringService {

	List<StudentVO> stdList;
	public StudentServiceV1() {
		stdList = new ArrayList<StudentVO>();
	}

	/*
	 * 학생 정보를 문자열 형태로 가지고 있는
	 * students 배열을 미리 생성해두고 
	 * 배열에 저장된 문자열을 split()으로 분해하여
	 * 각 항목별로 만들고
	 * 
	 * 학생정보 리스트를 만드는데 사용할 것
	 * 
	 */
	@Override
	public void input() {
		String[] students = new String[]
				{
						"홍길동:서울특별시:010-1111-1111:33",
						"성춘향:남원시:010-2222-2222:16",
						"이몽룡:익산시:010-3333-3333:18"
				};
		
		// student 배열의 0번째 요소에 저장된 문자열을
		// 콜론(:)을 기준으로 분해하여 
		// 배열로 생성하라
		String[] stdArray = students[0].split(":");
		// stdArray[0] => "홍길동"
		// stdArray[1] => "서울특별시"
		// stdArray[2] => "010-1111-1111"
		// stdArray[3] => "33"
		
		// 문자열 배열인 students를 반복하며 문자열 s로 추출
		// 학번 생성을 위한 변수 선언
		int intNum = 1;
		for(String s : students) {
			
			StudentVO stdVO = new StudentVO();
			
			// intNum 값을 문자열 학번으로 변환시키고
			// 1을 증가
			String strNum = String.format("%05d", intNum++);
			stdVO.setStrNum(strNum);
			
			// students 요소가 담긴 s 변수를 콜론(:) 문자열로 분해하여
			// stdArray 배열에 담기
			// stdArray 배열에 담긴 요소들을 stdVO에 세팅하기
			stdArray = s.split(":");
			stdVO.setStrName(stdArray[0]);
			stdVO.setStrAddr(stdArray[1]);
			stdVO.setStrTel(stdArray[2]);
			stdVO.setIntAge(Integer.valueOf(stdArray[3]));
			
			// 리스트에 추가하기
			stdList.add(stdVO);
			
		}
		
	}

	@Override
	public void list() {

		System.out.println("=================================================");
		System.out.println("학생명부");
		System.out.println("=================================================");
		System.out.println("학번\t이름\t주소\t전화\t나이");
		System.out.println("-------------------------------------------------");
		for(StudentVO vo : stdList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrAddr() + "\t");
			System.out.print(vo.getStrTel() + "\t");
			System.out.print(vo.getIntAge() + "\n");
		}
		System.out.println("=================================================");
	}

	@Override
	public void view() {
		
	}
	
	// 학번으로 학생 정보를 조회하는 method(),, void를 for문의 type인 StudentVO로 바꿔야
	public StudentVO search(String strNum) {
		
		for(StudentVO stdVO : stdList) {
			if(stdVO.getStrNum().equals(strNum)) {
				System.out.println("찾았다");
				return stdVO;
			}
		}
		return null;
		
	}
	public List<StudentVO> getScoreList(){
		return stdList;
		}

}

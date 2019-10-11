package com.biz.lombok.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {

//	List<StudentVO> stdList;
	

	@Override
	public void view() {
		// TODO Auto-generated method stub
		this.listTitle();
		for(StudentVO vo : stdList) {
			this.body(vo);
		}
		System.out.println("==================================");
	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		this.listTitle();
		for(StudentVO vo : stdList) {
			if(vo.getS_name().equals(strName))
				this.body(vo);
		}
		System.out.println("==================================");
	}

	@Override
	public void view(int intGrade) {
		// TODO Auto-generated method stub
		this.listTitle();
		for(StudentVO vo : stdList) {
			if(vo.getS_grade() == intGrade)
				this.body(vo);
		}
		System.out.println("==================================");
	}

	@Override
	public void view(int grGrade, int lessGrade) {
		// TODO Auto-generated method stub
		this.listTitle();
		for(StudentVO vo : stdList) {
			if(vo.getS_grade() <= grGrade && vo.getS_grade() >= lessGrade)
				this.body(vo);
		}
		System.out.println("==================================");
	}
	
	private void body(StudentVO stdVO) {
		System.out.print(stdVO.getS_num() + "\t");
		System.out.print(stdVO.getS_name() + "\t");
		System.out.print(stdVO.getS_tel() + "\t");
		System.out.print(stdVO.getS_grade() + "\t");
		System.out.print(stdVO.getS_addr() + "\n");
	}
	private void listTitle() {
		System.out.println("==================================");
		System.out.println("학생 명단 목록");
		System.out.println("==================================");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("----------------------------------");
	}
	
	

}

package com.biz.classes.exec;

import com.biz.classes.service.ClassServiceV1;

public class ClassEx_02 {

	public static void main(String[] args) {
		
		/*
		 * 현재 클래스(ClassEx_02)가 아닌 
		 * 다른 클래스(classServiceV1)에 있는 method를 호출하기
		 */
		
		// cs 객체 선언하기
		// 아직 cs 객체를 사용할 수 없는 상태!!
		ClassServiceV1 cs; 
		
		// cs 객체 초기화, 생성
		// cs는 인스턴스가 되었다
		// cs가 객체가 아니라 인스턴스가 됨
		// 이제는 cs 객체를 사용할 수 있는 상태
		// ==> ClassServiceV1 클래스에 선언된 method를
		// 		호출할 수 있다.
		cs = new ClassServiceV1();
		
		String strName = "홍길동";
		cs.getName(strName);
		
		System.out.println("strName : " + strName); //strName : 홍길동
		
		String[] strNames = new String[2];
		strNames[0] = "이몽룡";
		strNames[1] = "성춘향";
		
		System.out.println("strName[0] : " + strNames[0]); //strName[0] : 이몽룡
		System.out.println("strName[1] : " + strNames[1]); //strName[1] : 성춘향
		
		// getName(String[] strNames) method 호출하기
		// c언어에서는 변수의 값이 아닌 주소값을 줘서 그 주소의 값을 공유한다.(원본이 안 바뀜)
		// 자바에서는 일반변수는 주소 안 줌,,, 배열, 객체, 리스트는 주소 주기 허용
		cs.getName(strNames);
		System.out.println("strName[0] : " + strNames[0]); //strName[0] : 장보고
		System.out.println("strName[1] : " + strNames[1]); //strName[1] : 임꺽정
	}
}

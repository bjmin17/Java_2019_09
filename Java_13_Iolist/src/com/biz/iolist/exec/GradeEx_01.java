package com.biz.iolist.exec;

import java.util.Random;

import com.biz.iolist.model.GradeVO;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		GradeVO gradeVO = new GradeVO();
		gradeVO.setStrNum("001");
		gradeVO.setStrName("홍길동");
		gradeVO.setIntKor(90); 
		
		String s = gradeVO.toString();
		System.out.println(s); // 기억장소 주소 : com.biz.iolist.model.GradeVO@15db9742
								// GradeVO [strNum=001, strName=홍길동, intKor=90]
		
		
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i ++) {
			
			gradeVO = new GradeVO(rnd.nextInt()+"");
			s = gradeVO.toString(); // toString은 현재 정보가 저장된 기억장소의 주소를 알려주는 메서드
			System.out.println(s); // GradeVO에 toString 추가하면 GradeVO [strNum=null, strName=null, intKor=0]
									// GradeVO [strNum=001, strName=홍길동, intKor=90]
		}
		
		s = gradeVO.toString();
		System.out.println(s); //toString으로 확인.... GradeVO [strNum=308689971, strName=null, intKor=0]
		
	}
}

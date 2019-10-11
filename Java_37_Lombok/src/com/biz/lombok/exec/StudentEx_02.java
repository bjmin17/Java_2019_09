package com.biz.lombok.exec;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두 개의 정수를 입력받아 해당 범위의 학년에 해당하는 학생들만 콘솔에 보이기
 */
public class StudentEx_02 {

	public static void main(String[] args) {
		
		
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		
		Scanner scanner = new Scanner(System.in);
		String fileName = "src/com/biz/lombok/학생정보.txt";
		try {
			sRead.readStudent(fileName);
			
			List<StudentVO> stdList  = sRead.getStdList(); 
			sView.setStdList(stdList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("==================================");
			System.out.println("1. 전체명단 보기 2. 이름 3. 학년 4. 학년범위 0. 종료");
			System.out.println("==================================");
			System.out.print("메뉴선택 >> ");
			
			
			String strM = scanner.nextLine();
			int intM = Integer.valueOf(strM);
			
			
			if(intM == 0)break;
			if(intM == 1) sView.view();
			if(intM == 2) {
				System.out.print("보고자하는 이름 입력하기 >> ");
				String strName = scanner.nextLine();
				sView.view(strName.trim());
			}
			if(intM == 3) {
				System.out.print("학년으로 입력하기 >> ");
				String strGrade = scanner.nextLine();
				sView.view(Integer.valueOf(strGrade.trim()));
			}
			if(intM == 4) {
				System.out.println("학년범위로 입력하기");
				System.out.print("최저학년 >> ");
				String strLessGrade = scanner.nextLine();
				System.out.print("최고학년 >> ");
				String strGrGrade = scanner.nextLine();
				sView.view(Integer.valueOf(strGrGrade.trim()),Integer.valueOf(strLessGrade.trim()));
			}
		}
		System.out.println("종료!!!");
		System.out.println("==================================");
	}
}

package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		FileGradeService fg = new FileGradeServiceV1();
		String scoreFile = "src/com/biz/files/score.txt";
		
		try {
			fg.read(scoreFile); // 003번 학생의 점수 확인,, 학생 성적에 A라는 문자열이 들어가서 오류 발생
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fg.list();
		
	}
}

package com.biz.word.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV2;

public class WordQuizStart_01 {

	public static void main(String[] args) {
		
		WordListMakeService wm = new WordListMakeService();
		WordQuizService wq = new WordQuizServiceV2();
		wq = new WordQuizServiceV2();
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		
		Scanner scan = new Scanner(System.in);
		
		try {
			wm.makeWordList(wordFileName);
			List<WordVO> wordVOList = wm.getWordVOList();
			wq.setWordVOList(wordVOList);
			
			while(true) {
				System.out.println("=========================");
				System.out.println("행복나라 영어 정복 v1");
				System.out.println("=========================");
				
				wq.viewEngWord();
				wq.quizExec();
				
				// 개선할 부분
				if(((WordQuizServiceV2)wq).nCount <0) break;
				
//				System.out.println("아무 키나 누르세요... 종료(-0) ");
//				String strKey = scan.nextLine();
//				if(strKey.equals("-0")) break;
							
			}
			System.out.println("GAME OVER!!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

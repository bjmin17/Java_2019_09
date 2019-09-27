package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizService;
import com.biz.word.service.WordQuizServiceV1;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_02 {
	
	public static void main(String[] args) {
		
		WordListMakeService wm = new WordListMakeService();
		WordQuizService wq = new WordQuizServiceV1();
		wq = new WordQuizServiceV2();
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		
		try {
			
			// wm에서 wordVOList를 만들고 가져오기
			
			// 1. 파일을 읽어서 list를 생성해 두어라
			wm.makeWordList(wordFileName);
//			WordQuizServiceV1 wq = new WordQuizServiceV1(wm.getWordVOList());
			
			// 2. 생성 list를 가져오기
			List<WordVO> wordList = wm.getWordVOList();
			
			// 3. wq에게 wordList를 주입하기
			wq.setWordVOList(wordList);
			
			// 4. wq에게 주입된 wordList 중에 한 개를 추출하여
			//		영단어를 콘솔에 보여라
			
			wq.viewEngWord();
			
			// 5. 키보드에서 입력하여 단어 맞추기
			wq.quizExec();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
}

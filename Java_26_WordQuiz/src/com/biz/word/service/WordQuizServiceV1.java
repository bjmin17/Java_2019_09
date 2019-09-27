package com.biz.word.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV1 implements WordQuizService {

	// protected
	// 상속받은 곳에서만 사용해라
	// 만약 이 클래스를 누군가에게 상속하고
	// 상속받은 곳에서 wordVOlist를 사용할 수 있게 하려면
	// protected를 설정하라
	protected List<WordVO> wordVOList;
	
	public WordQuizServiceV1() {
	}
	
	public WordQuizServiceV1(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}
	
	public void setWordVOList(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}
	
	// wordVOList에서 임의의 1개의 영문단어를 추출하여
	// console에 보여주시오
	public void viewEngWord() {
//		wordVOList = new ArrayList<WordVO>(); // 이거때문에 사이즈 못만듦
		
		int nSize = wordVOList.size();
		Random rnd = new Random();
		int nIndex = rnd.nextInt(nSize);
		
//		for(int i = 0 ; i < nSize ; i++) {
		WordVO wordVO = wordVOList.get(nIndex);
			System.out.println(wordVO.getEngWord());
//		}
	}

	/*
	 * viewEngWord() method에서 뒤섞어 보여준 단어의
	 * 원형을 키보드로 입력받고
	 * 맞는지 틀린지를 보여주는 코드를 작성
	 */
	@Override
	public void quizExec() {
		
	}
}

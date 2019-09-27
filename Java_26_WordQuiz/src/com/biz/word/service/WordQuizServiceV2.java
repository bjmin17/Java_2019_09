package com.biz.word.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1{

	// V1에서 선언된 wordVOList를 사용하기 위해서 제거
//	List<WordVO> wordVOList;

	// V1에서 선언된 setWordVOList() 를 사용하기 위해서 제거
//	public void setWordVOList(List<WordVO> wordVOList) {
//		this.wordVOList = wordVOList;
//	}
	
	// wordVOList에서 임의의 1개의 영문단어를 추출하여
	// 알파벳을 낱개로 분해한 후
	// 무작위로 섞어서 console에 보이시오
	String strEng ;
	WordVO wordVO;
	int nCount;
	
	
	public WordQuizServiceV2() {
		strEng = "";
		wordVO = new WordVO();
		nCount = 0;
	}
	public void viewEngWord() {
		
		// 단어맞추기를 1번이라도 틀린 적이 있으면
		// nCount가 0 보다 클것이고
		// 그러면 이미 생성되어 있는 wordVO를
		// private viewEngWord(wordVO)에게 보내서
		// 다시 한번 뒤섞은 뒤 보여주기
		
		if(nCount > 0) {
			System.out.println();
			this.viewEngWord(wordVO);
			return;
		}
		
		// 새로운 단어로 시작이 되는 경우
		// 	게임을 최초로 시작한 경우
		// 	앞에서 단어를 맞추었을 경우
		
//		wordVOList = new ArrayList<WordVO>(); // 이거때문에 사이즈 못만듦
		
		int nSize = wordVOList.size();
		Random rnd = new Random();
		int nIndex = rnd.nextInt(nSize);
		
		wordVO = wordVOList.get(nIndex);

		
		this.viewEngWord(wordVO);

		
//		int sSize = strWord.length;
		
//		for(int i = 0 ; i < sSize; i++) {
//			String strEE = strWord[i];
//			wordList.add(strEE);
//			
//			Collections.shuffle(wordList);
//		}
//		System.out.println(wordList);
		
	} // end viewEngWord()
	
	private void viewEngWord(WordVO wVO) { // 뒤섞어서 화면에 print 해주는 일만 함

		// 임시코드 실제는 삭제될 코드
//		System.out.println(wVO.getEngWord());
		
		strEng = wVO.getEngWord();
		String[] strWord = strEng.split(""); // 알파벳단위로 분해하기
		
//		List<String> wordList = new ArrayList<String>();
		//문자열 배열을 문자열형 List로 바꾸는 방법
		List<String> wordList = Arrays.asList(strWord);
		
		
		Collections.shuffle(wordList); // 뒤죽박죽 섞는 방법
		System.out.println(wordList);
		
		Collections.sort(wordList); // a,b,c 순서로 보여줌
		System.out.println(wordList);
	}
	
	/*
	 * viewEngWord() method에서 뒤섞어 보여준 단어의
	 * 원형을 키보드로 입력받고
	 * 맞는지 틀린지를 보여주는 코드를 작성
	 * 
	 * 예를 들어
	 * [e, n, c, n, c, o, r]를 보여주고
	 * concern 이라는 단어를 입력하면 "맞았어요"
	 * 아니면 "틀렸어요"를 보여주기
	 */
	public void quizExec() {
		
		System.out.println("----------------------------");
		System.out.print("단어 입력 힌트(H) >> ");
		Scanner scanner = new Scanner(System.in);
		String strScan = scanner.nextLine();
		
		if(strScan.equals("H")) {
			System.out.println("----------------------------");
			System.out.println(wordVO.getKorMeans());
			int half = wordVO.getEngWord().length() / 2;
			System.out.println(wordVO.getEngWord().substring(0,half));
			System.out.println("----------------------------");
		}
		
		
		if(strScan.equalsIgnoreCase(wordVO.getEngWord())) {
			System.out.println("----------------------------");
			System.out.println("맞았어요");
			System.out.println("시도횟수 : " + (nCount + 1));
			System.out.println("----------------------------");
			System.out.println(wordVO.getKorMeans());
			System.out.println("----------------------------");
			nCount = 0;
			
		} else {
			System.out.println("----------------------------");
			System.out.println((nCount + 1) + "번 틀렸어요");
			System.out.println("----------------------------");
//			System.out.print("계속(Enter), 힌트보기(H+Enter) >> ");
//			String strH = scanner.nextLine();
//			if(strH.equals("H")) {
//				System.out.println("----------------------------");
//				System.out.println(wordVO.getKorMeans());
//				System.out.println("----------------------------");
//			}
			nCount ++;
//			System.out.println(wordVO.getEngWord());
		}		
		
	}
}

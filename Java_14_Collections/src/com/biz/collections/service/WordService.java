package com.biz.collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {

	public int count;
	private List<String> wordList;
	private String word;
	private List<String> words;
	
	private Scanner scan;
	
	public WordService() {

		scan = new Scanner(System.in);
		
		wordList = new ArrayList<String>();
		wordList.add("yesterday");
		wordList.add("morning");
		wordList.add("tomorrow");
		wordList.add("school");
		wordList.add("computer");
		wordList.add("human");
		wordList.add("monday");
		
		count = 0;
	}
	
	public void makeWord() {
		
		// 단어들 리스트를 뒤섞기
		Collections.shuffle(wordList);
		
		// 뒤섞인 단어 리스트에서 0번째 단어만 추출
		word = wordList.get(0); // wordList를 섞어서 0번째 위치해있는 wordList 값을 word에 저장
		
		// 추출된 단어를 알파벳 단위로 나누어서 List로 변환
		words = Arrays.asList(word.split(""));
		
		// 알파벳 뒤섞기
		Collections.shuffle(words);
		
		
	}
	
	public boolean input() { // void를 boolean으로 바꿈

		if(count < 1) {
			this.makeWord();
		}
		
		
		System.out.println("===================================");
		System.out.println("단어 맞추기 게임!!");
		System.out.println("===================================");
		System.out.println("제시한 알파벳을 잘 배열하여");
		System.out.println("단어를 완성하시오.");
		System.out.println("-----------------------------------");
		System.out.println(words);// words는 뒤섞인 단어가 나오기 때문에 this.makeWord와 똑같음
		System.out.println("-----------------------------------");
		System.out.print("(-1:END) >> ");
		String strKeyIn = scan.nextLine();
		if(strKeyIn.equals("-1")) {
			return true;
		}
		
		if(strKeyIn.equalsIgnoreCase(word)) { // 입력한 단어가 우리가 만든 단어인 word와 같으면
			System.out.println((count+1) + "번만에 맞았습니다");
			count = 0;
		} else {
			System.out.println("틀렸습니다");
			count++;
		}
		System.out.println("Press Any Key to Continue...(-1 : END)");
		String anyKey = scan.nextLine();
//		if(anyKey.equals("-1")) {
//			return true;
//		}
		return false;
		
	}
	
}

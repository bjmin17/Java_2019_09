package com.biz.collections.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto_01 {

	public static void main(String[] args) {
		
		/*
		 * List를 사용한 Lotto번호 추출
		 * 1. 정수값을 저장할 List를 생성
		 * 2. 1 ~ 45까지의 값을 add()
		 * 3. Collections 의 shuffle()로 섞음
		 * 4. index 0 부터 5번까지 값을 추출해서
		 * 보여주면 된다.
		 * 
		 * 
		 */
		List<Integer> lottos = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 45 ; i++) {
			lottos.add(i+1); // 이 값을 lottos에 저장하는데 i+1로 저장
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			Collections.shuffle(lottos);	
		}
		
		List<Integer> viewLottos = new ArrayList<Integer>();
		for(int i = 0 ; i < 6 ; i++) {
			viewLottos.add(lottos.get(i)); //6개만 viewLottos로 복사
		}
		
		Collections.sort(viewLottos);
		
		System.out.println("======================================");
		System.out.println("대박나세요!!!");
		System.out.println("--------------------------------------");
//		for(int i = 0 ; i < 6 ; i++) {
//			System.out.printf("%d, ", lottos.get(i));
//		}
		for(int n : viewLottos) {
			System.out.printf("%d, ", n);
		}
		System.out.println("\n======================================");
	}
}

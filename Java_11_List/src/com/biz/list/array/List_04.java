package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 7 ; i++) {
			nums.add(rnd.nextInt());
		}
		
		// list.size()
		// 현재까지 추가된 리스트의 개수를 알려주는 method
		
		// 1번 코드
		for(int i = 0 ; i < nums.size() ; i++) { //nums.size()는 계속 계산을 하기 때문에 비효율적임
			System.out.println(nums.get(i)); // 7개의 리스트를 만들고 그 내용을 보여주는 코드
		}
		
		// 2번 코드
		int numsSize = nums.size(); // 미리 size 계산을 수행하기 때문에
		for(int i = 0 ; i < numsSize ; i++) { // 위에 코드보다 실행 속도는 훨씬 빠름
			System.out.println(nums.get(i));
		}
		
		/*
		 * list의 개수만큼 반복문을 실행하고자 할 때
		 * 1번 코드는 for 반복문이 실행되는 횟수만큼
		 * list.size() 메서드를 호출하여
		 * 		size() 메서드에 작성된 코드가 반복 수행된다.
		 * 
		 * 하지만,
		 * 2번 코드는 for 반복문을 시작하기 전에
		 * 미리 개수를 계산하여 변수에 저장하여두고
		 * 변수 값을 읽어서 반복문을 수행하므로
		 * 리스트의 개수가 많아지면 많아질수록
		 * 훨씬 효율적인 코드가 된다.
		 */
		
	}
}

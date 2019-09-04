package com.biz.list.array;

import java.util.Random;

public class Prime_01 {

	/*
	 * 50개의 정수형 배열을 생성하고
	 * 각 요소에 1 부터 100까지 임의의 수를 저장하고
	 * 그 수가 소수인가를 찾는 코드(Prime)
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[50];
		
		// 임의의 숫자를 생성하기 위해 사용하는 class
		// Random class를 사용할 수 있도록
		// 		rnd 객체로 생성
		// rnd는 Random class의 method를 호출해서
		// 		연산(어떤 일들)을 수행하기 위한 대리자
		Random rnd = new Random();
		
		int num = rnd.nextInt(); // 정수 임의의 숫자를 생성
		num = rnd.nextInt(100) ; // 정수 0 ~ 99까지의 임의의 숫자 생성
		num = rnd.nextInt(100) + 1 ; // 정수 1 ~ 100까지의 임의의 수 생성
		
		for(int i = 0 ; i < nums.length ; i++) {
			
			// 1번 코드
			int rndNum = rnd.nextInt(100) + 1 ;
			nums[i] = rnd.nextInt(100) + 1;
			
			// 2번 코드
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0 ; i <nums.length ; i++) {
			// System.out.println(nums[i]);
			System.out.printf("%4d", nums[i]);
			
			if((i+1) % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}

		// 소수를 찾아서 리스트를 보이는 코드
		int intNum = 0;
		for (int i = 0; i < nums.length; i++) {
			
			// 만약 nums 배열의 i 위치에 값이 2 미만이면(0, 1)이면
			// 해당 값은 소수 검사를 하지 말고 
			// i++ 를 수행하여 다음번 위치에 있는 값으로 건너 뛰어라
			
			// 예)
			// nums[3] 값이 1이다 라고 가정하면
			// nums[3]의 값은 소수 검사를 하지말고
			// nums[4]로 건너 뛰어라
			if(nums[i] < 2) {
				
				/*
				 * for, whil 등의 반복문 내에서
				 * 어떤 이유로든 continue 명령문을 만나면
				 * 그 이후의 코드는 모두 무시하고 건너 뛴다.
				 * 
				 */
				continue; //
			}
			
			for (intNum = 2; intNum < nums[i]; intNum++) {
				if (nums[i] % intNum == 0) // 1번이라도 true면 소수가 아니다
					break;
			}
			
			// 소수이면 break를 만나서 intNum 반복이 중단
			// 소수가 아니면 break 한번도 만나지 않아서
			//		intNum 반복이 모두 완료
			if (intNum >= nums[i]) {  // 반복문이 모두 완료!!
					System.out.println("nums[" + i + "] : " + nums[i] + " 은 소수다.");
			}

		}

	}
}

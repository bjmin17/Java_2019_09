package com.biz.classes.exec;

public class ClassEx_04 {

	public static void main(String[] args) {
		
		int[] nums = new int[2];
		nums[0] = 40;
		nums[1] = 50;
		
		// Ex_03에서 배열을 이용하면 값이 바뀜,,, 
		// Ex_04에선 안 바뀜,,,, 매개변수로 받은 배열의 요소!!!!를 바꾼 것
		System.out.printf("nums[0] : %d, nums[1] : %d\n", nums[0], nums[1]); //nums[0] : 40, nums[1] : 50
		swap(nums);
		System.out.printf("nums[0] : %d, nums[1] : %d\n", nums[0], nums[1]); //nums[0] : 40, nums[1] : 50
	}
	
	/*
	 * method에서 매개변수로
	 * 배열, 객체(String, Integer 등 제외), 리스트를
	 * 받은 후
	 * 각 요소들의 값을 변경을 하면
	 * 전달한 쪽 원본 데이터의 값도 같이 변경이 된다.
	 * 
	 * 단,
	 * method에서 new 키워드로 재생성을 하면
	 * 원본과는 다른 변수가 되어
	 * 값을 변경해도 원본에 영향을 미치지 않는다.
	 */
	public static void swap(int[] nums) {
		nums = new int[2];
		nums[1] = 100; //nums[0] : 40, nums[1] : 50
		nums[0] = 200; //nums[0] : 40, nums[1] : 50로 값이 바뀌지 않음
	}
	
}

package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {

	
	private static int[] intKor; //static은 자유롭게 접근할 수 있는 코드라는 의미
	private static Scanner scan;
	
	public static void main(String[] args) {

		intKor = new int[5];
		scan = new Scanner(System.in);
		for (int i = 0; i < intKor.length; i++) {
			input(i); // i값에 저장된 0 ~ intKor.length -1 까지를 input에 전달하는 코드
		}
		
		// main()에서 배열의 개수만큼 반복적으로
		// view() 메서드에게 국어점수를 표시하라고 지시
		for(int i = 0 ; i < intKor.length ; i++) {
			view(i);
			
		}
		
		// 아예 intKor 배열을 통째로 
		//		view() 메서드에게 보내고
		// 알아서 표시하라고 지시
		view(intKor);
		
	} // main end
	
	public static void input(int index) {
		System.out.print( (index+1) + "번의 국어 >> ");
		String strKor = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor);
	}
	
	// index번째 배열의 국어 점수를 표시
	public static void view(int index) {
		System.out.println((index+1) + "번 국어 : " +intKor[index]);
	}
	
	// intKor 배열전체를 표시하는 부분
	public static void view(int[] intKor) {
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.println((i+1) + "번 국어 : " + intKor[i]);
		}
	}
}

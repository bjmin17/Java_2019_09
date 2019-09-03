package com.biz.grade;

import java.util.Scanner;

public class Grade_02 {

	/*
	 * 멤버변수
	 * 멤버변수 영역에 선언된 변수들은
	 * 종류, type에 관계없이
	 * 현재 클래스(Grade_02)에 선언된 모든 method에서
	 * 접근(읽기, 쓰기, 생성 등등)을 할 수 있다.
	 * 
	 * 어떤 method에서 멤버변수에 값을 저장하면
	 * 다른 method에서 그 값을 읽어서 연산을 수행할 수 있다.
	 * 
	 * 멤버변수 접근제한자
	 * public : 아무런 제한없이 멤버변수에 접근할 수 있다.
	 * private : 현재 클래스에 있는 
	 * 			method에서만 접근할 수 있다.
	 *
	 * 현재 클래스에 main() method가 있으면
	 * 모든 멤버변수에 static을 붙이자
	 * 그래야만이 main() 메서드에서 멤버변수에 접근할 수 있다.
	 * 
	 * 또한
	 * main() 이외 다른 method에도 static을 붙여야 한다.
	 * 
	 */
	
	// 1. intKor 배열변수를 static으로 선언만
	//		배열의 개수가 정해지지 않은 상태
	//		배열을 사용할 수 없는 단계, 선언부와 생성부를 분리
	private static int[] intKor; //static은 자유롭게 접근할 수 있는 코드라는 의미
	
	// Scanner 클래스를 scan 객체로 선언만
	// 아직 scan을 사용할 수 없는 단계
	private static Scanner scan;
	
	public static void main(String[] args) {

		// 2. intKor 배열변수를 5개의 배열로 생성
		//		배열을 사용할 준비가 된 단계
		intKor = new int[5];
		
		// scan 객체를 사용해서 키보드에서 값을 입력
		//		받을 수 있게 준비가 된 단계
		scan = new Scanner(System.in);
		
		
		for (int i = 0; i < intKor.length; i++) {
			input(i);
		}
	} // main end
	
	public static void input(int index) {
		System.out.print("국어점수 >> ");
		String strKor = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor);
	}
}

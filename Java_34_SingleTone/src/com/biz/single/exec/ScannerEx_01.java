package com.biz.single.exec;

import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		System.out.println("아무문자나 입력!! >> ");
		String str1 = scan1.nextLine();
		scan1.close();
		
		System.out.println("아무문자나 입력!! >> ");
		String str2 = scan2.nextLine(); //NoSuchElementException 발생,, 키보드,프린터 등과 같은 장치들은 동시에 2개 사용X
		
		
		System.out.println("아무문자나 입력!! >> ");
		String str3 = scan3.nextLine();
		
		System.out.println(str1 + " : " + str2 + " : " + str3);
	}

}

package com.biz.bank.service;

import java.util.Scanner;

public class BankServiceV3 {

	int intBalance = 0;
	String strAccNum;
	
	Scanner scanner = null; //new Scanner(System.in); // 서비스클래스에서 스캐너 만들면 불편해지니 생성자에 넣어줌
	
	// BankServiceV1의 생성자
	public BankServiceV3() {
		scanner = new Scanner(System.in);
	}
	
	// BankServiceV1의 또다른 생성자
	// 계좌번호와 잔액을 파라메터(매개변수)로 받는 생성자
	public BankServiceV3(String strAccNum, int intBalance) { // 계좌번호가 없다고 떠서 생성자를 하나 더 만듦
		this.strAccNum = strAccNum;
		this.intBalance = intBalance;
		scanner = new Scanner(System.in);
	}
	
	// 만약 계좌번호가 있으면
	// 잔액을 보여주고 true를 return
	// 계좌번호가 없으면
	//		없다는 메시지를 보이고 false를 return
	public boolean viewAcc() {
		System.out.print("계좌번호 >> ");
		String strAccKeyIn = scanner.nextLine();
		if(!strAccKeyIn.equals(strAccNum)) { // 계좌번호가 없으면
			System.out.println("계좌번호가 없음!!");
			return false;
		} // V2는 true의 코드가 길어지면 if문 바깥으로 이동해버릴수 있기 때문에 
		// 중요한 코드는 if 끝나고 작동하도록
		System.out.println("===================================");
		System.out.printf("계좌번호 : %s\n" , strAccNum);
		System.out.printf("잔고 : %d\n" , intBalance);
		System.out.println("===================================");
//			this.viewAcc(); // 옳게 입력했을 때 return 할 때 문제가 발생할 수 있음
		return true;
		
	}
	
	public void input() throws NumberFormatException {
		
		System.out.println("입금처리");
		System.out.println("===================================");
		/*
		 * 2. 입금을 받고
		 * 3. 계좌잔액 = 입금액 + 계좌잔액
		 */
		System.out.print("입금액 >> ");
		String strInput = scanner.nextLine();
		int intInput = Integer.valueOf(strInput);
		intBalance += intInput;

	}

	// output() method가 실행되는 동안 NumberFormat... 이 발생하면
	// 호출한 곳에 알려줘라.
	public void output() throws NumberFormatException {
	
		System.out.println("출금처리");
		System.out.println("===================================");
		/*
		 * 2. 출금을 받고
		 * 3. 잔액 >= 출금 : 잔액 = 잔액 - 출금액
		 *    잔액 < 출금 : 출금 거부
		 */
		System.out.print("출금액 >> ");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		if(intBalance >= intOutput) {
			intBalance -= intOutput;
		} else {
			System.out.println("잔액 부족!! 출금 거부 !!");
		}
		
	}
}

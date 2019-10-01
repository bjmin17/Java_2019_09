package com.biz.pay.service;

/*
 * 1. make() method를 정의하고
 * 2. 매개변수로 pay(급여)를 전달 받고
 * 3. 화폐매수를 계산하여 console에 보이시오.
 * 4. test를 위해서 PayEx_02를 만들고
 * 		main() method에서 테스트를 수행하시오.
 */
public class PaperMakeServiceV1 {
	
	public void make(int pay) {
		int balance = 50000;
		int nSwitch = 1;
		while(true) {
			
			// 최초에 권명 50000 이므로
			// 매수는 5만원권 매수가 된다.
			
			if(balance < 10) break;
			int count = pay/balance;
			System.out.println(balance + "원권 : " + count + " 장");
			
			pay -= count * balance;
			nSwitch *= -1;
			if(nSwitch < 0) {
				balance = balance / 5;
			}
			else {
				balance = balance / 2;
			}
		}
	}
}

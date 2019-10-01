package com.biz.pay.exec;

/*
 * 1. main() method에서
 * 2. 3758750원의 급여를
 * 		액면가 5만, 1만, 5천, 1천, 5백, 1백, 50, 10인 화폐로
 * 		최소한으로 지급할 수 있도록 매수를 계산하시오.
 */
public class PayEx_01 {

	public static void main(String[] args) {

		int pay = 3758750;
		int balance = 50000; // 대한민국 화폐단위 최상위 금액
		int nSwitch = 1;
		
		while(true) {
			
			// 최초에 권명 50000 이므로
			// 매수는 5만원권 매수가 된다.
			
			if(balance < 10) break;
			int count = pay/balance;
			System.out.println(balance + "원권 : " + count + " 장");
			
			pay -= count * balance;
			nSwitch *= -1;
			if(nSwitch > 0) {
				balance = balance / 2;
			}
			else {
				balance = balance / 5;
			}
		}
	}
}

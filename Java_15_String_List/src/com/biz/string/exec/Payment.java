package com.biz.string.exec;

/*
 * 화폐매수 계산
 */
public class Payment {

	public static void main(String[] args) {
		
		// 지급하는 화폐를 최소화하는 방법
		int pay = 3785870;
		int mo = 50000;
		
		// 5만원권 매수
		int count = (int)(pay / mo); // 5만원권 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5만원 매수를 제외한 금액
		
		// 만원권 매수
		mo = mo / 5; // 1만원
		count = (int)(pay / mo); // 1만원권 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 만원권 매수 제외한 금액
		
		// 5천원권 매수
		mo = mo / 2; // 5천원
		count = (int)(pay / mo); // 5천원권 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; //5천원권 매수 제외한 금액
		
		// 천원권 매수
		mo = mo / 5; // 천원
		count = (int)(pay / mo); // 천원권 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; //천원권 매수 제외한 금액
		
		// 5백원권 매수
		mo = mo / 2; // 5백원
		count = (int)(pay / mo); // 5백원 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; //5백원 매수 제외한 금액
		
		// 백원 매수
		mo = mo / 5; // 백원
		count = (int)(pay / mo); // 백원 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; //백원 매수 제외한 금액
		
		// 오십원 매수
		mo = mo / 2; // 오십원
		count = (int)(pay / mo); // 오십원 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; //오십원 매수 제외한 금액
		
		// 십원 매수
		mo = mo / 5; // 십원
		count = (int)(pay / mo); // 십원 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; //십원 매수 제외한 금액
		
		
		
				
		
		
		
		
		
	}
}

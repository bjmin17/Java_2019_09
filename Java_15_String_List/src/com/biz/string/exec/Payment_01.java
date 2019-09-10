package com.biz.string.exec;

public class Payment_01 {

	public static void main(String[] args) {
		
		int pay = 3785870;
		int mo = 50000;
		
		int sum = 0;
		int count = 0;
		
		
		for(; mo >= 10;) {
			
			count = (int)(pay / mo);
			System.out.println(mo + "원권 : " + count);
			pay = pay - count * mo;
			
			if(sum == 0) {
				mo = mo / 5;
				sum =1;
			}else {
				mo = mo / 2;
				sum = 0;
			}

			
//			mo = mo / 5; // 1만원
//			count = (int)(pay / mo); // 1만원권 매수
//			System.out.println(mo + "원권 : " + count);
//			pay = pay - count * mo; // 만원권 매수 제외한 금액

//			int count = (int)(pay / mo); // 5만원권 매수
//			System.out.println(mo + "원권 : " + count);
//			pay = pay - count * mo; // 5만원 매수를 제외한 금액

			
		}
		
		
	}
}

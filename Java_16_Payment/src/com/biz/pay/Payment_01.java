package com.biz.pay;

import com.biz.pay.service.PayServiceV1;

/*
 * 반복문을 사용하여 화폐매수를 계산하시오
 * 1. 화폐 권종을 배열로 선언하여 계산하는 방법
 * 		화폐 권종이 불규칙적인 경우 사용하는 방법
 */
public class Payment_01 {

	public static void main(String[] args) {
		
		// 배열로 화폐 매수 구하기
		int pay = 3785870;
		PayServiceV1 ps = new PayServiceV1();
		
		ps.array(pay);
		
//		int sum = 0;
//		int count = 0;
//		
//		
//		for(; mo >= 10;) {
//			
//			count = (int)(pay / mo);
//			System.out.println(mo + "원권 : " + count);
//			pay = pay - count * mo;
//			
//			if(sum == 0) {
//				mo = mo / 5;
//				sum =1;
//			}else {
//				mo = mo / 2;
//				sum = 0;
//			}
//
			
//			mo = mo / 5; // 1만원
//			count = (int)(pay / mo); // 1만원권 매수
//			System.out.println(mo + "원권 : " + count);
//			pay = pay - count * mo; // 만원권 매수 제외한 금액

//			int count = (int)(pay / mo); // 5만원권 매수
//			System.out.println(mo + "원권 : " + count);
//			pay = pay - count * mo; // 5만원 매수를 제외한 금액

			
	
		
		
	}
}

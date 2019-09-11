package com.biz.pay.service;

public class PayServiceV3 extends PayServiceV2{


	// array(int pay)
	// whilePay(int pay)
	
	// V2의 whilePay가 마음에 안 들어 다시 정의해서 사용할 예정

	@Override
	public void whilePay(int nPay) {
		
		this.headerView(nPay);
		
		int intSw = 1;
		
		// while(참인 조건) {   }
		// 참인 조건을 만족하는 동안 {  } 코드를 실행해라
		
		while(true) {

			if(nPay < 5) break;
			
			int nCount = nPay / nMoney ; // 매수 계산
			nPay -= nCount * nMoney; // nPay = nPay - nCount * nMoney
			System.out.printf("%8s 원권 %4d매\n", paperForm.format(nMoney), nCount);
			
			if(intSw == 1) {
				nMoney /= 5; // nMoney = nMoney / 5
			} else {
				nMoney /= 2; // nMoney = nMoney / 2
			}
			intSw = intSw * (-1); // 0과 1로 바꾸는 것보다 알고리즘에서 더 유리,,, 스위치코드
									// 연산결과가 잘못될 확률을 굉장히 낮출 수 있음
		}
		System.out.println("=============================");
	}
}

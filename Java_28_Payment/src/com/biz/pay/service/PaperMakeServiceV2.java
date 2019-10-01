package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 * 1. List<PaperVO> paperList를 선언
 * 2. make() method를 정의하고
 * 3. 매개변수로 pay(급여)를 전달 받고
 * 4. 화폐매수를 계산하여
 * 		"50000", 37 형식으로 paperVO를 만들고
 * 5. paperList에 추가하시오.
 * 6. Test를 위해서 PayEx_03를 만들고
 * 		main() method에서 테스트를 수행하시오.
 */
public class PaperMakeServiceV2 {

	private List<PaperVO> paperList;
	
	public void make(int pay) {
		paperList = new ArrayList<PaperVO>();
		
		int balance = 50000;
		int nSwitch = 1;
		while(true) {
			
			// 최초에 권명 50000 이므로
			// 매수는 5만원권 매수가 된다.
			
			if(balance < 10) break;
			int count = pay/balance;
//			System.out.printf("%d원권 : %d 장\n", balance, count);
			
			pay -= count * balance;
			
			PaperVO vo = new PaperVO(balance + "", count);
//			vo.setPaper(balance + "");
//			vo.setCount(count);
			
			paperList.add(vo);
			
			nSwitch *= -1;
			if(nSwitch < 0) {
				balance = balance / 5;
			}
			else {
				balance = balance / 2;
			}
		}
		for(PaperVO vo : paperList) {
			System.out.println(vo);
		}
	}
	// 외부에서 paperList를 가져가도록 열어주는 통로
	public List<PaperVO> getPaperList(){
		return paperList;
	}
}

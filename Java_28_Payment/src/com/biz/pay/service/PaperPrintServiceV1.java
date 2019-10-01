package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;
/*
 * 1. pay.txt 파일을 읽어서 다음과 같은 급여명세를 console에 출력하시오
 * ============================================================
 * 사원번호 : HA-0001, 급여액 : 2638770
 * ------------------------------------------------------------
 * 50000	??
 * 10000	??
 */
public class PaperPrintServiceV1 {

	List<PaperVO> paperList;
	
//	public setPayStrList(List<String> ReadList) {
//		
//	}
	
	
	public void make(int pay) {
		paperList = new ArrayList<PaperVO>();
//		//선생님꺼
//		PaperMakeServiceV2 pm = new PaperMakeServiceV2();
//		// pay.txt에 읽은 문자열 들이 payStrList에 담겨있다.
//		for(String pay : readList) {
//			String[] pays = pay.split(":");
//			// pays[0] : 사번
//			// pays[1] : 급여
//			
//			System.out.println("=====================================");
//			System.out.printf("사번 : %s, 급여 : %s" , pays[0], pays[1]);
//			System.out.println("-------------------------------------");
//			
//			// 각 사원에 대한 급여 화폐 내역 생성
//			int intPay = Integer.valueOf(pays[1]);
//			pm.make(intPay);
//			List<PaperVO> paperList = pm.getPaperList();
//			
//			for(PaperVO vo : paperList) {
//				System.out.println(vo.getPaper() + "\t" + vo.getCount());
//			}
//		}
		
		
		
		
		
		
		
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
			System.out.printf("%10s원권 \t\t%d장\n", vo.getPaper(), vo.getCount());
		}
	}
	
	public void print(List<String> readList, String strRead, String strFile) {
		
//		PrintWriter pw = new PrintWriter(strFile);
		
		for(String ss : readList) {
//			for(PaperVO vo : paperList) {
//				pw.printf("%s\t%d\n", vo.getPaper(), vo.getCount());
//			}	
		}
		
//		pw.close();
		
		
		
		
	}
}

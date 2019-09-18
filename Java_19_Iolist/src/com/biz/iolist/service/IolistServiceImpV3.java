package com.biz.iolist.service;

import java.text.DecimalFormat;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV3 extends IolistServiceImpV2 {
	
	/*
	 * 전체 리스트의 매입금액과 매출금액 합계를 리스트 마지막에 표시
	 * ==================================================================
	 * 거래일자		상품명		구분	단가	수량	매입금액	매출금액
	 * ------------------------------------------------------------------
	 * 2019-12-19	(신)벌집핏자	1	472			0			131
	 * 2019-10-22	8000카드		2	0			8000		139
	 * ==================================================================
	 * 합계												61832	56423
	 * ==================================================================
	 */
	
	public void list() {
		
		this.list_header();
		int intISum = 0;
		int intOSum = 0;
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrPName() + "\t\t");
			/*
			 * 만약 vo 설계단계에서 io 구분자 저장 변수를
			 * int 형으로 만들었다면 
			 * 파일에서 데이터를 읽어 들이는 부분에서
			 * Integer.valueOf() method로 한번만 변환을 시키면
			 * 이후 다른 부분에서는 부담없이 사용할 수 있었을 것이다.
			 * 
			 * 하지만, 지금은 io 구분자를 쉽게 쓰기 위해
			 * int 형으로 변환시키는 코드가 곳곳에 산재하게 됐다.
			 * 이런 경우를 설계 미스로 인한 비용 증가 라고 한다.
			 */
			int intIO = Integer.valueOf(vo.getStrIO());
			//if(vo.getStrIO().equals("1")) {}
			int intIPrice = 0;
			int intOPrice = 0;
			
			String strIoTitle = "매출";
			
			if(intIO == 1) {
				intIPrice = vo.getIntPrice();
				strIoTitle = "매입";
			} else {
				intOPrice = vo.getIntPrice();
			}
			System.out.print(strIoTitle + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQTy() + "\t");
			
			System.out.printf("%8d\t", intIPrice * vo.getIntQTy());
			System.out.printf("%8d\n", intOPrice * vo.getIntQTy());
			intISum += intIPrice * vo.getIntQTy();
			intOSum += intOPrice * vo.getIntQTy();
			
		}
		System.out.println("===============================================================================================");
		System.out.printf("합계\t\t\t\t\t\t\t\t%8d\t%8d\n" ,intISum ,intOSum );
		System.out.println("===============================================================================================");
		
		
	}
	
	protected void list_header() {
		System.out.println("===============================================================================================");
		System.out.println("거래일자\t상품명\t\t\t구분\t단가\t수량\t매입금액\t매출금액");
		System.out.println("-----------------------------------------------------------------------------------------------");
		
	}


}

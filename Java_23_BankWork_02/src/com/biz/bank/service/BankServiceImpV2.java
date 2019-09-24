package com.biz.bank.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.biz.bank.util.BankInfo;

public class BankServiceImpV2 extends BankServiceImpV1 {

	@Override
	public void output() throws Exception {
		// TODO 출금처리
		this.viewAcc();
		
		if(bookVO == null) return; 
		
		System.out.print("출금액 >> ");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		
		// 만약 출금액이 (-) 이면 입금 거부!!
		if(intOutput < 0) {
			System.out.println("출금액은 0원 이상이어야 함!!");
			return;
		}
		// 잔액 < 출금액 ?
		if(bookVO.getBalance() < intOutput) {
			System.out.println("잔액이 부족!!");
			return;
		}
		int intBalance = bookVO.getBalance();
		intBalance -= intOutput;
		bookVO.setBalance(intBalance);
		// bookVO.setBalance(bookVO.getBalance() - intOutput);
		
		
		
		
		// 거래일자, 구분 설정
		// java 1.8에서 새롭게 등장한 날짜 클래스
		// Date 클래스에서 발생한 날짜 관련 여러가지 이슈가
		// 상당부분 해소된  새로운 클래스
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 위의 코드를 문자열로 변환시키기 위해 DateTimeFormatter이용
		String lastDate = localDate.format(df);
		bookVO.setLastDate(lastDate);
		
		bookVO.setRemark(BankInfo.REMARK.OUTPUT);
		this.accListWrite(BankInfo.REMARK.OUTPUT, intOutput);
		
		this.bookWrite(bookFile);
		
	}

}

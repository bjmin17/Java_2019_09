package com.biz.iolist.service;

public interface IolistService {

	// 판매 관리
	// 판매정보를 입력할 수 있는 부분이 필요
	// 거래일자, 거래시각, 상품이름, 단가, 수량
	public void input();
	
	// 여러데이터를 연속해서 입력하고자 할 때
	// 몇 개의 데이터를 입력할 것인가를 지정하여
	// 처리하는 method
	public void input(int count);
	
	
	// 위의 정보로 판매금액 계산하는 method 필요
	public void total();
	
	// 판매정보 리스트 보기
	public void list();
	
	// 판매정보 1개의 정보 보기
	public void view();
	
}

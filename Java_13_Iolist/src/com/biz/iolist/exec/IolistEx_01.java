package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV1;

public class IolistEx_01 {

	public static void main(String[] args) {
		
		//IolistService 라는 interface를 이용해서 ioService를 선언, 생성
		IolistService ioService = new IolistServiceImpV1();
		
		ioService.input(5);
		ioService.total();
		ioService.list();
		
	}
}

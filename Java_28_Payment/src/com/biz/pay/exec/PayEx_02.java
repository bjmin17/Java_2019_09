package com.biz.pay.exec;

import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {

	public static void main(String[] args) {
		
		int pay = 3758750;
		PaperMakeServiceV1 pm = new PaperMakeServiceV1();
		
		pm.make(pay);
	}
}

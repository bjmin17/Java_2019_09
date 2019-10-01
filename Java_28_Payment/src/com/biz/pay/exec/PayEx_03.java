package com.biz.pay.exec;

import com.biz.pay.service.PaperMakeServiceV2;

public class PayEx_03 {

	public static void main(String[] args) {
		
		PaperMakeServiceV2 pm= new PaperMakeServiceV2();
		
		int pay = 3758750;
		pm.make(pay);
	}
}

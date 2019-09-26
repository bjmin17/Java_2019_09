package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;

public class BuyEx_01 {

	public static void main(String[] args) {
		
		IolistService is = new IolistService();
		
		try {
			is.buyMake();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV2;
import com.biz.pay.service.PaperWriterServiceV1;

public class PayEx_04 {
	
	public static void main(String[] args) {
		PaperMakeServiceV2 pm = new PaperMakeServiceV2();
		int pay = 3758750;
		pm.make(pay);
		List<PaperVO> paperList = pm.getPaperList();
		
		String strFile = "src/com/biz/pay/화폐매수.txt";
		
		try {
			PaperWriterServiceV1 pw = new PaperWriterServiceV1();
			pw.print(paperList, strFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
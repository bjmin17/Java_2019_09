package com.biz.pay.exec;

import java.io.PrintWriter;
import java.util.List;

import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PaperReaderServiceV1;

public class PayEx_06 {

	public static void main(String[] args) {
		
		PaperReaderServiceV1 pr = new PaperReaderServiceV1();
		String strRead = "src/com/biz/pay/pay.txt";
		PaperPrintServiceV1 pm = new PaperPrintServiceV1();
		
		
		
		try {
			pr.print(strRead);
			List<String> readList = pr.getReadList();
			
			String payPath = "src/com/biz/pay/";
			for(String ss : readList) {
				String[] strA = ss.split(":");
				
				System.out.println("=======================================");
				System.out.printf("사원번호 : %s\t 급여 : %s\n",strA[0], strA[1]);
				System.out.println("---------------------------------------");
				pm.make(Integer.valueOf(strA[1]));
				System.out.println("=======================================\n");
				
				
				PrintWriter fileOut = new PrintWriter(payPath + strA[0]);
				fileOut.println("=======================================");
				fileOut.printf("사원번호 : %s\t 급여 : %s\n",strA[0], strA[1]);
				fileOut.println("---------------------------------------");
				fileOut.println(Integer.valueOf(strA[1]));
				fileOut.println("=======================================");
				fileOut.close();
//				pm.make(Integer.valueOf(ss.substring(7)));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

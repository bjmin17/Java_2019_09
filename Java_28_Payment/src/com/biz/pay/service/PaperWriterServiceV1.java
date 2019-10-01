package com.biz.pay.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 * 1. print() method를 정의하고
 * 2. 매개변수로 List<PaperVO> paperList를 전달 받고
 * 3. src/com/biz/pay/화폐매수.txt 파일에 아래와 같이 저장하시오.
 */
public class PaperWriterServiceV1 {

	// set을 활용해서 만들었다면 필요하겠지만 여기서는 바로 매개변수로 받기 때문에 set이나 멤버변수로 만들어주는건 필요없음
//	String strFile;
//	List<PaperVO> paperList;
	
//	public void print(String payFile) throws FileNotFoundException{
//		PrintWriter fileOut = new PrintWriter(payFile);
//		for(PaperVO vo : this.paperList) {
//			//출력
//			fileOut.print("");
//		}
//		fileOut.close();
//		this.print(this.paperList,payFile); <----- print 메서드들끼리 겹치는게 많으니 이 코드를 넣어서 매개변수와 연결해도 됨
//	}
	public void print(List<PaperVO> paperList, String strFile) throws Exception {
//		this.paperList = paperList;
//		this.strFile = strFile;
		
		PrintWriter pw = new PrintWriter(strFile);
		
		for(PaperVO vo : paperList) {
			pw.printf("%s\t%d\n", vo.getPaper(), vo.getCount());
		}
		pw.close();
	}
}

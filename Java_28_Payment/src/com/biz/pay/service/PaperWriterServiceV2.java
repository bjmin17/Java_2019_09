package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;

import com.biz.pay.domain.PaperVO;


public class PaperWriterServiceV2 {

	public void print(List<PaperVO> paperList, String strRead, String strFile) throws Exception {
		
		PrintWriter pw = new PrintWriter(strFile);
		
		for(PaperVO vo : paperList) {
			pw.printf("%s\t%d\n", vo.getPaper(), vo.getCount());
		}
		pw.close();
	}
}

package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/*
 * 1. pay.txt 파일을 읽어서 다음과 같은 급여명세를 console에 출력하시오
 * ============================================================
 * 사원번호 : HA-0001, 급여액 : 2638770
 * ------------------------------------------------------------
 * 50000	??
 * 10000	??
 */
public class PaperReaderServiceV1 {

	List<String> readList;
	
	public void print(String strRead) throws Exception {
		readList = new ArrayList<String>();
		FileReader fileReader = new FileReader(strRead);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = "";
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
					
			readList.add(reader);
			
		}	
//		System.out.println(readList);
		buffer.close();
		fileReader.close();
	}
	public List<String> getReadList(){
		return readList;
	}

}

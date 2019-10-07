package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 외부에서 주입된 pay.txt 파일 이름으로
 * 파일을 열어서 
 * 급여 내역을 문자열형 List에 담는 코드
 */
public class PayReadServiceV1 {

	// 급여내역 문자열형 List 선언
	private List<String> payStrList;
	
	// payStrList 외부에서 사용할 수 있도록 getter() method
	public List<String> getPayStrList(){
		return this.payStrList;
	}
	
	public void readPay(String payFile) throws IOException {
		
		payStrList = new ArrayList<String>();
		
		// 파일을 읽기 위해 open하고 임시 저장할 buffer를 선언
		FileReader fileReader = new FileReader(payFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		// buffer부터 문자열을 읽어서 담을 변수 선언
		String read = new String();
		while(true) {
			read = buffer.readLine();
			if(read == null) break;
			
			// 다른 가공없이 문자열을 payStrList 바로 추가
			payStrList.add(read);
		}
		buffer.close();
		fileReader.close();
		
	}
}

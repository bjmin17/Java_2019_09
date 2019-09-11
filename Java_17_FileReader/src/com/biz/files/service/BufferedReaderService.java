package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderService {

	FileReader fileReader = null;
	BufferedReader buffer = null;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);// fileReader를 주입시켜줌		
		
		String strReader = buffer.readLine(); //readLine은 data.txt파일의 한 줄만 읽어서 변수에 넘겨줌
		//, 13코드(엔터코드)를 기준으로 통째로 읽음
		System.out.println(strReader);
		
	}
	
}

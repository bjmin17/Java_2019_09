package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.List;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV1 implements IolistService {

	/*
	 * fileName 파일을 읽어서 한줄씩 console에 보이시오
	 */
	
	@Override
	public void read(String fileName) throws Exception {

		FileReader fileReader;
		BufferedReader bufferReader;
		
		fileReader = new FileReader(fileName);
		bufferReader = new BufferedReader(fileReader);
		
		String strRead = new String();

		while(true) {
			strRead = bufferReader.readLine();
			if(strRead == null) break;
			System.out.println(strRead);
		}
		bufferReader.close();
		fileReader.close();
		

	}

	@Override
	public void list() {


	}

	@Override
	public void summary() {

		
	}

}

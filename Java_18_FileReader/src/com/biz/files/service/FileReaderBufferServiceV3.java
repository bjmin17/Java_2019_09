package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV3 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		// buffer.readLine()은 파일에서 한 줄(~~\n)까지를 읽는다.
		// buffer.readLine()이 반복해서 실행될 때마다
		// 계속해서 다음줄의 문자열을 읽어 들이도록 되어 있다.
		// 파일에 저장된 문장의 줄수 만큼 buffer.readLine()을
		// 반복해서 실행하면
		// 파일의 모든 내용을 읽을 수 있을 것이다.
		
		String reader = ""; 
		// reader 값을 null로 초기화했기 때문에 실행이 안되는 상태
		// while문은 전혀 실행이 안된다.
//		while(reader != null) {
//			reader = buffer.readLine();
//			if(reader == null) break;
//			System.out.println(reader); // 대한민국 ln 우리나라 ln Republic of Korea
//		}
		/*
		 * 먼저 buffer에서 한줄을 읽고
		 * console에 표시한 다음
		 * null이 아니면 계속해서 다음줄을 읽어라
		 */
		do {
			
			reader = buffer.readLine();
			System.out.println(reader);
			
		}while(reader != null);
		
		// close() method는 resource를 반납하는 기능
		// close() 실행할 때는
		// buffer를 먼저 close()하라
		buffer.close();
		fileReader.close();
		
	}
	
}

package com.biz.files;

import java.io.FileReader;
import java.io.IOException;

import com.biz.files.service.FileReaderServiceV2;

public class FileEx_04 {

	public static void main(String[] args) {
		
		FileReaderServiceV2 fs = new FileReaderServiceV2();
		String fileName = "src/com/biz/files/data.txt";
		try {
			fs.read(fileName); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * 실행
		 * Korea
대한민국
우리나라
Republic of Korea
		 */
		
	}
}

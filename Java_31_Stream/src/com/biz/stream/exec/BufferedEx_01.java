package com.biz.stream.exec;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx_01 {

	public static void main(String[] args) {
		
		String imgFile = "src/com/biz/stream/2019_2.png";
		
		FileInputStream fs = null;
		BufferedInputStream buffer = null;
		
		/*
		 * BufferedInputStream
		 * FileInputStream으로 open된 파일을 읽어서 buffer 메모리에 임시 저장을 하고
		 * read() method를 통해서 buffer로부터 값을 읽는다.
		 */
		try {
			
			fs = new FileInputStream(imgFile);
			buffer = new BufferedInputStream(fs);
			
			byte[] bytes = new byte[32];
			
			buffer.read(bytes);
			
			for (int i = 0 ; i < bytes.length;i++) {
				System.out.printf("%02X ", bytes[i]);
			}
			//89 50 4E 47 0D 0A 1A 0A 00 00 00 0D 49 48 44 52 00 00 02 BC 00 00 01 B6 08 02 00 00 00 12 AB C2 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

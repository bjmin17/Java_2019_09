package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data.txt"; // 문자열 변수 fileName 생성
		
		FileReader fileReader; // FileReader라는 클래스를 이용해서 fileReader라는 객체 선언
		
		try {
			// fileName으로 지정된 text 파일을
			// 읽을 수 있도록 준비하라
			// fileReader 객체(인스턴스)에는
			// 파일을 읽는데 필요한 여러가지 정보가 담겨 있다.
			fileReader = new FileReader(fileName);
			
			// fileReader 객체에 담긴 파일 정보를 사용하여
			// 한 개의 문자를 읽어서
			// ASCII 코드로 달라
			int intChar = fileReader.read();
			System.out.print(intChar); // 코드값을 10진수로,,, 45824
			System.out.print(" : ");
			System.out.println((char)intChar); // 어떤 문자인가?,,, 대
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

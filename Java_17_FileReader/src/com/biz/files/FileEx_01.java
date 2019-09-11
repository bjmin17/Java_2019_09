package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data.txt 파일을 읽어서 기억장치로 가져오려고 한다.
 * 1. 운영체제에게 data.txt을 읽을테니 허락을 해달라 라고 요청
 * 
 */
public class FileEx_01 {

	public static void main(String[] args) {
		
		String file = "src/com/biz/files/data.txt";// data파일 주소 복사한것
		
		/*
		 * FileReader
		 * 운영체제에게 파일을 읽을테니 허락해달라 하는 요청과
		 * 운영체제가 허락을 하면, 읽을 파일에 대한 정보를
		 * java 코드에서 사용할 수 있도록 준비해 주는 클래스
		 * 
		 * 읽고자 하는 파일이름을 파일이 저장된 폴더 path(경로)까지
		 * 문자열 형태로 전달하면서 객체로 생성해주면 된다.
		 */
		
		FileReader fileReader = null; // FileReader 를 try문이 아니라 밖에 쓴 이유?
							// 안에 선언과 생성문을 같이 만들면 ,,, try문이 정상 작동되어서
							// fileReader = new 가 밖으로 나온다고 해도 이를 읽어줄 게 없음
		try {
			/*
			 * FileReader 클래스를 사용해서 파일을 읽을 준비를 수행하는데
			 * 알 수 없는 여러가지 이유로 파일을 읽는데 문제가 발생을 할 수 있다.
			 * 이 때, 만약 파일이 어떤 이유로 지워졌거나 깨졌을 경우
			 * FileNotFoundException이 발생할 확률이 있다.
			 * 
			 * 그래서 파일을 읽기 위한 객체 생성(초기화)명령문은
			 * 반드시 try catch 문으로 감싸도록 되어 있다.
			 * 
			 * 또한, FileReader의 선언문과
			 * 생성문을 분리를 하는데
			 * 그 이유는 fileReader 객체에 접근할 수 있는
			 * scope 문제를 해결하기 위한 것이다.
			 */
			fileReader = new FileReader(file);
			int alpha = fileReader.read();// 초기화 오류 나오면 fileReader = null로 초기화해주기,
			System.out.println(alpha);// 75
			System.out.println((char)alpha);// K,,, 75를 형변환하면 K가 나옴
			
			alpha = fileReader.read();
			System.out.println(alpha); // 111 
			System.out.println((char)alpha); // o
			
			alpha = fileReader.read();
			System.out.println(alpha); // 114
			System.out.println((char)alpha); // r
			// fileReader.read()는 fileReader의 file을 한 글자씩 ASCII로 읽음
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) { //1개의 try문으로 여러가지 Exception을 계층적으로 관리하는 부분
			System.out.println("파일을 읽는 동안 문제 발생");
		} catch(Exception e) {
			System.out.println("어떤 exception 이라도 처리 가능");
		}
		
		
	}
	
}

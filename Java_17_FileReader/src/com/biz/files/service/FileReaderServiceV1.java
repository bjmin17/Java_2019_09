package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {

	FileReader fileReader = null;
	
	/*
	 * 만약 read(String fileName) method가 실행되는 동안
	 * exception이 발생을 하면
	 * read() method를 호출한 곳으로 exception을 toss 하라
	 */
	public void read(String fileName) throws IOException { //IOException보다 하위 등급 exception이 나오면 던져라?

		fileReader = new FileReader(fileName); // throw 누르면 FileNotFoundException이 나옴
		while(true) {
			int al = fileReader.read(); // 또 한번 throw 누르면 IOException 나옴
			
			/*
			 * fileReader.read() method를 실행했을 때
			 * 파일을 모두 읽은 이후 또 method를 실행하면
			 * al 변수에 -1이 담긴다.
			 * 그런데 간혹, 파일을 모두 읽은 이후
			 * -1 보다 더 작은(음수) 값들이 읽히는 경우가 있다.
			 * 이럴때 == -1을 사용하면
			 * break 문을 건너 뛰고 이후 코드를 실행하여
			 * 이후 코드에서 오류가 발생할 수도 있다.
			 * 
			 * 이런 상황을 방지하기 위해서
			 * if(al == -1) 이 아닌
			 * if(al < 0 )의 코드를 사용하자
			 */
			if(al < 0 ) break; //아래보다 이게 더 안정적인 코드, 
//			if(al == -1) break;
			System.out.printf("%d : %c\n", al, al);
			
		}
		
		
		
	}
	
	
}

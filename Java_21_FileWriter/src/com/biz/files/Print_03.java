package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data4.txt";
		
		FileWriter fileWriter = null;
		PrintWriter fileOut = null;
		
		try {
			/*
			 * java 1.5 부터는
			 * PrintWriter 클래스만 단독으로 사용해서
			 * 파일에 text를 기록할 수 있다.
			 * 
			 * PrintWriter는 무조건 모든 파일을 새로 생성한다.
			 * append mode로 파일을 open 할 수 없다.
			 * 
			 * 만약 file을 append mode로 open 하고자 할 때는
			 * 일단 FileWriter를 사용해서 append mode로 open을 하고
			 * PrintWriter에 (buffer 생략하고) 직접 주입한다.
			 * 
			 * 두번째 메서드를 지정하면
			 * 	flush() method를 자동으로 실행할 수 있다.
			 * 
			 * 자동 flush는 print() 메서드를 실행할 때마다
			 * 		기록이 되는 것이 아니고,
			 * 		내부에서 buffer를 별도로 관리하면서
			 * 		내용을 기록한다.
			 * 자동 flush는 원하는 만큼의 안정성을
			 * 		보장하지 않는다.
			 */
			
			fileWriter = new FileWriter(fileName,true);
			fileOut = new PrintWriter(fileWriter);
			
			fileOut.println("우리나라만세");
			fileOut.println(30 * 40);
			fileOut.println(200 % 2);
			
			fileOut.printf("%5d\n", 30 + 40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

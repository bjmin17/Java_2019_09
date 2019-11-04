package com.biz.thread.exec;

import com.biz.thread.classes.Cal_01;
import com.biz.thread.classes.Cal_02;

public class CalendarEx_01 {

	
	
	
	public static void main(String[] args) {
		

		Cal_01 ca1 = new Cal_01();
		ca1.start();
		
		Cal_02 ca2 = new Cal_02();
		ca2.start();
		// static이기 때문에 값이 섞임,, 겹침
		
	}
	

}

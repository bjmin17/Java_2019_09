package com.biz.date.exec;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_01 {

	public static void main(String[] args) {
		
		// old java에서 사용하는 날짜와 관련된 class 1
		/*
		 * Java에서 사용되었던 Date 클래스는
		 * 날짜와 관련된 많은 이슈를 가지고 있다.
		 * 특히, 날짜와 관련된 연산(날짜 수 등 계산)에서
		 * 정확하지 않은 값이 추출되어
		 * app을 작성하는데 많은 어려움이 있었다.
		 * 
		 * 이런 여러 이유 때문에
		 * 실무에서 날짜와 관련된 여러 데이터는
		 * 순수한 문자열로 변환하거나
		 * 다양한 방법으로 연산을 수행해왔다.
		 * 
		 */
		// Date date = new Date()
		// Date() 생성자에 매개변수를 사용하지 않으면 
		// JDK 8 이상 버전에서 문제를 일으킨다.
		
		// 현재 시스템 날짜 가져오기
		Date date = new Date(System.currentTimeMillis());
		
		// 날짜를 문자열로 변환하는 방법
		// 1. SimpleDateFormat을 사용해서 형식지정 객체를 생성
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		
		// 2. format() method를 사용해서 문자열로 변환
		String curDate = sf.format(date);
		
		// 시간을 문자열로 변환하는 방법
		// 1. SimpleDateFormat을 사용해서 형식지정 객체 생성
		SimpleDateFormat st = new SimpleDateFormat("hh:mm:ss");
		
		// 2. format() method를 사용해서 문자열로 변환
		String curTime = st.format(date);
		
		System.out.println("오늘 : " + curDate);
		System.out.println("현재시각 : " + curTime);
		
	}
}

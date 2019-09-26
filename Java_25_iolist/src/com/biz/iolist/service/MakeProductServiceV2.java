package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV2 {

	protected List<String> proNameList;
	protected List<String> productList;
	
	/*
	 * 1. 과자이름.txt 파일이름을 proFileName 변수로 받기
	 * 2. proFileName 파일을 읽어서 과자이름 List를 추출하기
	 * 3. 임의의 숫자를 발생시켜서 과자가격을 부착하여
	 * 4. 과자정보를 생성
	 * 5. 다른곳에서 사용할 수 있도록 return 수행
	 */
	
	public MakeProductServiceV2() {
		// TODO Auto-generated constructor stub
		
	
	}
	
	public List<String> getProductList(String proFileName) throws Exception {
		
		// 생성자에서 수행하지 않고, getProductList() method에서
		// proNameList 초기화
		proNameList = new ArrayList<String>();
		productList = new ArrayList<String>();
		
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		String reader = new String();
		while(true) {
			
			reader = buffer.readLine();
			// if() 조건이 true 이면 while() 반복문을 중단하라
			if(reader == null) break;
			
			// if() 조건이 true 이면 while() 이후 코드를 무시하고
			// 반복문 시작부분으로 점프하라.
			if(reader.length() < 1) continue; // continu를 만나면 반복문 종료가 아닌 다시 처음으로 감
			
			// NullPointException : proNameList를 사용할
			//		준비가 되어 있지 않다.
			
			proNameList.add(reader);
			
		}
		buffer.close();
		fileReader.close();
		/*
		 * 파일을 읽기 위해서 FileReader, BufferedReader로 open을 한 후
		 * while() 반복문 내에서 한 줄씩 읽어서
		 * 여러가지 연산을 수행하는 과정에서
		 * 
		 * 연산수행 시간이 오래걸리거나
		 * 어떤 exception이 발생할 확률이 조금이라도 있다면
		 * 		중간에 읽고 있는 파일이 손상될 수도 있기 때문에
		 * 
		 * 읽어들인 문자열(reader 변수에 담긴 값)을
		 * List<String> type의 list로 생성을 하고
		 * 
		 * 파일을 close() 한 후
		 * 
		 * 생성된 list를 사용하여 다른 연산을 수행하자
		 */
		for(String pro : proNameList) {
			
			// Math : 수학연산과 관련된 여러 method()를 가지고 있는
			// 		java 클래스 이다.
			
			// 랜덤 클래스와의 차이 :
			// 클래스를 객체로 생성하지 않고도
			// 간단히 난수를 발생할 수 있다.
			
			// 상품가격을 800원 ~ 5000원까지 임의 값을 생성
			
			int price = (int)(Math.random() * (5000 - 800 + 1)+ 800);
			String product = String.format("%s:%d\n", pro, price);
			
			productList.add(product);
			
		}
		return productList;
	}
}

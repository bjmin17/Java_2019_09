package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class IolistService {

	protected List<String> proList ;
	protected List<BuyVO> buyList;
	
	/*
	 * 상품정보.txt 파일을 읽어서
	 * 임의의 상품정보를 추출한 후
	 * 
	 * 상품매입정보를 생성
	 * 1. 날짜 : 2019-09-26
	 * 2. 단가 : (상품정보의 상품단가)에서 부가세를 제외한 금액
	 * 3. 부가세 : (상품정보의 상품단가) - (2번에서 계산한) 단가
	 * 4. 수량은 : 10개 부터 100개까지의 임의의 수
	 * 5. 합계 : 단가 * 수량
	 * 
	 * 생성된 상품매입정보를 20개 생성하여
	 * buyList에 추가하기
	 */
	
	public IolistService() {
		// TODO Auto-generated constructor stub
		proList = new ArrayList<String>();
		
	}
	public void buyMake() throws Exception {
		buyList = new ArrayList<BuyVO>();
		
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = sd.format(date);
		
		Random rnd = new Random();
		
		int nSize = proList.size();
		
		for(int i = 0 ; i < 20 ; i ++) {
			
			// proList 개수의 범위내에서 정수 1개를 임의로 생성하라
			int index = rnd.nextInt(nSize);
			
			// 임의의 상품정보 추출하기 
			String strProduct = proList.get(index);
			
			String[] strPro = strProduct.split(":");
			// pros[0] 상품명, pros[1] 단가
			
			BuyVO vo = new BuyVO();
			vo.setProName(strPro[0]);
			
			// 상품정보에 있는 금액을 일단 bVO의 price에 담기
			vo.setPrice((int)(Integer.valueOf(strPro[1])));
			
			// 계산식을 사용해서 부가세 별도 단가 계산,
			// 부가세 계산 총액 계산
			int intPrice = Integer.valueOf(strPro[1]); // 부가세 별도 단가 생성
			intPrice = (int)(intPrice / 1.1); 
			int intVat = intPrice - vo.getPrice();
			
			int intQty = (int)(Math.random() * 90) + 10 ; // 난수로 수량 생성
			int intTotal = intPrice * intQty; 
			
			//상품단가를 부가세 별도 단가로 변경
			vo.setProName(strPro[0]);
			vo.setDate(strDate);
			vo.setPrice((Integer.valueOf(strPro[1])));
			vo.setVat((int)(Integer.valueOf(strPro[1])/1.1));
			vo.setQty(intQty);
			vo.setTotal(vo.getPrice() * intQty);
			
			
			buyList.add(vo);

		}
//		for(String pro : proList) {
////			for(int i = 0 ; i < 20 ; i++) {
//				String[] strPro = pro.split(":");
//				
//				BuyVO vo = new BuyVO();
//				vo.setProName(strPro[0]);
//				vo.setPrice((int)(Integer.valueOf(strPro[1])));
//				
//				// 계산식을 사용해서 부가세 별도 단가 계산,
//				// 부가세 계산 총액 계산
//				int intPrice = 0; // 부가세 별도 단가 생성
//				int intVat = intPrice - vo.getPrice();
//				int intQty = (int)(Math.random() * 90) + 10 ; // 난수로 수량 생성
//				int intTotal = intPrice * intQty; 
//				
//				//상품단가를 부가세 별도 단가로 변경
//				vo.setProName(strPro[0]);
//				vo.setDate(strDate);
//				vo.setPrice((Integer.valueOf(strPro[1])));
//				vo.setVat((int)(Integer.valueOf(strPro[1])/1.1));
//				vo.setQty(intQty);
//				vo.setTotal(vo.getPrice() * intQty);
//				
//				
//				buyList.add(vo);
//
//		}
		System.out.println("======================================================================");
		System.out.println("상품매입정보");
		System.out.println("======================================================================");
		System.out.println("번호	상품명	매입날짜	가격	부가세	수량	합계");
		System.out.println("----------------------------------------------------------------------");
		Collections.shuffle(buyList);
		for(int i = 0 ; i < 20 ; i ++) {
			System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\n",
					i+1,
					buyList.get(i).getProName(),
					buyList.get(i).getDate(),
					buyList.get(i).getPrice(),
					buyList.get(i).getVat(),
					buyList.get(i).getQty(),
					buyList.get(i).getTotal());
		}
		System.out.println("======================================================================");
			
		
		
		
	}
	
	/*
	 * 상품정보.txt 파일을 읽어서
	 * 상품이름:가격 형식의 문자열을 리스트 생성하는 곳
	 * 
	 * proList에는 다음과 같은 문자열들이 리스트로 만들어져 있다.
	 * 		상품이름:가격
	 */
	public void readProduct(String proFileName) throws Exception {
		
		
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			if(reader.length() < 1) continue;
			proList.add(reader);
		}
		buffer.close();
		fileReader.close();
		
	}
}

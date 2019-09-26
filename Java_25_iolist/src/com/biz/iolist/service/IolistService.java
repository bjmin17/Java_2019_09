package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		
		
		for(String pro : proList) {
//			for(int i = 0 ; i < 20 ; i++) {
				String[] strPro = pro.split(":");
				
				BuyVO vo = new BuyVO();
				vo.setProName(strPro[0]);
				vo.setPrice((int)(Integer.valueOf(strPro[1])));
				
				// 계산식을 사용해서 부가세 별도 단가 계산,
				// 부가세 계산 총액 계산
				int intPrice = 0; // 부가세 별도 단가 생성
				int intVat = intPrice - vo.getPrice();
				int intQty = 0 ; // 난수로 수량 생성
				int intTotal = intPrice * intQty; 
				
				//상품단가를 부가세 별도 단가로 변경
				vo.setProName(strPro[0]);
				vo.setDate(strDate);
				vo.setPrice((int)(Integer.valueOf(strPro[1])));
				vo.setVat(Integer.valueOf(strPro[1]) - Integer.valueOf(strPro[1])/1.1);
				vo.setQty((Math.random() * 90) + 10);
				vo.setTotal((Integer.valueOf(strPro[1])/1.1) * (Math.random() * 90) + 10);
				
				
				buyList.add(vo);
				}
			
		
		
		
	}
	
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

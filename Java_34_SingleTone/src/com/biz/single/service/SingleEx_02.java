package com.biz.single.service;

public class SingleEx_02 {

	public static void main(String[] args) {
		
		SafeSingleClassV1 ssc = SafeSingleClassV1.getInstance();
		
		ssc.setName("홍길동");
		ssc.setNation("Republic of Korea");
		
		SafeSingleClassV1 ssc1 = SafeSingleClassV1.getInstance();
		
		System.out.println("너는 누구냐? >> " + ssc1.getName()); //너는 누구냐? >> 홍길동
		System.out.println("고향이 어디냐? >> " + ssc1.getNation()); //고향이 어디냐? >> Republic of Korea
		
	}
}

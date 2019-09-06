package com.biz.iolist.exec;

import com.biz.iolist.model.AddrVO;

public class AddrEx_01 {

	public static void main(String[] args) {
		
		AddrVO addrVO = new AddrVO();
		String s = addrVO.toString();
		System.out.println(s); // com.biz.iolist.model.AddrVO@15db9742,,, addrVO는 com.biz.iolist.model에 들어있다.
		//15db9742는 데이터가 저장되어 있는 곳의 주소(2자리씩 16진수로)
		
	}
}

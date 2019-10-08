package com.biz.classes.service.children;

import com.biz.classes.service.parents.RemoconABS;

public class TvClassV1 extends RemoconABS{

	@Override
	public void power() {
		System.out.println("TV를 켭니다");
	}
	// 인터페이스 implements 한것처럼 메서드들을 붙여줌
	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ChUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ChDown() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}

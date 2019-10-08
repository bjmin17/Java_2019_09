package com.biz.single.service;
// 싱글톤 클래스의 기본 패턴
public class SingleClassV1 {

	/*
	 * 프로젝트가 시작될 때
	 * 자신(SingleClassV1)을 myObject라는 인스턴스로
	 * 생성해 두어라
	 */
	// 자기자신(SingcleClassV1)을 타입으로 한 myObject를 생성
	private static SingleClassV1 myObject = new SingleClassV1();
	
	/*
	 * 클래스 생성자를 private으로 선언하여
	 * new SingleClassV1() 생성자 코드를 사용할 수 없도록 한다.
	 */
	private SingleClassV1() {
		// this.myObject = new SingleClassV1();
	}
	
	public static SingleClassV1 getInstance() {
		return myObject;
	}
	
	
	
}

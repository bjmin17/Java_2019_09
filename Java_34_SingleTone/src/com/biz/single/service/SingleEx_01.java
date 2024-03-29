package com.biz.single.service;
/*
 * 현재 생성한 싱글 클래스는
 * thread 환경에서 매우 불안전한 상태로 존재한다.
 * 이런 상태로 싱글클래스를 사용하게 되면
 * 프로젝트 전반에 많은 문제들을 일으킬 수 있다.
 */
public class SingleEx_01 {

	public static void main(String[] args) {
		
		
		// 현재 SingleClassV1은 생성자로 생성을 할 수 없다.
		// 생성자를 private으로 선언했기 때문에
//		SingleClassV1 sc = new SingleEx_01();
		
		// 싱글톤 패턴으로 설정된 클래스는
		// new 생성자로 객체(인스턴스)를 만들지 않고
		// 별도의 method(getInstance())를 통해서
		// 가져다 사용을 한다.
		SingleClassV1 sc1 = SingleClassV1.getInstance();
		SingleClassV1 sc2 = SingleClassV1.getInstance();
		SingleClassV1 sc3 = SingleClassV1.getInstance();
		
		// 3개 모두 같은 주소
		System.out.println(sc1);//com.biz.single.service.SingleClassV1@15db9742
		System.out.println(sc2);//com.biz.single.service.SingleClassV1@15db9742
		System.out.println(sc3);//com.biz.single.service.SingleClassV1@15db9742
		
		/*
		 * 싱글톤 객체
		 * 프로젝트 전체에서 공유해야할 어떤 데이터들을
		 * 	예) 사용자 정보, 시스템 설정값
		 * 메모리에 저장해두고
		 * 여러 클래스에 공유해서 사용하고자 할 때 사용하는 방법
		 * 
		 * 일반적인 static class와의 차이
		 * multi thread 환경에서 안전하게 사용할 수 있도록 설정 가능하다.
		 * multi thread 환경에서는 여러 곳의  method에서 동시에 한 곳의 기억장소 값을
		 * 	동시에 변경하는 경우가 발생을 한다.
		 */
		
		
		
	}
}

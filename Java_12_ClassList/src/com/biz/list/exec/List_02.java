package com.biz.list.exec;

import com.biz.list.service.BookService;
import com.biz.list.service.BookServiceImpV1;

/*
 * 도서정보들을 키보드에 입력받아서
 * 리스트로 만들고
 * 리스트를 console에 보이는 코드
 */
public class List_02 {

	public static void main(String[] args) {
		
		// 1개가 아닌 여러 개의 도서 정보
		//BookService라는 interface를 이용해서 bs를 선언하고
		BookService bs = new BookServiceImpV1();
		
		//bs.input(); // 1개의 도서정보를 입력받아라
		// bs.input만 쓰면 오류, BookService에는 새로 만든input(int count) method가 없기 때문
		
		// interface에 구현되지 않은
		// input(int count) method를 호출해서 사용하려면
		// bs 객체를 BookServiceImpV1 클래스로 형변환을 해야 한다.
		// 이 코드로 인해서 interface를 활용하는 의미가
		// 		일부 퇴색된다.
		// 그래서
		// 만약 input(int count)처럼 처음에 interface를 만들 때
		// 없던 method를 사용하려면
		// 가급적 설계자에게 요청하여
		// interface에 등록하도록 하는 것이 좋은 방법
		//((BookServiceImpV1)bs).input(3);
		bs.input(3);
		bs.list();
		
		bs.view(1);
		bs.view("1");
	}
}

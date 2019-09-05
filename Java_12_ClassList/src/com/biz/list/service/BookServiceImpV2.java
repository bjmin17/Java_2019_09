package com.biz.list.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

/*
 * 키보드에서 도서정보를 입력받아서
 * List에 추가하고
 * 목록보기, 정보보기 구현
 * 기능이 업그레이드 된 코드
 * 
 * V2는 잘못 입력해도 건너뛰지 않고 값을 다시 입력하도록 만들거임
 */
public class BookServiceImpV2 implements BookService {

	/*
	 * scan 객체와 bookList 객체를 선언은 했는데
	 * 아직 생성(사용할 준비)이 안 된 상태이므로
	 * 이 클래스의 어떤 메서드든지 호출하면
	 * NullpintException이 발생할 것이다.
	 * 
	 * scan과 bookList를 초기화, 생성을 해야한다.
	 */
	Scanner scan;
	List<BookVO> bookList;
	
	/*
	 * scan과 bookList를 생성, 초기화하는 코드를
	 * 클래스의 생성자에 작성한다.(return 값이나 void가 없도록)
	 * 
	 */
	public BookServiceImpV2() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	
	
	@Override
	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			System.out.println("===============================");
			System.out.println((i+1) + " 번째 도서정보 입력");
			System.out.println("-------------------------------");
			try {
				this.input(); // 아래 input()에서 메시지 발생한 것만 받아서 여기서 받아서 오류 해결처리과정 수행
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("데이터를 다시 입력하세요");
				i--;
				continue;
			}
		}
	}

	
	
	
	@Override
	public void input() {
		
		

//		BookVO vo = new BookVO(); vo라는 변수를 만들고
//		System.out.println("도서번호 >> ");
//		vo.setStrNum(scan.nextLine()); 하나로 입력했을 때는
//		중간에 오류가 발생하면 사용하지 않는 vo가 만들어졌다가 삭제되는
//		경우가 발생. 메모리 관리(실행 비용)측면에서 비용 발생
		
		
		System.out.print("도서번호 >> ");
		String strNum = scan.nextLine();
		
		System.out.print("도서명 >> ");
		String strName = scan.nextLine();
		
		System.out.print("저자 >> ");
		String strWriter = scan.nextLine();

		System.out.print("출판사 >> ");
		String strComp = scan.nextLine();
		
		System.out.print("가격 >> ");
		String strPrice = scan.nextLine();
		int intPrice = 0;
		// 문자열형 숫자를 숫자로 변경하는 과정에서
		// 예외 상황이 자주 발생하더라
		// 예외 처리를 추가하려고 한다.
		// 1. 예외 상황이 발생할 코드를 작성
		// 2. 실행해서 예외 상황이 발생하도록 테스트하기
		// 3. 여기에서 NumberFormatiException 이 발생을 하더라
		// 4. 예외 처리를 시작
		// 	가. try catch문을 작성
		// 	나. 예외가 발생할 코드를 try {} 안으로 이동
		// 	다. 예외상황을 처리하는 코드를 catch() {}에 작성
		
		try {
			intPrice = Integer.valueOf(strPrice);	
		} catch (Exception e) {
			/*
			 * 만약 도서가격을 입력하는 도중에
			 * NumberFormati... 예외가 발생하면
			 * 현재 입력하던 도서 정보를 다시 입력하도록 코드를 작성
			 */
			/*
			 * 키보드로부터 값을 입력받고
			 * 변환을 하는 등의 코드가 
			 * for() {   } 반복문으로 감싸져 있다면
			 * for 반복문을 재 시작하는 continue 키워드를
			 * 사용하여 다시 입력을 시도하도록 할 수 있다.
			 * 
			 * 하지만,
			 * 지금 작성한 input() 메서드는
			 * for 반복문에서 별도로 호출한 method이기 때문에
			 * continue 키워드를 사용할 수 없다.
			 * 
			 * 방법은
			 * 현재 input() 메서드에서 exception이 발생을 하면
			 * 호출한 곳에 exception이 발생했다고 알려주고
			 * 그곳에서 처리하도록 하면 된다.
			 */
			System.out.println("!! 가격은 숫자만 입력하세요 !!");
			
			// throw : 나(input() method를 호출한 곳으로
			// 예외를 던진다. 
			// 현재 발생한 예외를 네가 대신 처리해 달라
			// 라고 요청
			throw new NumberFormatException(); // 어떤 exception이 발생했는지 알려주기
			
			
			
			// TODO: handle exception
		}
//		
//		
//		try {
//			
//			// 문자열형 숫자를 정수로 바꾸는 과정에서
//			// 발생할 수 있는 exception
//			// NumberformatException
//			intPrice = Integer.valueOf(strPrice);
//			
//		} catch (Exception e) {
//			System.out.println("!! 가격에 문자열이 포함되어 있음 !!");
//			throw new
//		}
		
		System.out.print("출판연도 >> ");
		String strPubYear = scan.nextLine();
		int intPubYear = 0;// 0 으로 안하면 뒤에 반복되는 곳에서 오류발생,,
		
		try {
			
			/*
			 * intPubYear 변수를 try {} 안에서 선언을 하게 되면
			 * 만약 정상적으로 코드가 수행 되었을 때
			 * try 다음줄 명령코드를 실행하는 과정에서
			 * intPubYear 변수를 참조 할 수 없다.
			 * 
			 * 반드시 try가 시작되기전에
			 * 변수를 선언하고 clear를 한 상태에서
			 * try 내에서 변수에 어떤 값을 저장하도록 
			 * 코드가 작성 되어야 한다.
			 */
			// int intPubYear = Integer.valueOf(strPubYear); 라고 작성하면 {}안에 있으면 데이터를 잃어버림
			intPubYear = Integer.valueOf(strPubYear);

		} catch (Exception e) {
			System.out.println("연도는 숫자로만 입력!!!");
			throw new NumberFormatException();
		

// 연도에서 오류났을 때 연도로 돌아가고 싶으면...
//		} catch (Exception e) {
//			System.out.println("연도는 숫자로만 입력!!!");
//
//			While(true) {
//				System.out.println("연도를 다시 입력(종료:-1) > ");
//				String s1 = scan.nextLine();
//				
//				try {
//					intPubYear = Integer.valueOf(s1);
//					if(intPubYear == -1) break; // 무한루프를 중단하기 위해 추가한 부분
//					break; // break 안 쓰면 정상적으로 입력됐을 때 무한루프됨
//				} catch (Exception e2) {
//					// TODO: handle exception // 오류 났을 때 여기 코드가 없어서 while문 반복
//				}
						
			}
		
//		try {
//			intPubYear = Integer.valueOf(strPubYear);
//		} catch (Exception e) {
//			System.out.println("!! 출판연도에 문자열이 포함되어 있음 !!");
//			return ;
//		}
		
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrWriter(strWriter);
		bookVO.setStrComp(strComp);
		bookVO.setIntPrice(intPrice);
		bookVO.setIntPubYear(intPubYear);
		
		bookList.add(bookVO);
		
	} // input() end

	@Override
	public void list() {
		// TODO Auto-generated method stub

		System.out.println("===============================================================================");
		System.out.println("도서 정보 일람표");
		System.out.println("===============================================================================");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격\t출판연도");
		System.out.println("-------------------------------------------------------------------------------");
		/*
		  int nSize = bookList.size();
		 
		for(int i = 0 ; i < nSize ; i++) {
			
			// get으로 부터 값을 추출해서 vo 변수에 담음
			BookVO vo = bookList.get(i);
			
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%4d\n", vo.getIntPubYear());
			
		}
		*/
		// 확장 for로 업그레이드
		for(BookVO vo : bookList) {
			System.out.println(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%4d\n", vo.getIntPubYear());
		}
	}

	@Override
	public void view(int index) {
		
		BookVO vo = bookList.get(index);
		System.out.println("================================");
		
		// System.out.println("ISBN : " + bookList.get(index).getStrNum());
		// 이 코드는 매회 실행될 때마다 bookList에 index값 주고 get(index)에서 getStrNum를 추출해옴
		
		// 각 항목을 console에 표시할 때마다
		// bookList로 부터 index번째의 BookVO를 추출하고
		// 추출된 BookVO의 getter() 메서드를 호출하는데
		// 코드 시작점에서 bookList로부터 index번째의 BookVO를 추출하여
		// 변수에 저장해 두고
		// getter() 메서드만을 호출하여 값을 표시한다.
		// 앞 코드보단 조금은 효율이 좋을 것으로 예상된다.
		System.out.println("ISBN : " + vo.getStrNum());
		System.out.println("도서명 : " + vo.getStrName());
		System.out.println("출판사 : " + vo.getStrComp());
		System.out.println("저자 : " + vo.getStrWriter());
		System.out.println("가격 : " + vo.getIntPrice());
		System.out.println("출판연도 : " + vo.getIntPubYear());
		System.out.println("================================");
	}
	
	// 도서명으로 검색하기
	@Override
	public void view(String strName) {
		// 정확히 strName 과 일치하는 문자만 나옴
//		int nSize = bookList.size();
//		for(int i = 0 ; i < nSize ; i++) {
//			if(bookList.get(i).getStrName().equalsIgnoreCase(strName)) {
//				this.view(i);
//				break; // 최초로 발견된 1개의 정보만 확인하고 마침
//			}
//		}
		// 호환되는 모든 것들을 보고 싶을 경우
		int nSize = bookList.size();
		for(int i = 0 ; i < nSize ; i++) {
			BookVO vo = bookList.get(i);
			String voStrName = vo.getStrName();
			
			// 도서명과 검색어(strName)이 반드시 일치하는 경우만 검색
			if(voStrName.equalsIgnoreCase(strName)) {
				this.view(i);
				//break; // 최초로 발견된 1개의 정보만 확인하고 마침
			}
			
			// 도서명 문자열 중에 strName 문자열이 포함되어 있으면
			// 그 값을 표시하자
			// 중간문자열 검색
			
			// "ABC".contains("B")
			// 문자열 ABC 중에 문자열 B가 포함되어 있냐?
			if(voStrName
					.toUpperCase()
					.contains(strName.toUpperCase())) { // contains는 위의 IgnoreCase보다 시간이 엄청 오래 걸림
				this.view(i);
				
			}
			
		}
	}
}

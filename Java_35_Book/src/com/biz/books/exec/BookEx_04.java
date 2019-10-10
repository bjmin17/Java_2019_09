package com.biz.books.exec;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookSaveServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx_04 {

	public static void main(String[] args) {
		
		String bookFile = "src/com/biz/books/도서정보.txt";
		String bookSavePath = "src/com/biz/books/";
		BookReadServiceV1 bRead = new BookReadServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		BookSaveServiceV1 bSave = new BookSaveServiceV1();
		Scanner scanner = new Scanner(System.in);
		
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getBookList();
			
			bView.setBookList(bookList);
//			bView.view();
//			bView.search("책");
			
			bSave.setBookList(bookList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("==============================");
			System.out.println("도서검색");
			System.out.println("==============================");
			System.out.println("1. 제목 2. 가격 0. 종료");
			System.out.println("------------------------------");
			System.out.print("선택 >> ");
			
			String strM = scanner.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 0) break;
			
			if(intM == 1) {
				System.out.print("제목 >> ");
				String strTitle = scanner.nextLine();
				bView.search(strTitle);
				
				System.out.print("파일로 저장??(YES/no) >> ");
				String sOk = scanner.nextLine();
				if(sOk.equals("YES")) {
					try {
						bSave.print(bookSavePath + strTitle + ".txt",strTitle);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			if(intM == 2) {
				System.out.print("최저가격 >> ");
				String sPrice = scanner.nextLine();
				
				System.out.print("최고가격 >> ");
				String ePrice = scanner.nextLine();
				
				try {
					bView.search(Integer.valueOf(sPrice), Integer.valueOf(ePrice));
					
					System.out.print("파일로 저장??(YES/no) >> ");
					String sOk = scanner.nextLine();
					if(sOk.equals("YES")) {
						try {
							bSave.print(bookSavePath + sPrice + " - " + ePrice + ".txt",
										Integer.valueOf(sPrice),
										Integer.valueOf(ePrice));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				} catch (Exception e) {
					System.out.println("가격은 숫자형식으로 입력!!");
				}
				
			}
			
		}
		System.out.println("업무종료 !!!");
		
	}
}

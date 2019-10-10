package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.utils.BookSettings;
import com.biz.books.utils.BookSettings.FILE;

/*
 * 도서정보.txt 파일을 읽어서
 * 문자열을 콜론(:)을 기준으로 분리하고
 * BookVO에 담은 후 bookList에 추가하는 method를 작성
 */
public class BookReadServiceV1 {

	private List<BookVO> bookList;
	
	public List<BookVO> getBookList(){
		return bookList;
	}
	
	
	public void readBookInfo(String bookFile) throws Exception {
		bookList = new ArrayList<BookVO>();
		FileReader fr = new FileReader(bookFile);
		BufferedReader buffer = new BufferedReader(fr);
		
		String read = "";
		
		int lineNum = 0;
		while(true) {
			
			read = buffer.readLine();
			if(read == null) break;
//			System.out.print(++lineNum + " ");
			String[] strs = read.split(":");
			
			BookVO vo = new BookVO();
			vo.setB_isbn(strs[BookSettings.FILE.ISBN]);
			vo.setB_title(strs[BookSettings.FILE.TITLE]);
			vo.setB_writer(strs[BookSettings.FILE.WRITER]);
			vo.setB_comp(strs[BookSettings.FILE.COMP]);
			vo.setB_trans(strs[BookSettings.FILE.TRANS]);
			vo.setB_price(Integer.valueOf(strs[BookSettings.FILE.PRICE].trim()));
			vo.setB_page(Integer.valueOf(strs[BookSettings.FILE.PAGE]));
			vo.setB_date(strs[BookSettings.FILE.DATE]);
			
			bookList.add(vo);
		}
		buffer.close();
		fr.close();
	}
}

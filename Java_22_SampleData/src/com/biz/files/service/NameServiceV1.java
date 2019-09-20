package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class NameServiceV1 implements NameService{

	List<String> nameList = null;
	List<String> famList = null;
	List<String> sortList = null;
	
	// 클래스 이름과 같은 이름의 method이고
	// return type 없다(void, int...)
	public NameServiceV1() {
		nameList = new ArrayList<String>();
		famList = new ArrayList<String>();
		sortList = new ArrayList<String>();
	}
	@Override
	public void readNameList(String nameFile) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);
			
		String reader = "";
			
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			nameList.add(reader);
		}
		buffer.close();
		fileReader.close();
	}
	@Override
	public void readFamList(String famFile) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(famFile);
		buffer = new BufferedReader(fileReader);
			
		String famRead = "";
		while(true) {
			famRead = buffer.readLine();
			if(famRead == null) break;
			
			// reader에서 한글성씨만 추출하기
			String[] famSt1 = famRead.split(":");
			// famSt1[1] 데이터 중에서 첫 글자 1개만 필요
			String famSt = famSt1[1].substring(0,1);
			
			famList.add(famSt);
		}
		buffer.close();
		fileReader.close();
		
		//-----------디버깅
//		for(String s : famList) {
//			System.out.println(s);
//		}
	}
	@Override
	public void writeNameFile(String korNameFile, int length) throws Exception {

//		// 선생님꺼
//		// nameList와 famList를 한번 섞어주기
//		Collections.shuffle(nameList);
//		Collections.shuffle(famList);
//		
		// 1번 코드
//		int nameSize = nameList.size();
//		int famSize = famList.size();
//		PrintWriter fileOut = new PrintWriter(korNameFile);
//		for(int i = 0 ; i < 100 ; i++) {
//			String strName = famList.get(i) + nameList.get(i);
//			System.out.println(strName);
//		}
//		System.out.println("========================");
		
		//----------------------------------------------
		//2번 코드
//		Random rnd = new Random();
//		
//		String strName = "";
//		
//		for(int i = 0 ; i < 100 ; i++) {
//			strName = famList.get(rnd.next(famSize));
//			strName += famList.get(rnd.next(nameSize));
//			System.out.println(strName);
//			fileOut.println(strName);
//		}
//		fileOut.close();
		
		Random rnd = new Random();
		PrintWriter fileOut;
		
		fileOut = new PrintWriter(korNameFile);
		int nSize = nameList.size();
		int fSize = famList.size();
		for(int i = 0 ; i < length ; i++) {
			int nameNum = rnd.nextInt(nSize);
			int famNum = rnd.nextInt(fSize);
			System.out.printf("%s%s\n", famList.get(famNum), nameList.get(nameNum));
			
			fileOut.printf("%s%s\n", famList.get(famNum), nameList.get(nameNum));
			fileOut.flush();
			
			String strSort = String.format("%s%s\n", famList.get(famNum), nameList.get(nameNum));
			
			sortList.add(strSort);
		}
		fileOut.close();
//		Collections.sort(sortList);
//		for(String s : sortList) {
//			System.out.print(s);
//		}
//		Collections.sort(sortList, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//
//				return o1.(int)(o1.substring(0,1) - o2.(int)(o2.substring(0,1));
//			}
//
//			
//		});
	}
}

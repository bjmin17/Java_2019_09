package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.util.StudentIDX;

public class StudentServiceV1 {
	// Map
	// List와 달리 Map은 key, value 형태로 데이터를 저장한다.
	// key값으로 임의의 데이터를 읽기 쉽도록 구조가 되어 있다.
	// List는 순서대로 add하고 get(index)로 값을 읽음,,순서대로 처리할 때 유리
	// Map은 순서에 관계없이 put으로 입력하고 값을 찾을 때는 get(key)로 읽음,, 무작위로 처리할 때 유리
	// Map은 HashMap, TreeMap(자동정렬)으로 생성할 수 있다.
	// 저장 put(), 읽기 get(key)
	
	
	// List
	// 보통 순서대로 데이터를 추가하고, 순서대로 읽는 구조
	// List는 ArrayList, LinkedList 생성한다.
	// 저장 add(), 읽기 get(index,위치 값을 알아야만 쓸 수 있다.)
	private Map<String, StudentVO> stdList;
	
	public StudentServiceV1() {
		// TreeMap은 put된 데이터를 순서대로 자동 정렬한다.
		stdList = new TreeMap<String, StudentVO>();
	}
	
	public Map<String, StudentVO> getStdList() {
		return this.stdList;
	}
	
	
	// student.txt 파일을 읽어서 stdList에 데이터 가져오기
	public void read(String stdFileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(stdFileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] stds = reader.split(":");
			/*
			 * stds[0] : 학번
			 * stds[1] : 이름
			 * stds[2] : 전화번호
			 * stds[3] : 주소
			 */
			StudentVO stdVO = new StudentVO();
			stdVO.setNum( stds[ StudentIDX.NUM ]);
			stdVO.setName( stds[ StudentIDX.NAME ]);
			stdVO.setTel( stds[ StudentIDX.TEL ]);
			stdVO.setAddr(stds[ StudentIDX.ADDR ]);
			
			// key를 학번으로 지정하고
			// value를 StudentVO로 지정한다.
			stdList.put(stds[StudentIDX.NUM], stdVO);
			
			
			
		}// end while
		buffer.close();
		fileReader.close();
		
	}
	
	public void list() {
		// map의 key 부분만 추출해서 리스트로 볼 수 있도록 변환
		// stdList Map에서 Key부분만 추출하여 Set으로 자료 변환
		Set<String> stdNums = stdList.keySet();
		
		System.out.println("======================================================");
		System.out.println("학생명부");
		System.out.println("======================================================");
		System.out.println("학번\t이름\t전화번호\t주소");
		System.out.println("------------------------------------------------------");
		for(String key : stdNums) {
			// stdList에는 <String, StudentVO> 형태의 자료가
			//		저장되어 있기 때문에
			//	stdList.get("A001") 형태로 값을 추출하면
			// 		추출된 데이터는 StudentVO type이 된다.
			// 	따라서 stdList.get(key) method가 return 하는 값을
			//		변수에 담으려면 
			//		변수 type이 studentVO이어야 한다.
			StudentVO stdVO = stdList.get(key);
			
			System.out.print(stdVO.getNum() + "\t");
			System.out.print(stdVO.getName() + "\t");
			System.out.print(stdVO.getTel() + "\t");
			System.out.print(stdVO.getAddr() + "\n");
		}
		System.out.println("======================================================");
	} // end List
	
	// 학번으로 학생정보를 조회하는 method
	public StudentVO getStudent(String strNum) {
		
		return stdList.get(strNum);
		
		
	}
	
	
}

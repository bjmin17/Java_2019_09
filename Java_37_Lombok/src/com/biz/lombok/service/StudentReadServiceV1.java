package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Getter;

@Getter
public class StudentReadServiceV1 {

	private List<StudentVO> stdList;
	
	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 * 
	 */
	
	public List<StudentVO> getStdList(){
		return stdList;
	}
	public void readStudent(String fileName) throws IOException {
		stdList = new ArrayList<StudentVO>();
		FileReader fileRead = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileRead);
		
		String read = "";
		
		while(true) {
			read = buffer.readLine();
			if(read == null) break;
//			001:홍길동:010-1111-1111:3:서울특별시
			String[] strs = read.split(":");
			
			StudentVO stVO = new StudentVO();
			stVO.setS_num(strs[0]);
			stVO.setS_name(strs[1]);
			stVO.setS_tel(strs[2]);
			stVO.setS_grade(Integer.valueOf(strs[3]));
			stVO.setS_addr(strs[4]);
			
			
			stdList.add(stVO);
		}
		buffer.close();
		fileRead.close();
	}
	
	
	
}

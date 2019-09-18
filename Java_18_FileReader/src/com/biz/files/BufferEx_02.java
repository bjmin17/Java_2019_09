
package com.biz.files;

import java.io.IOException;

import com.biz.files.service.FileReaderBufferServiceV3;

public class BufferEx_02 {

	public static void main(String[] args) {
		
		FileReaderBufferServiceV3 fb = new FileReaderBufferServiceV3();
		String fileName = "src/com/biz/files/data.txt";
		
		try {
			fb.read(fileName); // 반복문을 무한히 반복해서 결과값이 null이 나옴,, V2에 if문 추가
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// v3로 실행하면 맨 마지막에 null 값이 적혀서 나옴
		// 마지막에 Korea까지 갔다가 다시 do를 실행하는데 읽을게 없어서 null이 나옴
		// 따라서 v3보단 v2가 안전,,, if문으로 끝나는걸 명시해줌
		
	}
}

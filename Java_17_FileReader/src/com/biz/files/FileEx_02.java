package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEx_02 {

	public static void main(String[] args) {
		
		String file = "src/com/biz/files/data.txt"; // 읽어올 파일 위치 표시
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			
			while(true) { // 몇번 반복해야할지 모르겠을 때는 while문
				int al = fileReader.read();
				if(al < 0) break;
				
				System.out.print(al + " : "); // 무한 반복하면 글자를 다 읽고나서 ASCII코드가 아닌
				System.out.println((char)al); // -1을 나타내줌
			}

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * 실행 값
		 * 75 : K
111 : o
114 : r
101 : e
97 : a
13 : 은 엔터코드

10 : 이것도 일종의 엔터코드

45824 : 대
54620 : 한
48124 : 민
44397 : 국
13 : 

10 : 

50864 : 우
47532 : 리
45208 : 나
46972 : 라
13 : 

10 : 

82 : R
101 : e
112 : p
117 : u
98 : b
108 : l
105 : i
99 : c
32 :  
111 : o
102 : f
32 :  
75 : K
111 : o
114 : r
101 : e
97 : a
		 */
	}
}

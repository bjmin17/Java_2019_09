package com.biz.string.exec;

public class StringEx_01 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		// strNation에 담긴 문자열을
		// 알파벳 단위로 (한글자씩) 잘라서
		// strS1 배열에 담아
		String[] strS1 = strNation.split("");
		
		for(String s : strS1) {
			System.out.print(s); //R e p u b l i c " "  o f " "  K o r e a,, 17개의 배열 생성 
		}
		
		// strNation에 담긴 문자열을
		// space(" ")기준으로 잘라서
		// strS2 배열에 담아라
		String[] strS2 = strNation.split(" "); // Republic of Korea,, 3개의 배열
		System.out.println("\n0 : " + strS2[0]);
		System.out.println("1 : " + strS2[1]);
		System.out.println("2 : " + strS2[2]);
		
		
		// 오류가나면 그냥 무시하라
		try {
			System.out.println("3 : " + strS2[3]); // 실행해서
		} catch (Exception e) { // exception이 발생하면 catch문을 실행하라,, 여기선 아무것도 안하고 무시
			// 코드 없음
			// 만약 exception이 발생하면
			// 모든 것을 무시하라
		}
		
		try {
			System.out.println("3 : " + strS2[3]);
		} catch (Exception e) {
			
			// try {} 내의 코드가 실행되는 과정에서
			// exception이 발생하면
			// JVM은 catch(e) {} 블럭에게 
			// 	exception 정보를 전달한다.
			//	이 때, exception 정보는 변수 e가 받아서 가지고 있다.
			// e 변수의 printStackTrace() method는
			// 어떤 exception이 발생했는지 단순히 console에
			// 보여주는 기능을 수행한다.
			e.printStackTrace();// e는 윗줄의 Exception,, 어떤 오류가 나는지 보여주는 메서드
		}
	}
}

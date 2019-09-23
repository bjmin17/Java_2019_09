package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccService;
import com.biz.bank.service.BankAccServiceV2;

public class BankAccEx_02 {

	public static void main(String[] args) {
		
		BankAccService bs = new BankAccServiceV2();
		Scanner scanner = new Scanner(System.in);
		String strBookFile = "src/com/biz/bank/계좌원장.txt";
		
		while(true) {
			System.out.println("============================================");
			System.out.println("한국은행 차세대 시스템 v2");
			System.out.println("============================================");
			System.out.println("1.조회 2.입금 3. 출금 4.전체조회 0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("업무선택 >> ");
			String strMenu = scanner.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			
			try {
				if(intMenu == 0) {
					
					BankAccServiceV2 bs2 = (BankAccServiceV2)bs; // 인터페이스가 있으면 그냥,, 없으면 형변환해서 써야함
//					bs2.writeAccBook(strBookFile);
					
					// 한줄로 한다면
//					((BankAccServiceV2)bs).writeAccBook(strBookFile);
					break;
				}
				else if(intMenu == 1) bs.viewAcc(); // else if와 다른점,,, else if는 1을 입력하면 viewAcc()만 하고 빠져나가서 while문 반복 
				// 모두 if문이라면 1을 선택하면 viewAcc()를 실행하고 intMenu가 2인지, 3인지 모두 비교함,, 아무래도 else if보다는 비효율적
				else if(intMenu == 2) bs.input();
				else if(intMenu == 3) bs.output();
				else if(intMenu == 4) bs.bankBookList();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		bs.bankBookList();
		try {
			bs.writeAccBook(strBookFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
		System.out.println("업무종료");
	}
}

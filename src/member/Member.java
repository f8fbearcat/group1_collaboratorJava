package member;

import java.util.Scanner;


public class Member {
	public void addM() {
		
		
			Scanner input = new Scanner(System.in);
			System.out.println("==회원==");
			System.out.println("1.회원 저장");
			System.out.println("2.보여지는 회원 수");
			System.out.println("3.나가기");
			System.out.println(">>>>");
			int num=input.nextInt();
			while(true) {
			if(num==1) {
				System.out.println("회원 정보 저장");
				break;
			}else if(num==2) {
				System.out.println("회원수를 보여줍니다.");
				break;
			}else {
				System.out.println("나가기");
				break;
			}
			}
		
		}
	}
		



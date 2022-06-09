package group1_project;

import java.util.Scanner;

import event.Event;

public class Main {
	public static void main(String[] args) {
		while(true){
			System.out.println("1. 회원관리 이동");
			System.out.println("2. 이벤트 관리 이동");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			switch(num) {
				case 1:
					break;
				case 2: 
					Event e = new Event();
					int choiceEvent = 0;
					
					while(choiceEvent < 3) {
						System.out.println("1. 이달의 이벤트 보기");
						System.out.println("2. 전체 이벤트 보기");
						System.out.println("3. 이벤트 나가기");
						System.out.print(">> 입력 : ");
						choiceEvent = input.nextInt();
						
						switch(choiceEvent) {
						case 1 :
							e.selectMonthEventList();
							break;
						case 2 :
							e.selectAllEventList();
							break;
						}
					}
					System.out.println("==============================");
					break;
				case 3:
					break;
			}
		}
	}
}
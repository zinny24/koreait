package tut01;

import java.util.Scanner;

public class LoopEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money 	= 10000;
		int coffee 	= 3000;
		int stock 	= 10;
		
		boolean run = true;
		while(run) {
			System.out.println("===========================");
			System.out.println("스타벅스 커피 자동 판매기");
			System.out.println("===========================");
			System.out.println("1. 구매(P/p)  |  2. 잔액(B/b)  | 3. 종료(Q/q)");
			System.out.print("메뉴 선택 > ");
			String menu = sc.next();
			System.out.println("");
			
			
			switch(menu) {
			case "P":
			case "p":
	
				if( money < coffee ) {
					System.out.println("잔액이 부족합니다.");
					
				}else if( stock < 1 ) {
					System.out.println("커피(재고)를 구매할 수 없습니다.");
				
				}else {
					money = money - coffee;
					stock = stock - 1;
					System.out.println("커피를 구매 하였습니다.");
				}
				
				break;
				
			case "B":
			case "b":
				System.out.println("잔액 확인");
				System.out.println("");
				System.out.println("잔액 : "  + money);
				System.out.println("재고 : "  + stock);
				break;
				
			case "Q":
			case "q":
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
				break;
				
			default:				
				System.out.println("잘못 선택된 메뉴입니다.");
				System.out.println("");
				continue;				
				
			}
			
		}
	}
}






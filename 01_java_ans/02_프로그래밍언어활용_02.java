import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("");
            System.out.println("A(a).입력 |  Q(q).종료");
            System.out.print("선택 > ");
            String menu = sc.next();
            System.out.println("");

            if( menu.equals("A") ||  menu.equals("a")) {
                System.out.print("영어입력(띄어쓰기 없이) > ");
                String str = sc.next();
                System.out.println(str.toUpperCase());
                System.out.println("");
            }else if(menu.equals("Q") || menu.equals("q")) {
                System.out.println("프로그램 종료");
                System.out.println("");
                System.exit(0);
            }else{
                System.out.println("잘못된 메뉴 선택입니다.");
                System.out.println("");
            }
        }
    }
}

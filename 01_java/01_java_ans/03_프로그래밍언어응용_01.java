import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학년(1 ~ 4) : ");
        int grade = sc.nextInt();

        System.out.print("점수(0 ~ 100) : ");
        int score = sc.nextInt();
        System.out.println("");

        if( score >= 60) {

            if( grade < 4 ) {
                System.out.println("합격입니다.");

            }else if(grade > 3 && score >= 80) {
                System.out.println("졸업입니다.");

            }else{
                System.out.println("재시험입니다.");
            }


        }else{
            System.out.println("불합격입니다.");
            System.out.println("");
        }
    }
}

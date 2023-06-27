package try_catch;

import java.util.Scanner;

public class MainClass08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		while(true) {
			try {
				System.out.println("인증 프로그램 입니다.");
				System.out.print("주민번호 입력(앞6자리) : ");
				n = sc.nextInt();
				if(n >= 900000) {
					System.out.println("가입불가");
				}else if((int)(Math.log10(n)+1) != 6) {
					System.out.println("길이가 틀렸습니다.");
				}else if(891212 >= n) {
					System.out.println("가입가능");
				}else {
					System.out.println("잘못입력");
				}


			} catch (Exception e) {
				
				System.err.println("숫자를 입력하세요!!!");
				String n2 = sc.nextLine();
			}


			System.out.println("90년생 이상은 '가입불가'");
			System.out.println("89년생 이하는 '가입가능'");
			System.out.println("A ,ㅁ,ㅋ 문자를 잘못입력");







		}
	}

}

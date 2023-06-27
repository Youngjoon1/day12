package try_catch;

import java.util.Scanner;

public class TestClass04 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		int n1 = 10, n2 = 2;
		try {
			System.out.println(n1 / n2);
			return;
		} catch (Exception e) {
			System.out.println("문제발생!!!");
		}finally {
			System.out.println("finally 실행");
			sc.close();
		}
		System.out.println("다음 문장들 실행");	
		
		
		
	}
	
	
}

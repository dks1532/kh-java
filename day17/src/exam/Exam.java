package exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Divisor d = new Divisor();
		LCM lcm = new LCM();
		GCD gcd = new GCD();
		
		while(true) {
			System.out.println("시행할 작업을 선택(1: 약수, 2: 최소공배수, 3: 최대공약수, 0: 종료) : ");
			int x = sc.nextInt();
			if(x == 0)
				break;
			
			switch(x) {
			case 1:
				System.out.println("숫자를 입력: ");
				int num = sc.nextInt();
				d.divisor(num);
				break;
			case 2:
				System.out.print("두 수 입력 : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				lcm.lcm(num1, num2);
				break;
			case 3:
				System.out.print("두 수 입력 : ");
				int num3 = sc.nextInt();
				int num4 = sc.nextInt();
				gcd.gcd(num3, num4);
				break;
			default:
				System.out.println("0~3까지의 숫자만 입력하세요");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}

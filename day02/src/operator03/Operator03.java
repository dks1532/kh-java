package operator03;

public class Operator03 {

	public static void main(String[] args) {
		// 비교연산자
		// >, <, >=, <=, ==(같다), !=(같지않다)
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 > num2);
		
		boolean bool = num1 > num2;
		System.out.println(bool);
		
		bool = num1 == num2;
		System.out.println("num1과 num2는 같은가? " + bool);
		
		bool = num1 != num2;
		System.out.println("num1과 num2가 같지않은가? " + bool);

	}

}

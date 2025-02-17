package casting02;

public class Casting02 {

	public static void main(String[] args) {
		// 명시적 형변환 : 큰자료형을 작은 자료형에 넣을때
		//				반드시 앞에 작은자료형을 괄호안에 명시한다
		int num1 = 120;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
		num1 = 1234534;
		b1 = (byte)num1;
		System.out.println(b1);
		
		double d1 = 13627.2879246876;
		float f1 = (float)d1;
		System.out.println(f1);
		
		System.out.println("byte의 크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short의 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int의 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long의 크기 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("char의 크기 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);	
	}

}
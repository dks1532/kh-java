package decimalFormat01;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormat1 {

	public static void main(String[] args) {
		double number = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(number));
		
		// 위의 2줄을 한줄로하면
		System.out.println(new DecimalFormat("0").format(4758.948));
		
		System.out.println("------------------------------------");
		
		System.out.println(new DecimalFormat("0").format(number));
		System.out.println(new DecimalFormat("#").format(number));
		System.out.println(new DecimalFormat("0.0").format(number));
		System.out.println(new DecimalFormat("0.00").format(number));
		System.out.println("------------------------------------");
		
		number = 1234567.0;
		System.out.println(new DecimalFormat("0.0").format(number));	// 0은 무조건 그자리는 출력
		System.out.println(new DecimalFormat("#.#").format(number));	// 있으면 출력 없으면 출력하지 않음

		number = 1234567.89;
		System.out.println(new DecimalFormat("000000000.0").format(number));
		System.out.println(new DecimalFormat("#########.#").format(number));
		System.out.println("------------------------------------");
		
		// number = -1234567.89;
		System.out.println(new DecimalFormat("#.#-").format(number));
		System.out.println(new DecimalFormat("-#.#").format(number));
		System.out.println(new DecimalFormat("+#.#;-#.#").format(number));	// 양수면 +, 음수면 - 기호를 붙여줌
		System.out.println("------------------------------------");
		
		System.out.println(new DecimalFormat("#,###.#").format(number));
		System.out.println(new DecimalFormat("#,####.#").format(number));
		System.out.println(new DecimalFormat("+#,###.#;-#,###.#").format(number));
		System.out.println("------------------------------------");
		
		System.out.println(new DecimalFormat("#.#%").format(number));
		System.out.println(new DecimalFormat("\u00A4#,###.#").format(number));
		System.out.println(new DecimalFormat("\\#,###.#").format(number));	// 글꼴이 한글일때만 통화표시
		System.out.println("====================================");
		
		// parse() 는 DecimalFormat의 조상인 NumberFormat에 정의되어 있는 메소드 : 문자열을 숫자로 변환
		// Number는 래퍼클래스의 조상	(기본자료형(int,double,char)을 => Integer, Double 객체화하기 위해 만든 클래스)
		// intValue(), doubleValue()
		
		String stNum = "1,234,567.89";
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		try {
			Number num = df2.parse(stNum);
			// System.out.println(num*2);  // 객체(Number)타입으로 변환을 했기 때문에 연산은 안됨
			
			double douNum = num.doubleValue();	// 실수형으로 변환
			System.out.println(douNum*2);
			
			// 위에것을 한줄로
			System.out.println((new DecimalFormat("#,###.#").parse("1,234,567.89").doubleValue()) * 3);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

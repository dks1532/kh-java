package exception01;

public class _08_MultiTryCatch {

	public static void main(String[] args) {
		String[] str = {"a", "b", "c"};
		String[] strNum = {"23", "17", "3"};
		int i=0;
		
		try {
			str[1] = "d";
			str[2] = "e";
			
			for(i=0; i<strNum.length; i++) {
				int x = Integer.parseInt(strNum[i]);
				System.out.println(x);
			}
	
			int num = 9/0;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 넘어섰습니다 index는 2까지만 가능");
		} catch(NumberFormatException e) {
			System.out.println(strNum[i] + "는 정수로 변환할 수 없습니다");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {	// finally 잘안씀 안쓰고 try catch구문 밖에 실행문을 적으면 똑같이 기능
			System.out.println("프로그램 종료"); 
		}
		System.out.println("프로그램 종료");
	}
}

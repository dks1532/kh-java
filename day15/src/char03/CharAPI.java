package char03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharAPI {
	/*
	 * 문자기반 스트림
	 * - 문자 스트림 : 2byte단위로 전송하는 통로
	 * - 기반 스트림 : 외부매체와 직접 연결하는 통로
	 * 
	 * xxxReader : 입력용 스트림
	 * xxxWriter : 출력용 스트림
	 */
	
	// 프로그램 -> 파일 (출력)
	public void fileSave() {
		FileWriter fw = null;
		
		try {
			// 1. 객체 생성
			fw = new FileWriter("b_char.txt");
			
			// 2. 데이터 출력
			fw.write("화요일이다");
			fw.write('A');
			fw.write("\n");
			fw.write("java\n");
			
			char[] arr = {'a','p','p','l','e'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			// 3. 스트림 반납
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 프로그램 <- 파일(입력)
	public void fileRead() {
		// FileReader : 파일로부터 데이터를 2byte 단위로 읽어 오는 스트림
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

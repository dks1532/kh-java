package file01;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		try {
			// 경로를 지정하지 않고 파일 만들기
			File f1 = new File("test.txt");
			f1.createNewFile();	// 메소드까지 호출해야만 파일이 만들어짐
			
			// 존재하고 있는 폴더에 파일 생성 : 경로 지정
			//File f2 = new File("D:\\test.txt");
			File f2 = new File("D:/test.txt");
			f2.createNewFile();
			
			// 폴더 만들기
			File tempfolder = new File("D:/temp");
			tempfolder.mkdir();		// 폴더생성
			
			File f3 = new File("D:/temp/test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists());		// 존재하는지 안하는지
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile());		// 파일인지 아닌지
			System.out.println(tempfolder.isFile());
			System.out.println("-------------");
			
			// parent폴더 만들기
			File folder = new File("parent");
			folder.mkdir();
			
			// parent폴더안에 person.txt파일 만들기
			File file = new File("parent/person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			System.out.println("상위폴더 : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

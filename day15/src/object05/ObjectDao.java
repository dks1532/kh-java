package object05;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDao {
	// 프로그램 --> 파일(출력)
	public void fileSave() {
		Phone ph1 = new Phone("아이폰", 1800000);
		Phone ph2 = new Phone("갤럭시", 1700000);
		Phone ph3 = new Phone("갤럭시노트", 2100000);
		
		// FileOutputStream : 1byte 기반 스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조 스트림 (ObjectWriter없음)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			oos.writeObject(ph1); // 직렬화를 하지 않았기 때문에 예외가 발생 Phone에 implements Serializable를 해야됨
			oos.writeObject(ph2);
			oos.writeObject(ph3);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 프로그램 <-- 파일(입력)
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			while(true)
				System.out.println(ois.readObject());
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일을 다 읽었습니다");
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/*
		catch(EOFException e) {
			System.out.println("파일을 다 읽었습니다");
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
		System.out.println("프로그램 종료");
	}
}

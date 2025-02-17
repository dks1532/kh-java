package calendar01;

import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		date1.set(2022, 3, 10);
		System.out.println(date1.get(Calendar.YEAR) + "년" + date1.get(Calendar.MONTH) + "월" + date1.get(Calendar.DATE) + "일");
		
		// 100일 후
		date1.add(Calendar.DATE, 100);
		System.out.println(date1.get(Calendar.YEAR) + "년" + date1.get(Calendar.MONTH) + "월" + date1.get(Calendar.DATE) + "일");
		
		// 100일 전
		date1.add(Calendar.DATE, -100);
		System.out.println(date1.get(Calendar.YEAR) + "년" + date1.get(Calendar.MONTH) + "월" + date1.get(Calendar.DATE) + "일");
		
		// 2달 전
		date1.add(Calendar.MONTH, 2);
		System.out.println(date1.get(Calendar.YEAR) + "년" + date1.get(Calendar.MONTH) + "월" + date1.get(Calendar.DATE) + "일");
	}
}

package collection.treeSet03;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		Object[] arr = { 1, 4, 6, 7, 3, 2, 8, 9, 3, 4, 5, 6, 7 }; // 13개

		TreeSet set = new TreeSet();
		for (Object i : arr)
			set.add(i);

		System.out.println(set); // 오름차순 정렬
		NavigableSet<Integer> descending = (TreeSet<Integer>) set.descendingSet();
		/*
		for(int i : descending) {
			System.out.print(i + " ");
		}
		*/
		System.out.println(descending);	// 내림차순 정렬 
	}
}

package collection.hashSet02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet5 {

	public static void main(String[] args) {
		Set lotto = new HashSet();
		
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45 + 1));
		}
		List list = new ArrayList(lotto);
		Collections.sort(list);
		System.out.println("로또 번호: " + list);
		
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		for(int i=0; lotto2.size() < 6; i++) {
			lotto2.add((int)(Math.random()*45 + 1));
		}
		List list2 = new LinkedList(lotto2);
		Collections.sort(list2);
		System.out.println("로또 번호: " + list2);
	}
}

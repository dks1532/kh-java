package collection.treeSet03;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		Set lotto = new TreeSet();

		while (lotto.size() < 6) {
			lotto.add((int) (Math.random() * 45 + 1));
		}
		System.out.println(lotto);
	}

}

package inheritance03;
class D {
	static int i;
	static int j;
}

class E extends D {
	static String i;
}

public class InheritanceTest4 {
	public static void main(String[] args) {
		D.i = 100;
		E.i = "KH정보교육원";
		D.j = 500;
	}
}

package ifelse01;

public class IfElseMulti06 {

	public static void main(String[] args) {
		int score = 140;
		
		if(score <= 100) {
			if(score >= 60){
				if(score >= 90)
					System.out.println("A학점");
				else if(score >= 80)
					System.out.println("B학점");
				else if(score >= 70)
					System.out.println("C학점");
				else
					System.out.println("D학점");
			} else if(score >= 0) {
				System.out.println("F학점");
			} else
				System.out.println("점수는 0미만이 될 수 없습니다");
			
		} else {
			System.out.println("점수는 100초과 될 수 없습니다");
		}

	}

}

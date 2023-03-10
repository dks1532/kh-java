package dicegame;

import java.util.Scanner;

public class Game {
	public void game() {
		Dice d = new Dice();
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		int i = 0;
		while(true) {
			int p1 = d.roll();
			int p2 = d.roll();
			System.out.printf("p1: %d, p2: %d\n",p1,p2);
			sum1 += p1;
			sum2 += p2;
			i++;
			if(sum1 >= 20 && sum2 >= 20) {
				System.out.println("두 플레이어 모두 동시에 주사위 합 20을 넘어 비겼습니다.");
				break;
			}
			else if(sum1 >= 20) {
				System.out.println("주사위 합 " + sum1 +" p1의 승리");
				break;
			}
			else if(sum2 >= 20) {
				System.out.println("주사위 합 " + sum2 +" p2의 승리");
				break;
			}
			System.out.printf("<%d번째 게임 결과>\np1 주사위합: %d, p2 주사위합: %d\n계속하려면 엔터를 입력하세요",i,sum1,sum2);
			sc.nextLine();
		}
	}
}

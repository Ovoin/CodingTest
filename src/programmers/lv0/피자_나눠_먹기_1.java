package programmers.lv0;


/**
 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 
 * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
 * @author ovoin
 *
 */
public class 피자_나눠_먹기_1 {
	public static void main(String[] args) {
		int num = 9;
		int requiredPizzaCnt = calculateTheLeastPizzaCount(num);
		
		System.out.printf("필요한 피자의 수는 %d개입니다.", requiredPizzaCnt);
	}
	
	public static int calculateTheLeastPizzaCount(int num) {
		int PIZZA_PIECES = 7;
		int requiredPizzaCnt = 0;
		
		if(num < PIZZA_PIECES) {
			requiredPizzaCnt = 1;
		} else if(num % PIZZA_PIECES == 0) {
			requiredPizzaCnt = num / PIZZA_PIECES;
		} else if(num % PIZZA_PIECES != 0) {
			requiredPizzaCnt = num / PIZZA_PIECES + 1;
		}
		
		return requiredPizzaCnt;
	}
}

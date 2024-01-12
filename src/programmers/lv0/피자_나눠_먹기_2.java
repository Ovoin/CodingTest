package programmers.lv0;

import java.math.BigInteger;

/**
 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
 * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
 * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 
 * 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 * @author ovoin
 *
 */
public class 피자_나눠_먹기_2 {
	public static void main(String[] args) {
		BigInteger pizzaSlices = new BigInteger("6");
		int num = 10;
		BigInteger peopleCount = new BigInteger(String.valueOf(num));
		
		// 6과 주어진 숫자의 최소공배수 찾기
		BigInteger lcm = calculateLCM(pizzaSlices,peopleCount);
		
		// 최소공배수 구하기
		int requiredPizzaCount = lcm.divide(pizzaSlices).intValue();
		System.out.printf("필요한 최소한의 피자 개수는 %d판입니다.",requiredPizzaCount);
		
		
		
	}
	
	// 최대공약수 계산하기
	private static BigInteger calculateGCD(BigInteger num1, BigInteger num2) {
		while(!num2.equals(BigInteger.ZERO)) {
			BigInteger temp = num2;
			num2 = num1.mod(num2);
			num1 = temp;
			
		}
		return num1;
	}
	
	// 최소공배수 계산하기
	private static BigInteger calculateLCM(BigInteger num1, BigInteger num2) {
		return num1.multiply(num2).divide(calculateGCD(num1,num2));
	}
	
	
}

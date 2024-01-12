package programmers.lv0;

import java.util.Arrays;
import java.util.OptionalDouble;

public class 배열의_평균값 {
	
	public static void main(String[] args) {
		int[] numbers = {1,5,6,4,2};
		double avg = calculateNumbersAverage(numbers);
		System.out.printf("배열의 평균값은 %.1f입니다.",avg);
	}
	
	private static double calculateNumbersAverage(int[] numbers) {
		OptionalDouble avgOptional = Arrays.stream(numbers).average();
		double avg = avgOptional.orElseThrow();
		return avg;
	}
}

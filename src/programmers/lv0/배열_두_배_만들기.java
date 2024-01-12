package programmers.lv0;

import java.util.Arrays;

public class 배열_두_배_만들기 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int[] DoubleNumbers = DoubleEachNumbers(numbers);
		System.out.println(Arrays.toString(numbers) + "배열을 두 배 로 만든 결과 => " + Arrays.toString(DoubleNumbers));
	}
	
	public static int[] DoubleEachNumbers(int[] numbers) {
		int[] result = Arrays.stream(numbers).map(n -> n * 2).toArray();
		return result;
	}

}

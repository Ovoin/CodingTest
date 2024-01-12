package programmers.lv0;

import java.util.Arrays;

/**
 * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 
 * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
 *
 */
public class 중앙값_구하기 {
	public static void main(String[] args) {
		int[] array = {9,-1,0};
		ascendingOrderByInt(array);
		int middleIndex = findMiddelIndex(array);
	
		System.out.printf("오름차순 정렬된 정수배열의 중앙값은 %d입니다.",array[middleIndex]);
		
	}
	
	public static void ascendingOrderByInt(int[] array) {
		Arrays.sort(array);
	}
	
	public static int findMiddelIndex(int[] array) {
		return array.length / 2 ;
	}

}

package programmers.lv0;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다.
 * @author ovoin
 *
 */
public class 최빈값_구하기 {
	public static void main(String[] args) {
		int[] array = {1,2,2,2,3,3,3,4};
		Map<Integer,Long> frequencyMap = accumulateFrequency(array);
		int result = findMostFrequentKey(frequencyMap);
		// 결과 출력
		if(result != -1) {
			System.out.println("최빈값은 " + result + " 입니다.");
		} else {
			System.out.println("최빈값을 가진 원소가 2개 이상입니다.");
		}
	}
	
	public static Map<Integer,Long> accumulateFrequency(int[] array){
		// IntStream을 사용하여 각 원소의 빈도수를 세고 맵으로 변환
		return  Arrays.stream(array)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	public static int findMostFrequentKey(Map<Integer, Long> frequencyMap) {
		boolean hasMultipleMaxFrequencyKeys = false;
		Long maxFrequency = -1L;
		int mostFrequentKey = -1;
		
		for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            Long frequency = entry.getValue();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentKey = key;
                hasMultipleMaxFrequencyKeys = false;
            } else if (frequency == maxFrequency) {
                hasMultipleMaxFrequencyKeys = true;
            }
        }
		
        return hasMultipleMaxFrequencyKeys ? -1 : mostFrequentKey;
    }
}

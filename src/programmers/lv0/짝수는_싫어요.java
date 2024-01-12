package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 짝수는_싫어요 {
	
	public static void main(String[] args) {
		int n = 16;
		int[] result = outputOddLessThan(n);
		System.out.println(Arrays.toString(result));
	}
	
	static int[] outputOddLessThan(int n) {
		List<Integer> oddList = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				oddList.add(i);
			}
		}
		return oddList.stream().mapToInt(i -> i).toArray();
	}

}

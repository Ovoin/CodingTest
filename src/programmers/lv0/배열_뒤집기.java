package programmers.lv0;

import java.util.Arrays;

public class 배열_뒤집기 {
	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		int[] answer = reverseArray(num_list);
		System.out.println("뒤집힌 배열 : " + Arrays.toString(answer));
	}
	
	private static int[] reverseArray(int[] num_list){
		int[] answer = new int[num_list.length];
		int j=0;
		for(int i = num_list.length-1; i>=0; i--) {
			answer[j] = num_list[i];
			j++;
		}
		return answer;
	}
}

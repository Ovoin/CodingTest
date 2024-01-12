import java.util.Scanner;

public class P2018_투포인터 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 연속된 자연수를 구할 자연수 N
		
		// 투포인터 초기화
		int start_idx = 1;
		int end_idx = 1;
		int sum = 1;
		int count = 1;
		
		while(end_idx != N) {
			if(sum < N) {
				end_idx++;
				sum = sum + end_idx;
			} else if(sum == N) {
				end_idx++;
				count++;
				sum = sum + end_idx;
			} else if(sum > N) {
				sum = sum - start_idx;
				start_idx++;
			}
		}
		
		System.out.println("연속된 자연수의 가짓수 : " + count);
	}

}

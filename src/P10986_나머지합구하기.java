import java.util.Arrays;
import java.util.Scanner;

public class P10986_나머지합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N개의 수 (배열의 길이)
		int M = sc.nextInt(); // 나누어떨어지는 수
		
		
		long[] S = new long[N];
		long[] C = new long[M]; 
		long answer = 0;
		S[0] = sc.nextInt();
		
		for(int i=1; i<N; i++) { // 수열 합배열 만들기
			S[i] = S[i-1] + sc.nextInt();
		}
		
		for(int i=0; i<N; i++) { // 합배열에 모든 값에 % 연산 수행하기
			int remainder = (int)(S[i] % M);
			if(remainder == 0) {
				answer++;
			}
			C[remainder]++; // 나머지가 같은 인덱스의 개수 카운팅
			
		}
		
		for(int i=0; i<M; i++) {
			//나머지가 같은 인덱스중 2개를 뽑아 정답에 더해주기
			if(C[i] > 1) {
				
				answer = answer + (C[i] * (C[i]-1) / 2);
			}
		}
		System.out.println("나머지의 합 개수는 : "+ answer);
		
	}

}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1940_주몽 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 재료의 개수
		int M = sc.nextInt(); // 갑옷을 만드는데 필요한 수
		
		int[] A = new int[N]; // 재료들 
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
		int count = 0;
		int i= 0;
		int j= N-1;
		 
		while(i < j) { // 투 포인터 이동 원칙 따라 포인터를 이동하며 처리 
			if(A[i] + A[j] < M) {
				i++;
			} else if(A[i] + A[j] > M) {
				j--;
			} else {
				count++;
				i++;
				j--;
				
			}
		}
		
		System.out.println("만들 수 있는 갑옷의 수 : " + count);
		
	}

}

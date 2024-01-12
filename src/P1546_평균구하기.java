import java.util.Scanner;

public class P1546_평균구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 시험을 본 과목의 개수(N<=1000)
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		long sum=0;
		long max=0;
		for(int i=0; i<N; i++) {
			if(A[i] > max) max = A[i];
			sum += A[i];
		}
		
		double avg = (sum * 100.0 / max / 3);
		System.out.println(avg);
	}
}

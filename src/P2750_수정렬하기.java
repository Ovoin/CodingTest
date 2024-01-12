import java.util.Scanner;

public class P2750_수정렬하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 숫자의 개수
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i< N-1; i++) {
			int j=0;
			while(j <  N-1-i) {
				if(A[j]>A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
				j++;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(A[i]);
		}
		

	}

}

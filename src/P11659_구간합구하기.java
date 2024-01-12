import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//합배열을 구하는 공식은 ? S[i] = S[i-1] + A[i]
public class P11659_구간합구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = 
				new StringTokenizer(br.readLine());
		
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		
		System.out.println("데이터의 개수 : " + suNo);
		System.out.println("질의 개수 : " +quizNo);
		
		long[] S = new long[suNo + 1]; // 합배열
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		System.out.println(S[0]);
		for(int q=0; q<quizNo; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println("구간합은 : " + (S[j] - S[i-1]));
		}
		
		
	}
}

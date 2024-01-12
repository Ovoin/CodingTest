import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298_오큰수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 수열의 크기
		int[] A = new int[N];				     // 수열배열
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int[] result = new int[N];
		
		for(int i=1; i<N; i++) {
			
			int top = stack.peek();
			while(!(stack.isEmpty()) &&  A[top]<A[i]) {
				result[stack.pop()] = A[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.empty()) {
			result[stack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<N; i++) {
			bw.write(result[i] + " ");
		}
		bw.write("\n");
		bw.flush();
		
		
	}

}

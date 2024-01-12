import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
	static int checkArr[];
	static int myArr[];
	static int checkSecret;
	 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken()); // 문자열의 크기 
		int P = Integer.parseInt(st.nextToken()); // 부분문자열의 크기 
		
		int result = 0;
		char[] DNA = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		
		DNA = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) { // 0이라면 조건에 충족하므로 checkSecret에 1을 더해준다.
				checkSecret++;
			}
		}
		
		for(int i=0; i<P; i++) {
			Add(DNA[i]);
		}
		
		if(checkSecret == 4) {
			result++;
		}
		
		for(int i=P; i<S; i++) {
			int j = i - P;
			Add(DNA[i]);
			Remove(DNA[j]);
			if(checkSecret == 4) {
				result++;
			}
		}
		
		System.out.println(result);
		br.close();
		
	}
	
	private static void Add(char c) {
		
		switch(c) {
		case 'A' :
			myArr[0]++;
			if(myArr[0] == checkArr[0]) {
				checkSecret++;
			}
			break;
		case 'C' :
			myArr[1]++;
			if(myArr[1] == checkArr[1]) {
				checkSecret++;
			}
			break;
		case 'G' :
			myArr[2]++;
			if(myArr[2] == checkArr[2]) {
				checkSecret++;
			}
			break;
		case 'T' :
			myArr[3]++;
			if(myArr[3] == checkArr[3]) {
				checkSecret++;
			}
			break;
		}
	}
	
	private static void Remove(char c) {
		
		switch(c) {
		case 'A' :
			
			if(myArr[0] == checkArr[0]) {
				checkSecret--;
			}
			myArr[0]--;
			break;
		case 'C' :
			
			if(myArr[1] == checkArr[1]) {
				checkSecret--;
			}
			myArr[1]--;
			break;
		case 'G' :
			
			if(myArr[2] == checkArr[2]) {
				checkSecret--;
			}
			myArr[2]--;
			break;
		case 'T' :
			
			if(myArr[3] == checkArr[3]) {
				checkSecret--;
			}
			myArr[3]--;
			break;
		}
	}
}

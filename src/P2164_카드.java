import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> myQueue = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++) {
			myQueue.add(i);
		}
		
		while(myQueue.size() > 1) {
			myQueue.poll();
			int su = myQueue.poll();
			myQueue.add(su);
		}
		
		System.out.println(myQueue.poll());
	}

}

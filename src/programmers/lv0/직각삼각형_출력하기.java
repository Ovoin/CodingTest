package programmers.lv0;

import java.util.Scanner;

/**
 * 
 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 
 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
 *
 */
public class 직각삼각형_출력하기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        makeRightTriangle(n);
        System.exit(0);
	}

	private static void makeRightTriangle(int n) {
		for(int i=1; i<=n; i++) {
        	String star = "*".repeat(i);
        	System.out.println(star);
        }
	}

}

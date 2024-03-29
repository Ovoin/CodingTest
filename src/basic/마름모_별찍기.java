package basic;

import java.util.Scanner;

public class 마름모_별찍기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("홀수를 입력해주세요.");
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("홀수를 입력해야 합니다");
		} else {
			printDiamond(n);
		}
		
		sc.close();
	}
	
	public static void printDiamond(int n) {
		int space = n / 2;
		int star = 1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			if(i <= n / 2) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
		}
	}

}

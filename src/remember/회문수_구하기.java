package remember;

/**
 * 회문수란 ? 거꾸로 해도 똑같은 숮자를 의미한다 예를들어 12321....
 * 회문수를 구하는 로직은 좀 까먹지말자 제발~~~~~
 * @author ovoin
 *
 */
public class 회문수_구하기 {
	public static void main(String[] args) {
		int number = 12321;
		
		if(isPalindrom(number)) {
			System.out.printf("%d -> 검증결과 이 수는 회문수가 맞습니다",number);
		} else {
			System.out.printf("%d -> 검증결과 이 수는 회문수가 아닙니다",number);
			
		}
	}
	
	public static boolean isPalindrom(int number) {
		int palindrom = makePalindrom(number);
		
		if(number == palindrom) {
			return true;
		}
		return false;
	}

	private static int makePalindrom(int number) {
		System.out.print(number + "의 회문수는 ");
		int numberLen = String.valueOf(number).length();
		int palindrom = 0;
		
		for(int i=0; i<numberLen; i++) {
			int lastNumber = number % 10;
			palindrom *= 10;
			palindrom += lastNumber;
			number /= 10;
		}
		System.out.println(palindrom + " 입니다.");
		
		return palindrom;
	}
}

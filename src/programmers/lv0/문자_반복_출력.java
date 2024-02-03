package programmers.lv0;

/**
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 
 * return 하도록 solution 함수를 완성해보세요.
 * @author ovoin
 *
 */
public class 문자_반복_출력 {
	public static void main(String[] args) {
		String my_string="hello";
		int repeat=3;
		String result = repeatString(my_string,repeat);
		System.out.printf("문자열을 %d번 반복한 결과는 %s입니다.",repeat,result);
	}
	
	private static String repeatString(String str,int repeat) {
		String result="";
		for(int i=0; i<str.length(); i++) {
			result += Character.toString(str.charAt(i)).repeat(repeat);
		}
		return result;
	}
}

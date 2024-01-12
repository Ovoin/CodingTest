package programmers.lv0;

public class 문자열_뒤집기 {
	public static void main(String[] args) {
		String myString = "easy";
		String result = reverseString(myString);
		System.out.printf("%s을 뒤집은 결과는 %s입니다.",myString,result);
	}
	
	public static String reverseString(String myString) {
		String result = "";
		for(int i = myString.length() -1 ; i >= 0; i--) {
			char myChar = myString.charAt(i);
			result += myChar;
		}
		return result;
	}
}

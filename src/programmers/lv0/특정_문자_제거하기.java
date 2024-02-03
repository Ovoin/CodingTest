package programmers.lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. 
 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 * @author ovoin
 *
 */
public class 특정_문자_제거하기 {
	
	public static void main(String[] args) {
		String my_string = "HELLO";
		String letter = "L";
		
		String result = removeTargetLetter(my_string, letter);
		
		System.out.printf("%s에서 %s을 제거한 결과는 %s입니다.",my_string,letter,result);
		
	}
	
	private static String removeTargetLetter(String str,String target) {
		IntStream result = str.chars().filter(ch -> 
			ch != target.charAt(0)
		);
		
		return result.mapToObj(ch -> String.valueOf((char)ch))
			  .collect(Collectors.joining());
	}
}

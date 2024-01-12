package programmers.lv0;


/**
 * 
 * 정수 num1과 num2가 매개변수로 주어질 때, 
 * num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 
 * solution 함수를 완성해주세요.
 *
 */
public class 두_수의_나눗셈 {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 2;
		float floatNumMultiplyThousandTimes = intToFloat(num1,num2) * 1000;
		int intNumMultiplyThousandTimes = FloatToInt(floatNumMultiplyThousandTimes);
		System.out.println(intNumMultiplyThousandTimes);
		
	}
	
	public static float intToFloat(int num1,int num2) {
		return (float)num1 / num2; 
	}
	
	public static int FloatToInt(Float num) {
		return num.intValue();
	}
	
}

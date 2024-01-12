package programmers.lv0;

import java.math.BigInteger;

/**
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 
 * return 하도록 solution 함수를 완성해보세요.
 *
 */
public class 분수의_덧셈 {
	// 1. 두 denom의 최소공배수를 찾아낸다.
	// 2. 각 분수를 최소공배수 / denom 으로 나온 수를 곱해준 값으로 전환한다 . 
	// 3. 두 분수를 더한다 => 두 분수의 분자값을 더해준다.
	// 4. 최종 답을 배열로 전환한다.
	public static void main(String[] args) {
		int numer1 = 5;
		int denom1 = 5;
		int numer2 = 5;
		int denom2 = 5;
		int leastCommonMultiple = findLeastCommonMultiple(denom1,denom2);
		int multipledNumer1 = multipleNumerByLeastCommonMultiple(numer1,denom1,leastCommonMultiple);
		int multipledNumer2 = multipleNumerByLeastCommonMultiple(numer2,denom2,leastCommonMultiple);
		int sumNumer = multipledNumer1 + multipledNumer2;
		int greatestCommonDivisor = findGreatestCommonDivisor(sumNumer,leastCommonMultiple);
		int[] result = {sumNumer / greatestCommonDivisor,leastCommonMultiple / greatestCommonDivisor};
		System.out.printf("%d / %d + %d / %d = %d / %d 입니다."
				,numer1,denom1,numer2,denom2,result[0],result[1]);
		
	}
	
	public static int findLeastCommonMultiple(int denom1,int denom2) {
		if(isMultipledAnotherDenom(denom1,denom2)) {
			return Math.max(denom1, denom2);
		}
		return denom1 * denom2;
	}
	
	public static boolean isMultipledAnotherDenom(int denom1, int denom2) {
		if( denom1 % denom2 == 0 || denom2 % denom1 == 0) {
			return true;
		}
		return false;
	}
	
	public static int multipleNumerByLeastCommonMultiple(int numer,int denom,int leastCommonMultiple) {
		return numer * (leastCommonMultiple / denom);
	}
	
	public static int findGreatestCommonDivisor(int num1, int num2) {
		BigInteger gcd = BigInteger.valueOf(num1).gcd(BigInteger.valueOf(num2));
		return gcd.intValue();
	}

}

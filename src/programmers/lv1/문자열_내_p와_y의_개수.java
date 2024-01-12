package programmers.lv1;

/**
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 * @author ovoin
 *
 */
public class 문자열_내_p와_y의_개수 {
	public static void main(String[] args) {
		String s = "ppPPpoTTYYYooyY";
		int pNum = countPnum(s);
		int yNum = countYnum(s);
		boolean result = false;
		
		if(pNum == 0 && yNum == 0) {
			result = true;
		} else if(pNum == yNum) {
			result = true;
		} 
		
		System.out.printf("p의 개수는 %d, y의 개수는 %d입니다. 따라서 결과는 %b입니다",pNum,yNum,result);
	}
	
	public static int countPnum(String s) {
		boolean alExist = s.contains("p") || s.contains("P");
		int alCnt = 0;
		if(!alExist) {
			return 0;
		} else {
			for(int i=0; i < s.length(); i++) {
				if(s.charAt(i) == "p".charAt(0) || s.charAt(i) == "P".charAt(0)) {
					alCnt++;
				};
				
			}
			return alCnt;
		}
	}
	
	public static int countYnum(String s) {
		boolean alExist = s.contains("y") || s.contains("Y");
		int alCnt = 0;
		if(!alExist) {
			return 0;
		} else {
			for(int i=0; i < s.length(); i++) {
				if(s.charAt(i) == "y".charAt(0) || s.charAt(i) == "Y".charAt(0)) {
					alCnt++;
				};
			}
			return alCnt;
		}
	}

}

package programmers.lv0;

public class 머쓱이보다_키큰_사람 {
	public static void main(String[] args) {
		int[] heighs = {149, 180, 192, 170};
		int mussekHeight = 160;
		
		int result = countGreaterNumsThanNum(heighs,mussekHeight);
		
		System.out.printf("머쓱이보다 키 큰 사람수는 총 %d명입니다.", result);
	}
	
	public static int countGreaterNumsThanNum(int[] nums,int standardNum) {
		int result = 0;
		for(int num : nums) {
			if(standardNum < num) result++;
		}
		
		return result;
	}

}

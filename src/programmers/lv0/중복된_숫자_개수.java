package programmers.lv0;

public class 중복된_숫자_개수 {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,2,5};
		int num = 2;
		
		int result = countDuplicateNum(nums,num);
		System.out.println("중복된 숫자의 개수는 " + result + "개입니다.");
	}
	
	public static int countDuplicateNum(int[] nums,int findNum) {
		int result = 0;
		
		for(int num : nums) {
			if(num == findNum) {
				result++;
			}
		}
		
		return result;
	}
	
	
}

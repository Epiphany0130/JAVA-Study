public class test{

	//编写一个 main 方法
	public static void main(String[] args){

		int[] nums = {5, 6, 7, 9, 4, 8, 2, 1, 0, 3};
		int temp = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			
			for (int j = 0; j < nums.length - 1 - i; j++) {
				
				//升序
				if(nums[j] > nums[j + 1]){
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
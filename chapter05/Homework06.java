/**
 * @author GuYuqi
 * 2024/5/26 16:45
 * 输出小写的a-z以及大写的Z-A[Homework06.java]
 */ 

public class Homework06 {
	
	//编写一个 main 方法
	public static void main(String[] args) {
		
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println(" ");
		for (char c = 'Z'; c >= 'A'; c--) {
			System.out.print(c + " ");
		}
	}
}
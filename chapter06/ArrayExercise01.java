
/**
 * @author GuYuqi
 * 2024/5/27 15:38
 * 创建一个char类型的26个元素的数组，分别放置 ‘A’ - ‘Z’ 。使用for循环访问所有元素并打印出来。提示：char 类型数据运算 ‘A’ + 1 --> ‘B’[ArrayExercise01.java]
 */ 
public class ArrayExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建数组
		char[] c = new char[26];

		//赋值
		for(int i = 0; i < 26; i++){
			c[i] = (char)(65 + i);
		}

		//打印
		for (int i = 0; i < 26; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
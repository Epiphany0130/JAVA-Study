/**
 * @author GuYuqi
 * 2024/5/24 17:17
 * 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5 / 9 * （华氏温度 - 100），请求出华氏温度对应的摄氏温度。[234.5] [ArithmeticOperatorExercise05.java]
 */ 

public class ArithmeticOperatorExercise05 {

	//编写一个main方法
	public static void main(String[] args) {
		
		double f = 234.5;
		double c;
		c = (f - 32) * 5. / 9;
		System.out.println("华氏温度：234.5 对应的摄氏温度是： " + c);
	}
}
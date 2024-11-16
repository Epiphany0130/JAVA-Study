
//基本类型和String类型转换
public class StringToBasic{

	//编写一个main方法
	public static void main(String[] args){

		//基本 -> String
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";	//int -> String
		String s2 = f1 + "";	//float -> String
		String s3 = d1 + "";	//double -> String
		String s4 = b1 + "";	//boolean -> String
		System.out.println(s1 + " " + s2 + " " + s3 + "" + " " + s4);

		//String -> 基本
		String s5 = "123";
		//parse - 解析 转换
		int num1 = Integer.parseInt(s5);			// -> int
		double num2 = Double.parseDouble(s5);		// -> double
		float num3 = Float.parseFloat(s5);			// -> float
		long num4 = Long.parseLong(s5);				// -> long
		byte num5 = Byte.parseByte(s5);				// -> byte
		boolean b = Boolean.parseBoolean("true");	// -> boolean
		short num6 = Short.parseShort(s5);			// -> short

		System.out.println("==================");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b);
	}
}
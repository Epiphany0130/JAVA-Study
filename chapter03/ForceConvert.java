
//强制类型转换
public class ForceConvert{	//Force - 强迫 迫使

	//编写一个main方法
	public static void main(String[] args){

		int n1 = (int)1.9;		//将 double 强制转为 int，造成精度损失
		System.out.println("n1 = " + n1);

		int n2 = 2000;
		byte b1 = (byte)n2;		//数据溢出
		System.out.println("b1 = " + b1);
	}
}
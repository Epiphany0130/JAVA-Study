
//测试浮点陷阱
public class FloatDetail{

	//编写一个main方法
	public static void main(String[] args){

		//测试陷阱
		double a = 2.7;			//变量 a 的值为 2.7
		double b = 8.1 / 3;		//变量 b 的值为 8.1 / 3 = 2.7
		System.out.println(a);	//正常输出2.7
		System.out.println(b);	//无法正常输出2.7，而是输出一个接近2.7的小数
	}
}
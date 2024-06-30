
//数据类型转换细节注意
public class AutoConvertDeatil{

	//编写一个main方法
	public static void main(String[] args){

		//有多种类型的数据混合运算时,系统首先将所有数据转换成容量最大的那种数据类型,然后再进行计算
		int n1 = 10;	//int 给到 int 没问题

		//float d1 = n1 + 1.1;	//1.1是浮点常量double，n1 + 1.1是double，double 给到 float 报错
		double d1 = n1 + 1.1;	//解决方案1		double 给到 double
		float d2 = n1 + 1.1F;	//解决方案2		float 给到 float

		//当我们把精度大的数据类型赋给精度小的数据类型时，会报错，反之自动类型转换
		//int n2 = 1.1;	//double 给到 int 报错

		//（byte，short）和 char 之间不会自动转换
		byte b1 = 10;	//byte 给到 byte 没问题
			//当把一个数给到byte，先判断该数是否在byte范围内，如果在就是byte，不是就是默认int，就报错了
			int n2 = 1;
			//byte b2 = n2;	//int 给到 byte 报错，如果是变量赋值，则判断类型
		//char c1 = b1;	//报错，byte不能自动转char

		//byte，short，char 他们三者可以计算，在计算时首先转为int类型
		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;	//报错，b2 + s1 会自动转为int，int 给到 short 报错
		int s2 = b1 + s1;	//int 给到 int 没问题
		//byte b4 = b2 + b3;	//报错，b2 + b3 会转为int，int 给到 byte 报错
		//无论是同类型计算还是不同类型混合计算，只要是byte short char 就会自动转int

		//boolean不参与转换
		boolean pass = true;
		//int num100 = pass;	//报错，因为布尔类型不参与自动数据类型转换
		
		//自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		double num300 = 1.1;
		double num500 = b4 + s3 + num200 + num300;	//赋值号右边的表达式运算结果是最大的，即double
		//float num500 = b4 + s3 + num200 + num300;	//报错，double 给到 float
		
	}
}
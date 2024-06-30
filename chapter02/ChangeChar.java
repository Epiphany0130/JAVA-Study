//转义字符的使用
public class ChangeChar{
	public static void main(String[] args){
		
		//\t 制表符
		System.out.println("北京\t天津\t上海\t");
		//\n 换行符
		System.out.println("jack\nsmith\nmary");
		//\\ 一个\
		System.out.println("C:\\\\Windows\\System32\\cmd.exe");
		//\" 一个"
		System.out.println("老韩说:\"要好好学习java，有前途\"");
		//\' 一个'
		System.out.println("老韩说:\'要好好学习java，有前途\'");
		//\r 回车
		System.out.println("韩顺平教育\r\n北京");
	}
}
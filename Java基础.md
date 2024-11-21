# Java基础

```
谷煜奇
2024/5/22--
B站课程（韩顺平 零基础30天学会Java）
```

JAVA语言的特点：跨平台性

Test.java -> Test.class -> Win JVM / Linux JVM / Mac JVM

因为有了JVM，同一个Java程序在三个不同的操作系统中都可以执行。这样就实现了Java的跨平台性

## 快速入门

需求：开发一个Hello.java程序，可以输出“Hello,world!”

```java

//1.public class Hello 表示Hello是一个类，是一个public（公有）的类
//2.Hello{ }表示一个类的开始和结束
//3.public static void main(String[] args) 表示一个主方法，即程序的入口
//4.main(){ } 表示方法的开始和结束
//5.System.out.println("hello,world~");表示输出“hello,world~”到屏幕
//6.;表示语句结束
public class Hello{

	//编写一个main方法
	public static void main(String[] args){
		System.out.println("hello,world~");
	}
}
```

### 课堂练习

要求开发一个Hello1.java程序，可以输出“xx is studying java!”

```java
public class Hello1{

	public static void main(String[] args){
		System.out.println("Gu Yuqi is studying java!");
	}
}
```

## Java运行机制

.Java文件（源文件） ->（javac 编译）-> .class文件（字节码文件）->（java 运行）-> 结果

## Java开发细节

1. Java源文件以.java为拓展名。源文件的基本组成部分是类（class）。

2. Java应用程序的执行入口是main()方法。它有固定的书写格式：

   public static void main(String[] args){...}

3. Java语言严格区分大小写
4. Java方法由一条条语句构成，每个语句以 “ ; ” 结束。
5. 大括号都是成对出现的，缺一不可。[习惯，先写 { } 再写代码]
6. 一个源文件中最多只能有一个public类。其它类的个数不限。

​	编译后，每一个类，都对应一个.class

7. 如果源文件包含一个public类，则文件名必须按该类名命名！
8. 一个源文件中最多只有一个public类。其他类的个数不限，也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法。

## Java转义字符

在控制台，输入Tab键，可以实现命令补全

Java常用的转义字符

```
\t	一个制表符，实现对齐的功能
\n	换行符
\\	一个\
\"	一个"
\'	一个'
\r	一个回车
```

### 课堂练习

要求：请使用一句输出语句，达到输入如下图形的效果

```
书名	作者	价格	销量
三国	罗贯中	120	 1000
```

```java
public class ChangeCharTest{
	public static void main(String[] args){
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
	}
}
```

## 注释

1. 被注释的文字不会被JVM（Java虚拟机）解释执行

2. 多行注释里面不允许有多行注释嵌套

```java
//注释使用

public class Comment01{

	//编写一个main方法
	public static void main(String[] args){

		//单行注释

		/*
			注释
			注释
			int n1 = 1;
			System.out.plantln("Comment~");
			...
		*/
	}
}
```

### 文档注释

注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页文件形式提现的该程序的说明文档，一般写在类

```
javadoc -d 文件夹名 -xx -yy Demo3.java
```

```java
//文档注释

/**
 * @author 谷煜奇
 * @version 1.0
 * 
 */
public class Comment02{

	//编写一个main方法
	public static void main(String[] args){

	}
}
```

## Java代码规范基础

1. 类、方法的注释，要以javadoc的方式来写。
2. 非Java Doc的注释，往往是给代码维护者看的，着重告诉堵着为什么这样写，如何修改，注意什么问题等。
3. 使用Tab操作，实现缩进，默认整体向右边移动，使用shift + Tab整体向左移。
4. 运算符和 = 两边习惯性各加一个空格。比如：2 + 4 * 5 + 345 - 89
5. 源文件使用utf-8编码
6. 行宽度不要超过80字符
7. 代码编写次行风格和行位风格

## 常见Dos命令

Dos：Disk Operating System 磁盘操作系统

Dos基本原理：1. 接收指令  2. 解析指令  3. 执行指令

相对路径：从当前目录开始定位，形成的一个路径     

绝对路径：从顶级目录开始定位，形成的一个路径

1. 查看当前目录有什内容

   ```
   dir		dir d:\abc2\test200
   ```

2. 切换到其他盘下

   ```
   cd		cd/D c:
   ```

3. 切换到当前盘的其他目录

   ```
   cd 目录
   ```

   这里的目录可以是相对路径也可以是绝对路径

4. 切换到上一级

   ```
   cd..
   ```

5. 切换到根目录

   ```
   cd \
   ```

6. 查看指定目录下所有的子目录

   ```
   tree 目录
   ```

7. 清屏

   ```
   cls
   ```

8. 退出DOS

   ```
   exit
   ```

更多命令使用时随时上网搜索即可

## 作业1

1. 编写hello，world程序[Homework01.java]

   ```java
   /**
    * @author GuYuqi 
    * 2024/5/23 11:59
    * 编写hello，world程序[Homework01.java]
    */
   public class Homework01{
   
   	//编写一个main方法
   	public static void main(String[] agrs){
   
   		//编写Hello,world程序
   		System.out.println("Hello,world");
   	}
   }
   ```

2. 将个人的基本信息（姓名、性别、籍贯、住址）打印到控制台上输出。各条信息分别占一行[Homework02.java]

   ```java
   /**
    * @author GuYuqi 
    * 2024/5/23 12:01
    * 将个人的基本信息（姓名、性别、籍贯、住址）打印到控制台上输出。各条信息分别占一行[Homework02.java]
    */
   public class Homework02{
   
   	//编写一个main方法
   	public static void main(String[] agrs){
   
   		//编写输出个人信息
   		System.out.println("小明\n男\nA市\nA市B区C街道D小区");
   	}
   }
   ```

3. JDK，JRE，JVM的关系[Homework03.java]

   ```java
   /**
    * @author GuYuqi 
    * 2024/5/23 12:05
    * JDK，JRE，JVM的关系[Homework03.java]
    */
   答：
   1. JDK = JRE + Java开发工具
   2. JRE = JVM + 核心类库
   ```

4. 环境变量path配置及其作用[Homework04.java]

   ```java
   /**
    * @author GuYuqi
    * 2024/5/23 12:07
    * 环境变量path配置及其作用[Homework04.java]
    */
   答：
    1. 环境变量的作用是为了在dos的任意目录，可以使用java和javac
    2. 先配置一个 JAVA_HOME = 指向JDK安装的目录
    3. 编辑Path环境变量
   ```

5. Java编写步骤[Homework05.java]

   ```java
   /**
    * @author GuYuqi
    * 2024/5/23 12:11
    * Java编写步骤[Homework05.java]
    */ 
   答：
   1. 编写Java源代码
   2. javac 编译，得到对应的 .class 字节码文件
   3. java 运行，本质就是把 .class 加载到jvm 运行
   ```

6. Java编写的7个规范[Homework06.java]

   ```java
   /**
    * @author GuYuqi
    * 2024/5/23 12:14
    * Java编写的7个规范[Homework06.java]
    */ 
   答：
   1. 类，方法的注释，使用javadoc的方式，即文档注释
   2. 非javadoc注释，往往是对代码的说明，给程序的维护者看，说明如何修改，注意事项
   3. 使用Tab，整体将代码右移，使用 shift + Tab 整体右移
   4. 运算符和 = 两边，给空格，代码看上去清楚 int n = 1 + 4;
   5. 源码文件使用 utf-8 编码
   6. 行宽字符不要超过 80
   7. 代码编程风格有两种，次行风格和行尾风格
   ```

7. 初学者Java易犯错误[Homework07.java]

   ```java
   /**
    * @author GuYuqi
    * 2024/5/23 12:35
    * 初学者Java易犯错误[Homework07.java]
    */ 
   答：
   1. 编译或运行时，找不到文件 
   	把文件名或目录名找对
   2. 主类名和文件名不一致，修改时保持一致即可
   3. 缺少;
   4. 拼写错误，要求写代码时一定要小心
   ```


## 变量使用注意事项

1. 变量表示内存中的一个存储区域[不同的变量，类型不同，占用的空间大小不同]
2. 该区域有自己的名称[变量名]和类型[数据类型]
3. 变量必须先声明，后使用，即有顺序
4. 该区域的数据可以在同一类型范围内不断变化
5. 变量在同一个作用域内不能重名
6. 变量 = 变量名 + 值+ 数据类型。变量三要素

## 加号的使用

1. 当左右两边都是数值型时，则做加法运算
2. 当左右两边有一方为字符串，则做拼接运算
3. 运算顺序：从左到右

```java

//验证加号在程序中的作用
public class Plus{

	//编写一个main方法
	public static void main(String[] args){

		//测试加号作用
		System.out.println(100 + 3);			//103
		System.out.println("100" + 3);			//1003
		System.out.println(100 + 3 + "hello");	 //103hello
		System.out.println("hello" + 100 + 3);	 //hello1003
	}
}
```

## 数据类型

每一种数据都定义了明确的数据类型，在内存中分配了不同大小的存储空间（字节）

1. 基本数据类型
   1. 数值型
      1. 整数类型，存放整数（byte[1], short[2], int[4], long[8]）
      2. 浮点（小数）类型（float[4], double[8]）
   2. 字符型（char[2]），存放单个字符
   3. 布尔型（boolean[1]），存放true，false
2. 引用数据类型
   1. 类（class）
   2. 接口（interface）
   3. 数组（[ ]）

### 整数类型

1. byte	字节	1字节	-128 ~ 127
2. short       短整型     2字节       -32768 ~ 32767
3. int           整型         4字节        -2147483648 ~ 2147483647
4. long         长整型     8字节       -2^63 ~ 2^63 -1

### 整型细节

1. Java各整数类型有固定的范围和字段长度，不受具体OS的影响，以保证Java程序的可移植性

2. Java的整型常量默认为 int 型，声明 long 型常量须后加 ‘l’ 或 ‘L’
3. java程序中变量常声明为 int 型，除非不足以表示大数，才使用long
4. bit：计算机中的最小存储单位。byte：计算机中的基本存储单元，1byte = 8bit

### 浮点类型

1. float	单精度	4字节	-3.403E38 ~ 3.403E38
2. double    双精度        8字节        -1.798E308 ~ 1.798E308

浮点数 = 符号位 + 指数位 + 尾数位

尾数部分可能丢失，造成精度损失

### 浮点细节

1. 与整数类型类似，Java浮点类型也有固定的范围和字段长度，不受具体OS的影响。
2. Java的浮点型常量（具体值）默认为 double 型，声明 float 型常量，须后加 ‘f’ 或 ‘F’
3. 浮点型常量有两种表示形式
   1. 十进制数形式：5.12	512.0f	.512(必须有小数点)
   2. 科学计数法形式：5.12e2        5.12E-2
4. 通常情况下，应该使用 double 型，因为它比 float 型更加精确

5. 浮点使用陷阱

```java

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
```

当我们对运算结果是小数的数进行相等判断时，要小心

```java
if(a == b){
    System.out.println("相等");
}
```

如果要比较，应该以两个数的差值的绝对值，在某个精度范围内判断

正确的写法

```java
if(Math.abs(a - b) < 0.000001){
    System.out.println("差值非常小，到我的规定精度，认为相等");
}
```

### 字符类型

```java

//char的基本使用
public class Char01{

	//编写一个main方法
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '教';
		char c4 = 97;		//字符类型可以直接存放一个数字
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
```

### 字符细节

1. 字符常量是用单引号（ ‘ ’ ）括起来的单个字符
2. Java还允许使用转义字符 ‘ \ ’ 来将其后的字符转变为特殊字符型常量
3. 在Java中，char的本质是一个整数，在输出时，是Unicode码对应的字符
4. 可以直接给char赋一个整数，然后输出时，会按照对应的 Unicode 字符输出
5. char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码

### 字符型的本质

1. 字符型存储到计算机中，需要将字符对应的码值（整数）找出来

   存储： ‘a’ -> 97 -> 二进制 -> 存储

   读取： 二进制 -> 97 -> ‘a’ -> 显示

2. 字符和码值的对应关系是通过字符编码表决定的

### 布尔类型

1. 布尔类型也叫boolean类型，boolean类型数据只允许取值true和false，无Null
2. boolean类型占1个字节
3. boolean类型适用于逻辑运算，一般用于程序流程控制

```java

//布尔类型使用
public class Boolean01{

	//编写一个main方法
	public static void main(String[] args){

		//定义一个布尔变量
		boolean isPass = true;
		if(isPass == false){
			System.out.println("通过");
		}else{
			System.out.println("没有通过");
		}
	}
}
```

Java中不可以用0或非0的整数代替false和true

### 基本数据类型转换

当Java程序在进行赋值或运算时，精度小的类型自动转换为精度大的数据类型，这个就是自动类型转换

char -> int -> long -> float -> doble

byte -> short -> int -> long -> float -> double 

```java

//数据类型转换
public class AutoConvert{	//Auto - Automatic - 自动的
							//Convert - 转换

	//编写一个main方法
	public static void main(String[] args){

		//把char给到int
		int num = 'a';
		//把int给到double
		double d1 = 80;

		System.out.println(num);
		System.out.println(d1);
	}
}
```

1. 有多种类型的数据混合运算时，系统首先将所有数据转换成容量最大的那种数据类型，然后再进行计算 
2. 当我们把精度大的数据类型赋给精度小的数据类型时，会报错，反之自动类型转换
3. （byte，short）和 char 之间不会自动转换
4. byte，short，char 他们三者可以计算，在计算时首先转为int类型
5.  boolean不参与转换
6. 自动提升原则：表达式结果的类型自动提升为操作数中最大的类型

```java

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
```

### 强制类型转换

自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。

使用时要加上强制转换符 （ ），但可能造成精度降低或溢出，格外要注意

```java

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
```

1. 当进行数据的大小从 大 -> 小，就需要使用到强制转换
2. 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
3. char类型可以保存int的常量值，但不能保存int的变量值，需要强转
4. byte 和 short 类型在进行运算时，当做 int 类型处理

### 基本类型和String类型转换

程序开发中，经常需要将基本数据类型转为String类型。或将String类型转成基本数据类型。

基本类型转String

​	将基本类型的值 + "" 即可

String类型转基本

​	通过基本类型的包装类调用parseXX方法即可

​	解读：使用基本数据类型对应的包装类的相应方法，得到基本数据类型

```java

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
```

字符串转char就是把字符串的第一个字符得到

```java
System.out.println(s5.charAt(0));
```

## 作业2

1. 程序阅读题，看看输出什么？[Homework01.java]

```java
public class Homework01 {
	public static void main(String[] args) {
		int n1;
		n1 = 13;
		int n2;
		n2 = 17;
		int n3;
		n3 = n1 + n2;
		System.out.println("n3 = " + n3);
		int n4 = 38;
		int n5 = n4 - n3;
		System.out.println("n5 = " + n5);
	}
}
```

```
运行结果：
n3 = 30
n5 = 8
```

2. 使用char类型，分别保存\n \t \r \\\\ 1 2 3 等字符，并打印输出[Homework02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/23 23:48
 * 使用char类型，分别保存\n \t \r \\\\ 1 2 3 等字符，并打印输出[Homework02.java]
 */ 
public class Homework02 {

	//编写一个main方法
	public static void main(String[] args) {

		//存放字符
		char c1 = '\n';
		char c2 = '\t';
		char c3 = '\\';
		char c4 = '1';
		char c5 = '2';
		char c6 = '3';

		//打印字符
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
```

3. 编程，保存两本书名，用+拼接，看效果。保存两个性别，用+拼接，看效果。保存两本书价格，用+拼接，看效果。

```java
/**
 * @author GuYuqi
 * 2004/5/23 23:53
 * 编程，保存两本书名，用+拼接，看效果。保存两个性别，用+拼接，看效果。保存两本书价格，用+拼接，看效果。
 */ 
public class Homework03 {

	//编写一个main方法
	public static void main(String[] args) {

		//两本书
		String book1 = "ABC";
		String book2 = "DEF";
		System.out.println(book1 + book2);

		//两个性别
		String sex1 = "男";
		String sex2 = "女";
		System.out.println(sex1 + sex2);

		//两个价格
		double price1 = 38.8;
		double price2 = 42.9;
		System.out.println(price1 + price2);
	}
}
```

4. 编程实现如下效果[Homework04.java]

```
姓名		年龄		成绩		性别		爱好
XX		  XX	    XX        XX	   XX
```

```java
/**
 * @author GuYuqi
 * 2024/5/24 0:00
 * 编程实现如下效果[Homework04.java]
 */ 
public class Homework04 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//输出字段名
		System.out.println("姓名" + "\t" + "年龄" + "\t" + "成绩" + "\t" + "性别" + "\t" + "爱好");

		//存放记录内容
		String name = "张三";
		int age = 18;
		int score = 100;
		String sex = "男";
		String love = "刑法";

		//输出记录内容
		System.out.println(name + "\t" + age + "\t" + score + "\t" + sex + "\t" + love);
	}
}
```

## 运算符

### 算数运算符

| 运算符 |     运算     |
| :----: | :----------: |
|   +    |     正号     |
|   -    |     负号     |
|   +    |      加      |
|   -    |      减      |
|   *    |      乘      |
|   /    |      除      |
|   %    | 模除（取余） |
|   ++   |     自增     |
|   --   |     自减     |
|   +    |  字符串相加  |

%的本质：a % b = a - a / b * b

当模除左边是小数时，本质：a % b = a - (int)a / b * b

练习：

1. 下列程序的运行结果是多少？为什么？[ArithmeticOperatorExercise01.java]

```java

//阅读题
public class ArithmeticOperatorExercise01 {	//Arithmetic - 算数
											//Operator - 运算符
											//Exercise - 练习

	public static void main(String[] args) {

		int i = 1;
		i = i++;
		System.out.println(i);
	}
}

```

```
首先 i = 1，接着，计算机规定使用一个临时变量，temp = i，然后执行i = i + 1，此时 i 的值变为2，最后再把临时变量中 temp 的值给到 i， 所以最终 i 的值为1
```

2. 下列程序的运行结果是多少？为什么？[ArithmeticOperatorExercise02.java]

```java

//阅读题
public class ArithmeticOperatorExercise02{	//Arithmetic - 算数
											//Operator - 运算符
											//Exercise - 练习

	public static void main(String[] args) {
		
		int i = 1;
		i = ++i;
		System.out.println(i);
	}
}
```

```
首先 i = 1，接着 i++，i的值为2，然后有一个临时变量temp = i，最后i = temp，所以 i 的值为2
```

3. 下列程序的运行结果是多少？[ArithmeticOperatorExercise03.java]

```java

//阅读题
public class ArithmeticOperatorExercise03 {	//Arithmetic - 算数
											//Operator - 运算符
											//Exercise - 练习
	
	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.print("i = " + i);
		System.out.println("i2 = " + i2);
		i = --i2;
		System.out.print("i = " + i);
		System.out.println("i2 = " + i2);
	}
}
```

```
i = 10i2 = 20
i = 19i2 = 19
```

4. 假如还有59天放假，问：合XX个星期零XX天？[ArithmeticOperatorExercise04.java]

```java
/**
 * @author GuYuqi
 * 2024/5/24 17:12
 * 假如还有59天放假，问：合XX个星期零XX天？[ArithmeticOperatorExercise04.java]
 */ 

public class ArithmeticOperatorExercise04 {

	//编写一个main方法
	public static void main(String[] args) {
		
		int day = 59;
		int n1 = day / 7;
		int n2 = day % 7;
		System.out.println(n1 + "个星期零" + n2 + "天");
	}
}
```

5. 定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：（华氏温度 - 32） * 5 / 9，请求出华氏温度对应的摄氏温度。[234.5] [ArithmeticOperatorExercise05.java]

```java
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
```

### 关系运算符

关系运算符的结果都是布尔类型

| 运算符     | 运算               |
| ---------- | ------------------ |
| ==         | 相等于             |
| !=         | 不等于             |
| >          | 大于               |
| <          | 小于               |
| <=         | 小于等于           |
| >=         | 大于等于           |
| instanceof | 检查是否是类的对象 |

### 逻辑运算符

用于连接多个表达式，最终的结果还是一个布尔值

|   a   |   b   |  a&b  | a&&b  | a\|b  | a\|\|b |  !a   |  a^b  |
| :---: | :---: | :---: | :---: | :---: | :----: | :---: | :---: |
| true  | true  | true  | true  | true  |  true  | false | false |
| true  | false | false | false | true  |  true  | false | true  |
| false | true  | false | false | true  |  true  | true  | true  |
| false | false | false | false | false | false  | true  | false |

#### 逻辑与 &

a & b

当 a 和 b 同时为 true ，则结果为 true，否则为 false

#### 短路与 &&

a && b

当 a 和 b 同时为 true ，则结果为 true，否则为 false

#### 逻辑或 |

a | b

当 a 和 b 有一个为 true ，则结果为 true，否则为 false

#### 短路或 ||

a || b

当 a 和 b 有一个为 true ，则结果为 true，否则为 false

#### 取反 ！

!a 

当 a 为 true，则结果为 false，当 a 为 false，则结果为 true

#### 逻辑异或 ^

a ^ b

当 a 和 b 不同时，则结果为 true，否则为false

### 赋值运算符

基本赋值运算符：=

复合赋值运算符：+=、-=、*=、/=、%= 等

1. 赋值运算符从右往左
2. 赋值运算符的左边，只能是变量，右边，可以是变量、表达式、常量值
3. 复合赋值运算符会进行类型转换 (同理，自增自减也会类型转换)

``` java
byte b = 2;
b += 3;	//b = b + 3	 -->	b = (byte)(b + 2)
b++;	//b = b + 1	-->		b = (byte)(b + 1)
```

### 三元运算符

基本语法：条件表达式？表达式1：表达式2

如果条件表达式为 true，运算后的结果是表达式1；如果条件表达式为false，运算后的结果为表达式2

1. 表达式1和表达式2要为可以赋给接受变量的类型（或可以自动转换）
2. 三元运算符可以转成if-else

### 运算符的优先级

1. 运算符有不同的优先级，所谓优先级就是表达式运算中的运算顺序
2. 只有单目运算符、赋值运算符是从右向左运算的
3. 下表中，上一行运算符总优先于下一行

| 结合性  | 运算符                               |
| ------- | ------------------------------------ |
|         | .     ()     {}     ;     ,          |
| R --> L | ++     --     ~     !(data type)     |
| L --> R | *     /     %                        |
| L --> R | +     -                              |
| L --> R | <<     >>     >>>     位移           |
| L --> R | <     >     <=     >=     instanceof |
| L --> R | ==     !=                            |
| L --> R | &                                    |
| L --> R | ^                                    |
| L --> R | \|                                   |
| L --> R | &&                                   |
| L --> R | \|\|                                 |
| L --> R | ? :                                  |
| R --> L | =     *=     /=     %=               |
|         | +=     -=     <<=     >>=            |
|         | >>>=     &=     ^=     \|=           |

. , () {} > 单目 > 算数 > 位移 > 关系 > 逻辑 > 三元 > 赋值

## 标识符

Java 对各种变量、方法和类等命名时使用的字符序列称为标识符

凡是自己可以起名字的地方都叫标识符

### 命名规则和规范

规则[必须遵守]：

1. 由字母、数字、下划线或 $ 组成
2. 不能以数字开头
3. 不能使用关键字和保留字，但能包含关键字和保留字
4. Java中严格区分大小写，长度无限制
5. 标识符不能包含空格

规范[更加专业]：

1. 包名：多单词组成时所有字母都小写：aaa.bbb.ccc	

   例如：com.hsp.crm

2. 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz [大驼峰]

   例如：TankShotGame

3. 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz [小驼峰 - 驼峰法]

   例如：tankShotGame

4. 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

   例如：定义一个所得税率 TAX_RATE

5. 后面我们学习到 类、包、接口等时，我们的命名规范要这样遵守，更加详细的看文档

### 关键字

定义：被 Java 语言赋予了特殊的含义，用作专门用途的字符串（单词）

特点：关键字中所有字母都为小写

开发软件中会有语法高亮



用于定义数据类型的关键字

|  class  | interface | enum  |  byte  | short |
| :-----: | :-------: | :---: | :----: | :---: |
|   int   |   long    | float | double | char  |
| boolean |   void    |       |        |       |

用于定义数据类型值的关键字

| true | false | null |      |      |
| :--: | :---: | :--: | ---- | ---- |

用于定义流程控制的关键字

|   if   | else | switch | case  | default  |
| :----: | :--: | :----: | :---: | :------: |
| while  |  do  |  for   | break | continue |
| return |      |        |       |          |

用于定义访问权限修饰符的关键字

| private | protected | public |      |      |
| :-----: | :-------: | :----: | :--: | ---- |

用于定义类、函数、变量修饰符的关键字

| abstract | final | static | synchronized |      |
| -------- | ----- | ------ | ------------ | ---- |

用于定义类与类之间关系的关键字

| extends | implements |      |      |      |
| ------- | ---------- | ---- | ---- | ---- |

用于定义建立实例及引用实例，判断实例的关键字

| new  | this | super | instanceof |      |
| ---- | ---- | ----- | ---------- | ---- |

用于异常处理的关键字

| try  | catch | finally | throw | throws |
| ---- | ----- | ------- | ----- | ------ |

用于包的关键字

| package | import |      |      |      |
| ------- | ------ | ---- | ---- | ---- |

其他修饰符关键字

| native | strictfp | transient | volatile | assert |
| ------ | -------- | --------- | -------- | ------ |

### 保留字

现有 Java 版本尚未使用，但以后版本可能会作为关键字使用。自己命名标识符时要避免使用这些保留字。

byValue、cast、future、generic、inner、operator、outer、rest、var、goto、const

## 输入语句

在编程过程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取

步骤：

	1. 导入该类所在的包，java.util.*
	1. 创建该类对象（声明变量）
	1. 调用里面的功能

```java
//引入 Scanner 类所在的包
import java.util.Scanner;	//表示把java.util下的Scanner类导入

//接收用户的输入
public class Input {

	//编写一个main方法
	public static void main(String[] args) {
		
		//Scanner类 表示 简单文本扫描器，在java.util包
		//创建 Scanner 对象, new 创建一个对象
		//myScanner 就是 Scanner 类的对象
		Scanner myScanner = new Scanner(System.in);	//System.in  从键盘输入

		//接收用户的输入,使用相关的方法
		System.out.println("请输入名字");
		String name = myScanner.next();			//接收用户输入的字符串
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();			//接收用户输入的int
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();	//接收用户输入的double

		System.out.println("人的信息如下：");
		System.out.println("名字：" + name + '\n' + "年龄：" + age + '\n' + "薪水" + sal);
	}
}
```

## 进制

二进制：0,1，满2进1，以0b或0B开头

十进制：0-9，满10进1

八进制：0-7，满8进1，以数字0开头

十六进制：0-9及A（10）-F（15），满16进1，以0x或0X开头。此处的 A - F 不区分大小写

## 原码、反码、补码

1. 二进制的最高位是符号位：0表示整数，1表示负数（口诀：0 -> 0    1 -> -）
2. 正数的原码、反码、补码都一样（三码合一）
3. 负数的反码 = 它的原码符号位不变，其他位取反（0 -> 1     1 -> 0）
4. 负数的补码 = 它的反码 + 1，负数的反码 = 负数的补码 - 1
5. 0的反码、补码都是0
6. java没有无符号数，换言之，java中的数都是有符号的
7. 在计算机运算的时候，都是以补码的方式来运算的
8. 当我们看运算结果的时候，要看他的原码

## 作业3

1. 计算下列表达式的结果

```
10 / 3 = 
10 / 5 = 
10 % 2 = 
-10.5 % 3 = 
```

```
3
2
0
-1.5
```

2. 下列程序运行的结果

```java
int i = 66;
System.out.println(++i+i);
```

```
134
```

3. 在Java中，以下赋值语句正确的是

```java
A) int num1 = (int)"18";
B) int num2 = 18.0;
C) double num3 = 3d;
D) double num4 = 8;
E) int i = 48; char ch = i + 1;
F) byte b = 19; short s = b + 2;
```

```
C D 
```

4. 试写出将String转换成double类型的语句，以及将char类型转换成String的语句，举例说明即可

```java
String str = "18.8";
double d1 = Double.parseDouble(str);
```

```java
char c1 = 'a';
String str1 = c1 + "";
```

## 流程控制

### 顺序控制

程序从上到下逐行地执行，中间没有任何的判断和跳转

### 分支控制

让程序有选择的执行

#### 单分支

```java
if(条件表达式){
    执行代码块;
}
```

如果 { } 中只有一条语句，则可以不用 { }，建议写上

```java

//编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，则输出“你的年龄大于18，要对自己的行为负责，送入监狱”
//导入 scanner 类所在的包
import java.util.Scanner;	//表示把java.util下的Scanner类导入

public class If01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner scanner = new Scanner(System.in);	//从键盘输入

		//让用户输入年龄
		System.out.print("请输入年龄：");
		int age = scanner.nextInt();

		//判断是否符合条件
		if(age > 18)
			System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
	}
}
```

#### 双分支

```java
if(条件表达式){
    执行代码快1;
}
else{
    执行代码快2;
}
```

```java

//编写一个程序，可以输入人的年龄
///如果该同志的年龄大于18岁，则输出“你年龄大于18，要对自己的行为负责，送入监狱”
//否则，输出“你的年龄不够18岁，这次放过你了”

//导入 Scanner 类所在的包
import java.util.Scanner;

public class If02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入年龄：");
		int age = myScanner.nextInt();

		//判断是否符合条件
		if(age > 18){
			System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
		}
		else{
			System.out.println("你的年龄不够18岁，这次放过你了");
		}
	}
}
```

#### 双分支练习题

1. 编写程序，声明两个double型变量并复制。判断第一个数大于10.0，且第二个数小于20.0，打印两数之和。[IfExercise01.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 13:56
 * 编写程序，声明两个double型变量并复制。判断第一个数大于10.0，且第二个数小于20.0，打印两数之和。[IfExercise01.java]
 */

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入第一个数：");
		double num1 = myScanner.nextDouble();
		System.out.print("请输入第二个数：");
		double num2 = myScanner.nextDouble();

		//判断条件
		if(num1 > 10.0 && num2 < 20.0){
			System.out.println("num1 + num2 = " + (num1 + num2));
		}
	}
} 
```

2. 定义两个变量int，判断二者的和，是否能被3又能被5整除，打印提示信息。[IfExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 14:03
 * 定义两个变量int，判断二者的和，是否能被3又能被5整除，打印提示信息。[IfExercise02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise02  {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入第一个数：");
		int num1 = myScanner.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = myScanner.nextInt();

		//判断条件
		if((num1 + num2) % 3 == 0 && (num1 + num2) % 5 == 0)
			System.out.println("两数之和可以同时被3和5整除");
		else
			System.out.println("两数之和不能同时被3和5整数");
	}
}
```

3. 判断一个年份是否为闰年，闰年的条件是符合下面二者之一：1） 年份能被4整除，但不能被100整除 2） 能被400整除。[IfExcercise03.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 14:12
 * 判断一个年份是否为闰年，闰年的条件是符合下面二者之一：1） 年份能被4整除，但不能被100整除 2） 能被400整除。[IfExcercise03.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入一个年份：");
		int year = myScanner.nextInt();

		//判断条件
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("该年份是闰年");
		}
		else{
			System.out.println("该年份不是闰年");
		}
	}
}
```

#### 多分支

```java
if(条件表达式1){
    执行代码快1;
}
else if(条件表达式2){
	执行代码快2;
}
else{
    执行代码快n;
}
```

多分支可以没有else

```
输入保国同志的芝麻信用分：
如果：
1. 信用分为100分时，输出 信用极好
2. 信用分为(80,99]时，输出 信用优秀
3. 信用分为[60,80]时，输出 信用一般
4. 其他情况，输出 信用不及格
5. 从键盘输入保国的芝麻信用分，并加以判断
[IfExercise04.java]
```

```java
/**
 * @author GuYuqi
 * 2024/5/25 14:25
 * 输入保国同志的芝麻信用分:
 * 如果：
 * 1. 信用分为100分时，输出 信用极好
 * 2. 信用分为(80,99]时，输出 信用优秀
 * 3. 信用分为[60,80]时，输出 信用一般
 * 4. 其他情况，输出 信用不及格
 * 5. 从键盘输入保国的芝麻信用分，并加以判断
 */  

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise04 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("输入芝麻信用分：");
		int score = myScanner.nextInt();

		//判断条件
		if(score >= 0 && score <= 100){
			if(score == 100){
				System.out.println("信用极好");
			}else if(score > 80 && score <= 90){
				System.out.println("信用优秀");
			}else if(score >= 60 && score <= 80){
				System.out.println("信用一般");
			}else
				System.out.println("信用不及格");
			}
		}else{
			System.out.println("信用分需要在0-100，请重新输入！");
		}
}
```

#### 嵌套分支

在一层分支结构中又完整的嵌套了另一个完整的分支结构，里面的分支结构称为内层分支，外面的分支结构称为外层分支

规范：不要超过3层

```java
//参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰
//并且根据性别提示进入男子组和女子组
//输入成绩和性别，进行判断和输出信息

//导入 Scanner 类所在的包
import java.util.Scanner;

public class If03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("输入成绩：");
		double score = myScanner.nextDouble();

		if(score > 8.0){
			System.out.print("输入性别：");
			char gender = myScanner.next().charAt(0);	//先接收字符串，然后取字符串的第一个字符
			
			if(gender == '男'){
				System.out.println("进入男子组决赛");
			}else if(gender == '女'){
				System.out.println("进入女子组决赛");
			}else{
				System.out.println("性别输入错误，不能参加比赛");
			}

		}else{
			System.out.println("淘汰");
		}
		
	}
}
```

#### 嵌套练习

```java
/**
 * @author GuYuqi
 * 2024/5/25 18:02
 * 出票系统：根据淡旺季的月份和年龄，打印票价
 * 4-10月旺季：
 * 		成人（18 - 60）：60
 * 		儿童：半价
 * 		老人：1/3
 * 淡季：
 * 		成人：40
 * 		其他：20
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class IfExercise05 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入月份：");
		int month = myScanner.nextInt();
		System.out.print("请输入年龄：");
		int age = myScanner.nextInt();

		double price;
		if(month >= 4 && month <= 10){

			if(age < 18){
				price = 60 / 2;
			}else if(age <= 60){
				price = 60;
			}else{
				price = 60 / 3;
			}

		}else{

			if(age >= 18 && age <= 60){
				price = 40;
			}else{
				price = 20;
			}
		}

		System.out.println("票价：" + price);
	}
}
```

#### switch 分支结构

```java
switch(表达式){
        case 常量1：
            语句块1;
        	break;
        case 常量2：
            语句块2;
        	break;
        ...
        case 常量n:
        	语句块n;
        	break;
		default:
        	语句块;
        	break;
}
```

1. switch关键字，表示switch分支
2. 表达式对应一个值
3. case 常量1：当表达式的值等于常量1，就执行语句块1
4. break：表示退出switch
5. 如果和case 常量1匹配，就执行语句块1，如果没有匹配，就继续匹配case 常量2
6. 如果一个都没有匹配上，执行default

```java
//编写一个程序，该程序可以接收一个字符，比如：a,b,c,d,e,f,g
//a表示星期一，b表示星期二
//根据用户的输入显示相依的信息，要求使用switch语句完成

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Switch01 {

	//编写一个main方法
	public static void main(String[] args) {
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入a-g的一个字母：");
		char c = myScanner.next().charAt(0);

		switch(c){
		case 'a':
			System.out.println("星期一");	break;
		case 'b':
			System.out.println("星期二");	break;
		case 'c':
			System.out.println("星期三");	break;
		case 'd':
			System.out.println("星期四");	break;
		case 'e':
			System.out.println("星期五");	break;
		case 'f':
			System.out.println("星期六");	break;
		case 'g':
			System.out.println("星期天");	break;
		default:
			System.out.println("输入错误");	break;
		}
	}
}
```

#### switch细节

1. 表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型
2. switch(表达式)中表达式的返回值必须是：（byte, short, int, char, enum, String）
3. case子句中的值必须是常量，而不能是变量
4. default子句是可选的，当没有分配的case时，执行default
5. break语句用来在执行完一个case分支后使程序跳出switch语句快；如果没有写break，程序会顺序执行到switch结尾

#### switch练习题

1. 使用switch把小写类型的char型转为大写（键盘输入）。只转换a，b，c，d，e。其他的输出“other”[SwitchExercise01.java]

```java
/**
 * @author GuYuqi
 * 1014/5/25 18:59
 * 使用switch把小写类型的char型转为大写（键盘输入）。只转换a，b，c，d，e。其他的输出“other”[SwitchExercise01.java]
 */

//导入 Scanner 类所用的包
import java.util.Scanner;

public class SwitchExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//用键盘输入

		System.out.print("请输入一个字母：");
		char c = myScanner.next().charAt(0);

		switch(c){
		case 'a': case 'b': case 'c': case 'd': case 'e':
			System.out.println((char)(c-32));
			break;
		default:
			System.out.println("other");
			break;
		}
	}
} 
```

2. 对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。（注：输入的成绩不能大于100）。提示，成绩 / 60[SwitchExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 19:05
 * 对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。（注：输入的成绩不能大于100）。提示，成绩 / 60[SwitchExercise02.java]
 */

//导入 Scanner 所用的包
import java.util.Scanner;

public class SwitchExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		System.out.print("输入成绩：");
		int score = myScanner.nextInt();

		score /= 60;
		switch(score){
		case 0:
			System.out.println("不合格");
			break;
		default:
			System.out.println("合格");
			break;
		}
	}
} 
```

3. 根据用于置顶月份，打印该月所属的季节。3,4,5春6,7,8夏9,10,11秋12,1,2冬[SwitchExercise03.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 19:10
 * 根据用于置顶月份，打印该月所属的季节。3,4,5春6,7,8夏9,10,11秋12,1,2冬[SwitchExercise03.java]
 */ 

//导入 Scanner 所用的包
import java.util.Scanner;

public class SwitchExercise03 {
	
	//编写一个mian方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入月份：");
		int month = myScanner.nextInt();

		switch(month){
		case 3: case 4: case 5:
			System.out.println("春天");	
			break;
		case 6: case 7: case 8:
			System.out.println("夏天");
			break;
		case 9: case 10: case 11:
			System.out.println("秋天");	
			break;
		case 12: case 1: case 2:
			System.out.println("冬天");
			break;
		}
	}
}
```

#### switch 和 if 的选择

1. 如果判断的具体数值不多，而且符合byte、short、int、char、enum[枚举]、String这6种类型。虽然两个语句都可以使用，建议用switch语句
2. 对取件判断，对结果为boolean类型判断，使用if，if的使用范围更广

### for循环控制

```java
for(循环变量初始化;循环条件;循环变量迭代){
    循环操作;
}
```

1. for关键字，表示循环控制
2. for有四要素：1）循环变量初始化 2）循环条件 3）循环操作 4）循环变量迭代
3. 循环操作，这里可以有多条语句，也就是我们要循环执行的代码
4. 如果循环操作（语句）只有一条语句，可以省略 { }，建议不要省略

### for细节

1. 循环条件是返回一个布尔值的表达式

2. for( ; 循环判断条件 ; )中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略
3. 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开

### for练习题

1. 打印1-100之间所有是9的倍数的整数，统计个数及总和[ForExercise01.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 20:11
 * 打印1-100之间所有是9的倍数的整数，统计个数及总和[ForExercise01.java]
 */ 

public class ForExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int total = 0, sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 9 == 0){
				total++;
				sum += i;
			}
		}
		System.out.println("个数：" + total + '\n' + "总和：" + sum);
	}
}
```

2. 完成下列输出[ForExercise02.java]

```
0 + 5 = 5
1 + 4 = 5
2 + 3 = 5
3 + 2 = 5
4 + 1 = 5
5 + 0 = 5
```

```java
/**
 * @author GuYuqi
 * 2024/5/25 20:20
 * 完成下列输出[ForExercise02.java]
 * 0 + 5 = 5
 * 1 + 4 = 5
 * 2 + 3 = 5
 * 3 + 2 = 5
 * 4 + 1 = 5
 * 5 + 0 = 5
 */ 

public class ForExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 0; i <= 5; i++){
			System.out.println(i + "+" + (5 - i) + "=5" );
		}
	}
}
```

### while循环控制

```java
while(循环条件){
    循环体（语句）;
    循环变量迭代
}
```

while循环也有四要素，只是位置不一样

while循环是先判断再执行语句

### while练习题

1. 打印1-100之间所有能被3整除的数，使用while。[WhileExercise.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 20:33
 * 打印1-100之间所有能被3整除的数，使用while。[WhileExercise.java]
 */ 

public class WhileExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0)
				System.out.print(i + " ");
		}
	}
}
```

2. 打印40-200之间所有偶数，使用while。[WhileExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 20:37
 * 打印40-200之间所有偶数，使用while。[WhileExercise02.java]
 */ 

public class WhileExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 40;
		while(i <= 200){
			if(i % 2 == 0){
				System.out.println(i + " ");
			}
			i++;
		}
	}
}
```

### do-while循环控制

```java
do{
    循环体（语句）;
    循环变量迭代;
}while(循环条件);
```

1. do while是关键字
2. 也有循环四要素，只是位置不一样
3. 先执行，再判断，也就是说，一定会执行一次
4. 最后有一个分号

### do-while练习题

1. 打印1-100[DoWhileExercise.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 20:47
 * 打印1-100[DoWhileExercise01.java]
 */ 

public class DoWhileExercise {
	
	//编写一个main方法
	public static void main(String[] args) {
		

		int i = 1;
		do{
			System.out.print(i++ + " ");
		}while(i <= 100);
	}
}
```

2. 计算1-100的和[DoWhileExercise.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 20:52
 * 计算1-100的和[DoWhileExercise.java]
 */ 

public class DoWhileExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("1 + 2 + 3 + ... + 100 = " + sum);
	}
}
```

3. 统计1-200之间能被5整除但不能被3整除的个数[DoWhileExercise03.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 20:55
 * 统计1-200之间能被5整除但不能被3整除的个数[DoWhileExercise03.java]
 */ 

public class DoWhileExercise03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i = 1, total = 0;
		do{
			if(i % 5 == 0 && i % 3 != 0){
				total++;
			}
			i++;
		}while(i <= 200);
		System.out.println(total);
	}
}
```

### 多重循环控制

1. 将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for、while、wo-while均可以作为外层循环和内层循环。一般建议使用两层，最多不要超过三层。
2. 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为false时，才会完全跳出内层循环，才可以结束外层的当次循环，开始下一次的循环。
3. 设外层循环的次数是 m 次，内层为 n 次，则内层循环体实际上需要执行 m * n 次

### 多重循环练习题

1. 统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分。[MulForExercise01.java]

```java
/**
 * @author GuYuqi
 * 2024/5/25 21:06
 * 统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分。[MulForExercise01.java]
 */ 

//引入 Scanner 类所用的包
import java.util.Scanner;

public class MulForExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		double avg = 0, score;
		for (int cla = 0; cla < 3; cla++) {
			System.out.println("请输入第" + (cla + 1) + "个班的同学的成绩：");
			avg = 0;
			for (int stu = 0; stu < 5; stu++) {
				score = myScanner.nextInt();
				avg += score;
			}
			System.out.println((cla + 1) + "班的平均分：" + (avg / 5));
		}
	}
}
```

2. 统计三个班及格人数，每个班有5名同学[MulForExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 10:51
 * 统计三个班及格人数，每个班有5名同学[MulForExercise02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class MulForExercise02 {
	
	//编写一个main函数
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		int total = 0, score;
		for (int cla = 0; cla < 3; cla++) {
			System.out.println("请输入第" + (cla + 1) + "个班同学的成绩：");
			for (int stu = 0; stu < 5; stu++) {
				score = myScanner.nextInt();
				if(score > 60){
					total++;
				}
			}
		}
		System.out.println("三个班及格的人数是：" + total);
	}
}
```

3. 打印九九乘法表[MulForExercise03.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 10:59
 * 打印九九乘法表[MulForExercise03.java]
 */ 

public class MulForExercise03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++){
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + '\t');
			}
			System.out.print('\n');
		}
	}
}
```

4. 打印金字塔

[MulForExercise04.java]

```
*
**
***
****
*****
```

```java
/**
 * @author GuYuqi
 * 2024/5/26 11:04
 * 打印金字塔[MulForExercise04.java]
 */ 

public class MulForExercise04 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++){
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}
```

[MulForExercise05.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 11:10
 * 打印金字塔[MulForExercise05.java]
 */ 

public class MulForExercise05 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++){
			for (int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.print('\n');
		}
	}
}
```

### break

需求：随机生成1-100的一个数，直到生成了97这个数，看看一共用了几次

提示使用

```java
(int)(Math.random() * 100) + 1	//返回1-100的随机数
```

```

//break的使用
public class Break {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int total = 0;
		for (int i = 1; ; i++) {
			if(((int)(Math.random() * 100) + 1) == 97){
				break;
			}
			total++;
		}
		System.out.println(total);
	}
}
```

1. break语句出现在多层嵌套的语句块中，可以通过标签指明要终止的是哪一层语句块
2. 标签的基本使用

```java
label1:{ ......
label2:		{ ......
label3:			{ ......
    			  break label2;
                   ......
				}
			}
		}
```

	1. break语句可以指定退出哪层
	1. label1是标签，由程序员指定
	1. break后指定到哪个label就退出到哪里
	1. 在实际的开发中，尽量不要使用标签
	1. 如果没有指定break，默认退出最近的循环体

练习题：

1. 1-100以内的数求和，求出当和第一次大于20的当前数[BreakExercise01.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 12:35
 * 1-100以内的数求和，求出当和第一次大于20的当前数[BreakExercise01.java]
 */ 

public class BreakExercise01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int i, sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
			if(sum > 20){
				break;
			}
		}
		System.out.println(i);
	}
}
```

2. 实现登录验证，有3次机会，如果用户名为“丁真”，密码“666”提示登录成功，否则提示还有几次机会。[BreakExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 12:42
 * 实现登录验证，有3次机会，如果用户名为“丁真”，密码“666”提示登录成功，否则提示还有几次机会。[BreakExercise02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class BreakExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		String name = "";
		String passwd = "";
		int chance = 3;
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入名字：");	
			name = myScanner.next();
			System.out.println("请输入密码：");
			passwd = myScanner.next();

			//比较输入的名字和密码是否正确
			//字符串内容比较 使用的方法 equals
			if("丁真".equals(name) && "666".equals(passwd)){
				System.out.println("登录成功");
				break;
			}

			//登录的机会减少
			chance--;
			System.out.println("你还有" + chance + "次机会");
		}
	}
}
```

### continue

continue用于结束本次循环，继续执行下一次循环

continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环，这个和前面的标签使用的规则一样

```java
{
    ......
    continue;
    ......
}
```

```java

//Continue使用
public class Continue {
	
	//编写一个main方法
	public static void main(String[] args) {

		int i = 1;
		while(i <= 4){
			i++;
			if(i == 2){
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}
```

### return

return使用在方法，表示跳出所在的方法

如果 return 写在 main 方法，退出程序

## 作业4

1. 编程实现如下功能[Homework01.java]

```
某人有100000元，每经过一次路口，需要交费，规则如下：
1）当现金>50000时，每次交5%
2）当现金<=50000时，每次交1000
编程计算该人可以经过多少次路口，要求：使用while break方式完成
```

```java
/**
 * @author GuYuqi
 * 2024/5/26 16:16
 * 编程实现如下功能[Homework01.java]某人有100000元，每经过一次路口，需要交费，规则如下：
 * 1）当现金>50000时，每次交5%
 * 2）当现金<=50000时，每次交1000
 * 编程计算该人可以经过多少次路口，要求：使用while break方式完成
 */ 

public class Homework01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		double money = 100000;	//一共有100000元
		int total = 0;	//计数器
		while(money > 1000){

			//判断金额并扣款
			if(money > 50000){
				money = money - (money * .05);
			}else{
				money -= 1000;
			}
			total++;
		}
		System.out.println("可以经过路口" + total + "次");
	}
}
```

2. 实现判断一个整数，属于哪个范围：大于0；小于0；等于0[Homework02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 16:23
 * 实现判断一个整数，属于哪个范围：大于0；小于0；等于0[Homework02.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Homework02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入一个数：");
		int num = myScanner.nextInt();

		if(num > 0){
			System.out.println("大于0");
		}else if(num < 0){
			System.out.println("小于0");
		}else{
			System.out.println("等于0");
		}

	}
}
```

3. 判断一个年份是否为闰年[Homework03.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 16:27
 * 判断一个年份是否为闰年[Homework03.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Homework03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);

		System.out.print("请输入一个年份：");
		int year = myScanner.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}
}
```

4. 判断一个整数是否为水仙花数，所谓水仙花数是指一个三位数，其各个位上的数字立方和等于其本身[Homework04.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 16:33
 * 判断一个整数是否为水仙花数，所谓水仙花数是指一个三位数，其各个位上的数字立方和等于其本身[Homework04.java]
 */ 

//导入 Scanner 类所在的包
import java.util.Scanner;

public class Homework04 {
	
	//编写一个 main 方法
	public static void main(String[] args) {
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		System.out.print("请输入一个三位数：");
		int num = myScanner.nextInt();

		//手动拆分三位数
		int a = num % 10;
		int b = num / 10 % 10;
		int c = num / 100;

		if(a * a * a + b * b * b + c * c * c == num){
			System.out.println("是水仙花数");
		}else{
			System.out.println("不是水仙花数");
		}
	}
}
```

5. 下列程序的运行结果

```java
class Demo{
    public static void main(String[] args){
        int m = 0, n = 3;
        if(m > 0){
            if(n > 2)
                System.out.plantln("OK1");
            esle
                System.out.plantln("OK2");
        }
    }
}
```

```
不输出
```

6. 输出1-100之间的不能被5整除的数，每5个一行[Homework05.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 16:40
 * 输出1-100之间的不能被5整除的数，每5个一行[Homework05.java]
 */ 

public class Homework05 {
	
	//编写一个 main 方法
	public static void main(String[] args) {
		
		int count = 0;	//计数器
		for (int i = 1; i <= 100; i++) {
			if(i % 5 != 0){
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0){
					System.out.println(" ");
				}
			}
		}
	}
}
```

7. 输出小写的a-z以及大写的Z-A[Homework06.java]

```java
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
```

8. 求出1 - 1/2 + 1/3 - 1/4 ... 1/100[Homework07.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 16:49
 * 求出1 - 1/2 + 1/3 - 1/4 ... 1/100[Homework07.java]
 */ 

public class Homework07 {
	
	//编写一个 main 方法
	public static void main(String[] args) {
		
		//状态判断符号轮转
		int f = 1;
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + (1. / i) * f;
			f = -f;
		}
		System.out.println("1 - 1/2 + 1/3 - 1/4 ... 1/100 = " + sum);
	}
}
```

9. 求 1 + （1 + 2） + （1 + 2 + 3） + （1 + 2 + 3 +4） + ... + （1 + 2 + 3 + ... + 100）的结果[Homework08.java]

```java
/**
 * @author GuYuqi
 * 2024/5/26 16:54
 * 求 1 + （1 + 2） + （1 + 2 + 3） + （1 + 2 + 3 +4） + ... + （1 + 2 + 3 + ... + 100）的结果[Homework08.java] 
 */ 
public class Homework08 {
	  
	//编写一个 main 方法
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			int sum1 = 0;
			for (int j = 1; j <= i; j++) {
				sum1 += j;
			}
			sum += sum1;
		}
		System.out.println("1 + （1 + 2） + （1 + 2 + 3） + （1 + 2 + 3 +4） + ... + （1 + 2 + 3 + ... + 100） = " + sum);		
	}
}
```

## 数组

数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型

即：数组就是一组数据

一个养鸡场有6只鸡，它们的体重分别是3kg，5kg，1kg，3.4kf，2kg，50kg。请问这6只鸡的总体重是多少？平均体重是多少？[Array01.java]

```java

public class Array01 {	//Array - 数组
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义一个数组
		double[] hens = {3, 5, 1, 3.4, 2, 50};	//double 类型的数组，数组名 hens

		double totalWeight = 0;
		//遍历数组求和
		for(int i = 0; i < 6; i++){
			totalWeight += hens[i];
		}

		System.out.println("总体重:  " + totalWeight + "\n" + "平均体重： " + (totalWeight / 6));

	}
}
```

### 动态初始化

定义：

```java
数据类型 数组名[] = new 数据类型[大小]
数据类型[] 数组名 = new 数据类型[大小]	//阿里开发规范强制使用这种方式
    
int a[] = new int[5];	//创建了一个数组，名字a，存放5个int
```

引用

```java
数组名[下标/索引]
a[2]	//数组a中的第3个数
```

循环输入5个成绩，保存到double数组，并输出[Array02.java]

```java

//使用动态初始化定义数组

//导入 Scannr 类所在的包
import java.util.Scanner;

public class Array02{

	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		double[] score = new double[5];

		//遍历 输入
		for(int i = 0; i < score.length; i++){
			System.out.print("请输入第" + (i + 1) + "个元素的值：");
			score[i] = myScanner.nextDouble();
		}

		//遍历 输出
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
}
```

### 动态初始化

先声明数组：

```java
数据类型 数组名[]
数据类型[] 数组名
    
int a[];
int[] a;
```

创建数组：

```java
数组名 = new 数据类型[大小]

a = new int[10];
```

循环输入5个成绩，保存到double数组，并输出[Array02.java]

```java

//使用动态初始化定义数组

//导入 Scannr 类所在的包
import java.util.Scanner;

public class Array02{

	//编写一个main方法
	public static void main(String[] args) {
		
		//创建 Scanner对象
		Scanner myScanner = new Scanner(System.in);	//从键盘输入

		double[] score;			//声明数组		此时 score 是 null
		score = new double[5];	//分配内存空间

		//遍历 输入
		for(int i = 0; i < score.length; i++){
			System.out.print("请输入第" + (i + 1) + "个元素的值：");
			score[i] = myScanner.nextDouble();
		}

		//遍历 输出
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
}
```

### 静态初始化

初始化

```java
数据类型[] 数组名 = {元素值,元素值,...}

int a[] = {2, 5, 6, 7, 8, 9};
int[] a = {2, 5, 6, 7, 8, 9};
其等价于
int[] a = new int [6];
a[0] = 2;
a[1] = 5;
a[2] = 6;
a[3] = 7;
a[4] = 8;
a[5] = 9;
```

案例见[Array01.java]

### 数组细节

1. 数组是多个相同类型数据的组合，实现对这些数据的同一管理
2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
3. 数组创建后，如果赋值，有默认值
   1. int	0
   2. short    0
   3. byte      0
   4. long      0
   5. long      0
   6. float      0.0
   7. double  0.0
   8. char      \u0000
   9. boolen   false
   10. String    null

4. 使用数组的步骤
   1. 声明数组并开辟空间
   2. 给数组各个元素赋值
   3. 使用数组
5. 数组的下标是从0开始的
6. 数组下标必须在指定的范围内使用，否则报：下标越界异常，比如：

```java
int[] arr = new int[5];
则有效下标为0-4
```

7. 数组属性引用类型，数组型数据是对象（object）

### 练习题

1. 创建一个char类型的26个元素的数组，分别放置 ‘A’ - ‘Z’ 。使用for循环访问所有元素并打印出来。提示：char 类型数据运算 ‘A’ + 1 --> ‘B’[ArrayExercise01.java]

```java

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
```

2. 请求出一个数组int[]的最大值{4, -1, 9, 10, 23}，并得到对应的下标[ArrayExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/5/27 15:43
 * 请求出一个数组int[]的最大值{4, -1, 9, 10, 23}，并得到对应的下标[ArrayExercise02.java]
 */ 

public class ArrayExercise02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义数组
		int[] a = {4, -1, 9, 10, 23};

		//找最大
		int max = a[0], m = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max){
				max = a[i];
				m = i;
			}
		}

		System.out.println("最大值为：" + max);
		System.out.println("下标为：" + m);
	}
}
```

### 数组赋值机制

1. 基本数据类型赋值，这个值就是具体的数据，而且互相不影响

```java
int n1 = 2;
int n2 = n1;
```

2. 数组在默认情况下是引用传递，赋的值是地址

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;
```

### 数组拷贝

```java

//数组拷贝
public class ArrayCopy {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};

		//创建一个新的数组arr2，开辟新的空间
		//大小 arr1.length
		int[] arr2 = new int[arr1.length];

		//遍历arr1，把每个元素拷贝到对应位置
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		//修改arr2
		arr2[0] = 100;

		//输出
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println(" ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
```

### 数组反转

```java

//数组反转
public class ArrayReverse {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义数组
		int[] arr = {11, 22, 33, 44, 55, 66};

		//规律
		//1. 把 arr[0] 和 arr[5] 进行交换 {66, 22, 33, 44, 55, 11}
		//2. 把 arr[1] 和 arr[4] 进行交换 {66, 55, 33, 44, 22, 11}
		//3. 把 arr[2] 和 arr[3] 进行交换 {66, 55, 44, 33, 22, 11}
		//一共要交换的次数 = arr.length / 2
		//每次交换，对应的下标是 arr[i] 和 arr[arr.length - 1 - i] 

		for(int i = 0; i < arr.length / 2; i++){
			int temp = arr[arr.length - i - 1];	//保存
			arr[arr.length - i - 1] = arr[i];
			arr[i] = temp;
		}

		/*
			优化
			int temp = 0;
			int len = arr.lenth;
			for(int i = 0; i < len / 2; i++){
			temp = arr[len - i - 1];	//保存
			arr[len - i - 1] = arr[i];
			arr[i] = temp;
		}
		*/

		//打印
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
```

```java

public  class ArrayReverse02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr = {11, 22, 33, 44, 55, 66};

		//建立数组 arr2
		int[] arr2 = new int[arr.length];

		//逆序复制
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[i] = arr[arr.length - i - 1];
		}

		//打印
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
} 
```

### 数组扩容

要求：实现动态给数组添加元素的过程，实现对数组扩容

1. 原始数组使用静态分配

```java
int[] arr = {1, 2, 3};
```

2. 增加的元素，直接放在数组的最后

```java
arr = {1, 2, 3, 4}
```

代码实现：

```java

//数组扩容
public class ArrayAdd {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义初始数组
		int[] arr = {1, 2, 3};

		//定义一个新数组
		int[] arrNew = new int[arr.length + 1];

		//遍历arr，依次拷贝
		for (int i = 0; i  < arr.length; i++) {
			arrNew[i] = arr[i];
		}

		//给arrNew赋值
		arrNew[arrNew.length - 1] = 4; 

		//让 arr 指向 arrNew
		arr = arrNew;

		//打印
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
```

### 排序

排序是将多个数据，按指定的顺序进行排序的过程

排序的分类：

1. 内部排序

将需要处理的所有数据都加载到内部存储器中进行排序。

包括（交换式排序，选择排序，插入排序）

2. 外部排序

数据量过大，无法全部加载到内存中，需要借助外部存储进行排序。

包括（合并排序和直接合并排序）

### 冒泡排序

基本思想：

通过对待排序序列从后向前（从下标大的元素开始），依次比较相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部，就像水底下的气泡一样逐渐向上冒。

两两比较，小的在前，层层递减

规律：

5个元素，进行了4轮排序（外层循环），每一轮排序确定一个数的位置。比较时，前面大于（降序就小于）后面就交换。

```java
//升序

public class BubbleSort {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr = {24, 69, 80, 57, 13};
		int temp = 0;	//交换 临时变量

		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = 0; j < arr.length - 1 - i; j++) {	//4次比较
			//如果前面的数大于后面的数，交换
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
 			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
```

### 查找

java中，常用的查找有两种：

1. 顺序查找
2. 二分查找

### 二维数组

快速入门：用二维数组输出如下图形

```
000000
001000
020300
000000
```

```java

//二维数组输出图形
public class TwoDimensionalArray01 {	//Two - 二
										//Dimensional - 维度
										//Array - 数组
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义形式 int[][]
		//可以理解为，原来的一维数组的每个元素是一维数组，就构成二维数组
		int[][] arr = {{0, 0, 0, 0, 0, 0}, 
					   {0, 0, 1, 0, 0, 0}, 
					   {0, 2, 0, 3, 0, 0}, 
					   {0, 0, 0, 0, 0, 0}};

		for (int i = 0; i < arr.length; i++) {	//遍历二维数组的每个元素 - 一维数组
			for (int j = 0; j < arr[i].length; j++) {	//遍历二维数组的每个一维数组的长度
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
```

 #### 动态初始化1

语法：

```java
类型[][] 数组名 = new 类型[大小][大小];
int a[][] = new int[2][3];
```

```java

//动态初始化
public class TwoDimensionalArray02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];

		//遍历arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	} 
}
```

#### 动态初始化2

语法：

```java
先声明：类型 数组名[][];
再定义：数组名 = new 类型[大小][大小];
最后赋值（有默认值）
```

```java

//动态初始化
public class TwoDimensionalArray03 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[][] arr;	//先声明
		arr = new int[2][3];	//再开空间

		//遍历arr
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	} 
}
```

#### 动态初始化3 - 不确定列数

在Java中，可以创建类似下面这样的二维数组

| 1    |      |      |
| ---- | ---- | ---- |
| 2    | 2    |      |
| 3    | 3    | 3    |

即第一个一维数组长度为1，第二个一维数组长度为2，第三个一维数组长度为3

```java

//动态初始化
public class TwoDimensionalArray04 {
	
	//编写一个main方法
	public static void main(String[] args) {

		/*
			i = 0:	1
			i = 1:	2  2
			i = 2:	3  3  3
		*/		

		int[][] arr = new int[3][];	//列数不确定，所以列数不写
		for (int i = 0; i < arr.length; i++) {	//遍历 arr 的每一个一维数组
			//给每个一维数组开空间
			arr[i] = new int[i + 1];	//如果没有给一维数组 new，那么，arr[i] 就是 null

			//遍历一维数组，并给每个元素赋值
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}

		//遍历输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	} 
}
```

#### 静态初始化

```java
类型 数组名[][] = {{值1, 值2}, {值1, 值2}, ...};
```

#### 二维数组练习题

1. 遍历下面的二维数组，并得到和[TwoDimensionalArray05.java]

```java
int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
```

```java
/**
 * @author GuYuqi
 * 2024/5/27 22:05
 * 遍历下面的二维数组，并得到和[TwoDimensionalArray05.java]
 * int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
 */ 

public class TwoDimensionalArray05 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//定义数组
		int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};

		//遍历求和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		//输出
		System.out.println(sum);
	}
}
```

#### 杨辉三角

```java
/**
 * @author GuYuqi
 * 2024/5/27 22:08
 * 杨辉三角
 */ 
public class YangHui {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[][] arr = new int[10][10];

		//赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i][i] = 1;
			arr[i][0] = 1;
		}

		for (int i = 2; i < arr.length; i++) {
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}
		}

		//输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}
}
```

```java

public class YangHui {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		int[][] arr = new int[10][];	

		//开辟每个一维数组的空间
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}

		//赋值
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}

		//输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}
}
```

#### 二维数组细节

1. 一维数组声明方式

```java
int[] a;
int a[];
```

2. 二维数组声明方式

```java
int[][] y;
int[] y[];
int y[][];
```

3. 二维数组实际上是由多个一维数组组成的，它的各个一维数组的长度可以相同，也可以不同

```java
map[][]
```

是一个二维数组

```java
map[][] = {{1, 2}, {3, 4, 5}}
```

由map[0]是一个含有两个元素的一维数组，map[1]是一个含有三个元素的一维数组构成，我们也成列数不等的二维数组

## 作业5

1. 下面数组定义正确的有：[Homework01.java]

```java
下面数组定义正确的有：[Homework01.java]

A. String strs[] = {'a', 'b', 'c'};
B. String[] strs = {"a", "b", "c"};
C. String[] strs = new String{"a" "b" "c"};
D. String strs[] = new String[]{"a", "b", "c"};
E. String[] strs = new String[3]{"a", "b", "c"};
```

```
BD
```

2. 写出结果[Homework02.java]

```java
String foo = "blue";
boolean[] bar = new boolean[2];
if(bar[0]){
	foo = "green";
}
System.out.println(foo);
```

```
blue
```

3. 输出结果[Homework03.java]

```java
int num = 1;
while(num < 10){
	System.out.println(num);
	if(num > 5) {
		break;
	}
	num += 2;
}
```

```
1
3
5
```

4. 已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：[10, 12, 45, 90]，添加23后，数组为[10, 12, 23, 45, 90]。[Homework04.java]

```java
/**
 * @author GuYuqi
 * 2024/5/27 23：00
 * 已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：[10, 12, 45, 90]，添加23后，数组为[10, 12, 23, 45, 90]。[Homework04.java]
 */ 

public class Homework04 {
	
	//编写一个main方法
	public static void main(String[] args) {

		//创建一个数组
		int[] arr = {10, 12, 45, 90};

		//要添加的数
		int num = 23;

		//将数插入 arrNew
		int[] arrNew = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}

		// 空出位置
		int n = 0;
		for (int i = arrNew.length - 2; i >= 0; i--) {
			if(arrNew[i] > num) {
				arrNew[i + 1] = arrNew[i];
				n = i;
			} else {
				break;
			}
		}

		//插入元素
		arrNew[n] = num;

		//改变 arr
		arr = arrNew;

		//输出
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
```

5. 随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8[Homework05.java]

```java
/**
 * @author GuYuqi
 * 2024/5/27 23:19
 * 随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值、球最大值和最大值的下标、并查找里面是否有8[Homework05.java]
 */

 public class Homework05 {
 	
 	//编写一个main方法
 	public static void main(String[] args) {
 		
 		//生成随机数并存入数组
 		int[] arr = new int[10];
 		for (int i = 0; i < arr.length; i++) {
 			arr[i] = (int)(Math.random() * 100) + 1;
 		}

 		//倒叙打印
 		for (int i = arr.length - 1; i >= 0; i--) {
 			System.out.print(arr[i] + " ");
 		}

 		//计算平均值，找到最大值、最小值下标并找8
 		int avg = 0, max = arr[0], min = arr[0];
 		int m = 0, n = 0, f = 0;
 		for (int i = 0; i < arr.length; i++) {
 			avg += arr[i];
 			if(arr[i] > max) {
 				max = arr[i];
 				m = i;
 			} else if(arr[i] < min) {
 				min = arr[i];
 				n = i;
 			}

 			if(arr[i] == 8) {
 				f = 1;
 			}
 		}
 		
 		System.out.println("\n平均值：" + (double)(avg / 10) + "\n最大值下标：" + m + "\n最小值下标：" + n);
 		if(f == 1) {
 			System.out.println("有8");
 		} else {
 			System.out.println("没有8");
 		}
 	}
 } 
```

6. 输出结果[Homework06.java]

```java
char[] arr1 = {'a', 'z', 'b', 'c'};
char[] arr2 = arr1;
arr1[2] = "韩";

for (int i = 0; i < arr2.length; i++) {
	System.out.println(arr1[i] + "," + arr2[i]);
}
```

```
a,a
z,z
韩,韩
c,c
```

7. 冒泡排序[Homework07.java]	略，具体代码见上文排序章节

## 类与对象（OOP）

 类与对象关系

```
把猫的特性提取出来 -> 猫类Cat（属性、行为） -> 对象（实例）
```

```java
/*
	张老太太养了两只猫：
	一只叫小白，今年三岁，白色
	另一只叫小花，今年一百岁，花色
	编写程序，当用户输入小猫的名字时，就显示名字、年龄、颜色
	如果输入小猫名错误，则显示 张老太太没有这只猫
*/

//已有技术解决
public class Object01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
	/*	

		//单独变量解决 -> 不利于数据管理
		//第一只猫信息
		String cat1Name = "小白";
		int cat1Age = 3;
		String cat1Color = "白色";

		//第二只猫信息
		String cat1Name = "小花";
		int cat1Age = 100;
		String cat1Color = "花色";

		//数组 -> 1.  数据类型无法体现 
		//		  2. 只能通过下标获取信息，造成变量名与内容对应不明确
		//		  3. 不能体现猫的行为
		//第1只猫信息
		String[] cat1 = {"小白", "3", "白色"};
		String[] cat2 = {"小花", "100", "花色"};
	}

	*/

		//使用OOP面向对象解决
		//实例化一只猫
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		//创建第二只猫，并赋给 cat2
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		//使用对象属性
		System.out.println("第一只猫的信息：" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("第二只猫的信息：" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
}

//面向对象解决
//定义一个猫类 Cat -> 自定义的数据类型
class Cat {
	//属性
	String name;	//名字
	int age;		//年龄
	String color;	//颜色
}
```

### 属性/成员变量

1. 从概念或叫法上看：成员变量 = 属性 = field[字段]（即 成员变量是用来表示属性的）
2. 属性是类的一个组成部分，一般是基本数据类型，也可是引用类型（对象，数组）

### 属性细节

1. 属性的定义语法同变量

```
访问修饰符 属性类型 属性名;

访问修饰符 - 控制属性的访问范围
public proctected private 默认
```

2. 属性定义类型可以为任意类型，包含基本类型或引用类型
3. 属性如果不复制，有默认值，规则和数组一致

### 创建对象访问属性

创建对象

1. 先声明再创建

```java
Cat cat;
cat = new Cat();
```

2. 直接创建

```java
Cat cat = new Cat();
```

访问属性

```
对象名.属性名;
```

### Java内存结构

栈：一般存放基本数据类型

堆：存放对象（Cat cat，数组等）

方法区：常量池（常量，比如字符串），类加载信息

### Java创建对象的流程

```java
Person p = new Person();
p.name = "jack";
p.age = 10;
```

1. 先加载Person类信息（属性和方法信息，只会加载一次）
2. 在堆中分配空间，进行默认初始化（给默认值）
3. 把地址赋给p，p就指向对象
4. 进行指定初始化（赋值）

### 成员方法

在某些情况下，我们要需要去定义成员方法（简称方法）。比如人类：除了有一些属性外（年龄，姓名..），我们人类还有一些行为比如：可以说话、跑步...，通过学习，还可以做算术题。这时就要用成员方法才能完成。现在要求对Person类进行完善

快速入门：

Method01.java

1） 添加speak成员方法，输出，我是一个好人

2） 添加cal01成员方法，可以计算1 + ... + 1000的结果

3） 添加cal02成员方法，该方法可以接受一个数n，计算从1 + ... + n的结果

4） 添加getSum成员方法，可以i计算两个数的和

```java
public class Method01 {	//Method - 方法
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//方法调用
		//先创建对象，再调用方法
		Person p1 = new Person();	//创建对象
		p1.speak();	//调用方法

		//调用 cal01 方法
		p1.cal01();

		//调用 cal02 方法
		p1.cal02(5);
		p1.cal02(10);

		//调用 getSum 方法
		System.out.println(p1.getSum(5, 10)); 
	}
}

class Person{

	String name;
	int age;

	//添加 speak 方法，输出“我是一个好人”
	public void speak() {	//public 表示该方法是公开的
							//void 表示该方法没有返回值
							//speak() speak是方法名 ()是形参列表
		System.out.println("我是一个好人");
	}

	//添加 cal01 方法，计算1 + ... + 100的结果
	public void cal01() {
		int res = 0;
		for (int i = 1; i <= 100; i++) {
			res += i;
		}
		System.out.println("cal01 计算结果 = " + res);
	}

	//添加cal02成员方法，该方法可以接受一个数n，计算从1 + ... + n的结果
	public void cal02(int n) {	//(int n)	//当前有一个形参，可以接受用户输入
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02 计算结果 = " + res);
	}

	//添加getSum成员方法，可以i计算两个数的和
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}
```

遍历一个数组，输出数组各个元素值[Method02.java]

```
int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
```

传统的方法，就是使用单个for循环，将数组输出

```java
public class Method02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

		//遍历 map 数组
		//传统方法：直接遍历
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
```

如果在多个地方都要遍历，就要写很多遍，造成代码冗余度高

为了减少冗余度，可以定义一个类MyTools，然后写一个成员方法，调用实现遍历

```java
public class Method02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

		//遍历 map 数组
		//传统方法：直接遍历
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//使用方法完成输出
		System.out.println("=====");
		MyTools tool = new MyTools();
		tool.printArr(map);
	}
}

//把输出的功能，写到一个类的方法中，然后调用该方法
class MyTools {
	//方法，接受一个二维数组
	public void printArr(int[][] map) {
		//对传入的二维数组进行遍历输出
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
```

成员方法的好处：

1. 提高代码的复用性
2. 可以将实现的细节封装起来，然后供其他用户来调用即可

### 方法的定义

```java
访问修饰符 返回数据类型 方法名（形参列表）{//方法体
    语句;
    return 返回值;
}
```

1. 形参列表：表示成员方法输入
2. 返回数据类型：表示成员方法输出，void表示没有返回值
3. 方法主体：表示为了实现某一功能代码块
4. return语句不是必须的

### 方法细节

访问修饰符：作用是控制方法使用的范围。有四种：public proctected private 默认

返回类型：

1. 一个方法最多有一个返回值
2. 返回类型可以为任意类型，包含基本类型或引用类型（数组，对象）

```java
public class MethodDetail {

	//编写一个 main 方法
	public static void main() {

		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
	}
}

class AA {
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2];	//创建一个数组
		res[0] = n1 + n2;
		res[1] = n1 - n2;
		return resArr;
	}
}
```

3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为

```java
return 值;
```

而且要求返回值类型必须和return的值类型一致或兼容

4. 如果方法是void，则方法中可以没有return语句，或者只写 return;

方法名遵循驼峰命名法，最好见名知义，表达出该功能的意思即可

比如得到两个数的和getSum，开发中按照规范

### 方法练习题

1. 编写类AA，有一个方法：判断一个数是奇数还是偶数，返回boolean[MethodExercise01.java]

```java
//编写类AA，有一个方法：判断一个数是奇数还是偶数，返回boolean[MethodExercise01.java]
public class MethodExercise01 {

	//编写一个 main 方法
	public static void main(String[] args) {

		AA a = new AA();
		boolean b = a.isOdd(4);
		System.out.println(b);
	}
}

//编写一个类 AA
class AA {

	//编写一个方法，判断奇偶数
	public boolean isOdd(int num) {
		//return num % 2 != 0 ? true : false;
		return num % 2 != 0;
	}
}
```

2. 根据行、列、字符打印对应行数和列数的字符，比如：行：4，列：4，字符：#。则打印相应的效果[MethodExercise02.java]

```java
//根据行、列、字符打印对应行数和列数的字符，比如：行：4，列：4，字符：#。则打印相应的效果[MethodExercise02.java]

//引入 Scanner 类所在的包
import java.util.Scanner;

public class MethodExercise02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		AA a = new AA();
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入行数：");
		int hang = myScanner.nextInt();
		System.out.print("请输入列数：");
		int lie = myScanner.nextInt();
		System.out.print("请输入字符");
		char ziFu = myScanner.next().charAt(0);

		a.print(hang, lie, ziFu);
	}
}

//编写一个类 AA 
class AA {
	
	//编写一个方法
	public void print(int hang, int lie, char ziFu) {
		for (int i = 0; i < hang; i++) {
			for (int j = 0; j < lie; j++) {
				System.out.print(ziFu);
			}
			System.out.println();
		}
	}
}
```

### 成员方法的传参机制

#### 基本数据类型的传参机制

[MethodParmeter01.java]

```java
public class MethodParmeter01 {

	//编写一个 main 方法
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		//创建AA对象，名字obj
		AA obj = new AA();
		obj.swap(a, b);	//调用swqp

		System.out.println("\nmain 方法\na = " + a + " b = " + b);//a = 10, b = 20

	} 
}

class AA {
	public void swap(int a, int b) {
		System.out.println("\na和b交换前的值\na = " + a + "\tb = " + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值\na = " + a + "\tb = " + b);	
	}
}
```

基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参

#### 引用数据类型的传参机制

[MethodParameter02.java]

```java
public class MethodParmeter02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		B b = new B();
		int[] arr = {1, 2, 3};
		b.test100(arr);
		System.out.println("main 的 arr 数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		System.out.println("main 的 p.age = " + p.age);
	}
}

class Person {
	String name;
	int age;
}

class B {

	public void test200(Person p) {
		p.age = 10000;
		// p = null;
	}

	public void test100(int[] arr) {
		arr[0] = 200;
		System.out.println("test100 的 arr 数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
```

引用传递传递的是地址（传递也是值，但值是地址），可以通过形参影响实参

### 克隆对象

编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象，注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同[MethodExercise03.java]

```java
public class MethodExercise03 {

	//编写一个 main 方法
	public static void main(String[] args) {

		Person p = new Person();
		p.name = "milan";
		p.age = 100;
		//创建tools对象
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);
		//到此，p 和 p2 都是Person对象，但是两个独立的对象，属性相同
		System.out.println("p 的属性 age = " + p.age + " 名字 = " + p.name);
		System.out.println("p2 的属性 age = " + p2.age + " 名字 = " + p2.name);
		
		//通过对象比较看看是否为同一个对象
		System.out.println(p == p2);
	}
}

class Person {
	String name;
	int age;
}

class MyTools {

	public Person copyPerson(Person p) {
		//创建一个新对象
		Person p2 = new Person();
		p2.name = p.name;	//把原来对象的名字赋给p2.name
		p2.age = p.age;		//把原来对象的年龄赋给p2.age

		return p2;
	}
}
```

### 方法递归调用

递归就是方法自己调用自己，每次调用时传入不同的变量，递归有助于编程者解决复杂问题，同时可以让代码变得简洁

递归[Recursion01.java]

```java
public class Recursion01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		T t1 = new T();
		t1.test(4);
	}
}

class T {
	public void test(int n) { 
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}
}
```

阶乘[Recursion02.java]

```java
public class Recursion02 {

	//编写一个 main 方法
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println(t1.factorial(5));
	}
}

class T {
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}
```

### 递归重要规则

1. 执行一个方法时，就创建一个新的受保护的独立空间（栈空间）
2. 方法的局部变量是独立的，不会相互影响，比如n变量
3. 如果方法中使用的是引用类型变量（比如数组），就会共享该引用类型的数据
4. 递归必须向退出递归的条件逼近，否则就是无限递归，出现StackOverflowError，死归了
5. 当一个方法执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕



### 斐波那契数列

使用递归的方法求出斐波那契数列1,1,2,3,5,8,13...给你一个整数n，求出它的值是多少

[RecursionExercise01.java]

```java
public class RecursionExercise01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println(t1.fib(7));
	}
}

class T {
	public int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
```

### 猴子吃桃问题

猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃），发现只有1个桃子了。问题：最初共有多少个桃子[RecursionExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/6/30 14:20
 * 猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃），发现只有1个桃子了。问题：最初共有多少个桃子
 */

public class RecursionExercise02 {

	//编写一个 main 方法
	public static void main(String[] args) {

		T t1 = new T();
		System.out.println("第一天有 " + t1.test100(10) + " 个桃子");
	}
}  

class T {
	public int test100(int n) {
		if(n == 1) {
			return 1;
		} else {
			return (test100(n - 1) + 1) * 2;
		}
	}
}
```

### 迷宫问题

[MiGong.java]

```java
public class MiGong {

	//编写一个 main 方法
	public static void main(String[] args) {

		//创建地图
		int[][] map = new int[8][7];
		//将最上面一行和最下面一行都置1
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//将最右边和最左边的列也置1
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//单独置1
		map[3][1] = 1;
		map[3][2] = 1;

		//使用findWay给老鼠找路
		T t1 = new T();
		t1.findWay(map, 1, 1);

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T {
	//使用递归回溯的思想解决
	//findWay方法就是专门来找出迷宫的路径
	//如果找到，就返回True，否则返回False
	//map 就是二维数组，即表示迷宫
	//i,j就是老鼠的位置，初始化位置为（1,1）
	//因为是递归找路，所以先规定map数组的各个值的含义
	//0 可以走 1 障碍物 2 走过可以走 3 走过但走不通
	//递归退出条件：map[6][5] == 2
	//找路策略：下 -> 右 -> 上 -> 左
	public boolean findWay(int[][] map, int i, int j) {
		if(map[6][5] == 2) {	//已经找到
			return true;
		} else {
			if(map[i][j] == 0) {	//当前位置0，可以走
				//假定可以走通
				map[i][j] = 2;
				//使用找路策略确定该位置是否真的可以走通
				//下 -> 右 -> 上 -> 左
				if(findWay(map, i + 1, j)) {	//下
					return true;
				} else if(findWay(map, i, j + 1)){	//右
					return true;
				} else if(findWay(map, i - 1, j)){	//上
					return true;
				} else if(findWay(map, i, j - 1)){	//左
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {	//map[i][j] = 1, 2, 3
				return false;
			}
		}
	}
}
```

### 汉诺塔

[HanoiTower.java]

```java
public class HanoiTower {

	//编写一个 main 方法
	public static void main(String[] args) {
		Tower tower = new Tower();
		tower.move(26, 'A', 'B', 'C');
	}
}

class Tower {

	//num - 表示要移动的个数
	//a, b, c - 分别表示 A 塔，B 塔，C 塔
	public void move(int num, char a, char b, char c) {
		//如果只有一个盘，即 num = 1
		if(num == 1) {
			System.out.println(a + " -> " + c);
		} else {
			//如果有多个盘，可以看成两个，即最下面的和上面的所有
			//先移动上面所有的盘到 b，中间借助 c
			move(num - 1, a, c, b);
			//把最下面的盘移动到 c
			System.out.println(a + " -> " + c);
			//再把 b 塔的所有盘移动到 c，借助 a
			move(num - 1, b, a, c);
		}
	}
}
```

### 方法重载（OverLoad）

Java中允许在同一个类中，多个同名方法的存在， 但要求形参列表不一致！

比如：System.out.println();  out是PrintStream类型

重载的好处：

1. 减轻了起名的麻烦
2. 减轻了记名的麻烦

```
案例：
类：MyCalculator
方法：calculate

calculate(int n1, int n2)			//两个整数的和
calculate(int n1, double n2)		//一个整数，一个double的和
calculate(double n2, int n1)		//一个double，一个int和
calculate(int n1, int n2, int n3)	//三个int的和
```

```java
public class OverLoad01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1.1, 2));
	}
}

class MyCalculator {	//calculate - 计算
	//下面四个 calculate 方法构成了重载
	//两个整数的和
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}			

	//一个整数，一个double的和
	public double calculate(int n1, double n2) {
		return n1 + n2;
	}

	//一个double，一个int和
	public double calculate(double n2, int n1) {
		return n1 + n2;
	}

	//三个int的和
	public int calculate(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}
```

细节：

1. 方法名：必须相同
2. 形参列表：必须不同（参数类型或个数或顺序，至少有一样不同，参数名无要求）
3. 返回类型：无要求

### 方法重载练习题

1. 与

```java
void show(int a, char b, double c) { }
```

构成重载的有：

```java
A. void show(int x, char y, double z) { }
B. int show(int a, double c, char b) { }
C. void show(int a, double c, char b) { }
D. boolean show(int c, char b) { }
E. void show(double c) { }
F. double show(int x, char y, double z) { }
G. void shows() { }
```

```
BCDE
```

2. 编写程序，类Methods中定义三个重载方法并调用。方法名为m。三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。分别执行平方运算并输出结果，相乘冰输出结果，输出字符串信息。在主类的 main() 方法中分别用参数区别调用三个方法[OverLoadExercise01.java]

```java
/**
 * @author GuYuqi
 * 2024/7/6 13:21
 * 编写程序，类Methods中定义三个重载方法并调用。方法名为m。三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。分别执行平方运算并输出结果，相乘冰输出结果，输出字符串信息。在主类的 main() 方法中分别用参数区别调用三个方法
 */
public class OverLoadExercise01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Methods myMethods = new Methods();
		System.out.println(myMethods.m(2));
		System.out.println(myMethods.m(2, 3));
		myMethods.m("Hello, World!");
	}
} 

class Methods {
	//int 平方
	public int m(int a) {
		return a * a;
	}

	//int 相乘
	public int m(int a, int b) {
		return a * b;
	}

	//输出字符串
	public void m(String c) {
		System.out.println(c);
	}
}
```

3. 在 Methods 类，定义三个重载方法 max()，第一个方法，返回两个 int 值中的最大值，第二个方法，返回两个 double 值中的最大值，第三个方法，返回三个 double 值中的最大值，并分别调用三个方法[OverLoadExercise02.java]

```java
/**
 * @author GuYuqi
 * 2024/7/6 13:30
 * 在 Methods 类，定义三个重载方法 max()，第一个方法，返回两个 int 值中的最大值，第二个方法，返回两个 double 值中的最大值，第三个方法，返回三个 double 值中的最大值，并分别调用三个方法
 */
public class OverLoadExercise02 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Methods myMethods = new Methods();
		System.out.println(myMethods.max(2, 3));
		System.out.println(myMethods.max(2.2, 3.3));
		System.out.println(myMethods.max(6.6, 5.5, 4.4));
	}
}

class Methods {

	//返回两个 int 中大的
	public int max(int a, int b) {
		return a > b ? a : b;
	}

	//返回两个 double 中大的
	public double max(double a, double b) {
		return a > b ? a : b;
	}

	//返回三个 double 中大的
	public double max(double a, double b, double c) {
		return a > b ? a : b > c ? b : c;
	}
}
```

### 可变参数

基本概念：Java允许将同一个类中的多个同名同功能但参数个数不同的方法，封装成一个方法

基本语法

```
访问修饰符 返回类型 方法名(数据类型... 形参名) {
    
}
```

快速入门[VarParameter01.java]

```
类 HspMethod
方法 sum
可以计算 2 个数的和，3 个数的和，4、5... 个数的和
```

 ```java
 public class VarParameter01 {
 
 	//编写一个 main 方法
 	public static void main(String[] args) {
 		HspMethod myHspMethod = new HspMethod();
 		System.out.println(myHspMethod.sum(1, 2, 3));
 	}
 }
 
 class HspMethod {
 	//方法重载
 	/*
 	public int sum(int n1, int n2) {	//2 个数的和
 		return n1 + n2;
 	}
 	public int sum(int n1, int n2, int n3) {	//3 个数的和
 		return n1 + n2 + n3;
 	}
 	public int sum(int n1, int n2, int n3, int n4) {	//4 个数的和
 		return n1 + n2 + n3 + n4;
 	}
 	*/
 	//......
 
 	//封装（可变参数优化）
 	public int sum(int... nums) {	//int... - 可变参数，类型 int 可以接收多个
 									//使用时可以当做数组来使用
 									//即 nums 可以当做数组
 		System.out.println("接受的参数个数" + nums.length);
 		int res = 0;
 		for (int i = 0; i < nums.length; i++) {
 			res += nums[i];
 		}
 		return res;
 	}
 }
 ```

细节：

1. 可变参数的实参可以为0个或任意多个
2. 可变参数的实参可以为数组
3. 可变参数的本质就是数组
4. 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
5. 一个形参列表中只能出现一个可变参数

```java
public class VarParameterDetail {

	//编写一个 main 方法
	public static void main(String[] args) {

		//可变参数的实参可以为数组
		int[] arr = {1, 2, 3};
		T t1 = new T();
		t1.f1(arr);
	}
}

class T {
	public void f1(int... nums) {
		System.out.println("长度 = " + nums.length);
	}

	//可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
	public void f2(String str, double... nums) {
		
	}
}
```

### 可变参数练习

有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。封装成一个可变参数的方法[VarParameterExercise.java]

```
类名 HspMethod
方法名 showScore
```

```java
/**
 * @author GuYuqi
 * 2024/7/6 14:00
 * 有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课成绩（总分），返回姓名和五门课成绩（总分）。封装成一个可变参数的方法
 */
public class VarParameterExercise {

	//编写一个 main 方法
	public static void main(String[] args) {
		HspMethod myHspMethod = new HspMethod();
		System.out.println(myHspMethod.showScore("Jack", 100, 90));
		System.out.println(myHspMethod.showScore("Jack", 100, 10, 20));
		System.out.println(myHspMethod.showScore("Jack", 100, 100, 100, 100, 100));
	}
}

class HspMethod {
	public String showScore(String name, double... scores) {
		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + " - " + totalScore;
	}
}
```

### 作用域

1. 在Java编程中，主要的变量就是属性（成员变量）和局部变量
2. 我们说的局部变量一般是指在成员方法中定义的变量
3. Java中作用域的分类
   1. 全局变量：也就是属性，作用域为整个类体
   2. 局部变量：也就是除了属性以外的其他变量，作用域为定义它的代码块中
4. 全局变量（属性）可以不赋值，直接使用，因为有默认值，局部变量必须赋值后才能使用，因为没有默认值

```java
public class VarScope {

	//编写一个 main 方法
	public static void main(String[] args) {

	}
}

class Cat {

	//局部变量：也就是除了属性以外的其他变量，作用域为定义它的代码块中
	//属性在定义时，可以直接赋值
	int age = 10;

	//全局变量（属性）可以不赋值，直接使用，因为有默认值
	double weight;	//没赋值，有默认值 0.0

	public void hi() {
		//局部变量必须赋值后才能使用，因为没有默认值
		int num;
		System.out.println("num = " + num);	//错误，num 没有赋值
	}

	public void cry() {

		//局部变量一般是指在成员方法中定义的变量
		//n 和 name 是局部变量，作用域在 cry 方法中
		int n = 10;
		String name = "jack";
		//在 cry 方法中使用 age
		System.out.println("age = " + age);
	}

	{
		int num = 100;	//num 只能在代码块中使用，不能在 cry 和 eat 方法中使用
	}

	public void eat() {
		//在 eat 方法中使用 age
		System.out.println("age = " + age);

		System.out.println("name = " + name);	//错误，name 在 cry 中

	}
}
```

细节：

1. 属性和局部变量可以重名，访问时遵循就近原则

2. 在同一作用域中，比如在同一个成员方法中，两个局部变量，不能重名

3. 属性生命周期较长，伴随着对象的创建而创建，伴随着对象的死亡而死亡。局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而死亡。即在一次方法调用过程中

4. 作用域范围不同

   1. 全局变量：可以被本类使用，或其他类使用（通过对象调用）
      ```java
      class T {
          public void test() {
              Person p1 = new Person();
              System.out.println(p1.name);
          }
      }
      
      class Person {
          String name = "jack";
      }
      ```

   2. 局部变量：只能在本类中对应的方法中使用

5. 修饰符不同

   1. 全局变量可以加修饰符
      ```java
      public int age = 20;
      ```

   2. 局部变量不可以加修饰符

### 构造方法  /  构造器

基本语法

```
[修饰符] 方法名（形参列表） {
	方法体;
}
```

1. 构造器的修饰符可以默认，也可以是public protected private
2. 构造器没有返回值
3. 方法名 和 类名字必须一样
4. 参数列表 和 成员方法一样的规则
5. 构造器的调用由系统完成

构造方法又叫构造器（constructor），是类的一种特殊方法，它的主要作用是完成对新对象的初始化。它有几个特点：

1. 方法名和类名相同
2. 没有返回值
3. 在创建对象时，系统会自动的调用该类的构造器完成对对象的初始化 

快速入门

在创建人类的对象时，就直接指定这个对象的年龄和姓名[Constructor01.java]

```java
public class Constructor01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		//当我们 new 一个对象时，直接通过构造器指定名字和年龄
		Person p1 = new Person("smith", 80);
		System.out.println("p1.name = " + p1.name);
		System.out.println("p1.age = " + p1.age);
	}
}

class Person {
	String name;
	int age;

	//构造器
	//1. 构造器没有返回值，也不能写 void
	//2. 构造器的名称和类 Person 一样
	//3. (String pName, int pAge) 是构造器形参列表，规则和成员方法一样
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}
```

细节

1. 一个类可以定义多个不同的构造器，即构造器重载【比如：我们可以再给 Person 类定义一个构造器，用来创建对象的时候，只指定人名，不需要指定年龄】
2. 构造器名和类名要相同
3. 构造器没有返回值
4. 构造器是完成对象的初始化，并不是创建对象
5. 在创建对象时，系统自动调用该类的构造方法
6. 如果程序员没有定义构造方法，系统会自动给类生成一个默认无参构造器（也叫默认构造器）
7. 一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，除非显式的定义一下，即：Person(){ }

### 构造器练习

在 Person 类中添加两个构造器：

第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为18

第二个带 pName 和 pAge 两个参数的构造器：使得每次创建 Person 对象的同时初始化对象的 age 属性和 name 属性值。分别使用不同的构造器，创建对象

[ConstructorExercise.java]

```java
public class ConstructorExercise {

	//编写一个 main 方法
	public static void main(String[] args) {
		//无参构造器
		Person p1 = new Person();
		System.out.println("p1.name = " + p1.name + " p1.age = " + p1.age);
		//带参数的构造器
		Person p2 = new Person("scott", 50);
		System.out.println("p2.name = " + p2.name + " p2.age = " + p2.age);
	}
}

class Person {
	String name;
	int age;

	//无参
	public Person() {
		age = 18;
	}

	//带两个形参
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}
```

### 对象创建流程分析（面试题）

```java
class Person {
    int age = 90;
    String name;
    Person(String n, int a) {
        name = n;
        age = a;
    }
}

Person p = new Person("Jack", 20);
```

```
1. 在方法区加载 Person 类信息
2. new，在堆里面创建一个空间（设地址 0X1122），空间中有两个位置，一个是 age，一个是 name
3. 先没有赋 90，先给默认值，也就是给 age 赋 0，给 name 赋 null
4. 然后进行显式的初始化，也就是给 age 赋 90，name 没有赋值，保持不动
5. 初始化做完以后发现还有一个构造器，于是执行构造器，给 n 赋 Jack，然后再把 Jack 给到 name，此时堆里面 name 的位置才被赋上 Jack。但 Jack 不在堆里面，而是在常量池，常量池里面有一个空间（设地址0X1133），该空间的内容是 "Jack"，而堆中 name 空间中的内容是 0X1133，即堆中的 name 指向了常量池中的 0X1133
6. 然后给 a 赋 20，a 再把 20 给到 age，这样堆里面的 age 就从 90 被改为了 20
7. 此时，在栈里面正式有了一个 p，而这个 p 也指向了堆中的 0X1122

真正的对象在堆里面，栈中的 p 只能算作是对象的引用
```

```
1. 加载 Person 类信息（Person.class），只会加载一次
2. 在堆中分配空间（地址）
3. 完成对象初始化[3.1 默认初始化 age = 0 name = null  
                3.2 显式初始化 age = 90 name = null
                3.3 构造器的初始化 age = 20 name = Jack]
4. 在对象在堆中的地址返回给 p（p 是对象名，也可以理解成是对象的引用）
```

### this 关键字

Java 虚拟机会给每个对象分配 this，代表当前对象

[This01.java]

```java
public class This01 {

	//编写一个 main 方法
	public static void main(String[] args) {

		Dog dog1 = new Dog("Max", 3);
		dog1.info();
	}
}

class Dog {
	String name;
	int age;

	public Dog(String name, int age) {
		//this.name 就是当前对象的属性 name
		this.name = name;
		//this.age 就是当前对象的属性 age
		this.age = age;
	}

	public void info() {
		System.out.println(name + "\t" + age + "\t");
	}
}
```

简单的说，哪个对象调用，this 就代表哪个对象

细节：

1. this 关键字可以用来访问本类的属性、方法、构造器
2. this 用于区分当前类的属性和局部变量
3. 访问成员方法的语法：this.方法名(参数列表);
4. 访问构造器语法：this(参数列表); 注意只能在构造器中使用
5. this 不能在类定义的外部使用，只能在类定义的方法中使用

### this 课堂练习

定义 Person 类，里面有 name、age 属性，并提供 compareTo 比较方法，用于判断是否和另一个人相等，提供测试类 TestPerson 用于测试，名字和年龄完全一样，就返回 true，否则返回 false[TestPerson.java]

```java
public class TestPerson {

	//编写一个 main 方法
	public static void main(String[] args) {
		Person p1 = new Person("mary", 20);
		Person p2 = new Person("mary", 20);
		System.out.println(p1.compareTo(p2));
	}
} 

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo比较方法
	public boolean compareTo(Person p) {
		return this.name.equals(p.name) && this.age == p.age;
	}
}
```

## 作业6

1. 编写类 A01，定义方法 max，实现求某个 double 数组的最大值，并返回[Homework01.java]

```java
/**
 * @author GuYuqi
 * 2024/7/7 12:06
 * 编写类 A01，定义方法 max，实现求某个 double 数组的最大值，并返回
 */
public class Homework01 {

	//编写一个 main 方法
	public static void main(String[] args) {
		A01 a = new A01();
		double[] arr = {1.1, 2.2, 3.3};
		System.out.println(a.max(arr));
	}
} 

class A01 {
	public double max(double[] arr) {
		double max = arr[1];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
```

2. 编写类 A02，定义方法 find，实现查找某字符串是否在数组中，并返回索引，如果找不到，返回 -1[Homework02.java]

```java
public class Homework02 {

	//编写有一个 main 方法
	public static void main(String[] args) {
		String[] strs = {"jack", "tom", "mary", "milan"};
		A02 a02 = new A02();
		int index = a02.find("milan", strs);
		System.out.println(index);
	}
} 


class A02 {

	public int find(String findStr, String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			if(findStr.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
}
```

3. 编写类 Book，定义方法 updatePrice，实现更改某本书的价格，具体：如果价格>150，则更改为150，如果价格>100，更改为100，否则不变[Homework03.java]

```java
/**
 * @author GuYuqi
 * 2024/7/7 12:49
 * 编写类 Book，定义方法 updatePrice，实现更改某本书的价格，具体：如果价格>150，则更改为150，如果价格>100，更改为100，否则不变
 */
public class Homework03 {

	//编写一个 main 方法
	public static void main(String[] args) {
		double price = 80;

		//new 对象
		Book b = new Book();
		//更改价格
		price = b.updatePrice(price);
		//输出价格
		System.out.println(price);
	}
}

class Book {

	//定义方法
	public double updatePrice(double price) {
		return price > 150 ? 150 : price > 100 ? 100 : price;
	}
}
```

4. 编写类 A03，实现数组的复制功能 copyArr，输入旧数组，返回一个新数组，元素和旧数组一样[Homework04.java]

```java
/**
 * @author GuYuqi
 * 2024/7/7 12:54
 * 编写类 A03，实现数组的复制功能 copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
 */

//引入 Scanner 类所在的包
import java.util.Scanner;

public class Homework04 {

	//编写一个 main 方法
	public static void main(String[] args) {

		//new 对象
		A03 a = new A03();
		//输入数组
		Scanner myScanner = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = myScanner.nextInt();
		}
		//复制数组
		int[] copy = new int[10];
		copy = a.copyArr(arr);
		//输出数组
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
}  

class A03 {

	//定义对象
	public int[] copyArr(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
}
```

5. 定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法[Homework05.java]

```java
/**
 * @author GuYuqi
 * 2024/7/7 13:06
 * 定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
 */
public class Homework05 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println("c = " + c.c() + " s = " + c.s());
	}
} 

class Circle {
	double r;

	//构造器
	public Circle(double r) {
		this.r = r;
	}

	//周长 方法
	public double c() {
		return 2 * Math.PI * r;
	}

	//面积 方法
	public double s() {
		return Math.PI * r * r;
	}
}
```

6. 编程创建一个 Cale 计算类，在其中定义两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试[Homework06.java]

```java
/**
 * @author GuYuqi
 * 2024/7/7 13:15
 * 编程创建一个 Cale 计算类，在其中定义两个操作数，定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）并创建两个对象，分别测试
 */
public class Homework06 {

	//编写一个 main 方法
	public static void main(String[] args) {

		//new 对象
		Cale c = new Cale(1, 0);
		System.out.println(c.add() + " " + c.subtract() + " " + c.multiply() + " " + c.divide());
	}
}  

class Cale {

	double n1;
	double n2;

	//构造器
	public Cale(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	//和 方法
	public double add() {
		return n1 + n2;
	}

	//差 方法
	public double subtract() {
		return n1 - n2;
	}

	//乘 方法
	public double multiply() {
		return n1 * n2;
	}

	public double divide() {
		if(n2 == 0) {
			System.out.println("分母为 0，除法无结果");
			return 0;
		} else {
			return n1 / n2;
		}
	}
}
```

7. 设计一个 Dog 类，有名字、颜色和年龄属性，定义输出方法 show() 显示其信息。并创建对象，进行测试[Homework07.java]

```java
/**
 * @author GuYuqi
 * 2024/7/7 13:26
 * 设计一个 Dog 类，有名字、颜色和年龄属性，定义输出方法 show() 显示其信息。并创建对象，进行测试
 */
public class Homework07 {

	//编写一个 main 方法
	public static void main(String[] args) {

		//new 对象
		Dog d = new Dog("Mix", "white", 3);

		//调用方法
		d.show();
	}
}  

class Dog {

	//定义属性
	String name;
	String color;
	int age;

	//构造器
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	//输出 方法
	public void show() {
		System.out.println(name + " " + color + " " + age);
	}
}
```

8. 下列程序运行结果

```java
public class Test {
	int count = 9;
	public void count1() {
		count = 10;
		System.out.println("count1 = " + count);
	}
	public void count2() {
		System.out.println("count1 = " + count++);
	}
	public static void main(String[] args) {
		new Test().count1();
		Test t1 = new Test();
		t1.count2();
		t1.count2();
	}
}
```

```
count1 = 10
count1 = 9
count1 = 10
```

9. 定义 Music 类，里面有音乐名 name，音乐时长 times 属性，并有播放 play 功能和返回本身属性信息的功能方法 getInfo[Homework09.java]

```java
public class Homework09 {

	//编写一个 main 方法
	public static void main(String[] args) {
		Music music = new Music("ABC", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}  

class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	//播放 方法
	public void play() {
		System.out.println("音乐 " + name + " 正在播放中... 时长为" + times + "秒");	
	}
	//返回 方法
	public String getInfo() {
		return "音乐 " + name + " 播放时间为" + times;
	}
}	
```

10. 下列程序运行结果

```java
class Demo {
	int i = 100;
	public void m() {
		int j = i++;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}
public class Homework10 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = d1;
		d2.m();
		System.out.println(d1.i);
		System.out.println(d2.i);
	}
}
```

```
i = 101
j = 100
101
101
```

## IDEA 快捷键

删除当前行

```
Ctrl + Y
```

复制当前行

```
Ctrl + D
```

补全代码

```
Alt + /
```

添加、取消注释

```
Crtl + /
```

导入该行需要的类

```
Alt + Enter(需先配置 auto import)
```

快速格式化代码

```
Ctrl + Alt + L
```

快速运行程序

```
Shift + F10
```

生成构造器等

```
Alt + Insert
```

查看类的层级关系

```
Ctrl + H
```

定位方法

```
Ctrl + B
```

自动分派变量名

```
Ctrl + Alt + V
```

## 包

### 三大作用

1. 区分相同名字的类
2. 当类很多时，可以很好的管理类
3. 控制访问范围

### 基本语法

```java
package com.hspedu;
```

1. package 关键字，表示打包
2. com.hspedu 表示包名

### 包原理

包的本质实际上就是创建不同的文件夹来保存类文件

### 命名

规则：

​	只能包含数字、字母、下划线、小圆点，但不能用数字开头，不能是关键字或保留字

规范：

​	一般是 小写字母 + 小圆点

```
com.公司名.项目名.业务模块名
eg:	com.hspedu.oa.model;
	com.hspedu.oa.controller;
```

```
eg:
com.sina.crm.user	//用户模块
com.sina.crm.order	//订单模块
com.sina.crm.utils	//工具类
```

### 常用的包

一个包下，包含很多的类，Java 中常用的包有：

```
java.lang.*	//lang 包是基本包，默认引入，不需要再引入
java.util.*	//util 包，系统提供的工具包，工具类，使用 Scanner
java.net.*	//网络包，网络开发
java.awt.*	//是做 java 的界面包，GUI
```

### 引入包

语法

```java
import 包;
```

我们引入一个包的主要目的是要使用该包下面的类

比如

```java
import java.util.Scanner;
```

就只是引入一个类 Scanner

```java
import java.util.*
```

表示将 java.util 包所有都引入

案例：使用系统提供的 Arrays 完成数组排序[com.hspedu.pkg: Import01.java]

```java
package com.hspedu.pkg;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Import01 {

    public static void main(String[] args) {

        //使用系统提供的 Arrays 完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};

        Arrays.sort(arr);
        
        //输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + "\t");
        }
    }
}
```

### 细节

[PkgDetail.java]

1. package 的作用是生命当前类所在的包，需要放在 class 的最上面，一个类中最多只有一句 package
2. import 指令位置放在 package 的下面，在类定义前面，可以有多句且没有顺序要求

```java
//package 的作用是生命当前类所在的包，需要放在 class 的最上面，一个类中最多只有一句 package
package com.hspedu.pkg;
//import 指令位置放在 package 的下面，在类定义前面，可以有多句且没有顺序要求
import java.util.Arrays;
import java.util.Scanner;

public class PkgDetail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, -1, 1};
        Arrays.sort(args);
    }
}

```

## 访问修饰符

[com.hspedu.modifier: ]

Java 提供了四中访问修饰符号，用于控制方法和属性的访问权限：

1. 公开级别： 用 public 修饰，对外公开
2. 受保护级别：用 protected 修饰，对子类和同一个包中的类公开
3. 默认级别：没有修饰符号，向同一个包的类公开
4. 私有级别：用 private 修饰，只有类和本身可以访问，不对外公开

### 访问范围

| 访问级别 | 访问控制修饰符 | 同类 | 同包 | 子类 | 不同包 |
| -------- | -------------- | ---- | ---- | ---- | ------ |
| 公开     | public         | ✔    | ✔    | ✔    | ✔      |
| 受保护   | protected      | ✔    | ✔    | ✔    | ✖      |
| 默认     | 没有修饰符     | ✔    | ✔    | ✖    | ✖      |
| 私有     | private        | ✔    | ✖    | ✖    | ✖      |

### 注意事项

1. 修饰符可以用来修饰类中的属性，成员方法以及类
2. 只有默认的和 public 才能修饰类，并且遵循上述访问权限的特点
3. 成员方法的访问规则和属性完全一样

## 面向对象编程三大特征

面向对象编程有三大特征：封装、继承和多态

### 封装

封装（**encap**sulation）就是把抽象初的数据 [ 属性 ] 和对数据的操作 [ 方法 ] 封装在一起，数据被保护在内部，程序的其他部分只有通过被授权的操作 [ 方法 ] ，才能对数据进行操作

#### 好处

1. 隐藏实现细节
2. 可以对数据进行验证，保证安全合理

#### 实现步骤

1. 将属性进行私有化private【外部不能直接修改属性】

2. 提供一个公共的 (public)set 方法，用于对属性判断并赋值

   ```java
   public void SetXxx(类型 参数名) {	//Xxx 表示某个属性
       //加入数据验证的业务逻辑
       属性 = 参数名;
   }
   ```

3. 提供一个公共的 get 方法，用于获取属性的值

   ```java
   public XX getXxx() {	//权限判断
       return xx
   }
   ```

#### 快速入门

看一个小程序 [ com.hspedu.encap: Encapsulation01.java ] 不能随便查看人的年龄、工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认

年龄必须在 1 --- 120，年龄、工资不能直接查看，name 的长度在 2 --- 6 字符之间

```java
package com.hspedu.encap;

public class Encapsulation01 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);

        System.out.println(person.info());

        //如果用构造器指定属性
        Person person1 = new Person("smilt", 20, 50000);
        System.out.println("=====smith=====");
        System.out.println(person1.info());
    }
}

class Person {
    public String name;     //名字公开
    private int age;        //age 私有化
    private double salary;  //salary 私有化

    //构造器 - 无参
    public Person() {
    }
    //构造器 - 含参
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        //将 set 方法写在构造器中，这样仍可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }


    //set 和 get 的快捷键，Alt + Insert
    //自动生成后根据要求完善代码

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //对数据的校验，相当于增加了业务逻辑
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要(2-6)个字符，给默认名字");
            this.name = "张三";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，需要在(1-120)，给默认年龄18");
            this.age = 18;  //给一个默认年龄
        }
    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}
```

### 封装练习

[com.hspedu.encap: AccountTest.java] 和 [Account.java]

创建程序，在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性

1. Account 类要求具有属性：姓名（长度为2、3、4位）、余额（必须 >20）、密码（必须是六位），如果不满足，则给出提示信息，并给默认值
2. 通过 setXxx 的方法给 Account 的属性赋值
3. 在 AccountTest 中测试

[AccountTest.java]

```java
/**
 * @author GuYuqi
 * 2024/7/8 23:16
 * 创建程序，在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性
 *
 * 1. Account 类要求具有属性：姓名（长度为2、3、4位）、余额（必须 >20）、密码（必须是六位），如果不满足，则给出提示信息，并给默认值
 * 2. 通过 setXxx 的方法给 Account 的属性赋值
 * 3. 在 AccountTest 中测试
 */
package com.hspedu.encap;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account("Jack", 30, "060130");
        System.out.println(account.info());
    }
}

```

[Account.java]

```java
/**
 * @author GuYuqi
 * 2024/7/8 23:16
 * 创建程序，在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性
 *
 * 1. Account 类要求具有属性：姓名（长度为2、3、4位）、余额（必须 >20）、密码（必须是六位），如果不满足，则给出提示信息，并给默认值
 * 2. 通过 setXxx 的方法给 Account 的属性赋值
 * 3. 在 AccountTest 中测试
 */
package com.hspedu.encap;

public class Account {
    String name;
    double balance;
    String passwork;

    //构造器
    public Account() {
    }
    public Account(String name, double balance, String passwork) {
        this.name = name;
        this.balance = balance;
        this.passwork = passwork;
        setBalance(balance);
        setName(name);
        setPasswork(passwork);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //姓名 长度2、3、4位
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度输入错误，给默认姓名");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额过低，给默认余额");
            this.balance = 20;
        }
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        if(passwork.length() == 6) {
            this.passwork = passwork;
        } else {
            System.out.println("密码长度输入错误，给默认密码");
            this.passwork = "123456";
        }
    }

    public String info() {
        return name + " " + balance + " " + passwork;
    }
}
```

### 继承

继承可以解决代码复用，让我们的编程更加靠近人类思维，当多个类存在相同的属性和方法时，可以从这些类中抽象出父类，在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要通过 extends 来生命继承父类计科

#### 基本语法

```java
class 子类 extends 父类 {
    
}
```

1. 子类就会自动拥有父类定义的属性和方法
2. 父类又叫超类、基类
3. 子类又叫派生类

#### 快速入门

改进[Extends01.java]，使用继承的方法

改进前

```java
package com.hspedu.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角大王";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("============");
        Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
```

```java
package com.hspedu.extend_;
//小学生 -> 模拟小学生考试的情况
public class Pupil {
    public String name;
    public int age;
    private double score;   //成绩

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("小学生 " + name + " 正在考小学数学...");
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
```

```java
package com.hspedu.extend_;
//大学生类 -> 模拟大学生考试的简单情况
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() { //和 pupil 不一样
        System.out.println("大学生 " + name + " 正在考大学数学...");
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
```

改进后

```java
package com.hspedu.extend_.improve_;

import com.hspedu.extend_.Graduate;
import com.hspedu.extend_.Pupil;

public class Extends01 {

    public static void main(String[] args) {
        com.hspedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "银角大王~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(50);
        pupil.showInfo();

        System.out.println("============");
        com.hspedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
```

```java
package com.hspedu.extend_.improve_;

//父类，是 Pupil 和 Graduate 的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
```

```java
package com.hspedu.extend_.improve_;

public class Pupil extends Student{
    public void testing() {
        System.out.println("小学生 " + name + " 正在考小学数学...");
    }
}
```

```java
package com.hspedu.extend_.improve_;

public class Graduate extends Student{
    public void testing() {
        System.out.println("大学生 " + name + " 正在考大学数学...");
    }
}
```

#### 继承带来的便利

1. 代码的复用型提高了
2. 代码的扩展性和维护性提高了

#### 继承细节

[com.hspedu.extend_ 包: ExtendsDetail.java]

1. 子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问，但是私有属性不能在子类直接访问，要通过父类提供公共的方法去访问
2. 子类必须调用父类的构造器，完成父类的初始化
3. 当创建子类对象时，不管使用子类的哪个构造器，默认情况在总会去调用父类的无参构造器，如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不通过
4. 如果希望指定去调用父类的某个构造器，则显式的调用一下：super(参数列表)
5. super 在使用时，必须放在构造器第一行（super 只能在构造器中使用）
6. super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
7. Java 所有类都是 Object 类的子类，Object 是所有类的基类
8. 父类构造器的调用不限于直接父类，将一直往上追溯到 Object 类（顶级父类）
9. 子类最多只能继承一个父类（指直接继承），即 Java 中是单继承机制
10. 不能滥用继承，子类和父类直接必须满足 is-a 的逻辑关系

### 继承练习

1. [ExtendsExercise01.java]

```java
class A {
    A() {
        System.out.println("a");
    }
    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }
    B(String name) {
        System.out.println("b name");
    }
}
```

main 函数中，B b = new B(); 会输出什么？

```
a
b name
b
```

2. [ExtendsExercise02.java]

```java
class A {
    public A() {
        System.out.println("我是 A 类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是 B 类的无参构造");
    }
    public B(String name) {
        System.out.println(name + "我是 B 类的有参构造");
    }
}


class C extends B {
    public C() {
        this("hello");
        System.out.println("我是 C 类的无参构造");
    }
    public C(String name) {
        super("hahah");
        System.out.println("我是 C 类的有参构造");
    }
}
```

在 main 方法中：C c = new C(); 输出什么内容

```
我是 A 类
hahah我是 B 类的有参构造
我是 C 类的有参构造
我是 C 类的无参构造
```

3. [ExtendsExercise03.java]

编写 Computer 类，包含 CPU、内存、硬盘等属性，getDetails 方法用于返回Computer 的详细信息

编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】

编写 NotePad 子类，继承 Computer 类，添加特有属性【演示 color】

编写 Test 类，在 main 方法中创建 PC 和 NotePad 对象，分别给对象中特有的属性赋值，以及从 Computer 类继承的属性赋值，并使用方法并打印输出信息

```java
package com.hspedu.extend_.exercise.exercise03;

public class ExtendsExercise03 {

    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();

        NotePad notePad = new NotePad("intel", 16, 500, "OK");
        notePad.printInfo();
    }
}
```

```java
package com.hspedu.extend_.exercise.exercise03;

public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回 Computer 信息
    public String getDetails() {
        return "CPU: " + cpu + "\nMemory: " + memory + "\nDisk: " + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
```

```java
package com.hspedu.extend_.exercise.exercise03;

public class PC extends Computer{

    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC 信息: ");
        //调用父类的 getDetails 方法，得到相关属性信息
        System.out.println(getDetails() + "\nbrand = " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
```

```java
package com.hspedu.extend_.exercise.exercise03;

public class NotePad extends Computer{

    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void printInfo() {
        System.out.println("NotePad 信息: ");
        //调用父类的 getDetails 方法，得到相关属性信息
        System.out.println(getDetails() + "\ncolor = " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
```

## super 关键字

super 代表父类的引用，用于访问父类的属性、方法、构造器

### 基本语法

访问父类的属性，但不能访问父类的 private 属性

```java
super.属性名;
```

访问父类的方法，但不能访问父类的 private 方法

```java
super.方法名(参数列表);
```

访问父类的构造器

```java
super(参数列表);	//只放在构造器的第一句，只能出现一句
```

### 细节

1. 调用父类构造器的好处：分工明确，父类属性由父类初始化，子类的属性由子类初始化
2. 当子类中有和父类中成员重名时，为了访问父类的成员，必须通过 super。如果没有重名，使用 super、this、直接访问都是一样的效果
3. super 的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用 super 去访问爷爷类的成员；如果多个基类（上级类）中都有同名的成员，使用 super 访问遵循就近原则，即 A -> B -> C

### super 和 this 比较

| No.  | 区别点     | this                                                   | super                                    |
| ---- | ---------- | ------------------------------------------------------ | ---------------------------------------- |
| 1    | 访问属性   | 访问本类中的属性，如果本类没有此属性则从父类中继续查找 | 从父类开始查找属性                       |
| 2    | 调用方法   | 访问本类中的方法，如果本类没有此方法则从父类中继续查找 | 从父类开始查找方法                       |
| 3    | 访问构造器 | 调用本类的构造器，必须放在构造器的首行                 | 调用父类构造器，必须放在子类构造器的首行 |
| 4    | 特殊       | 表示当前对象                                           | 子类中访问父类对象                       |

## 方法重写 / 覆盖（override）



简单的说，方法覆盖（重写）就是子类有一个方法，和父类的某个方法的名称、返回类型、参数一样，那么我们就说子类的这个方法覆盖了父类的那个方法

[com.hspedu.override_ 包下 Override01.java]

```java
package com.hspedu.override_;

public class Override01 {

    public static void main(String[] args) {

        //方法重写
        Dog dog = new Dog();
        dog.cry();
    }

}
```

```java
package com.hspedu.override_;

public class Dog extends Animal{

    //因为 Dog 是 Animal 子类
    //Dog 的 cry 方法和 Animal 的 cry 定义类型一样
    //这时我们说 Dog 的 cry 方法重写了 Animal 的 cry 方法
    public void cry() {

        System.out.println("小狗汪汪叫");
    }
}
```

```java
package com.hspedu.override_;

public class Animal {

    public void cry() {
        System.out.println("动物叫唤");
    }
}
```

### 细节

方法重写也叫方法覆盖，需要满足下面的条件

1. 子类的方法的参数，方法名称，要和父类方法的参数，方法名称完全一样
2. 子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类
3. 子类方法不能缩小父类方法的访问权限

## 方法重写练习

1. 比较重载和重写

| 名称             | 发生范围 | 方法名   | 参数列表                       | 返回类型                                                   | 修饰符                             |
| ---------------- | -------- | -------- | ------------------------------ | ---------------------------------------------------------- | ---------------------------------- |
| 重载（Overload） | 本类     | 必须一样 | 类型、个数、顺序至少有一个不同 | 无要求                                                     | 无要求                             |
| 重写（Override） | 父子类   | 必须一样 | 必须一样                       | 子类重写的方法返回的类型和父类返回的类型一致，或者是其子类 | 子类方法不能缩小父类方法的访问范围 |

2. [OverrideExercise.java]

   1. 编写一个 Person 类，包括属性 / private(name、age)，构造器、方法 say（返回自我介绍的字符串）
   2. 编写一个 Student 类，继承 Person 类，增加 id、score属性 / private，以及构造器，定义 say 方法（返回自我介绍的信息）
   3. 在 main 中，分别创建 Person 和 Student 对象，调用 say 方法输出自我介绍

   ```java
   /**
    * @author GuYuqi
    * 2024/7/10 17:26
    * 1. 编写一个 Person 类，包括属性 / private(name、age)，构造器、方法 say（返回自我介绍的字符串）
    * 2. 编写一个 Student 类，继承 Person 类，增加 id、score属性 / private，以及构造器，定义 say 方法（返回自我介绍的信息）
    * 3. 在 main 中，分别创建 Person 和 Student 对象，调用 say 方法输出自我介绍
    */
   package com.hspedu.override_;
   
   public class OverrideExercise {
   
       public static void main(String[] args) {
   
           //new 对象
           Person person = new Person("Jack", 16);
           Student student = new Student("Jack", 16, 10000, 100);
   
           //调用say
           System.out.println(person.say());
           System.out.println(student.say());
       }
   }
   ```

   ```java
   /**
    * @author GuYuqi
    * 2024/7/10 17:26
    * 1. 编写一个 Person 类，包括属性 / private(name、age)，构造器、方法 say（返回自我介绍的字符串）
    * 2. 编写一个 Student 类，继承 Person 类，增加 id、score属性 / private，以及构造器，定义 say 方法（返回自我介绍的信息）
    * 3. 在 main 中，分别创建 Person 和 Student 对象，调用 say 方法输出自我介绍
    */
   package com.hspedu.override_;
   
   public class Student extends Person{
   
       //属性
       private int id;
       private int score;
   
       //构造器
       public Student(String name, int age, int id, int score) {
           super(name, age);
           this.id = id;
           this.score = score;
       }
   
       //方法 say
       public String say() {
           return super.say() + ", id: " + id + ", score: " + score;
       }
   
       public int getId() {
           return id;
       }
   
       public void setId(int id) {
           this.id = id;
       }
   
       public int getScore() {
           return score;
       }
   
       public void setScore(int score) {
           this.score = score;
       }
   }
   ```

   ```java
   /**
    * @author GuYuqi
    * 2024/7/10 17:26
    * 1. 编写一个 Person 类，包括属性 / private(name、age)，构造器、方法 say（返回自我介绍的字符串）
    * 2. 编写一个 Student 类，继承 Person 类，增加 id、score属性 / private，以及构造器，定义 say 方法（返回自我介绍的信息）
    * 3. 在 main 中，分别创建 Person 和 Student 对象，调用 say 方法输出自我介绍
    */
   package com.hspedu.override_;
   
   public class Person {
       //属性
       private String name;
       private int age;
   
       //构造器
       public Person(String name, int age) {
           this.name = name;
           this.age = age;
       }
   
       //方法 say
       public String say() {
           return "Hello " + name + " " + age + "!";
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   
       public int getAge() {
           return age;
       }
   
       public void setAge(int age) {
           this.age = age;
       }
   }
   ```

## 多态

请编写一个程序，Master 类 中有一个 feed（喂食） 方法，可以完成主人给动物喂食的信息[com.hspedu.poly_: Poly01.java]

程序中如果动物很多，食物很多，那 feed 方法就会很多，不利于管理维护，代码复用性不高，而且不利于代码维护，解决方案就是多态





方法和对象具有多种形态。是面向对象的第三大特征，多态是建立在封装和继承基础之上的

方法的多态：

[PloyMethod.java]

对象的多态（核心、重点、困难）：

[com.hspedu.poly_.objpoly: PolyObject.java]

1. 一个对象的编译类型和运行类型可以不一致

   ```java
   Animal animal = new Dog();
   /*
   animal 的编译类型是 Animal，运行类型是 Dog
   */
   ```

2. 编译类型在定义对象时，就确定了，不能改变

3. 运行类型是可以变化的

   ```java
   animal = new Cat();
   /*
   animal 的运行类型变成了 Cat，编译类型仍然是 Animal
   */
   ```

4. 编译类型看定义时 = 号的左边，运行类型看 = 号的右边



多态的前提：两个对象（类）存在继承关系

### 向上转型

1. 本质：父类的引用指向了子类的对象

2. 语法：父类类型 引用名 = new 子类类型();

3. 特点：编译类型看左边，运行类型看右边

   ​	可以调用父类中的所有成员（需遵守访问权限）

   ​	不能调用子类中特有成员

   ​	最终运行效果看子类的具体实现

### 向下转型

1. 语法： 子类类型 引用名 = (子类类型) 父类引用;
2. 只能强转父类的引用，不能强转父类的对象
3. 要求父类的引用必须指向的是当前目标类型的对象
4. 当向下转型后，可以调用子类类型中所有的成员

### 属性重写问题

属性没有重写之说！属性的值看编译类型

instanceOf 比较操作符，用于判断对象的运行类型是否为 XX 类型或 XX 类型的子类型

## 多态练习

1. 请说出下面每条语句，哪些是正确的，哪些是错误的，为什么？[PolyExercise01.java]

```java
package com.hspedu.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int in = 5;
        boolean b = (boolean)in;
        Object obj = "Hello";
        String objStr = (String)obj;
        System.out.println(objStr);

        Object objPri = new Integer(5);
        String str = (String)objPri;
        Integer str1 = (Integer)objPri;
    }
}
```

```java
package com.hspedu.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long) d;
        System.out.println(l);
        int in = 5;
        boolean b = (boolean)in;		//错 boolean --> int
        Object obj = "Hello";			//对，向上转型
        String objStr = (String)obj;	 //对，向下转型
        System.out.println(objStr);

        Object objPri = new Integer(5);	 //对，向上转型
        String str = (String)objPri;	 //错，指向 Integer 的父类引用转成 String
        Integer str1 = (Integer)objPri;	 //对，向下转型
    }
}
```

2. [PolyExercise02.java]

```java
package com.hspedu.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub0 s = new Sub0();
        System.out.println(s.count);
        s.display();
        Base0 b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}

class Base0 {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub0 extends Base0 {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
```

## 动态绑定机制

[DynamicBinding.java  com.hspedu.poly_.dynamic\_]

```java
package com.hspedu.poly_.dynamic_;

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return i + 20;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}

public class DynamicBinding {       //dynamic - 动态   binding - 绑定 / 结合
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
```

运行结果 40 30 毫无疑问

如果把 B 类中的 sum 方法注释掉

```java
package com.hspedu.poly_.dynamic_;

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;		//B 中的 getI
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}

public class DynamicBinding {       //dynamic - 动态   binding - 绑定 / 结合
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
```

运行结果为 30 30

如果把 B 类中的 sum1 方法也注释掉

```java
package com.hspedu.poly_.dynamic_;

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;		//B 中的 getI
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int getI() {
        return i;
    }
}

public class DynamicBinding {       //dynamic - 动态   binding - 绑定 / 结合
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
```

运行结果为 30 20



1. 当调用对象方法的时候，该方法和该对象的内存地址 / 运行类型绑定
2. 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用

## 多态数组

数组的定义类型为父类类型，里面保存的实际元素类型为子类类型

[com.hspedu.poly_.polyarr__ PloyArray.java]

应用实例：

​	现有一个继承结构如下：

![](D:\My_study\JAVA-Study\chapter08\屏幕截图 2024-08-02 210603.png)

​	要求创建一个 Person 对象、两个 Student 对象和两个 Teacher 对象，统一放在数组中，并调用 say 方法



应用实例升级：

​	如何调用子类特有的方法，比如 Teacher 有一个 teach，Student 有一个 study 怎么调用？

## 多态参数

方法定义的形参类型为父类类型，实参类型允许为子类类型

应用实例1：前面的主人喂动物

应用实例2：[com.hspedu.poly_.polyparameter__ 包 PloyParameter.java]

​	定义员工类 Employee，包含姓名和月工资[private]，以及计算年工资getAnnual的方法。普通员工和经理集成了员工，经理继承了奖金 bonus 属性和管理 manage 方法，普通员工类多了 work 方法，普通员工和经理类要求分别重写 getAnnual 方法

​	测试类中添加一个方法 showEmpAnnal(Employee e)，实现获取任何员工对象的年工资，并在 main 方法中调用该方法[e.getAnnual()]

​	测试类中添加一个方法，testWork，如果是普通员工，则调用 work 方法，如果是经理，则调用 manage 方法

## Object 类详解

### equals 

== 和 equals 的对比

[com.hspedu.object_ : Equals01.java]

==是一个运算符

1. ==：既可以判断基本类型，又可以判断引用类型
2. ==：如果判断引用类型，判断的是值是否相等。示例：int i = 10; double d = 10;
3. ==：如果判断引用类型，判断的是地址是否相等
4. equals：是 Object 类中的方法，只能判断引用类型
5. 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。比如 Integer，String

判断两个 Person 对象的内容是否相等，如果两个 Person 对象的各个属性值都一样，则返回 true，反之返回 false[EqualsExercise01.java]

```java
package com.hspedu.object_;

public class EqualsExercise01 {

    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');

        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //重写 Object 的 equals 方法
    public boolean equals(Object obj) {
        //判断如果比较的两个对象是同一个对象，则直接返回 true
        if(this == obj) {
            return true;
        }
        //类型判断
        if(obj instanceof Person) {

            Person p = (Person)obj;    //向下转型，因为需要 obj 的各个属性
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        //如果不是 Person，则直接返回 false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

写出输出结果[EqualsExercise02.java]

```java
package com.hspedu.object_;

public class EqualsExercise02 {

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "hspedu";

        Person1 p2 = new Person1();
        p2.name = "hspedu";

        System.out.println(p1 == p2);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.equals(p2));

        String s1 = new String("asdf");

        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}

class Person1 {
    public String name;
}
```

```
false
true
false
true
false
```

### hashCode

1. 提高具有哈希结构的容器的效率！
2. 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的！
3. 两个引用，如果指向的是不同对象，则哈希值是一样的
4. 哈希值主要根据地址号来的，不能完全将哈希值等价于地址
5. 后面在集合中，hashCode 如果需要的话，也会重写

### toString

默认返回：全类名 + @ + 哈希值的十六进制

子类往往重写 toString 方法，用于返回对象的属性信息

源码：

```java
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
```

当世界输出一个对象时，toString 方法会被默认调用

### finalize

1. 当对象被回收时，系统自动调用该对象的 finalize 方法。子类可以重写该方法
2. 什么时候被回收：当某个对象没有任何引用时，则 jvm 就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁对象，在销毁对象之前，会先调用 finalize 方法
3. 垃圾回收机制的调用，是由系统来决定，也可以通过 System,gc() 主动触发垃圾回收机制

## 断点调试（debug）

在开发中，新手程序员在查找错误时，这时老程序员会温馨提示，可以用断点调试，一步一步的看源码执行的过程，从而发现错误所在

在断点调试过程中，是运行状态，是以对象的运行类型来执行的



1. 断点调试是指在程序的某一行设置一个断点，调试时，程序运行到这一行就会停住，然后你可以一步一步往下调试，调试过程中可以看各个变量当前的值，出错的话，调试到出错的代码行即显示错误，停下。进行分析从而找到这个 Bug
2. 断点调试是程序员必须掌握的技能
3. 断点调试也能帮助我们查看 java 底层源代码的执行过程，提高程序员的 java 水平

### 快捷键

F7：跳入 - 跳入方法内

F8：跳过 - 逐行执行代码

shift + F8：跳出 - 跳出方法

F9：resume，执行到下一个断点

## 类变量

类变量也叫静态变量 / 静态属性，是该类的所有对象共享的变量，任何一个该类的对象去访问它时，取到的都是相同的值，同样任何一个该类的对象去修改它时，修改的也是同一个变量。

### 定义语法

```java
访问修饰符 static 数据类型 变量名; [推荐]
static 访问修饰符 数据类型 变量名;
```

### 访问语法

```java
类名.类变量名	[推荐]
对象名.类变量名
```

```java
package com.hspedu.static_;

public class ChildGame {

    public static void main(String[] args) {


        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;
        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;
        Child child3 = new Child("老鼠精");
        child3.join();
        child3.count++;

        //类变量可以通过类名访问
        System.out.println("共有" + Child.count + "个孩子加入了游戏");
    }

}

class Child {   //类
    private String name;
    //定义类变量
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }
    public void join() {
        System.out.println(name + "加入了游戏");
    }
}
```

### 类变量细节

1. 什么时候使用类变量

当我们需要让某个属性的所有对象都共享一个变量时，就可以考虑使用类变量（静态变量）。

2. 类变量与实例变量（普通属性）区别

类变量是该类的所有对象共享的，而实例变量是每个变量是每个对象独享的。

3. 加上 static 称为类变量或静态变量，否则称为实例变量 / 普通变量 / 非静态变量。
4. 类变量可以通过 类名.类变量名 或者 对象名.类变量名 来访问，但 Java 设计者推荐我们使用 类名.类变量名 的方式访问。前提是满足访问修饰符访问权限和范围。
5. 实例变量不能通过 类名.类变量名 来访问。
6. 类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只要类加载了，就可以使用类变量了。
7. 类变量的生命周期是随类的加载开始，随着类消亡而销毁。

## 类方法

### 定义语法

```java
访问修饰符 static 数据返回类型 方法名() { } [推荐]
static 访问修饰符 数据返回类型 方法名() { }
```

### 访问语法

```java
类名.类方法名 [推荐]
对象名.类方法名
```

```java
package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("Tom");
        tom.payFee(100);
        Stu mary = new Stu("Mary");
        mary.payFee(200);

        Stu.showFee();
    }
}

class Stu {
    private String name;
    //定义一个静态变量，来累加学生学费
    private static int fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee) {
        Stu.fee += fee; //累计到
    }
    public static void showFee() {
        System.out.println("学费为：" + Stu.fee);
    }
}
```

当方法中不涉及到任何对象相关的成员，则可以将方法设计成静态方法，提高开发效率。

在程序实际开发中，往往会将一些通用的方法，设计成静态方法，这样我们不需要创建对象就可以使用了，比如打印一维数组，冒泡排序，完成某个计算任务等...

### 类方法细节

1. 类方法和普通方法都是随着类的加载而加载，将结构信息存储在方法区：

类方法中无 this 的参数。

普通方法中隐含着 this 的参数。

2. 类方法可以通过类名调用，也可以通过对象名调用。
3. 普通方法和对象有关，需要通过对象名调用，比如对象名.方法名(参数)，不能通过类名调用。
4. 类方法中不允许使用和对象有关的关键字，比如 this 和 super。普通方法可以
5. 类方法（静态方法）中，只能访问 静态变量 或 静态方法。
6. 普通成员方法，既可以访问非静态成员，也可以访问静态成员。

## main

```java
public static void main(String[] args) { }
```

1. main 方法时虚拟机调用。
2. java 虚拟机需要调用类的 main() 方法，所以该方法的访问权限必须是 public。
3. java 虚拟机在执行 main() 方法时不必创建对象，所以该方法必须是 static。
4. 该方法接收 String 类型的数组参数，该数组中保存执行 java 命令时传递给所运行的类的参数。
5. java 执行的程序 参数1 参数2 参数3。
6. 在main()方法中，我们可以直接调用main 方法所在类的静态方法或静态属性。但是，不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的非静成员

## 代码块

代码块又称为初始化块，属于类中的成员[即 是类的一部分]，类似于方法，将逻辑语句封装在方法体中，通过 { } 包围起来。

但和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不用通过对象或类显式调用，而是加载类时，或创建对象时隐式调用。

### 基本语法

```java
[修饰符] {
    代码
};
```

注意：

1. 修饰符可选，要写的话，也只能写 static。
2. 代码块分为两类，使用 static 修饰的叫静态代码块，没有 static 修饰的，叫普通代码块。
3. 逻辑语句可以为任何逻辑语句（输入、输出、方法调用、循环、判断等）。
4. ;可以协商，也可以省略。

### 代码块的好处

1. 相当于另外一种形式的构造器（对构造器的补充机制），可以做初始化的操作。
2. 如果多个构造器中都有重复的语句，可以抽取到初始化块中，提高代码的重用性。

```java
package com.hspedu.codeblock_;

public class CodeBlock01 {
}

class Movie {
    private String name;
    private double price;
    private String director;

    //三个构造器 -> 重载
    public Movie(String name) {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
```

三个构造器构成重载，每个构造器中有重复的语句，造成冗余，这时，我们可以把相同的语句，放到一个代码块中

修改后

```java
package com.hspedu.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //三个构造器 -> 重载
    //代码块
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }
    public Movie(String name) {
        System.out.println("Movie(String name) 构造器被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
```

代码块调用的顺序优先于构造器

### 代码块细节

1. 代码块也叫静态代码块，作用是对类进行初始化，而且它随着类的加载而执行，并且只会执行一次。如果是普通代码块，每创建一个对象，就执行。
2. 类什么时候加载

① 创建对象实例时（new）

② 创建子类对象实例，父类也会被加载

③ 使用类的静态成员时（静态属性，静态方法）

3. 普通的代码块，在创建对象实例时，会被隐式的调用。被创建一次，就会调用一次。如果只是使用类的静态成员时，普通代码块并不会执行。

## 单例设计模式

该设计模式是静态方法和属性的经典使用场景

设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式。设计模式就像是经典的棋谱，不同的棋局，我们用不同的棋谱，免去我们自己思考和摸索

单例：单个的实例

所谓单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法

### 饿汉式

类被加载的时候就创建了对象，可能造成创建了对象，但是没有使用

步骤：

1. 构造器私有化 --> 防止直接 new
2. 类的内部创建对象（该对象是 static）
3. 提供一个公共的 static 方法，返回对象

```java
package com.hspedu.single_;

public class SingleTon01 {

    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");
        //通过方法获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}
//有一个类，GirlFriend，只能有一个对象
class GirlFriend{

    private String name;

    //如何保证我们只能创建一个 GirlFriend 对象
    //1. 将构造器私有化
    //2. 在类中创建该类对象
    private static GirlFriend gf = new GirlFriend("小红红");
    private GirlFriend(String name) {
        this.name = name;
    }

    //3. 对外提供一个公共的 static 方法，返回该对象
    public static GirlFriend getInstance(){
        return gf;
    }
    @Override
    public String toString() {
        return "GirlFriend{" + name + '}';
    }
}
```

### 懒汉式

使用了对象，才创建对象，避免了饿汉式可能造成资源浪费的弊端

步骤：

1. 构造器私有化
2. 定义一个 static 静态属性对象
3. 提供一个 public 的 static 方法
4. 懒汉式，只有当用户使用 getInstance 时，才返回 cat 对象，后面再次调用时，会返回上次创建的 cat 对象，从而保证了单例

```java
package com.hspedu.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);
    }
}

//希望在程序运行过程中，只能创建一个 Cat 对象，使用单例模式
class Cat {
    private String name;
    private static Cat cat;
    //1.私有化类的构造器
    //2.定义一个 static 静态属性对象
    private Cat(String name) {
        this.name = name;
    }
    //3.提供一个 public 的 static 方法，返回一个 Cat 对象
    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

### 饿汉式 VS 懒汉式

1. 二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创建了对象实例，而懒汉式是在使用时才创建。
2. 饿汉式不存在线程安全问题，懒汉式存在线程安全问题。
3. 饿汉式存在浪费资源的可能。如果一个程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不存在这个问题。
4. 在我们 javaSE 标准类中，java.lang.Runtime 就是经典的单例模式。

## Final

final 中文意思：最后的，最终的

final 可以修饰类、属性、方法和局部变量

在某些情况下，程序员可能有以下需求，就会使用到 final：

1. 当不希望类被继承时，可以用 final 修饰
2. 当不希望父类的某个方法被子类覆盖 / override 时，可以用 final 关键字修饰
3. 当不希望类的某个属性的值被修改，可以用 final 修饰
4. 当不希望某个局部变量被修改，可以使用 final 修饰

```java
package com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.TAX_RATE = 0.09;
    }
}

final class A {

}

//class B extends A {
//
//}

class C {
    public final void hi() {

    }
}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法");
//    }
}

class E {
    public final double TAX_RATE = 0.08;
}

class F {
    public void cry() {
        final double NUM = 0.01;
//        NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}
```

使用细节：

1. final 修饰的属性又叫常量，一般用 XX_XX_XX 来命名
2. final 修饰的属性在定义时，必须赋初值，并且以后不能再修改，赋值可以在如下位置之一【选择一个位置赋初值即可】：

① 定义时：如 public final double TAX_RATE = 0.08;

② 在构造器中

③ 在代码块中

3. 如果 final 修饰的属性是静态的，则初始化的位置只能是 ① 定义时 ② 在静态代码块 不能在构造器中赋值
4. final 类不能继承，但是可以实例化对象
5. 如果类不是 final 类，但是含有 final 方法，则该方法虽然不能重写，但是可以被继承。
6. 一般来说，如果一个类已经是 final 类了，就没有必要再将方法修饰成 final 方法。
7. final 不能修饰构造方法（即构造器）
8. final 和 static 往往搭配使用，效率更高，底层编译器做了优化处理
9. 包装类（Integer，Double，Float，Boolean 等都是 final），String 也是 final 类

## 抽象类

当父类的某些方法，需要声明，但是又不确定如何实现时，可以将其声明为抽象方法，那么这个类就是抽象类。

当父类的一些方法不能确定时，可以用 abstract 关键字来修饰该方法，这个方法就是抽象方法，用 abstract 来修饰该类就是抽象类

```java
package com.hspedu.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //父类方法不确定性的问题
//    public void eat() {
//        System.out.println("这是一个动物，但是不知道吃什么...");
//    }
    public abstract void eat();
}

```

### 抽象类的介绍

1. 用 abstract 关键字来修饰一个类时，这个类就叫抽象类

```java
访问修饰符 abstract 类名 {
}
```

2. 用 abstract 关键字来修饰一个方法时，这个方法就是抽象方法

```java
访问修饰符 abstract 返回类型 方法名(参数列表);	//没有方法体
```

3. 抽象类的价值更多作用是在于设计，是设计者设计好后，让子类继承并实现抽象类()
4. 抽象类，是考官比较爱问的知识点，在框架和设计模式使用较多

### 抽象类的细节

1. 抽象类不能被实例化（new）
2. 抽象类不一定要包含 abstract 方法。也就是说，抽象类可以没有 abstract 方法
3. 一旦类包含了 abstract 方法，则这个类必须声明为 abstract
4. abstract 只能修饰类和方法，不能修饰属性和其他的

```java
package com.hspedu.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能被实例化
//        new A();
    }
}
//抽象类不一定要包含 abstract 方法。也就是说，抽象类可以没有 abstract 方法，还可以有实现的方法
abstract class A {
    public void hi() {
        System.out.println("hi");
    }
}
//一旦类包含了 abstract 方法，则这个类必须声明为 abstract
///*abstract*/ class B {
//    public abstract void hi();
//}

//abstract 只能修饰类和方法，不能修饰属性和其他的
class C {
//    public abstract int n1 = 1;
}
```

5. 抽象类可以有任意成员【因为抽象类还是类】，比如：非抽象方法、构造器、静态属性等等
6. 抽象方法不能有主体
7. 如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为 abstract 类
8. 抽象方法不能使用 private、final 和 static 来修饰，因为这些关键字都是和重写违背的

```java
package com.hspedu.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
//抽象类可以有任意成员
abstract class D {
    public int n1 = 10;
    public static String name = "hsp";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
    }
}

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非它自己也声明为 abstract 类
abstract class E {
    public abstract void hi();
}
class F extends E {
    @Override
    public void hi() {//所谓实现就是要有方法体
    }
}
abstract class G extends E {

}

//抽象方法不能使用 private、final 和 static 来修饰，因为这些关键字都是和重写违背的
abstract class H {
//    private abstract void hi();
//    public final abstract void hello();
//    public static abstract void ok();
}
```

## 模板设计模式

模板设计模式是抽象类的最佳实践

需求：

1. 有多个类，完成不同的任务 job
2. 要求能够得到各自完成任务的时间

最佳实践：

设计一个抽象类（Template），能完成如下功能：

1. 编写方法 calculateTime()，可以计算某段代码的耗时时间
2. 编写抽象方法 job()
3. 编写一个子类 Sub，继承抽象类 Template，并实现 job 方法
4. 编写一个测试类 TestTemplate，看看是否好用

```java
package com.hspedu.abstract_;
public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();
        BB bb = new BB();
        bb.calculateTime();
    }
}
```

```java
package com.hspedu.abstract_;
abstract public class Template {
    public abstract void job(); //抽象方法
    public void calculateTime() {   //实现方法，调用 job
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务耗时：" + (end - start));
    }
}
```

```java
package com.hspedu.abstract_;
public class AA extends Template {
    //计算任务
    //1 + ... + 10000
    public void job() {
        int sum = 0;
        for (int i = 1; i <= 8000000; i++) {
            sum += i;
        }
    }
}
```

```java
package com.hspedu.abstract_;
public class BB extends Template {
    public void job() {
        int sum = 0;
        for (int i = 1; i <= 800000; i++) {
            sum *= i;
        }
    }
}
```

## 接口

### 基本介绍

接口就是给出一些没有实现的方法，封装到一起，到某个类需要使用的时候，在根据具体情况把这些方法写出来

语法：

```java
interface 接口名 {
    //属性
    //方法（1. 抽象方法 2. 默认实现方法 3. 静态方法）
}
class 类名 implements 接口 {
    自己属性;
    自己方法;
    必须实现的接口的抽象方法;
}
```

小结：

1. 在 jdk7.0 前，接口李的所有方法都没有方法体，即都是抽象方法
2. jdk8.0后，接口可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现

### 细节

1. 接口不能被实例化
2. 接口中所有的方法时 public 方法，接口中抽象方法，可以不用 abstract 修饰
3. 一个普通类实现接口，就必须将该接口的所有方法都实现
4. 抽象类实现接口，可以不用实现接口的方法
5. 一个类同时可以实现多个接口
6. 接口中的属性，只能是 final 的，而且是 public static final 修饰符。比如：int a = 1;实际上是 public static final int a = 1;（必须初始化）
7. 接口中属性的访问形式：接口名.属性名
8. 一个接口不能继承其它的类，但是可以继承别的接口
9. 接口的修饰符只能是 public 和默认，这点和类的修饰是一样的

### 接口 VS 继承

1. 接口和继承解决的问题不同

继承的价值主要在于：解决代码的复用性和可维护性

接口的价值主要在于：设计，设计好各种规范（方法），让其它类去实现这些方法

2. 接口比继承更加灵活

接口比继承更加灵活，继承是满足 is -a 的关系，而接口只需满足 like -a 的关系

3. 接口在一定程度上实现代码解耦[即：接口规范性 + 动态绑定]

```java
package com.hspedu.Interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("悟空");
        wukong.climing();
        wukong.swimming();
        wukong.flying();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climing() {
        System.out.println(name + "会爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}

class LittleMonkey extends Monkey implements Fishable, Birdable{
    public LittleMonkey(String name) {
        super(name);
    }
    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习，会游泳了");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习，会飞翔了");
    }

}
```

当子类继承了父类，就自动拥有了父类的功能

如果子类需要扩展功能，可以通过实现接口的方式扩展

可以理解为实现接口是对 java 单继承机制的一种补充

### 接口的多态特性

1. 多态参数

在 Usb 接口案例中，Usb usb，既可以接收手机对象，又可以接受相机对象，就体现了接口多态（接口引用可以指向实现了接口的类的对象）

2. 多态数组

给 Usb 数组中，存放 Phone 和相机对象，Phone类还有一个特有的方法 call()，请遍历 Usb 数组，如果是 Phone 对象，除了调用 Usb 接口定义的方法外，还需要调用 Phone 特有方法 call

```java
package com.hspedu.Interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组 -> 接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        //遍历
        for(int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if(usbs[i] instanceof Phone_) { //判断他的运行类型是 Phone_
                ((Phone_) usbs[i]).call();
            }
        }
    }
}

interface Usb {
    void work();
}
class Phone_ implements Usb {
    public void call() {
        System.out.println("打电话");
    }
    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}
```

3. 接口存在多态传递现象

```java
package com.hspedu.Interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向，实现了该接口的类的对象实例
        IG ig = new Teacher();
        //接口多态传递
        IH ih = new Teacher();
    }
}

interface IH {
    void hi();
}

interface IG extends IH{

}

class Teacher implements IG {
    @Override
    public void hi() {
        System.out.println("hi~");
    }
}
```

## 内部类

一个类的内部又完整的嵌套了一个类结构。被嵌套的类称为内部类（inner class），嵌套其它类的类称为外部类（outer class）。是我们类的第五大成员（类的五大成员：属性、方法、构造器、代码块、内部类），内部类最大的特点就是可以直接访问私有属性，并且可以提现类与类之间的包含关系

```java
class Outer {	//外部类
    class Inner {	//内部类
        
    }
}
class Other {	//外部其它类
    
}
```

 ```java
 package com.hspedu.innerclass_;
 
 public class InnerClass01 {     //外部其他类
     public static void main(String[] args) {
 
     }
 }
 
 class Outer {
     private int n1 = 100;   //属性
     public void m1() {     //方法
         System.out.println("Outer m1()");
     }
     {   //代码块
         System.out.println("Outer 类的构造代码块");
     }
     public Outer(int n1) {  //构造器
         this.n1 = n1;
     }
     class Inner {   //内部类
 
     }
 }
 ```

### 分类

定义在外部类局部位置上（比如方法内）：

1. 局部内部类（有类名）
2. 匿名内部类（没有类名，重点！！！！！）

定义在外部类的成员位置上：

1. 成员内部类（没用 static 修饰）
2. 静态内部类（使用 static 修饰）

### 局部内部类

说明：局部内部类是定义在外部类的局部位置，比如方法中，并且有类名

1. 可以直接访问外部类的所有成员，包括私有的。
2. 不能添加访问修饰符，因为它的地位就是一个局部变量。局部变量是不能用修饰符的。但是可以使用 final 修饰，因为局部变量也可以使用 final。
3. 作用域：仅仅在定义它的方法或代码块中。
4. 局部内部类 --- 访问 ---> 外部类的成员 [访问方式：直接访问]
5. 外部类 --- 访问 ---> 局部内部类的成员 [访问方式：创建对象，再访问（注意：必须在作用域内）]
6. 外部其他类 --- 不能访问 ---> 局部内部类（因为 局部内部类地位是一个局部变量）
7. 如果外部类和局部内部类的成员重名时，默认遵守就近原则，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问。

### 匿名内部类

说明：匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名（表面看没有类名）

1. 匿名内部类的基本语法

```java
new 类或接口(参数列表) {
    类体
};
```


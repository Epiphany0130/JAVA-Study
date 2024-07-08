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


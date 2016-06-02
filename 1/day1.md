# DAY01 #
---
### 1.学习DOS命令行
常见命令如下：

- cd  打开一个文件 ;dir  浏览该目录下所有文件
- cd..  返回上一级目录
- 直接d:或者e:或者f:  再按回车，直接进入该根目录
- cd\  返回该根目录
- md  创建文件夹(目录)  rd  删除文件夹(目录)
- del 删除文件  
- **注意：想要RD一个文件夹，必须得先删除该目录下所有的文件**
- **WINDOWS下，目录与目录之间使用 \ (反斜杠)**

###2.java的跨平台性、环境配置
- 在不同操作系统下面，有不同的虚拟机**（JVM）**来解析。因此，一份java代码，可以在不同的平台运行。实现了跨平台。

- JDK与JRE的区别。JDK（java development kit）开发工具套件，并且包括JRE。JRE（java runtime environment），运行java需要的环境。安装完JDK以后，就不需要安装JRE了。

- java环境的配置。在系统环境变量中Path路径下添加：Java\jdk1.8.0_20\bin;
- **高级配置技巧:** 先添加:JAVA\_HOME=jdk1.8,然后Path设置%JAVA\_HOME%\bin; 这是一种动态加载方式。方便于修改了文件和目录的情况。

- **动态配置环境变量:** 在CMD窗口中 set path=example 即可，多次添加环境变量，保存上一次环境变量，可以这样写 set path=another_path;%path% 即可（注意，这里所有的path最后面不加分号，加分号代表包括当前目录，而我们不推荐这么做，我们需要指定特殊的位置，因此最后不要加分号）。另外，在CMD中动态配置完以后，通过start命令重新开一个CMD窗口，设置的PATH还是存在的。除非在WIN+R重新开一个，这样PATH又是原来的设置。
清空path，可以这么写”set path=“ 即可

- **classpath的用法。**设置成如下：set classpath= 表示清空；set classpath=.表示当前目录；set classpath=c:\表示C盘根目录；set classpath=c:\;表示C盘根目录和当前目录。java 命令执行，虚拟机会优先到classpath中去寻找。找不到就报错。而path路径则不同、会优先到当前目录下寻找，找不到再到path路径下寻找。

###3. Hello World程序
1. 通过 javac test.java 编译java源文件，产生字节码文件（test.class）
2. 通过java test 执行该文件（调用虚拟机，执行.class文件）
3. **注意：** 如果该类是public class test,那么java源程序必须得与类名形同。如果该类没有public修饰符，那么java源程序的文件名可以随便写，但是通过java 执行的时候，必须执行.class的文件 
4. 类名首字母大写。AxxxBxxxCxxx。
5. java中所有的关键字都是小写的。

###4.模板与注释
- **javadoc**命令，程序记得写注释!


		/**
		*@author jack
		*
		*@version v1.0
		*/
- 注释

		/*
		需求：--------
		
		思路：--------
		
		步骤：--------
		
		*/

	**注意：注释里面不要嵌套注释，会产生新问题。**
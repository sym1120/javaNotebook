/**
	内部类的应用1；内部类在成员位置上时：
	- 1.内部类可以被私有化，内部类能直接访问外部类中的成员，因为省略了Outer.this.
	- 2.内部类如果违背private 修饰，可以在主函数被新建对象。 Outer.Inner in = new Outer().new Inner();
	- 3.外部类要访问内部类，必须得建立内部类对象。
	- 6.内部类中如果存在static关键字。那么内部类必须得是静态内部类。
	- 7.外部类中的静态方法访问内部类时，该内部类必须得是静态的。因为此时对象还没有存在。
*/

public class InnerDemo1{
	public static void main(String[] args){
		/*
		Outer.Inner in = new Outer().new Inner();
		in.fun2();
		*/
		/*
		Outer out = new Outer();
		out.fun();
		*/
		//new Outer.Inner2().fun2(); //访问静态内部类中的非静态方法
		//Outer.Inner2.fun3();//访问静态内部类中的静态方法
		
		Outer out = new Outer();
		out.fun();
	}
}

class Outer{
	int x = 3;
	public void fun(){
		Inner in = new Inner();
		in.fun2();
		Inner2.fun3();
	}
	
	public static void fun2(){
		new Inner2().fun2();
	}
	class Inner{
		int x = 4;
		public void fun2(){
			int x = 5;
			//System.out.println("inner:" + x );//输出5
			//System.out.println("inner:" + this.x );//输出4
			System.out.println("inner:" + Outer.this.x );//输出3
		}
	}
	static class Inner2{
		static int x = 5;
		public void fun2(){
			
			System.out.println("inner:" + x );//输出5
		}
		public static void fun3(){
			
			System.out.println("inner:" + x );//输出5
		}
	}
}
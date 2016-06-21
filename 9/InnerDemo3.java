/**
	匿名内部类：
	
	- 1.匿名内部类就是内部类的简写形式
	- 2.定义匿名内部类的前提：内部类必须继承一个类或者实现接口。
*/
public class InnerDemo3{
	public static void main(String[] args){
		new Outer().fun();
	}
}
abstract class AbsDemo{
	public static final int GG = 8;
	public abstract void show();
}
class Outer{
	int x = 3;
	
	public void fun(){	
		final int y = 90;
		/*
		class Inner extends AbsDemo{
			int x = 5;
			public void fun2(){
				
				System.out.println("inner:" + y );//90
			}
			
			public void show(){
				System.out.println("inner:" + GG );
			}
		}
		new Inner().show();
		*/
		
		//匿名内部类，是一个子类对象，就是上面方法的简写
		//多态。
		AbsDemo Abs = new AbsDemo(){
			int y = 90;
			public void show(){
				System.out.println("inner:" + GG );
			}
			
			public void fun(){
				
				System.out.println("inner:" + y );//90
			}
			
		};
		Abs.show();
		//Abs.fun();
	}
	
}
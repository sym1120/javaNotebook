/**
	内部类在局部位置时：访问局部时，只能访问final类型的数据。一定要加上final
	必须加上final关键字。但JDK8 加不加，无所谓了。
*/

public class InnerDemo2{
	public static void main(String[] args){
		new Outer().fun(12);
	}
}
class Outer{
	int x = 3;
	
	public void fun(final int a ){	
		final int y = 90;
		class Inner{
			int x = 5;
			public void fun2(){
				//System.out.println("inner:" + Outer.this.x );//3
				System.out.println("inner:" + y );//90
			}
		}
		
		new Inner().fun2();
	}
	
}

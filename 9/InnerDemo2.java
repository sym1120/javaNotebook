/**
	�ڲ����ھֲ�λ��ʱ�����ʾֲ�ʱ��ֻ�ܷ���final���͵����ݡ�һ��Ҫ����final
	�������final�ؼ��֡���JDK8 �Ӳ��ӣ�����ν�ˡ�
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

/**
	�����ڲ��ࣺ
	
	- 1.�����ڲ�������ڲ���ļ�д��ʽ
	- 2.���������ڲ����ǰ�᣺�ڲ������̳�һ�������ʵ�ֽӿڡ�
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
		
		//�����ڲ��࣬��һ��������󣬾������淽���ļ�д
		//��̬��
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
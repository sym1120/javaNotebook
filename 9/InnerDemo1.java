/**
	�ڲ����Ӧ��1���ڲ����ڳ�Աλ����ʱ��
	- 1.�ڲ�����Ա�˽�л����ڲ�����ֱ�ӷ����ⲿ���еĳ�Ա����Ϊʡ����Outer.this.
	- 2.�ڲ������Υ��private ���Σ����������������½����� Outer.Inner in = new Outer().new Inner();
	- 3.�ⲿ��Ҫ�����ڲ��࣬����ý����ڲ������
	- 6.�ڲ������������static�ؼ��֡���ô�ڲ��������Ǿ�̬�ڲ��ࡣ
	- 7.�ⲿ���еľ�̬���������ڲ���ʱ�����ڲ��������Ǿ�̬�ġ���Ϊ��ʱ����û�д��ڡ�
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
		//new Outer.Inner2().fun2(); //���ʾ�̬�ڲ����еķǾ�̬����
		//Outer.Inner2.fun3();//���ʾ�̬�ڲ����еľ�̬����
		
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
			//System.out.println("inner:" + x );//���5
			//System.out.println("inner:" + this.x );//���4
			System.out.println("inner:" + Outer.this.x );//���3
		}
	}
	static class Inner2{
		static int x = 5;
		public void fun2(){
			
			System.out.println("inner:" + x );//���5
		}
		public static void fun3(){
			
			System.out.println("inner:" + x );//���5
		}
	}
}
/**
	单例设计模式。分为三部曲来创建：
	1、构造函数私有化
	2、本类中创建唯一的对象
	3、将该对象返回
*/
public class SingleDemo{
	public static void main(String [] args){
		Single2 s = Single2.getInstance();
		Single2 s2 = Single2.getInstance();
		System.out.println(s);
		System.out.println(s2);
		
	}
	
}
//饿汉式，Single一加载，就进内存
class Single{
	private Single(){}
	
	private static Single s = new Single();
	
	public static Single getInstance(){
		return s;
	}
	
}

//懒汉式。但是多线程时，会出问题。加入同步即可。推荐用饿汉式。
class Single2{
	private Single2(){}
	
	private static Single2 s = null;
	
	//这样做效率低，每次都要判断锁
	public static synchronized Single2 getInstance2(){
		if(s == null)
			s = new Single2();
		return s;
	}
	
	//优化如下,减少了判断同步锁的次数
	public static Single2 getInstance(){
		if(s == null){
			synchronized(Single2.class){ 
				if(s == null)
					s = new Single2();
			}
		}
		return s;
	}
	
}











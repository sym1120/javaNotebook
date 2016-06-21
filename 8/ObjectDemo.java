/**
	Object 是所有的类的父类。
	Object()构造函数中，没有super()语句。
	Object中的equals()方法用来判断两个对象是否相同,通过地址值来比较
*/
class Demo{
	private int num;
	Demo(int num){
		this.num  = num;
	}
	public boolean equals(Object o){
		/*if(o instanceof Demo){
			Demo d = (Demo)o;
			return this.num == d.num;
		}
		else{
			return false;
		}*/
		
		if (!(o instanceof Demo))
			return false;
		Demo d = (Demo)o;
			return this.num == d.num;
	}
}
public class ObjectDemo{
		public static void main(String[] args){
			Demo d1 = new Demo(21);
			Demo d2 = new Demo(21);
			System.out.println(d1.equals(d2));
		}
	
}










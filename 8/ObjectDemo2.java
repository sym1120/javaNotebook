/**
	toString()的介绍。返回为：类+@+hashCode()的16进制
	getClass方法的介绍。
*/
class Demo{
	
}
public class ObjectDemo2{
	public static void main(String [] args){
		Demo d = new Demo();
		Class c = d.getClass();
		System.out.println(c.getName());//9个,因为继承Object
		System.out.println(c.getMethods().length);//Demo
		System.out.println(Integer.toHexString(d.hashCode()));//15db9742
		System.out.println(d.toString());//Demo@15db9742
		
		
	}
}
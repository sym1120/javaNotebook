/**
	toString()�Ľ��ܡ�����Ϊ����+@+hashCode()��16����
	getClass�����Ľ��ܡ�
*/
class Demo{
	
}
public class ObjectDemo2{
	public static void main(String [] args){
		Demo d = new Demo();
		Class c = d.getClass();
		System.out.println(c.getName());//9��,��Ϊ�̳�Object
		System.out.println(c.getMethods().length);//Demo
		System.out.println(Integer.toHexString(d.hashCode()));//15db9742
		System.out.println(d.toString());//Demo@15db9742
		
		
	}
}
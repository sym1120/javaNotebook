/*
	private表示一个类的私有属性,只能在本类中访问到,在其他的类中无法进行访问。
	private的访问控制是针对类来检查的，而非对象。
	编译只检查语法错误、编译的时候还没有建立对象
*/
public class TestPrivate{
	public static void main(String[] args){
		Person p1 = new Person(10);
		Person p2 = new Person(20);
		System.out.println(p2.equalAge(p1));
	}
}
class Person{
	private int age;
	Person(int age){
		this.age = age;
	}
	public boolean equalAge(Person p){
		return this.age == p.age;
	}
}
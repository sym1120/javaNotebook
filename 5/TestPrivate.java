/*
	private��ʾһ�����˽������,ֻ���ڱ����з��ʵ�,�������������޷����з��ʡ�
	private�ķ��ʿ���������������ģ����Ƕ���
	����ֻ����﷨���󡢱����ʱ��û�н�������
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
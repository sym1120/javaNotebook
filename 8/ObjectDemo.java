/**
	Object �����е���ĸ��ࡣ
	Object()���캯���У�û��super()��䡣
	Object�е�equals()���������ж����������Ƿ���ͬ
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










/**
	�������ģʽ����Ϊ��������������
	1�����캯��˽�л�
	2�������д���Ψһ�Ķ���
	3�����ö��󷵻�
*/
public class SingleDemo{
	public static void main(String [] args){
		Single2 s = Single2.getInstance();
		Single2 s2 = Single2.getInstance();
		System.out.println(s);
		System.out.println(s2);
		
	}
	
}
//����ʽ��Singleһ���أ��ͽ��ڴ�
class Single{
	private Single(){}
	
	private static Single s = new Single();
	
	public static Single getInstance(){
		return s;
	}
	
}

//����ʽ�����Ƕ��߳�ʱ��������⡣����ͬ�����ɡ��Ƽ��ö���ʽ��
class Single2{
	private Single2(){}
	
	private static Single2 s = null;
	
	//������Ч�ʵͣ�ÿ�ζ�Ҫ�ж���
	public static synchronized Single2 getInstance2(){
		if(s == null)
			s = new Single2();
		return s;
	}
	
	//�Ż�����,�������ж�ͬ�����Ĵ���
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











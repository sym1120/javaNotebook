/**
	����һ���࣬���ڻ�ȡĳ�γ��������ʱ�䡣
	ģ�����ģʽ����һ�����У�һ���ִ�����ȷ���ģ���һ���ִ����ǲ�ȷ���ġ�
	��ȷ���Ĵ����У����ò�ȷ����һ���֡��Ѳ�ȷ����һ���ֱ�¶��ȥ��ȷ����
	����¶�������ģ�����ģʽ��
*/

/**
	��ȡʱ����
*/
abstract class GetTime{
	private long start;
	private long end;
	
	public final void getTime(){
		start = System.currentTimeMillis();
		
		runCode();
		
		end = System.currentTimeMillis();
		
		System.out.println("run:"+(end-start)+"mills");
	}
	
	public abstract void runCode();
	
}
class SubTime extends GetTime{
		public void runCode(){
			for(int i = 0; i <1000;i++){
				System.out.print(i);
			}
			System.out.println();
		}
}
public class TemplateDemo{
	public static void main(String[] args){
		SubTime st = new SubTime();
		st.getTime();
	}
}








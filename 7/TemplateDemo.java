/**
	定义一个类，用于获取某段程序的运行时间。
	模板设计模式：在一个类中，一部分代码是确定的，另一部分代码是不确定的。
	在确定的代码中，调用不确定的一部分。把不确定的一部分暴露出去，确定的
	不暴露。这就是模板设计模式。
*/

/**
	获取时间类
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








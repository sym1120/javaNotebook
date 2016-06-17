/**
	接口与多态的例子。
	主板ManiBoard，接口PCI，声卡与网卡。
	PCI接口，是一种规则，同时对于网卡声卡来说又扩展了功能。
*/
class MainBoard{
	public void run(){
		System.out.println("mainboard run");
	}
	//接口型引用指向子类对象，也是多态
	public void runPCI(PCI p){
		p.run();
		p.close();
	}
}
interface PCI{
	public abstract void run();
	public abstract void close();
}

class NetCard implements PCI{
	public void run(){
		System.out.println("NetCard run");
	}
	public void close(){
		System.out.println("NetCard close");
	}
	
}

class SoundCard implements PCI{
	public void run(){
		System.out.println("SoundCard run");
	}
	public void close(){
		System.out.println("SoundCard close");
	}
	
}

public class DuotaiDemo{
	public static void main(String[] args){
		MainBoard mb = new MainBoard();
		mb.run();
		mb.runPCI(new SoundCard());
		mb.runPCI(new NetCard());
	}
	
}










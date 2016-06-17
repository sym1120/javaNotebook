/**
	�ӿ����̬�����ӡ�
	����ManiBoard���ӿ�PCI��������������
	PCI�ӿڣ���һ�ֹ���ͬʱ��������������˵����չ�˹��ܡ�
*/
class MainBoard{
	public void run(){
		System.out.println("mainboard run");
	}
	//�ӿ�������ָ���������Ҳ�Ƕ�̬
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










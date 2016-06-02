/*
����ת��demo����һ���Ż����룬ȥ���ظ�����
*/

public class ArrayTest4{
	public static void main(String[] args){
		toBinary(0);
		toOctal(60);
		toHex(-60);
		
	}
	
	/*
		ʮ����ת���ɶ�����
	*/
	private static void toBinary(int num){
		trans(num,1,1);
	}
	
	/*
		ʮ����ת���ɰ˽���
	*/
	private static void toOctal(int num){
		trans(num,7,3);
	}
	
	
	/*
		ʮ����ת����ʮ������
	*/
	private static void toHex(int num){
		trans(num,15,4);
	}
	
	
	private static void trans(int num,int base,int offset){
		if(num == 0){
			System.out.println(0);
			return;
		}
		
		char[] chs = {	'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F'};
		char[] arr = new char[32];
		int count = arr.length;
		
		
		while(num!=0){
			arr[--count] = chs[num & base];
			num = num >>> offset;
		}
		
		//��ӡ
		for(int i = count;i< arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
/*
	����ת��demo
*/
public class ArrayTest3{
	public static void main(String[] args){
		
		//toHex(60);
		toBinary(-6);
						
		
	}
	
	//��ʮ����ת����ʮ�����ƣ�һ��int�ͣ�4���ֽڣ�32λ
	private static void toHex(int num){
		//��������ʮ�����Ʊ�
		char[] chs = {	'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F'};
		char[] hex = new char[8];
		int count = hex.length;
		
		//���������㣬��ȡ�����λ�����ƣ���������λ��
		while(num!=0){
			hex[--count] = chs[num & 15];
			num = num >>> 4;
		}
		
		//��ӡ������
		for(int i = count;i< hex.length;i++){
			System.out.print(hex[i]);
		}
	}
	
	//��ʮ����ת���ɶ�����
	private static void toBinary(int num){
		char[] chs = new char[]{'0','1'};
		
		char[] arr = new char[32];
		int count = arr.length;
		
		while(num !=0){
			arr[--count] = chs[num & 1];
			num = num>>>1;
		}
		
		//��ӡ������
		for(int i = count;i< arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
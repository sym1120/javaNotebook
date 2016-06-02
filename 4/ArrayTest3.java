/*
	进制转换demo
*/
public class ArrayTest3{
	public static void main(String[] args){
		
		//toHex(60);
		toBinary(-6);
						
		
	}
	
	//将十进制转换成十六进制，一个int型，4个字节，32位
	private static void toHex(int num){
		//用来查找十六进制表
		char[] chs = {	'0','1','2','3',
						'4','5','6','7',
						'8','9','A','B',
						'C','D','E','F'};
		char[] hex = new char[8];
		int count = hex.length;
		
		//进行与运算，获取最后四位二进制，在右移四位。
		while(num!=0){
			hex[--count] = chs[num & 15];
			num = num >>> 4;
		}
		
		//打印二进制
		for(int i = count;i< hex.length;i++){
			System.out.print(hex[i]);
		}
	}
	
	//将十进制转换成二进制
	private static void toBinary(int num){
		char[] chs = new char[]{'0','1'};
		
		char[] arr = new char[32];
		int count = arr.length;
		
		while(num !=0){
			arr[--count] = chs[num & 1];
			num = num>>>1;
		}
		
		//打印二进制
		for(int i = count;i< arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
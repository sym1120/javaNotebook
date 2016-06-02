//将十进制转换成16进制Demo
public class BinaryToHex{
	public static void main(String[] args){
		int a = 999,temp,i=0;
		String[] arr = new String[10];
		//先将a与15进行与运算，取出最后四位的二进制，
		//然后a右移四位，重复计算与15的与运算，直到与运算的结果为0
		while((temp = (a & 15))!=0){
			if(temp >= 10)
				//将数字转换成16进制
				arr[i++] = (char)((temp-10)+'A')+"";
				//System.out.println((char)((temp-10)+'A'));
			else
				arr[i++] =temp+"";
				//System.out.println(temp);
			//三个箭头的右移，最高位全部补0，要不然>>最高位补1，循环结束不了
			a = a >>> 4;
		}
		//打印16进制结果
		for(int j = (i-1);j>=0;j--)
			System.out.print(arr[j]+"");
	}
}
/*
A  B  C  D  E  F
65 66 67 68 69 70
10 11 12 13 14 15
*/
//��ʮ����ת����16����Demo
public class BinaryToHex{
	public static void main(String[] args){
		int a = 999,temp,i=0;
		String[] arr = new String[10];
		//�Ƚ�a��15���������㣬ȡ�������λ�Ķ����ƣ�
		//Ȼ��a������λ���ظ�������15�������㣬ֱ��������Ľ��Ϊ0
		while((temp = (a & 15))!=0){
			if(temp >= 10)
				//������ת����16����
				arr[i++] = (char)((temp-10)+'A')+"";
				//System.out.println((char)((temp-10)+'A'));
			else
				arr[i++] =temp+"";
				//System.out.println(temp);
			//������ͷ�����ƣ����λȫ����0��Ҫ��Ȼ>>���λ��1��ѭ����������
			a = a >>> 4;
		}
		//��ӡ16���ƽ��
		for(int j = (i-1);j>=0;j--)
			System.out.print(arr[j]+"");
	}
}
/*
A  B  C  D  E  F
65 66 67 68 69 70
10 11 12 13 14 15
*/
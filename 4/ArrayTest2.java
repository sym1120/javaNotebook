/*
	�۰����demo��ǰ������Ϊ����ġ�
	���죺��һ�������������У���ȡ����λ��
*/
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr = {2,12,16,22,31,38,45,77};
		int index = insert(arr,18);
		System.out.println("index="+index);
	}
	//�۰�����㷨1,���ز���Ԫ���������е��±꣬û���򷵻�-1
	private static int halfSearch_1(int[] arr,int key) {
		int min = 0, max = arr.length-1,mid;
		mid =(min+max)/2;
		while(arr[mid]!=key){
			if(key > arr[mid])
				min = mid +1;
			else if(key < arr[mid])
				max = mid - 1;
			mid = (min+max)/2;
			if(max < min)
				return -1;
		}
		return mid;
	
	}
	
	//�۰�����㷨2,���ز���Ԫ���������е��±꣬û���򷵻�-1
	private static int halfSearch_2(int[] arr,int key) {
		int min = 0, max = arr.length-1,mid;
		mid =(min+max)/2;
		while(min <= max){
			if(key > arr[mid])
				min = mid +1;
			else if(key < arr[mid])
				max = mid - 1;
			else
				return mid;
			mid = (min+max)/2;
		}
		return -1;
	
	}
	
	//�۰���ҵ����죬��һ����������Ĳ���������,min��ֵ���ǲ�����±�λ
	private static int insert(int[] arr,int key) {
		int min = 0, max = arr.length-1,mid;
		mid =(min+max)>>1;
		while(min <= max){
			if(key > arr[mid])
				min = mid +1;
			else if(key < arr[mid])
				max = mid - 1;
			else
				return mid;
			mid = (min+max)>>1;
		}
		return min;
	
	}
	
	
}
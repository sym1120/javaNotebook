/*
	��������demo
*/
public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[] {34,2,6,12,1,43,22};
		//sort_1(arr);
		sort_2(arr);
		sop(arr);
	}
	//ѡ�����򣬵�һ�����κͺ���ıȽϣ�Ч�ʱȽϵ�
	private static void sort_1(int[] a) {
		int temp;
		for(int i = 0 ; i < a.length - 1; i++) {
			for(int j = i + 1 ; j < a.length; j++) {
				if(a[i] > a[j]) {
					/*temp = a[i];
					a[i] = a[j];
					a[j] = temp;*/
					swap(i,j,a);
				}
			}
		}
	}
	//ð�����������������бȽϣ����򣬴�ķŵ�����ڶ��ڴ��н��н�����Ч�ʵ�
	private static void sort_2(int[] a){
		int temp;
		for(int i = 0; i < a.length - 1;i++){
			for(int j = 0;j < a.length - i -1;j++){
				if(a[j]>a[j+1]){
					/*temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;*/
					swap(j,j+1,a);
				}
					
			}
		}
	}
	
	
	//��������λ��
	private static void swap(int a,int b,int[] arr){
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;	
	}
	

	//��ӡ����
	private static void sop(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			if(i != arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.print(arr[i]);
		}
	}
}
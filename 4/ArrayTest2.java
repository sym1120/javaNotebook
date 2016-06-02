/*
	折半查找demo，前提数组为有序的。
	延伸：将一个数插入数组中，获取插入位置
*/
public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr = {2,12,16,22,31,38,45,77};
		int index = insert(arr,18);
		System.out.println("index="+index);
	}
	//折半查找算法1,返回查找元素在数组中的下标，没有则返回-1
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
	
	//折半查找算法2,返回查找元素在数组中的下标，没有则返回-1
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
	
	//折半查找的延伸，将一个数字有序的插入数组中,min的值就是插入的下标位
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
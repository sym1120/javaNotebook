# DAY04
----------
## 1.数组常见问题 ##
- 例如：int a = new a[3]; sop(a[3]); 在编译时是不报错的，编译时，还没有新建数组实体。运行时才会报错。报arrayindexofboundsException.还有种情况，int a = new a[3]; a = null ; sop(a[2]); 这个编译时也不出错，运行会出错误。报NullpoitnException 
- 数组默认初始化值为0 ； 数组有一个属性 ，叫做length，arr.length就可以获取该数组的长度。直接打印数组arr（int数组- ）,会出现[I@de56ed 代表数组、int型，数组地址（哈希算法算出来的）
- 数组获取最值问题。

		//获取最大值
		int max = 0;//此处max为角标。这样更好。
		for(int i =1;i < arr.length;i++){
			if(arr[max]<arr[i])
					max = i;
		return max;
		}

- 数组排序问题，选择排序、冒泡排序。效率比较低。堆内存中置换元素，消耗资源比较大。可以进行优化。记录下标元素，最后一次进行交换。
	- java提供排序方法。Arrays.sort(arr);

- 二维数组

		int [][] a //二维数组写法
		int [] a[] //也能这么写
		int []a,y[] //代表 a[] 和 y[][]

- 二维数组在内存中的情况

		 int [][] a = new int[3][]; //可以这么写
		 sop(a[0]) //打印出来的是null
		 在内存中，具体参考图片
		
	
		
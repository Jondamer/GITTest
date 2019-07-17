package com.offerCollections;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 
 * @author zhengzhentao
 *
 */
public class InversePairsSolution {

	public InversePairsSolution() {
		// TODO Auto-generated constructor stub
	}

	public static  int InversePairs(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					sum++;
				}
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		测试函数
		int[] array ={1,2,3,4,5,6,7,0};
		int sum=InversePairs(array);
		System.out.println("逆序对的数目是:"+sum);
		
		
	}

}

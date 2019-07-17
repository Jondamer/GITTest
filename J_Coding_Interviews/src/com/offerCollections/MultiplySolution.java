package com.offerCollections;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A
 * [i+1]*...*A[n-1]。不能使用除法。
 * 
 * @author zhengzhentao
 *
 */
public class MultiplySolution {

	public MultiplySolution() {
		// TODO Auto-generated constructor stub
	}

	public static int[] multiply(int[] A) {
		int len = A.length;
		int forword[] = new int[len];
		int backword[] = new int[len];
		int B[] = new int[len];
		forword[0] = 1;
		backword[0] = 1;
		for (int i = 1; i < len; i++) {
			forword[i] = A[i - 1] * forword[i - 1];
			backword[i] = A[len - i] * backword[i - 1];
			System.out.println("我是第一个for循环啊");
		}
		
		for (int i : backword) {
			System.out.println("backword数组中的元素："+i);
		}
		
		for (int i = 0; i < len; i++) {
			B[i] = forword[i] * backword[len - i - 1];
			System.out.println("我是第二个for循环啊");
		}
		return B;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 4, 5, 8 };
		int[] B = multiply(A);
		for (int i : B) {
			System.out.print(i + "\t");
		}

	}

}

package com.offerCollections;
/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @author zhengzhentao
 *
 */
public class Sum_Solution {

	public Sum_Solution() {
		// TODO Auto-generated constructor stub
	}
	
	public static int sum_Solution(int n) {
        return (int)(Math.pow(n, 2) + n) >> 1;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       测试方法	
		int sum =sum_Solution(1000);
		System.out.println(sum);
	}

}

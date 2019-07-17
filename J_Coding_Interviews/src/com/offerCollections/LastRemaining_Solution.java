package com.offerCollections;


/**
 * 问题描述：0,1,2，....n-1这n个数字，组成一个圆圈，每次从这个圆圈中删除第m-1个数字，求出这个圆圈中最后剩余的数字是多少。
   I：数字n,数字m
   O:圆圈中最后的数字
 * @author zhengzhentao
 *
 */
public class LastRemaining_Solution {

	public LastRemaining_Solution() {
		// TODO Auto-generated constructor stub
	}

	public static int LastRemaining(int n,int m) {
		
		if(n<1||m<1)
			return -1;
		int last=0;
		for(int i=2;i<=n;i++){
			last=(last+m)%i;
		}
		return last;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int last =LastRemaining(6, 3);
      System.out.println("圆圈中最后剩余的数字是："+last);
	}

}

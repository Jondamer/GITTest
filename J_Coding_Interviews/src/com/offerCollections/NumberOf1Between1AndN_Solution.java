package com.offerCollections;

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、
 * 13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加
 * 
 * 普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * 
 * @author zhengzhentao
 *
 */
public class NumberOf1Between1AndN_Solution {

	public NumberOf1Between1AndN_Solution() {
		// TODO Auto-generated constructor stub
	}

	public static int NumberOf1Between1AndN_Solution(int n) {
		// TODO Auto-generated constructor stub
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i < n + 1; i++) {
			// System.out.println(String.valueOf(i));
			sb.append(String.valueOf(i));
		}
		// 转变成字符串
		String str = sb.toString();
		int num = 0;
		// 遍历字符串的每一个数组
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				num++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=NumberOf1Between1AndN_Solution(12);
       System.out.println(num);
	}
}
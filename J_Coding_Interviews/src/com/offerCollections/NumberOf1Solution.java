package com.offerCollections;

public class NumberOf1Solution {

	public NumberOf1Solution() {
		// TODO Auto-generated constructor stub
	}

	public static int NumberOf1(int n) {
		String string = Integer.toBinaryString(n); // 转化为二进制补码形式，32位。
		// 遍历字符串
		int iNum = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '1') {
				iNum++;
			}
		}
		return iNum;
	}

	public static int NumberOf1Solu2(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n & 1;// 逐个判断低位是否为1；
			// sum=sum +(n&1);
			n = n >>> 1;// 无符号右移，例如从11101变成1110
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

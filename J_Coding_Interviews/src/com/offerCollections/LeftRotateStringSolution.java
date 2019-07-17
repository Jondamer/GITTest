package com.offerCollections;

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循
 * 环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 输入I：字符串S,左移位数正整数n 输出：输出字符串S,循环左移n位后的字符串序列. 解决思路：
 * 
 * @author zhengzhentao
 *
 */
public class LeftRotateStringSolution {

	public LeftRotateStringSolution() {
		// TODO Auto-generated constructor stub
	}

	public static String LeftRotateString(String str, int n) {
		String LeftRotateString ="";
		if (n == 0 || n==str.length())
			return str;
		if(n>str.length()){
			return LeftRotateString;
		}
		String leftS = str.substring(0, n);
		String RS = str.substring(n, str.length());
		LeftRotateString = RS + leftS;
		return LeftRotateString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "abcXYZdef";
		String ls = LeftRotateString(S, 20);
		System.out.println(ls);
	}

}

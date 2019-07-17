package com.offerCollections;

import java.util.Stack;

/**
 * 翻转字符串
 * 
 * @author zhengzhentao
 *
 */
public class ReverseSentenceSolution {

	public ReverseSentenceSolution() {
		// TODO Auto-generated constructor stub
	}

	public static String ReverseSentence(String str) {
		if (str.equals(" "))
			return str;
		if ("".equals(str.trim())) {
			return str;
		}
		String string = str;
		int length = string.length();
		char[] array = new char[length];
		for (int i = 0; i < length; i++) {
			array[i] = string.charAt(length - 1 - i);
		}
		string = new String(array);
		String[] temp = string.split(" ");
		String SF = "";
		for (int i = 0; i < temp.length; i++) {
			String s = reverseString(temp[i]);
			SF = SF + s + " ";
		}
		SF = SF.trim();
		return SF;
	}

	static String reverseString(String string) {
		// 对s进行翻转,利用翻转前后字符的下标规律
		int length = string.length();
		char[] array = new char[length];
		for (int i = 0; i < length; i++) {
			array[i] = string.charAt(length - 1 - i);
		}
		string = new String(array);
		String reverseStr = new String(array);
		return reverseStr;
	}

	static void reverseString2(String string) {
		// 对s进行翻转,利用翻转前后字符的下标规律
		int length = string.length();
		char[] array = new char[length];
		for (int i = 0; i < length; i++) {
			array[i] = string.charAt(length - 1 - i);
		}
		string = new String(array);
		System.out.println("输入字符串翻转后的结果：" + string);
		String[] temp = string.split(" ");
		for (String string2 : temp) {
			System.out.println(string2);

		}
		System.out.println("长度是:" + temp.length); // ?长度为什么是1呢，长度应该是4才对啊,分割符不应该是"\t",而应该是"
													// "
		String SF = "";
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			String s = reverseString(temp[i]);
			System.out.println(s);
			SF = SF + s + " ";
		}
		System.out.println(SF);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试空格字符串
		String kong = " ";
		String kongs = ReverseSentence(kong);
		System.out.println("空字符串对应的输出是:" + kongs);

		// String testS = "student. a am I";
		// reverseString2(testS);
		// System.out.println(reS);
		// String[] temp = reS.split("\t");
		// for (String string : temp) {
		//
		// }
		// // 对s进行翻转,利用翻转前后字符的下标规律
		// int length = string.length();
		// char[] array = new char[length];
		// for (int i = 0; i < length; i++) {
		// array[i] = string.charAt(length - 1 - i);
		// }
		// String reverseStr = new String(array);
		// System.out.println(reverseStr);
		//
		// // 利用栈数据结构
		// Stack<Character> st = new Stack<>();
		// for (int j = 0; j < length; j++) {
		// st.push(string.charAt(j));
		// }
		// String output = "";
		// while (!st.isEmpty()) {
		// char ch = st.pop();
		// output = output + ch;
		// }
		// System.out.println(output);
		//
		// // 对output按照空格进行分割
		// String[] temp = output.split("\t");
		// for (String string2 : temp) {
		// System.out.print(string2 + "\t");
		// }
	}

}

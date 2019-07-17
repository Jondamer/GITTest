package com.offerCollections;

import java.util.LinkedHashMap;

/**
 * 字符流中第一个只出现一次的字符
 * P：
 *  使用linkedHashMap保存流入的字符，并可以保证字符的流入顺序。其中key为字符，value为字符出现的次数。
 *  遍历map时，输出value为1的字符，并结束循环。
 * 
 * @author zhengzhentao
 *
 */
public class FirstAppearingOnceSolution {

	public FirstAppearingOnceSolution() {
		// TODO Auto-generated constructor stub
	}

	StringBuilder sb = new StringBuilder();

	// Insert one char from stringstream
	public void Insert(char ch) {
		sb = sb.append(ch);
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		// stringbuilder转变成string类型
		String s = sb.toString();
		LinkedHashMap<Character, Integer> LHMap = new LinkedHashMap<>();
		int value = 1;
		// 遍历字符串s
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if (LHMap.containsKey(key)) {
				value = LHMap.get(key) + 1;
				LHMap.put(key, value);
			} else {

				value = 1;
				LHMap.put(key, value);
			}

		}
		// 遍历linkedHashMap
		// 声明一个char
		char c = '0';
		for (Character key1 : LHMap.keySet()) {
			if (LHMap.get(key1) == 1) {
				System.out.println(key1);
				c = key1;
				System.out.println("第一次只出现一次的字符是：" + c);
				break;
			}else{
				c='#';
			}

		}
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

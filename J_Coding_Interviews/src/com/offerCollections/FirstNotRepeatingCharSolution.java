package com.offerCollections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * 问题输入(I):一个字符串 问题输出(O)：第一个只出现一次的字符
 * 
 * @author zhengzhentao
 *
 */
public class FirstNotRepeatingCharSolution {

	public static int FirstNotRepeatingChar(String str) {
		if(str.length()==0)
			return -1;
		int index = 0;
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		char key;
		int value = 1;
		for (int i = 0; i < str.length(); i++) {
			key = str.charAt(i);
			if (hm.containsKey(key)) {
				value = hm.get(key) + 1;
				hm.put(key, value);
			} else {
				value = 1;
				hm.put(key, value);
			}
		}

		// 遍历HashMap
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				char ch = entry.getKey();
				index = str.indexOf(ch);
				return index;
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zhheeaab" ;
		// 测试函数
		int index = FirstNotRepeatingChar(s);
		System.out.println("第一次索引位置是：" + index);
	}
}

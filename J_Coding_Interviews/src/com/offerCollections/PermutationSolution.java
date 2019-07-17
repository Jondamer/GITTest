package com.offerCollections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,
 * bca,cab和cba。
 * 
 * @author zhengzhentao
 *
 */
public class PermutationSolution {

	public PermutationSolution() {
		// TODO Auto-generated constructor stub
	}

	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<String>();
		char[] ch = str.toCharArray();
		Permu(ch, 0, list);
		Collections.sort(list);
		return list;

	}

	public static void Permu(char[] str, int i, ArrayList<String> list) {
		if (str == null) {
			return;
		}
		if (i == str.length - 1) {
			if (list.contains(String.valueOf(str))) {
				return;
			}
			list.add(String.valueOf(str));
		} else {
			for (int j = i; j < str.length; j++) {
				char temp = str[j];
				str[j] = str[i];
				str[i] = temp;
				Permu(str, i + 1, list);
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		ArrayList<String> al = Permutation(str);
		for (String string : al) {
			System.out.println(string);
		}
	}

}

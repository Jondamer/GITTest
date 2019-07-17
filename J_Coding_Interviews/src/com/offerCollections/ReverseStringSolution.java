package com.offerCollections;

public class ReverseStringSolution {

	    public static String ReverseSentence(String str) {
			String trim = str.trim();
	        String a = "";
	        if("".equals(str.trim())){
	            return str;
	        }
	        String[] split = str.split(" ");
	        for (int i = split.length-1; i >=0; i--) {
	            a +=split[i]+" ";
	        }
	        return a.trim();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="student. a am I";
		String trim = s.trim();
		System.out.println(trim);
        String sOut=ReverseSentence(s);
        System.out.println(sOut);
	}

}

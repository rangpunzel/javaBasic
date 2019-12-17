package h_useful;

import java.util.Arrays;

public class StringClass {
	
	public static void main(String[] args) {
		/*
		 * equals()		: 문자열을 비교하여 같으면 true 다르면 false를 반환한다.
		 * length()		: 문자열의 길이를 반환한다.
		 * substring()	: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt() 	: 지정된 위치의 문자를 반환한다.
		 * indexOf()	: 주어진 문자의 위치를 반환한다.
		 * lastIndexOf(): 주어진 문자의 마지막 위치를 반환한다.
		 * replace()	: 문자열 내의 주어진 문자(문자열)를 새로운 문자(문자열)로 바꾼 문자열을 반환한다.
		 * replaceAll()	: 문자열 내의 주어진 정규표현식과 일치하는 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
		 * split()		: 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		 * startsWith()	: 주어진 문자열로 시작하는 여부를 반환한다.
		 * endsWith()	: 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase(): 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase(): 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim()		: 양끝의 공백을 제거한 문자열을 반환한다.
		 */
		
		String str = "abc abc  abc";
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.indexOf("a",1));
		
		System.out.println(str.replace("a","0"));
		System.out.println(str.replaceAll("[a-z]","0"));
		
		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(Arrays.toString(str.split(" +"))); //+앞에 있는 문자가 1개 이상
		
		System.out.println(str.startsWith("a"));
		System.out.println(str.startsWith("b"));
		
		System.out.println(str.endsWith("c"));
		System.out.println(str.endsWith("b"));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		String str2 = " abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		//자바의 정석 예제
		String s = new String("Hello");
		System.out.println(s);
		
		char[] c = {'H','e','l','l','o'};
		s = new String(c);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer ("Hello");
		s = new String(sb);
		System.out.println(s);
		
		s = "Hello";
		String n = "0123456";
		char cc = s.charAt(1);
		char c2 = n.charAt(1);
		
		System.out.println(cc);
		System.out.println(c2);
		
		int i ="aaa".compareTo("aaa");
		int i2 ="aaa".compareTo("bbb");
		int i3 ="bbb".compareTo("aaa");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		s="Hello";
		String s2 =s.concat("World");
		System.out.println(s2);
		
		s = "abcedfg";
		boolean b = s.contains("bc");
		System.out.println(b);
		
		String file = "Hello.txt";
		b = file.endsWith("txt");
		System.out.println(b);
		
		s = "Hello";
		b = s.equals("Hello");
		boolean b2 = s.equals("hello");
		System.out.println(b);
		System.out.println(b2);
		
		s = "Hello";
		b = s.equalsIgnoreCase("HELLO");
		b2 = s.equalsIgnoreCase("heLLo");
		System.out.println(b);
		System.out.println(b2);
		
		s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');
		System.out.println(idx1);
		System.out.println(idx2);
		
		s = "Hello";
		idx1 = s.indexOf('e',0);
		idx2 = s.indexOf('e',2);
		System.out.println(idx1);
		System.out.println(idx2);
		
		s = "ABCDEFG";
		int idx = s.indexOf("CD");
		System.out.println(idx);
		
		s = new String("abc");
		s2 = new String("abc");
		b = (s==s2);
		b2 = s.equals(s2);
		boolean b3 = (s.intern ()==s2.intern());
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);
		
		s = "Java.lang.Object";
		idx1 = s.lastIndexOf('.');
		idx2 = s.indexOf('.');
		System.out.println(idx1);
		System.out.println(idx2);
		
		s = "java.lang.java";
		idx1 = s.lastIndexOf("java");
		idx2 = s.indexOf("java");
		System.out.println(idx1);
		System.out.println(idx2);
		
		s = "Hello";
		int length = s.length();
		System.out.println(length);
		
		s = "Hello";
		String s1 = s.replace('H', 'C');
		System.out.println(s1);
		
		s = "Hellollo";
		s1 = s.replace("ll", "LL");
		System.out.println(s1);
		
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");
		System.out.println(r);
		
		ab = "AABBAABB";
		r = ab.replaceFirst("BB", "bb");
		System.out.println(r);
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr = animals.split(",",2);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		s = "java.lang.Object";
		b = s.startsWith("java");
		b2 = s.startsWith("lang");
		System.out.println(b);
		System.out.println(b2);
		
		s = "java.lang.Object";
		String ccc = s.substring(10);
		String p = s.substring(5,9);
		System.out.println(ccc);
		System.out.println(p);
		
		s= "Hello";
		s1 = s.toLowerCase();
		System.out.println(s1);
		
		s1 = s.toString();
		System.out.println(s1);
		
		s1 = s.toUpperCase();
		System.out.println(s1);
		
		s = " Hello World ";
		s1 = s.trim();
		System.out.println(s1);
		
		String bb = String.valueOf(true);
		ccc = String.valueOf('a');
		String ii = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println(bb);
		System.out.println(ccc);
		System.out.println(ii);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(date);
		
	}

}

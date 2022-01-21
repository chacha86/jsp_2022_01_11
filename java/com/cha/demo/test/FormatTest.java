package com.cha.demo.test;

public class FormatTest {

	public static void main(String[] args) {
		int dan = 3;
		System.out.println(dan + " X " + 1 + " = " + dan * 1);
		//%d => 십진수 정수
		System.out.printf("%d X %d = %d\n", 3, 1, 3 * 1);
		//%s => 문자열
		System.out.printf("당신의 이름은 : %s\n", "홍길동");
		//%f => 실수
		System.out.printf("%f + %f = %f\n", 1.1, 2.2, 1.1 + 2.2);
		
		String name = "차태진";
		
		String str = "안녕하세요 저는 " + name + "입니다.";
		String str2 = String.format("안녕하세요 저는 %s입니다.", name);
		
		System.out.println(str);
		System.out.println(str2);
		
	}

}

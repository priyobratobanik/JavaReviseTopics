package com.masai.day2;

public class Example1 {
	

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a); // 10
		System.out.println(a++);// 10 //post-increment => (print, increase)
		System.out.println(++a);// 12
		System.out.println(a--);// 12
		System.out.println(--a);// 10
		System.out.println(a);// 10
	}
}
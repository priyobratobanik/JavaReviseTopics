package com.masai.day2;

public class Example3 {

	public static void main(String[] args) {
		int a = 5;
		System.out.println((--a + --a) * (++a - a--) + (--a + a--) * (++a + a++));
	}
}

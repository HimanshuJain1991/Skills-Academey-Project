package com.rays.common;

public class Check {
	static {
		System.out.println("calling before main method");
	}

	public static void main(String[] args) {
		Check c = new Check();
		System.out.println(c instanceof Check);
		int i = 100;
		int j = i++;
		System.out.println("value of i=" + i);// 101
		System.out.println("value of j=" + j);// 100
		System.out.println("---------In case of preincrement--------");
		int k = 200;
		int l = ++k;
		System.out.println("value of k=" + k);
		System.out.println("value of l=" + l);
		String name = "Himanshu Kumar Jain";
		System.out.println(name.substring(2));
		System.out.println(name.substring(0,6));
		name.concat("ji Sir");
		System.out.println(name);
		String s=new String("Riyansh");
		System.out.println(s.concat("hhhhh"));

	}

}

package com;

/*输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。*/

/*
 * 思路
 * Interger.toBinaryString()
 * */

public class One {
	public static int NumberOf1(int n) {
		String b=Integer.toBinaryString(n);
		char[] a=b.toCharArray();
		int num=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]=='1') {
				num++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("有"+NumberOf1(10)+"个1");
	}

}
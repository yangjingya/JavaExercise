package com;

/*����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��*/

/*
 * ˼·
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
		System.out.println("��"+NumberOf1(10)+"��1");
	}

}
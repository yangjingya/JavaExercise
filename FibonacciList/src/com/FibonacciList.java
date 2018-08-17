package com;

/*大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39*/

/*思路
 * 斐波那契数列：
 * 	斐波那契数列指的是这样一个数列 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368........
 * 	这个数列从第3项开始，每一项都等于前两项之和。	
 * */

public class FibonacciList {

	public int Fibonacci(int n) {
		if(n==0) {
			return 0; 
		}else if(n==1||n==2){
			return 1;
		}else {
			int[] ret=new int[n];
			ret[0]=ret[1]=1;
			for(int i=2;i<n;i++) {
				ret[i]=ret[i-1]+ret[i-2];
			}
			return ret[n-1];
		}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciList fi=new FibonacciList();
		System.out.println(fi.Fibonacci(20));;
	}

}

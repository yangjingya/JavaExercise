package com;

/*��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
n<=39*/

/*˼·
 * 쳲��������У�
 * 	쳲���������ָ��������һ������ 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233��377��610��987��1597��2584��4181��6765��10946��17711��28657��46368........
 * 	������дӵ�3�ʼ��ÿһ�����ǰ����֮�͡�	
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

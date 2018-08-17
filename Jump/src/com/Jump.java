package com;

import java.io.Console;

/*一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。*/


/*对于本题,前提只有 一次 1阶或者2阶的跳法。

a.如果两种跳法，1阶或者2阶，那么假定第一次跳的是一阶，那么剩下的是n-1个台阶，跳法是f(n-1);

b.假定第一次跳的是2阶，那么剩下的是n-2个台阶，跳法是f(n-2)

c.由a\b假设可以得出总跳法为: f(n) = f(n-1) + f(n-2) 

d.然后通过实际的情况可以得出：只有一阶的时候 f(1) = 1 ,只有两阶的时候可以有 f(2) = 2

e.可以发现最终得出的是一个斐波那契数列：

           | 1, (n=1)

f(n) =     | 2, (n=2)

           | f(n-1)+f(n-2) ,(n>2,n为整数)*/

public class Jump {
	public int JumpFloor(int target) {
		int[] arr=new int[target+1];
		arr[0]=arr[1]=1;
		for(int i=2;i<=target;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[target];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jump j=new Jump();
		System.out.println("总共"+j.JumpFloor(5)+"种方法");
	}

}

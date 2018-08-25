package com;

/*把只包含质因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含质因子7。
习惯上我们把1当做是第一个丑数。
求按从小到大的顺序的第N个丑数。*/

/*思路
 * 通过循环计算 算出适合的数字
 * */

public class Ugly {
	public int GetUglyNumber_Solution(int index) {
		int num=1;
		int temp=0;
		int count=1;
		if(index==1) return 1;
		while(count<index) {
			num++;
			temp=num;
			while(temp>1) {
				if(temp%2==0) {
					temp=temp/2;
				}else if(temp%3==0) {
					temp=temp/3;
				}else if(temp%5==0) {
					temp=temp/5;
				}else {
					break;
				}
			}
			if(temp==1) {
				count++;
			}else {
				continue;
			}
		}
        return num;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ugly u=new Ugly();
		System.out.print(u.GetUglyNumber_Solution(10));
	}

}

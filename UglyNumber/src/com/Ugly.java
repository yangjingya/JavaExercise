package com;

/*��ֻ����������2��3��5��������������Ugly Number����
����6��8���ǳ�������14���ǣ���Ϊ������������7��
ϰ�������ǰ�1�����ǵ�һ��������
�󰴴�С�����˳��ĵ�N��������*/

/*˼·
 * ͨ��ѭ������ ����ʺϵ�����
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

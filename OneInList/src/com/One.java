package com;

/*���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
*/
public class One {
	public int NumberOf1Between1AndN_Solution(int n) {
	    int count=0;
	    while(n>0) {
	    	String str=String.valueOf(n);
	    	char[] num=str.toCharArray();
	    	for(int i=0;i<num.length;i++) {
	    		if(num[i]=='1') {
	    			count++;
	    		}
	    	}
	    	n--;
	    }
	    return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			One one=new One();
			System.out.println("1�ĸ���Ϊ:"+one.NumberOf1Between1AndN_Solution(1300));
			
	}

}

package com;

import java.util.Stack;

/*���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�*/

/*˼·
 * ����һ��������ջ������ѹջ˳��
 * �Ƚ���һ������ջ�У�������1��Ȼ���ж�ջ��Ԫ���ǲ��ǳ�ջ˳��ĵ�һ��Ԫ�أ�������4������Ȼ1��4���������Ǽ���ѹջ��
 * ֱ������Ժ�ʼ��ջ����ջһ��Ԫ�أ��򽫳�ջ˳������ƶ�һλ��ֱ������ȣ�
 * ����ѭ����ѹջ˳�������ɣ��������ջ����Ϊ�գ�˵���������в��Ǹ�ջ�ĵ���˳��
 * */

public class StackPush {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA.length==0||popA.length==0) return false;
	    Stack<Integer> st=new Stack<Integer>();
	    int popIndex=0;
	    for(int i=0;i<pushA.length;i++) {
	    	st.push(pushA[i]);
	    	while(!st.isEmpty()&&st.peek()==popA[popIndex]) {
	    		st.pop();
	    		popIndex++;
	    	}
	    }
	    return st.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackPush sp=new StackPush();
		int[] pushA=new int[] {1,2,3,4,5};
		int[] popA=new int[] {4,3,5,1,2};
		System.out.println(sp.IsPopOrder(pushA, popA));
	}

}

package com;

/*������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�*/

/*˼·
 * �����������ȳ�������ջ����������������ջ�������������ȡ����˳��ͱ���������ȳ���
 * */
	

import java.util.Stack;

public class Change {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()) {
    		stack2.push(stack1.pop());
    	}
    	int ret=stack2.pop();
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return ret;
    }
	
	public static void main(String[] ags) {
		Change c=new Change();
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		for(int ar:arr) {
			c.push(ar);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(c.pop()+" ");
		}
	}
}

package com;

/*用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。*/

/*思路
 * 队列是先入先出，而堆栈是先入后出，两个堆栈，依次输入后再取出，顺序就变成了先入先出了
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

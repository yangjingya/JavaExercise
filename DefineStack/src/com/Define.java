package com;

import java.util.Iterator;

/*定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。*/

/*思路
 *比较 获取最小值
 * */

import java.util.Stack;

public class Define {
	Stack<Integer> s=new Stack<Integer>();
	public void push(int node) {
        s.push(node);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int min() {
        Iterator it=s.iterator();
        int min=s.peek();
        while(it.hasNext()) {
        	if(min>(int)it.next()) {
        		min=(int) it.next();
        	}
        }
        return min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Define de=new Define();
		for(int i=10;i>0;i--) {
			de.push(i);
		}
		System.out.println(de.min());
	}

}

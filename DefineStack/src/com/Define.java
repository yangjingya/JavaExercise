package com;

import java.util.Iterator;

/*����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������*/

/*˼·
 *�Ƚ� ��ȡ��Сֵ
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

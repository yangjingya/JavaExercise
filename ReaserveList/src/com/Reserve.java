package com;

/*����һ��������ת��������������ı�ͷ��*/

/*˼·
 * ��ת���� �������������
 * �漴�뵽��ջ �����ȳ� 
 * �Ƚ������е�ֵȡ�� push���ջ Ȼ���ٴ���һ���µ����� ���Ž���ջ�е�ֵpop���� 
 * */

import java.util.Stack;

public class Reserve {
	public ListNode ReverseList(ListNode head) {
		Stack<Integer> s=new Stack<Integer>();
		ListNode temp=head;
		while(temp!=null){
			s.push(temp.data);
			temp=temp.next;
		}
		ListNode newList=new ListNode(0);
		while(!s.isEmpty()) {
			newList.add((int)s.pop());
		}
		return newList;
    }
	
	public static void main(String[] args) {
		ListNode list=new ListNode(0);
		for(int i=1;i<11;i++) {
			list.add(i);
		}
		Reserve r=new Reserve();
		list.print();
		System.out.println();
		r.ReverseList(list.head).print();
	}
}

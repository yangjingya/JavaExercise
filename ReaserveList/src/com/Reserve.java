package com;

/*输入一个链表，反转链表后，输出新链表的表头。*/

/*思路
 * 反转链表 即反向输出链表
 * 随即想到堆栈 先入先出 
 * 先将链表中的值取出 push入堆栈 然后再创建一个新的链表 接着将堆栈中的值pop出来 
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

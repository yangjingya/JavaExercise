package com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/*输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。*/

/*思路
	从尾到头遍历链表，首先想到的是堆栈，先入后出，将链表节点的值放入堆栈，再pop出去放在ArrayList中*/

public class PrintList {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> st=new Stack<Integer>();
        ListNode node=listNode;
        while(node!=null) {
        	st.push(node.data);
        	node=node.next;
        }
        ArrayList<Integer> ret=new ArrayList<Integer>();
        while(!st.isEmpty()) {
        	ret.add(st.pop());
        }
        
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list=new ListNode(0);
		PrintList pList=new PrintList();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		list.print();
		System.out.println();
		ArrayList<Integer> ret=pList.printListFromTailToHead(list.head);
		
//		方法一
		int length=ret.size();
		int i=0;
		Iterator it1=ret.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next());
			i++;
			if(i<length) {
				System.out.print("-->");
			}
		}
		
/*		
//		方法二
		i=0;
		for(int item:ret) {
			System.out.print(item);
			i++;
			if(i<length) {
				System.out.print("-->");
			}
		}
		
//		方法三
		i=0;
		for(int j=0;j<ret.size();j++) {
			System.out.print(ret.get(j));
			i++;
			if(i<length) {
				System.out.print("-->");
			}
		}
*/
	}

}

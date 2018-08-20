package com;

/*输入一个链表，输出该链表中倒数第k个结点。*/

/*思路
 * 首先 获取当前列表的长度 由倒数转换为正数
 * 其次 判断当前数组长度是否达到需求
 * 最后 输出对应的节点值
 * */

public class PrintList {
	public ListNode FindKthToTail(ListNode head,int k) {
		int i=0,size=0;
		ListNode temp=head;
		while(temp!=null) {
			size++;
			temp=temp.next;
		}
		if(size<k) {
			System.out.println("该数组中，不存在倒数第k个节点");
			return null;
		}
		temp=head;
		for(;i<size-k;i++) {
			if(temp!=null) {
				temp=temp.next;
				
			}
		}
		return temp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list=new ListNode(0);
		for(int i=1;i<=11;i++) {
			list.add(i);
		}
		list.print();
		System.out.println();
		PrintList pl=new PrintList();
		System.out.println(pl.FindKthToTail(list.head, 5).data);
	}

}

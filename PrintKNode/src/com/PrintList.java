package com;

/*����һ����������������е�����k����㡣*/

/*˼·
 * ���� ��ȡ��ǰ�б�ĳ��� �ɵ���ת��Ϊ����
 * ��� �жϵ�ǰ���鳤���Ƿ�ﵽ����
 * ��� �����Ӧ�Ľڵ�ֵ
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
			System.out.println("�������У������ڵ�����k���ڵ�");
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

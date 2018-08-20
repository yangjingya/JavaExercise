package com;

/*���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
*/

/*˼·
 * �򵥵�����ƴ��
 * */
public class Merge {
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
		ListNode ret=new ListNode(0);
		ListNode temp1=list1.head;
		ListNode temp2=list2.head; 
		while(temp1!=null&&temp2!=null) {
			if(temp1.data>temp2.data) {
				ret.add(temp2.data);
				temp2=temp2.next;
			}else {
				ret.add(temp1.data);
				temp1=temp1.next;
			}
		}
		while(temp1!=null) {
			ret.add(temp1.data);
			temp1=temp1.next;
		}
		while(temp2!=null) {
			ret.add(temp2.data);
			temp2=temp2.next;
		}
		return ret;
    }
	public static void main(String[] args) {
		ListNode list1=new ListNode(0);
		ListNode list2=new ListNode(0);
		for(int i=1;i<21;i++) {
			list1.add(i);
		}
		for(int i=1;i<11;i++) {
			list2.add(i);
		}
		Merge m=new Merge();
		m.Merge(list1, list2).print();
	}
}

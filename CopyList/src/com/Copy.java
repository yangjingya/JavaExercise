package com;

/*����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head����ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�*/

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Copy {
	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead==null) return null;
		RandomListNode head=new RandomListNode(pHead.label);
		if(pHead.random!=null) head.random=new RandomListNode(pHead.random.label);
		RandomListNode ret=head;
		while(pHead.next!=null) {
			pHead=pHead.next;
			head.next=new RandomListNode(pHead.label);
			if(pHead.random!=null) head.next.random=new RandomListNode(pHead.random.label);
			head=head.next;
		}
		return ret;
    }
	
	public static void main(String[] args) {
		RandomListNode head=new RandomListNode(0);
		RandomListNode ret=head;
		for(int i=1;i<11;i++) {
			RandomListNode temp=new RandomListNode(i);
			RandomListNode random;
			if(i<10) {
				random=new RandomListNode(i+1);
			}else {
				random=new RandomListNode(1);
			}
			ret.next=temp;
			ret.random=random;
			ret=ret.next;
		}
		ret.random=new RandomListNode(0);
		Copy c=new Copy();
		ret=c.Clone(head);
		while(ret!=null) {
			String ans=ret.label+" ��һ��";
			if(ret.next!=null) ans+=ret.next.label+" ���:";
			else ans+=null+" ���:";
			ans+=ret.random.label;
			System.out.println(ans);
			ret=ret.next;
		}
	}
}



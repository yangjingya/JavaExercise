package com;

/*输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）*/

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
			String ans=ret.label+" 下一个";
			if(ret.next!=null) ans+=ret.next.label+" 随机:";
			else ans+=null+" 随机:";
			ans+=ret.random.label;
			System.out.println(ans);
			ret=ret.next;
		}
	}
}



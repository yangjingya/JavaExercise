package com;

public class ListNode {
	int data;
	ListNode head=null;
	ListNode temp=null;
    ListNode next = null;
    
  
    public ListNode(int data) {
        this.data = data;
    }
    
    public void add(int newData) {
    	ListNode node=new ListNode(newData);
    	if(head==null) {
    		head=node;
    		return;
    	}
    	temp=head;
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=node;
    }
    
    public void print() {
    	temp=head;
    	while(temp!=null) {
    		System.out.print(temp.data);
    		temp=temp.next;
    		if(temp!=null) {
    			System.out.print("-->");
    		}
    	}
    }
}

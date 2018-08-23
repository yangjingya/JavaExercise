package com;


/*输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。*/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
        this.left=null;
        this.right=null;
    }
    
    public void addNode(int val) {
    	if(val<this.val) {
    		if(this.left!=null) this.left.addNode(val);
    		else this.left=new TreeNode(val);
    		return;
    	}else {
    		if(this.right!=null) this.right.addNode(val);
    		else this.right=new TreeNode(val);
    		return;
    	}
    }
    
    public void preOrder(TreeNode node) {
    	System.out.print(node.val+" ");
    	if(node.left!=null) {
    		preOrder(node.left);
    	}
    	if(node.right!=null) {
    		preOrder(node.right);
    	}
    	
    }

}

public class BinaryTree {
	public TreeNode head;
	public TreeNode preNode;
	public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        inOrder(pRootOfTree);
        return head;
    }
	
	public void inOrder(TreeNode newNode) {
		if(newNode==null) return;
		inOrder(newNode.left);
		if(preNode==null) {
			preNode=newNode;
			head=newNode;
		}else {
			preNode.right=newNode;
			newNode.left=preNode;
			preNode=preNode.right;
		}
		inOrder(newNode.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=10;
		BinaryTree bt=new BinaryTree();
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=(int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		TreeNode node=new TreeNode(arr[0]);
		for(int i=1;i<arr.length;i++) {
			node.addNode(arr[i]);
		}
		node.preOrder(node);
		System.out.println();
		node=bt.Convert(node);
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.right;
		}
	}

}

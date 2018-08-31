package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode (int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}
	
	public void setLeft(TreeNode left) {
		this.left=left;
	}
	
	public void setRight(TreeNode right) {
		this.right=right;
	}
	
	public int getVal() {
		return this.val;
	}
	
	public void setVal(int val) {
		this.val=val;
	}
	
	public TreeNode getLeft() {
		return left;
	}
	
	public TreeNode getRight() {
		return right;
	}
	
	public ArrayList<TreeNode> creatBinaryTree(int[] datas) {
		ArrayList<TreeNode> nodeList=new ArrayList<TreeNode>();
		//将数组变成node节点
		for(int nodeindex=0;nodeindex<datas.length;nodeindex++) {
			TreeNode node=new TreeNode(datas[nodeindex]);
			nodeList.add(node);
		}
		//给所有父节点设定子节点
		for(int index=0;index<nodeList.size()/2-1;index++) {
			//编号为n的节点她的左子节点编号为2*n，右子节点编号为2*n+1，但是因为list从0开始编号。所以还要+1
			//最后一个节点 可能没有右子节点，需要另行定义
			nodeList.get(index).setLeft(nodeList.get(2*index+1));
			nodeList.get(index).setRight(nodeList.get(2*index+2));
		}
		//单独设置最后一个节点
		int index=nodeList.size()/2-1;
		nodeList.get(index).setLeft(nodeList.get(2*index+1));
		if(nodeList.size()%2==1) {
			nodeList.get(index).setRight(nodeList.get(2*index+2));
		}
		return nodeList;
	}
	
	public void PrintCurrentNode(TreeNode node) {
		System.out.print(node.getVal()+" ");
	}
	
	//先序遍历
	public void preOrdered(TreeNode node) {
		if(node==null)
			return;
		PrintCurrentNode(node);
		preOrdered(node.getLeft());
		preOrdered(node.getRight());
	}
	//中序遍历
	public void inOrderOrdered(TreeNode node) {
		if(node==null)
			return;
		inOrderOrdered(node.getLeft());
		PrintCurrentNode(node);
		inOrderOrdered(node.getRight());
	}
	//后序遍历
	public void pastOrdered(TreeNode node) {
		if(node==null)
			return;
		pastOrdered(node.getLeft());
		pastOrdered(node.getRight());
		PrintCurrentNode(node);
	}
	//广度优先遍历
	public ArrayList<Integer> Breadth_first_traversal(TreeNode node) {
		ArrayList<Integer> lists=new ArrayList<Integer>();
		if(node==null) {
			return lists;
		}
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(node);
		while(!queue.isEmpty()) {
			TreeNode tree=queue.poll();
			if(tree.getLeft()!=null) {
				queue.offer(tree.getLeft());
			}
			if(tree.getRight()!=null) {
				queue.offer(tree.getRight());
			}
			lists.add(tree.getVal());
		}
		return lists;
	}
	//深度优先遍历
	public ArrayList<Integer> Depth_first_traversal(TreeNode node){
		ArrayList<Integer> lists=new ArrayList<Integer>();
		if(node==null) {
			return lists;
		}
		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(node);
		while(!stack.isEmpty()) {
			TreeNode tree=stack.pop();
			if(tree.getRight()!=null) {
				stack.push(tree.getRight());
			}
			if(tree.getLeft()!=null) {
				stack.push(tree.getLeft());
			}
			lists.add(tree.getVal());
		}
		return lists;
	}
}

public class BinaryTreeNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5,6,7,8};
		TreeNode tr=new TreeNode(-1);
		ArrayList<TreeNode> list=tr.creatBinaryTree(arr);
		TreeNode node=list.get(0);
		System.out.print("先序遍历：");
		tr.preOrdered(node);
		System.out.println();
		System.out.print("中序遍历：");
		tr.inOrderOrdered(node);
		System.out.println();
		System.out.print("后序遍历：");
		tr.pastOrdered(node);
		System.out.println();
		System.out.print("广度优先遍历：");
		ArrayList<Integer> listbr=tr.Breadth_first_traversal(node);
		for(int i:listbr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("深度优先遍历：");
		ArrayList<Integer> listde=tr.Depth_first_traversal(node);
		for(int i:listde) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}

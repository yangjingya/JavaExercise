package com;

import java.util.List;

public class TreeNode {
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
	
	public void creatBinaryTree(int[] datas,List<TreeNode> nodeList) {
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
}

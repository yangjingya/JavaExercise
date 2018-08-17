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
		//��������node�ڵ�
		for(int nodeindex=0;nodeindex<datas.length;nodeindex++) {
			TreeNode node=new TreeNode(datas[nodeindex]);
			nodeList.add(node);
		}
		//�����и��ڵ��趨�ӽڵ�
		for(int index=0;index<nodeList.size()/2-1;index++) {
			//���Ϊn�Ľڵ��������ӽڵ���Ϊ2*n�����ӽڵ���Ϊ2*n+1��������Ϊlist��0��ʼ��š����Ի�Ҫ+1
			//���һ���ڵ� ����û�����ӽڵ㣬��Ҫ���ж���
			nodeList.get(index).setLeft(nodeList.get(2*index+1));
			nodeList.get(index).setRight(nodeList.get(2*index+2));
		}
		//�����������һ���ڵ�
		int index=nodeList.size()/2-1;
		nodeList.get(index).setLeft(nodeList.get(2*index+1));
		if(nodeList.size()%2==1) {
			nodeList.get(index).setRight(nodeList.get(2*index+2));
		}
	}
	
	public void PrintCurrentNode(TreeNode node) {
		System.out.print(node.getVal()+" ");
	}
	
	//�������
	public void preOrdered(TreeNode node) {
		if(node==null)
			return;
		PrintCurrentNode(node);
		preOrdered(node.getLeft());
		preOrdered(node.getRight());
	}
	//�������
	public void inOrderOrdered(TreeNode node) {
		if(node==null)
			return;
		inOrderOrdered(node.getLeft());
		PrintCurrentNode(node);
		inOrderOrdered(node.getRight());
	}
	//�������
	public void pastOrdered(TreeNode node) {
		if(node==null)
			return;
		pastOrdered(node.getLeft());
		pastOrdered(node.getRight());
		PrintCurrentNode(node);
	}
}

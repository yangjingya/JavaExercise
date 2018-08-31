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
		return nodeList;
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
	//������ȱ���
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
	//������ȱ���
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
		System.out.print("���������");
		tr.preOrdered(node);
		System.out.println();
		System.out.print("���������");
		tr.inOrderOrdered(node);
		System.out.println();
		System.out.print("���������");
		tr.pastOrdered(node);
		System.out.println();
		System.out.print("������ȱ�����");
		ArrayList<Integer> listbr=tr.Breadth_first_traversal(node);
		for(int i:listbr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("������ȱ�����");
		ArrayList<Integer> listde=tr.Depth_first_traversal(node);
		for(int i:listde) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}

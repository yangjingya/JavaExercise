package com;

import java.util.ArrayList;
import java.util.Iterator;

/*�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��*/

/*˼·
 * �˴���arraylist�䵱���Ƕ��еĽ�ɫ���ֽ����ڵ���룬���ţ��鿴���Ƿ��������ӽڵ㣬���У�����룬���������ڵ㣬��ֵ�����������У�ֻҪ���в��գ���ѭ��ִ��
*/

public class Tree {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> ret=new ArrayList<Integer>();
		ArrayList<TreeNode> result=new ArrayList<TreeNode>();
		if(root==null) return ret;
		result.add(root);
		while(result.size()!=0) {
			TreeNode node=result.remove(0);
			if(node.left!=null) {
				result.add(node.left);
			}
			if(node.right!=null) {
				result.add(node.right);
			}
			ret.add(node.getVal());
		}
		return ret; 
    }
	public static void main(String[] args) {
		Tree tr=new Tree();
		TreeNode node=new TreeNode(0);
		int[] arr=new int[10];
		for(int i=1;i<11;i++) {
			arr[i-1]=i;
		}
		node=node.creatBinaryTree(arr);
		node.preOrdered(node);System.out.println();
		node.inOrderOrdered(node);System.out.println();
		ArrayList<Integer> ret=tr.PrintFromTopToBottom(node);
		Iterator it=ret.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}

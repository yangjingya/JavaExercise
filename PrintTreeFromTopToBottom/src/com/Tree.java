package com;

import java.util.ArrayList;
import java.util.Iterator;

/*从上往下打印出二叉树的每个节点，同层节点从左至右打印。*/

/*思路
 * 此处，arraylist充当的是队列的角色，现将父节点放入，接着，查看其是否有左右子节点，若有，则加入，并弹出父节点，将值放入结果集合中，只要队列不空，就循环执行
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

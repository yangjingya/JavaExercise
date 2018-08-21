package com;

import java.util.Stack;

/*���������Ķ�����������任ΪԴ�������ľ���
�������ľ����壺Դ������ 
		8
       /  \
	  6   10
	 / \  / \
	 5  7 9 11
	���������
	    8
	   /  \
	  10   6
	 / \  / \
	11 9 7  5
*/

/*˼·
 * ���������ӽڵ�ĸ��ڵ�����ҽڵ㽻��λ��
 * */

public class MirrorOfBinary {
	public void Mirror(TreeNode root) {
        //�ݹ�
		/*if(root==null) {
			return;
		}
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		if(root.left!=null) {
			Mirror(root.left);
		}
		if(root.right!=null) {
			Mirror(root.right);
		}*/
		//�ǵݹ�
		if(root==null) {
			return;
		}
		if(root.left==null&&root.right==null) {
			return;
		}
		Stack<TreeNode> st=new Stack<TreeNode>();
		st.push(root);
		while(!st.isEmpty()) {
			TreeNode node=st.pop();
			if(node.left!=null||node.right!=null) {
				TreeNode temp=node.left;
				node.left=node.right;
				node.right=temp;
			}
			if(node.left!=null) {
				st.push(node.left);
			}
			if(node.right!=null) {
				st.push(node.right);
			}
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5,6};
		TreeNode tr=new TreeNode(-1);
		tr=tr.creatBinaryTree(arr);
		tr.preOrdered(tr);System.out.println();
		tr.inOrderOrdered(tr);System.out.println();
		MirrorOfBinary m=new MirrorOfBinary();
		m.Mirror(tr);
		tr.preOrdered(tr);System.out.println();
		tr.inOrderOrdered(tr);
	}

}

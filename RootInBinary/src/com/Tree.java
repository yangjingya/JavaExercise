package com;

import java.io.Console;
import java.util.ArrayList;
import java.util.Iterator;

/*输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)*/

/*思路
 * 递归思想
 * 先在result中添加root的val，再让target减去相应的val，判断target是否为0，同时判断是否已经遍历到叶子节点，若是，则添加至ret
 * 每次返回上层时，result应自动移除一次尾部数据。
 * */

public class Tree {
	ArrayList<Integer> result=new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null) return ret;
        result.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null) {
        	ret.add(new ArrayList<Integer>(result));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        result.remove(result.size()-1);
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		Tree tr=new Tree();
		TreeNode node=new TreeNode(0);
		int[] arr=new int[10];
		for(int i=1;i<11;i++) {
			arr[i-1]=i;
		}
		node=node.creatBinaryTree(arr);
		list=tr.FindPath(node, 11);
		/*node.preOrdered(node);System.out.println();
		node.inOrderOrdered(node);System.out.println();*/
		for(int i=0;i<list.size();i++) {
			Iterator it=list.get(i).iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}

}

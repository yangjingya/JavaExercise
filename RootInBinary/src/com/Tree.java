package com;

import java.io.Console;
import java.util.ArrayList;
import java.util.Iterator;

/*����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����(ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)*/

/*˼·
 * �ݹ�˼��
 * ����result�����root��val������target��ȥ��Ӧ��val���ж�target�Ƿ�Ϊ0��ͬʱ�ж��Ƿ��Ѿ�������Ҷ�ӽڵ㣬���ǣ��������ret
 * ÿ�η����ϲ�ʱ��resultӦ�Զ��Ƴ�һ��β�����ݡ�
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

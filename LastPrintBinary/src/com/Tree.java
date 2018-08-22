package com;

/*输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。*/

/*已知条件：后序序列最后一个值为root；二叉搜索树左子树值都比root小，右子树值都比root大。
1、确定root；
2、遍历序列（除去root结点），找到第一个大于root的位置，则该位置左边为左子树，右边为右子树；
3、遍历右子树，若发现有小于root的值，则直接返回false；
4、分别判断左子树和右子树是否仍是二叉搜索树（即递归步骤1、2、3）。*/

public class Tree {
	public boolean VerifySquenceOfBST(int [] sequence) {
		Tree t=new Tree();
		if(sequence.length==0) return false;
		if(sequence.length==1) return true;
		return t.judge(sequence,0,sequence.length-1);    
    }
	
	public boolean judge(int[] se,int start,int end) {
		if(start>=end) return true;
		int i=start;
		while(se[i]<se[end]) {
			i++;
		}
		for(int j=i;j<end;j++) {
			if(se[j]<se[end])
				return false;
		}
		return judge(se,0,i-1)&&judge(se,i,end-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sequence=new int[]{2,9,5,17,17,15,19,18,12};
		Tree tr=new Tree();
		System.out.println(tr.VerifySquenceOfBST(sequence));
	}

}

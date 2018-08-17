package com;

/*����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡���������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�*/

/*˼·
 * 	�ݹ�˼�룬ÿ�ν������������������µĶ��������з�������������������׵����Ľڵ㣬�ٽ�������������ݽ��еݹ����
 * */

public class Rebuild {
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
	}
	
	private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
        
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);
          
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
                  
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tr=new TreeNode(0);
		Rebuild re=new Rebuild();
		int[] pre=new int[]{1,2,4,7,3,5,6,8};
		int[] in=new int[]{4,7,2,1,5,3,8,6};
		tr.preOrdered(re.reConstructBinaryTree(pre, in));System.out.println();
		tr.inOrderOrdered(re.reConstructBinaryTree(pre, in));System.out.println();
		tr.pastOrdered(re.reConstructBinaryTree(pre, in));
	}

}

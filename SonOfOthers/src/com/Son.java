package com;

/*�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
*/

/*˼·
 * ���õݹ飬����flag
 * �����ֿ�root1��root2�Ƿ��нڵ��ֵ��� 
 * ���� ����ƥ��������������Ƿ���� �������򷵻�false ����֮ǰƥ��Ĳ���
 * ��û�� �����ƥ����ڵ㡢�ҽڵ��Ƿ�����ȵ�
 * */
public class Son {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		Son s=new Son();
        if(root2==null) return false;
        if(root1==null && root2!=null) return false;      
        boolean flag = false;
        if(root1.val==root2.val){
            flag = s.isSubTree(root1, root2);
        }
        if(!flag){
            flag = HasSubtree(root1.left, root2);
            if(!flag){
                flag = HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }
       
    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if(root2==null) return true;
        if(root1==null && root2!=null) return false;      
        if(root1.val==root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }else{
            return false;
        }
    }
	
	public static void main(String[] args) {
		Son s=new Son();
		int[] arr1=new int[10];
		int[] arr2=new int[5];
		for(int i=0;i<10;i++) {
			arr1[i]=i;
		}
		for(int i=0;i<5;i++) {
			arr2[i]=i;
		}
		TreeNode root1=new TreeNode(0);
		root1=root1.creatBinaryTree(arr1);
		TreeNode root2=new TreeNode(0);
		root2=root2.creatBinaryTree(arr2);
		System.out.println(s.HasSubtree(root1, root2));;
		
	}
}

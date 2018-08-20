package com;

/*输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
*/

/*思路
 * 采用递归，设立flag
 * 首先现看root1和root2是否有节点的值相等 
 * 若有 继续匹配后面左右子树是否相等 若不等则返回false 继续之前匹配的步骤
 * 若没有 则继续匹配左节点、右节点是否有相等的
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

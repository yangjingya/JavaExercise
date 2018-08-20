package com;

/*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/

/*思路
 * 因为不能更换数据的相对位置，所以只能相邻交换或顺次移动
 * 一种方法 相邻交换 如下解题方法
 * 另一种方法 新建数组，现将所有奇数挑出来 加进去，再将所有偶数挑出来，加进去，最后返回
 * */
public class Change {
	public void reOrderArray(int [] array) {
        for(int i=0;i<array.length;i++) {
        	for(int j=0;j<array.length-1;j++) {
        		if(array[j]%2==0&&array[j+1]%2==1) {
        			int temp=array[j];
        			array[j]=array[j+1];
        			array[j+1]=temp;
        		}
        	}
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[] {1,2,22,33,34,54,24,44,55,62,78,89};
		Change c=new Change();
		c.reOrderArray(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}

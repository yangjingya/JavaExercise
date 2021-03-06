package com;

/*在一个二维数组中(每个一维数组的长度相同),每一行都按照从左到右递增的顺序排序,每一列都按照从上到下递增的顺序排序.请完成一个函数,输入这样的一个二维数组和一个整数,判断数组中是否含有该整数.
 * *思路
 * 		* 矩阵是有序的,从左下角来看,向上数字递减,向右数字递增，
		* 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
		* 要查找数字比左下角数字小时，上移
 * */


public class test {
	public boolean Find(int target, int [][] array) {
        int rowcount=array.length;
        int colcount=array[0].length;
       
        int i,j;
        for(i=rowcount-1,j=0;i>=0&&j<colcount;){
            if(target==array[i][j])
               return true;
            if(target>array[i][j])
               {
                  j++;
                  continue;
               }
            if(target<array[i][j])
               {
                  i--;
                  continue;
               }
       }
       return false;

   }
	
	public int[][] createArray(int row,int col) {
		int[][] arr=new int[row][col];
		int num=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=num;
				num++;
			}
		}
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		int [][]arr=t.createArray(10, 10);
		boolean ret = t.Find(10, arr);
		if(ret==true) {
			System.out.println("该数在数组中存在");
		}else {
			System.out.println("该数在数组中不存在");
		}
	}

}

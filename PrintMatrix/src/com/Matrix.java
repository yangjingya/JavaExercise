package com;

/*输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.*/

/*思路
 * 分为五个循环，最外一层控制循环次数，内部四个分别对应四个方向
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class Matrix {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> ret=new ArrayList<Integer>();
		if(matrix.length==0) return ret;
		int row=matrix.length;
		int col=matrix[0].length;
		int layers=(Math.min(row, col)-1)/2+1;
		for(int i=0;i<layers;i++) {
			for(int c=i;c<col-i;c++) {
				ret.add(matrix[i][c]);
			}
			for(int r=i+1;r<row-i;r++) {
				ret.add(matrix[r][col-i-1]);
			}
			for(int c=col-i-2;(c>=i)&&(row-1-i!=i);c--) {
				ret.add(matrix[row-1-i][c]);
			}
			for(int r=row-i-2;(r>i)&&(col-i-1!=i);r--) {
				ret.add(matrix[r][i]);
			}
		}
		return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=6;
		ArrayList arr=new ArrayList();
		int[][] matrix=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=(i+1)*(j+1);
				System.out.print(matrix[i][j]+" ");
			}
		}
		System.out.println();
		Matrix m=new Matrix();
		arr=m.printMatrix(matrix);
		Iterator it=arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}

package com;

/*����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.*/

/*˼·
 * ��Ϊ���ѭ��������һ�����ѭ���������ڲ��ĸ��ֱ��Ӧ�ĸ�����
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

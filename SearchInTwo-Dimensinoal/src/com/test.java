package com;

/*��һ����ά������(ÿ��һά����ĳ�����ͬ),ÿһ�ж����մ����ҵ�����˳������,ÿһ�ж����մ��ϵ��µ�����˳������.�����һ������,����������һ����ά�����һ������,�ж��������Ƿ��и�����.
 * *˼·
 * 		* �����������,�����½�����,�������ֵݼ�,�������ֵ�����
		* ��˴����½ǿ�ʼ���ң���Ҫ�������ֱ����½����ִ�ʱ������
		* Ҫ�������ֱ����½�����Сʱ������
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
			System.out.println("�����������д���");
		}else {
			System.out.println("�����������в�����");
		}
	}

}

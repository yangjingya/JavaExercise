package com;

/*����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣*/

/*˼·
 * ��Ϊ���ܸ������ݵ����λ�ã�����ֻ�����ڽ�����˳���ƶ�
 * һ�ַ��� ���ڽ��� ���½��ⷽ��
 * ��һ�ַ��� �½����飬�ֽ��������������� �ӽ�ȥ���ٽ�����ż�����������ӽ�ȥ����󷵻�
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

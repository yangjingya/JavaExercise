package com;

/*HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)*/

/*˼·
 * �����������ۼ� �������������������ڼ䱣�����ֵ����ʱ�滻
 * */

public class Max {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0) return -1; 
        int ret=array[0];
        int sum=0;
        for(int i=0;i<array.length;i++) {
        	if(sum<0) {
        		sum=array[i];
        	}else {
        		sum+=array[i];
        	}
        	if(sum>ret) {
        		ret=sum;
        	}
        }
        return ret;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max m=new Max();
		int[] arr=new int[] {6,-3,-2,7,-15,1,2,2};
		int ret=m.FindGreatestSumOfSubArray(arr);
		System.out.println(ret);
	}

}

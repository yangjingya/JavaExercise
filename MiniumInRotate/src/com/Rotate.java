package com;

/*��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��*/

/*˼·
 * ���������Ϊ�Ǽ����飬����ת���飬��Ȼ�ǽ���Сֵ�ŵ��˺��棬��ֻ��Ƚϳ��������е�һ��С��ǰһ��ֵ��ֵ�������ֵ�������������С��ֵ
 * */

public class Rotate {
	public int minNumberInRotateArray(int [] array) {
	    if(array.length==0) {
	    	return 0;
	    }
	    if(array.length==1) {
	    	return array[0];
	    }
	    int ret=array[0];
	    for(int i=0;i<array.length;i++) {
	    	if(ret>array[i]) {
	    		ret=array[i];
	    	}else {
	    		continue;
	    	}
	    }
	    return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[] {3,4,5,1,2};
		Rotate r=new Rotate();
		System.out.println("��СֵΪ:"+r.minNumberInRotateArray(array));;
	}

}

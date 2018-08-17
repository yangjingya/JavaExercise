package com;

/*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/

/*思路
 * 传入的数组为非减数组，其旋转数组，必然是将最小值放到了后面，则只需比较出，数组中第一个小于前一个值得值，则这个值就是这个数组最小的值
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
		System.out.println("最小值为:"+r.minNumberInRotateArray(array));;
	}

}

package com;

import java.util.ArrayList;
import java.util.Collections;

/*输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。*/

/*思路
 * 回溯法思想 现将数组中的所有内容调换顺序，再将其排序
 * */

public class ListTo {
	public String PrintMinNumber(int [] numbers) {
		ArrayList<String> list =new ArrayList<String>();
		Goback(list,numbers,0);
		Collections.sort(list);
		return list.get(0);
    }
	
	public void Goback(ArrayList<String> list,int[] arr,int index) {
		if(index==arr.length-1) {
			String str="";
			for(int i:arr) {
				str+=i;
			}
			list.add(str);
		}
		for(int i=index;i<arr.length;i++) {
			if(i==index||arr[i]!=arr[index]) {
				Swap(arr,i,index);
				Goback(list,arr,index+1);
				Swap(arr,i,index);
			}
		}
	}
	
	public void Swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTo list=new ListTo();
		int[] arr=new int[]{3,32,321};
		System.out.println(list.PrintMinNumber(arr));
		
	}

}

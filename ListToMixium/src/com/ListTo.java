package com;

import java.util.ArrayList;
import java.util.Collections;

/*����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��*/

/*˼·
 * ���ݷ�˼�� �ֽ������е��������ݵ���˳���ٽ�������
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

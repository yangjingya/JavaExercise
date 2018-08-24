package com;

import java.util.ArrayList;

/*输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。*/

public class Print {
	public void SelectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> ret=new ArrayList<Integer>();
		SelectSort(input);
		for(int i=0;i<k;i++) {
			ret.add(input[i]);
		}
		return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p=new Print();
		int[] arr=new int[] {4,5,1,6,2,7,3,8};
		ArrayList<Integer> ret=p.GetLeastNumbers_Solution(arr, 4);
		for(int i:ret) {
			System.out.print(i+" ");
		}
	}

}

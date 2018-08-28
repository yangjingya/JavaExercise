package com;

// Æ÷÷≈≈–Ú∑Ω∑®

public class Sorts {
	
	//1°¢√∞≈›≈≈–Ú
	public void Bubble(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	//2°¢—°‘Ò≈≈–Ú
	public void SelectSort(int[] arr) {
		int minIndex;
		for(int i=0;i<arr.length-1;i++) {
			minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	
	//3°¢≤Â»Î≈≈–Ú
	public void InsertSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int preIndex=i-1;
			int current=arr[i];
			while(preIndex>0&&arr[preIndex]>current) {
				arr[preIndex+1]=arr[preIndex];
				preIndex--;
			}
			arr[preIndex+1]=current;
		}
	}
	//4°¢œ£∂˚≈≈–Ú
	public void shellSort(int[] arr) {
		int d=arr.length;
		while(true) {
			d=d/2;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+d;j<arr.length;j+=d) {
					int temp=arr[j];
					int k;
					for(k=j-d;k>=0&&arr[k]<arr[j];k-=d) {
						arr[j]=arr[k];
					}
					arr[k+d]=temp;
				}
			}
			if(d==1) {
				break;
			}
		}
	}
	//5°¢πÈ≤¢≈≈–Ú
	
	//6°¢øÏÀŸ≈≈–Ú
	
	//7°¢∂—≈≈–Ú
	
	//8°¢º∆ ˝≈≈–Ú
	
	//9°¢Õ∞≈≈–Ú
	
	//10°¢ª˘ ˝≈≈–Ú

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorts s=new Sorts();
		int[] arr=new int[] {1,3,34,231,332,22,34,45,452,23,11,33,22,45};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
//		s.Bubble(arr);
//		s.SelectSort(arr);
//		s.InsertSort(arr);
		s.shellSort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

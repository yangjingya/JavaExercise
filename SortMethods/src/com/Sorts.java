package com;

//�������򷽷�

public class Sorts {
	
	//1��ð������
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
	
	//2��ѡ������
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
	
	//3����������
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
	
	//4��ϣ������
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
	
	//5���鲢����
	public void mergeSort(int[] a) {
		Sort(a,0,a.length-1);
	}
	
	public void Sort(int[] a,int left,int right) {
		if(left>=right) {
			return;
		}
		int mid=(left+right)/2;
		Sort(a,left,mid);
		Sort(a,mid+1,right);
		merge(a,left,mid,right);
	}
	
	public void merge(int[] a,int left,int mid,int right) {
		int[] temp=new int[a.length];
		int right1=mid+1;
		int tempStart=left;
		int oldList=left;
		while(left<=mid&&right1<=right) {
			if(a[left]<=a[right1]) {
				temp[tempStart++]=a[left++];
			}else {
				temp[tempStart++]=a[right1++];
			}
		}
		while(left<=mid) {
			temp[tempStart++]=a[left++];
		}
		while(right1<=right) {
			temp[tempStart++]=a[right1++];
		}
		while(oldList<=right) {
			a[oldList]=temp[oldList];
			oldList++;
		}
	}
	
	//6����������
	public void quickSort(int[] arr) {
		if(arr.length>0) {
			quick(arr,0,arr.length-1);
		}
	}
	
	public void quick(int[] arr,int start,int end) {
		if(start>end) {
			return;
		}
		int i=start;
		int j=end;
		int key=arr[start];
		while(i<j) {
			while(i<j&&arr[j]>key) {
				j--;
			}
			arr[i]=arr[j];
			while(i<j&&arr[i]<=key) {
				i++;
			}
			arr[j]=arr[i];
		}
		arr[i]=key;
		quick(arr,start,i-1);
		quick(arr,j+1,end);
	}
	
	//7��������
	public void heapSort(int[] arr) {
		for(int i=arr.length/2-1;i>=0;i--) {
			heap(arr,i,arr.length);
		}
		
		for(int j=arr.length-1;j>0;j--) {
			Swap(arr,0,j);
			heap(arr,0,j);
		}
	}
	
	public void heap(int[] arr,int i,int length) {
		int temp = arr[i];//��ȡ����ǰԪ��i
        for(int k=i*2+1;k<length;k=k*2+1){//��i�������ӽ�㿪ʼ��Ҳ����2i+1����ʼ
            if(k+1<length && arr[k]<arr[k+1]){//������ӽ��С�����ӽ�㣬kָ�����ӽ��
                k++;
            }
            if(arr[k] >temp){//����ӽڵ���ڸ��ڵ㣬���ӽڵ�ֵ�������ڵ㣨���ý��н�����
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//��tempֵ�ŵ����յ�λ��
	}
	
	public void Swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorts s=new Sorts();
		int[] arr=new int[] {1,3,34,231,332,22,34,45,452,23,11,33,22,45};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		s.Bubble(arr);
		s.SelectSort(arr);
		s.InsertSort(arr);
		s.shellSort(arr);
		s.mergeSort(arr);
		s.quickSort(arr);
		s.heapSort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

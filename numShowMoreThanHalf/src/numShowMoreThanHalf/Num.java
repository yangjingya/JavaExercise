package numShowMoreThanHalf;

/*数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。*/

public class Num {
	public void bubble(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					Swap(array,j,j+1);
				}
			}
		}
	}
	
	public void Swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public int MoreThanHalfNum_Solution(int [] array) {
		int length=array.length;
		int temp=array[0];
		int sum=1;
        bubble(array);
        for(int i=1;i<array.length;i++) {
        	if(temp==array[i]) {
        		sum++;
        		if(sum>length/2) {
        			return temp;
        		}else {
        			continue;
        		}
        	}else {
        		sum=1;
        		temp=array[i];
        	}
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,2,2,2,5,4,2};
		Num n=new Num();
		int ret=n.MoreThanHalfNum_Solution(arr);
		if(ret<0) {
			System.out.println("无此数");
		}else {
			System.out.println("该数为："+ret);
		}
	}

}

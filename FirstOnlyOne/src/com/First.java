package com;

/*��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.*/

public class First {
	public int FirstNotRepeatingChar(String str) {
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='0') {
				continue;
			}
			char index=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(index==arr[j]) {
					arr[j]='0';
					arr[i]='0';
				}else {
					if(j!=arr.length-1) {
						continue;
					}else {
						if(arr[i]!='0') {
							return i;
						}else {
							continue;
						}
					}
				}
			}
		}
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=new First();
		String str="sdhuiawsuhdu";
		System.out.println(f.FirstNotRepeatingChar(str));;
	}

}

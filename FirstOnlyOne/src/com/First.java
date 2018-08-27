package com;

/*在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.*/

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

package com;

/*����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��*/

/*��֪�����������������һ��ֵΪroot������������������ֵ����rootС��������ֵ����root��
1��ȷ��root��
2���������У���ȥroot��㣩���ҵ���һ������root��λ�ã����λ�����Ϊ���������ұ�Ϊ��������
3����������������������С��root��ֵ����ֱ�ӷ���false��
4���ֱ��ж����������������Ƿ����Ƕ��������������ݹ鲽��1��2��3����*/

public class Tree {
	public boolean VerifySquenceOfBST(int [] sequence) {
		Tree t=new Tree();
		if(sequence.length==0) return false;
		if(sequence.length==1) return true;
		return t.judge(sequence,0,sequence.length-1);    
    }
	
	public boolean judge(int[] se,int start,int end) {
		if(start>=end) return true;
		int i=start;
		while(se[i]<se[end]) {
			i++;
		}
		for(int j=i;j<end;j++) {
			if(se[j]<se[end])
				return false;
		}
		return judge(se,0,i-1)&&judge(se,i,end-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sequence=new int[]{2,9,5,17,17,15,19,18,12};
		Tree tr=new Tree();
		System.out.println(tr.VerifySquenceOfBST(sequence));
	}

}

package com;

/*���⣺
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
*/

/*˼·
 * ���ɷ��ܽᣬ���������쳲��������й���
 * */
public class Cover {
	
	public static int RectCover(int target) {
        if(target<=0)
            return 0;
        else if(target==1)
            return 1;
        else if(target==2)
            return 2;
        else
            return RectCover(target-1)+RectCover(target-2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("һ��"+RectCover(5)+"�ַ���");
	}

}

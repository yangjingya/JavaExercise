package com;

import java.util.ArrayList;
import java.util.Iterator;

/*����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��*/

/*˼·
 * ���ݷ�
 * */
public class Sort {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> ret = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return ret;
		}
		GoBack(ret, 0, str.toCharArray());
		return ret;
	}

	public void GoBack(ArrayList<String> ret, int index, char[] result) {
		if (index == result.length - 1) {
			ret.add(new String(result));
		}
		for (int i = index; i < result.length; i++) {
			if (i == index || result[i] != result[index]) {
				Swap(result, i, index);// ��һ�㽻��
				GoBack(ret, index + 1, result);// �²㽻��
				Swap(result, i, index);// �ָ�����ʼ����
			}
		}
	}

	public void Swap(char[] temp, int i, int j) {
		char t = temp[i];
		temp[i] = temp[j];
		temp[j] = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort s = new Sort();
		String str = "abcd";
		ArrayList<String> list = s.Permutation(str);
		for(String l : list) {
			System.out.print(l + " ");
		}
	}

}

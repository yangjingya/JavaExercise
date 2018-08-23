package com;

import java.util.ArrayList;
import java.util.Iterator;

/*输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。*/

/*思路
 * 回溯法
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
				Swap(result, i, index);// 第一层交换
				GoBack(ret, index + 1, result);// 下层交换
				Swap(result, i, index);// 恢复到初始序列
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

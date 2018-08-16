package com;

/*请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。*/

/*思路
	接收类型为stringbuffer，返回类型为string，所以会用到转换，再利用stringbuilder新建变量创建新的数据
*/
public class Replace {
	public String replaceSpace(StringBuffer str) {
    	String s=str.toString();
    	char[] ch=s.toCharArray();
    	StringBuilder sBuilder=new StringBuilder();
    	for( char c : ch) {
    		if(c==' ') {
    			sBuilder.append("%20");
    		}else {
    			sBuilder.append(c);
    		}
    	}
    	return sBuilder.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replace rep=new Replace();
		StringBuffer sBuffer=new StringBuffer("How are you");
		System.out.println(rep.replaceSpace(sBuffer));
	}

}

package com;

/*��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��*/

/*˼·
	��������Ϊstringbuffer����������Ϊstring�����Ի��õ�ת����������stringbuilder�½����������µ�����
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

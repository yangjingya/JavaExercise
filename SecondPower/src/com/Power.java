package com;

/*����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���*/

public class Power {
	public double Power(double base, int exponent) {
        double temp=1;
        if(exponent>0) {
        	for(int i=0;i<=exponent;i++) {
        		temp=temp*base;
        		if(temp>1.7976931348623157E308) {
        			System.out.println("�Ѿ�����double���͵�ȡֵ��Χ��");
                    return -1;
        		}
        	}
        	return temp;
        }else if(exponent<0) {
        	exponent=-exponent;
        	for(int i=0;i<=exponent;i++) {
        		temp=temp*base;
        		if(temp>1.7976931348623157E308) {
        			System.out.println("�Ѿ�����double���͵�ȡֵ��Χ��");
                    return -1;
        		}
        	}
        	temp=1/temp;
        	return temp;
        }else {
        	return temp;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p=new Power();
		
		System.out.println(p.Power(1.5,1000));
	}

}

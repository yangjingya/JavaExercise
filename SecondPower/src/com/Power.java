package com;

/*给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。*/

public class Power {
	public double Power(double base, int exponent) {
        double temp=1;
        if(exponent>0) {
        	for(int i=0;i<=exponent;i++) {
        		temp=temp*base;
        		if(temp>1.7976931348623157E308) {
        			System.out.println("已经超出double类型的取值范围。");
                    return -1;
        		}
        	}
        	return temp;
        }else if(exponent<0) {
        	exponent=-exponent;
        	for(int i=0;i<=exponent;i++) {
        		temp=temp*base;
        		if(temp>1.7976931348623157E308) {
        			System.out.println("已经超出double类型的取值范围。");
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

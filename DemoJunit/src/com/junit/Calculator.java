package com.junit;

public class Calculator {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int subtract(int num1,int num2) {
		return num1-num2;
	}
	public int Multiply(int num1,int num2)
	{
		return num1*num2;
		
	}
	public int Divide(int num1,int num2) throws InvalidDivisorException
	{
		if(num2<=0)
		{
			throw new InvalidDivisorException("Invalid Divisor");
		}
		return num1/num2;
	}

}

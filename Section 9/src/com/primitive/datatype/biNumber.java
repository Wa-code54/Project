package com.primitive.datatype;

public class biNumber {
      private int number1;
      private int number2;
      
      public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public biNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 =number2;
		// TODO Auto-generated constructor stub
	}
    public int add() {
    
    	return number1 +number2;
    }
    
    public int multiply() {
    	return number1 * number2;
    
    }
    public void doubleValue() {
    	this.number1 *= 2;
    	this.number2 *= 2;
    }
    }

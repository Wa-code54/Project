package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MotorBike ducati= new MotorBike();
         MotorBike suzuki = new MotorBike();
         
         ducati.start();
          suzuki.start();
          
          ducati.speed=100;
          suzuki.speed=120;
          System.out.println(ducati.speed);
          System.out.println(suzuki.speed);
	}

}

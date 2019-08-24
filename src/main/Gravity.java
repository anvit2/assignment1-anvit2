/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
		Scanner sc = new Scanner((System.in));
		double gravity=9.8;
		double time= sc.nextDouble();
		double speed;
		double distance;
		speed=gravity *time;
		distance=(1/2.0)*gravity*time*time;
		System.out.println("The speed of the object at time="+time+"Second  after its release is"+speed+"the distance the object has travelled in the time"+time+"seconds after the relase is"+distance);


	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}

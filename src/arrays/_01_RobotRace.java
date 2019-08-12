package arrays;

import java.awt.AWTException;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
	Robot[] r =new Robot[5];
	
	//3. use a for loop to initialize the robots.
for (int i = 0; i < r.length; i++) {
	
		r[i] = new Robot();
		r[i].setSpeed(10);
		// TODO Auto-generated catch block
		
	
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for (int i = 0; i < r.length; i++) {
	r[i].setX(100*i+300);
	r[i].setY(500);

	
}
	//5. use another for loop to iterate through the array and make each robot move 
//   a random amount less than 50.

while (true) {
for (int i = 0; i < r.length; i++) {
	
		
	
	Random ra = new Random();
	
	r[i].move(ra.nextInt(50));
	if(r[i].getY()<=0) {
		break;
	}
	}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
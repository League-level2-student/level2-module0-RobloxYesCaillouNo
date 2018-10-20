package arrays;

import java.awt.AWTException;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
import java.util.Random;
public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) throws AWTException {

		// 2. create an array of 5 robots.
		Robot[]p= new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < p.length; i++) {
			p[i]= new Robot();
			p[i].setSpeed(10);
		}
	p[1].setWindowSize(2000, 1000);
		// 4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < p.length; i++) {
		p[i].setX(420*i);
		p[i].setY(850);
	}
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
	boolean isAtTop = false;
	for (int i = 0; i < p.length; i++) {
		if (p[i].getY() <= 100) {
			isAtTop = true;
		System.out.println("test");
		}
	}	
	while(isAtTop == false) {
			for (int i = 0; i < p.length; i++) {
				int rand = new Random().nextInt(50);
				p[i].move(rand);
				
			}
		}
		// 7. declare that robot the winner and throw it a party!
		if (isAtTop == true) {
			p[0].setWindowColor(Color.GREEN);
		}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
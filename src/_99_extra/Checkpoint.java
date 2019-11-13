package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	
	
	String input = JOptionPane.showInputDialog("What is your favorite color"); 
	JOptionPane.showMessageDialog(null,input + " is my favorite color too");
	
	Robot hi= new Robot();
	hi.setSpeed(10);
	hi.penDown();
	
	for (int i = 0; i < 4; i++) {
		hi.move(250);
		hi.turn(90);
	}	
	
	
	
	

}
}

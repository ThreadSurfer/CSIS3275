/**
 * 
 */
package myJavaProject;

import javax.swing.JOptionPane;

/**
 * @author gilad
 *
 */
public class myTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myName = JOptionPane.showInputDialog("Please enter your name");
		int myAge = Integer.parseInt(JOptionPane.showInputDialog("please enter your age"));
		
		// greet person and tell them their age.
		
		System.out.println("Hello, my name is " + myName +
				" and I am " + myAge + " years old.");
		
		bouncerResponse(myName, myAge);

	}
	
	public static void bouncerResponse(String name, int age) {
		if (age >= 19)
			System.out.println("Welcome " + name + ". You may enter the bar.");
		else
			System.out.println("Sorry " + name +". You are too young to enter.");
	}

}

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

	}

}

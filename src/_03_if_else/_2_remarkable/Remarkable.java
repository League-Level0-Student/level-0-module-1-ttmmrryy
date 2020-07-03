package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String person1 = "You are funny.";
		String person2 = "You are cool.";
		String person3 = "You are nice.";
		String person4 = "You are smart.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String input = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if(input.equalsIgnoreCase("Jack")) {
			JOptionPane.showMessageDialog(null, person1);
		}
		else if(input.equalsIgnoreCase("Ron")) {
			JOptionPane.showMessageDialog(null, person2);
		}
		else if(input.equalsIgnoreCase("Max")) {
			JOptionPane.showMessageDialog(null, person3);
		}
		else if(input.equalsIgnoreCase("John")) {
			JOptionPane.showMessageDialog(null, person4);
		}
		else {
				JOptionPane.showMessageDialog(null, "Could not find your name.");
		}
	}
}


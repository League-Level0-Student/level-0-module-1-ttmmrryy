package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your birtday? Enter the month / day");
		if(input.contentEquals("7/3")) {
			JOptionPane.showMessageDialog(null, "Happy birthday to you!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday to you!");
		}
	}
}

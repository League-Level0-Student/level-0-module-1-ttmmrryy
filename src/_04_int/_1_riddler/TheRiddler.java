package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
				"Who buys it, has no use for it.\r\n" + 
				"Who uses it can neither see nor feel it.\r\n" + 
				"What is it? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input.equalsIgnoreCase("A Coffin")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer was a coffin.");
		}
		// 6. Add some more riddles
		
		
		
		String input2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(input2.equalsIgnoreCase("A Stamp")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer was a stamp.");
		}
		
		
		
		String input3 = JOptionPane.showInputDialog("What runs all around a backyard, yet never moves? ");
		if(input3.equalsIgnoreCase("A Fence")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer was a fence.");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is : " + score + " / 3");
	}
}


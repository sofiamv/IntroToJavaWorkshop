package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class MagicEightBall {
	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int number;
	number= new Random().nextInt(4);

		// 3. Print out this variable
	System.out.println(number);

		// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Type a message for the magic 8 ball.");
	
		// 5. If the random number is 0
	if(number==0){
	
	

		// -- tell the user "Yes"
		JOptionPane.showMessageDialog(null,"yes.");
}

		// 6. If the random number is 1
	if(number==1){
		JOptionPane.showMessageDialog(null, "No.");
	}

		// -- tell the user "No"

		// 7. If the random number is 2
	if(number==2){
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
	if(number==3){
		JOptionPane.showMessageDialog(null, "Look, the magic eight ball actually doesn't care about your question, or your well being. It is an inanimate object. Therefore,it cannot answer your question. Have a good day.");
	}

		// -- write your own answer
	
}
}

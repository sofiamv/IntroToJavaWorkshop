package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		String word;
		word="spaghetti";
		String answer;

		speak("Spell the word, spaghetti.");
		// 2. Catch the user's answer in a String
		answer= JOptionPane.showInputDialog(null);

		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equals(word)){
		speak("correct.");
		}
		
		
		
		// 4. Otherwise say "wrong"
		else {speak("you are wrong!");}

		// 5. repeat the process for other words
		String wordtwo;
		wordtwo= "pfeffernuss";
		String answertwo;
		
		speak("Now, spell the word Pfeffernuss");
		answertwo= JOptionPane.showInputDialog(null);
		if(answertwo.equals(wordtwo)){
			speak("Yes! correct once more incredible job kiddo.");
		}
		else {speak("You are wrong again!!! Work on spelling.");}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



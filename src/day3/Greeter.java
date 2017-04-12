package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name;
	name=JOptionPane.showInputDialog("Type your name.");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, "Salutations, "+name);

}
}

package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday": 
			for(int i = 0; i > -1; i++) {	
				System.out.println(":)");
			}
			break;
		case "Monday": 
			System.out.println(":(\n:[\n:/");
			break;
		case "Tuesday": 
			System.out.println("=(");
			break;
		case "Wednesday": 
			System.out.println("3");
			break;
		case "Thursday": 
			System.out.println("2");
			break;
		case "Friday": 
			System.out.println("1");
			break;
		case "Saturday": 
			System.out.println("over nine 1,000");
			break;
		}
	}
}

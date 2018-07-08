import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
		String something = "hello";

		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		JOptionPane.showMessageDialog(null, something.charAt(2));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length
		JOptionPane.showMessageDialog(null, something.length());

		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
			for (int u = 0; u < 5; u++) {
				JOptionPane.showMessageDialog(null, something.charAt(u));
				JOptionPane.showMessageDialog(null, u);
			}

		JOptionPane.showMessageDialog(null, "Character e is at index 1");
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}



import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("what kind of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "Pet Tasks", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "feed", "water", "walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			while (0==0) {
			 if (task == 0) {
					feedPet();
				}
			 if (task == 1) {
					waterPet();
				}
			 if (task == 2) {
					walkPet();
				}
				else if (happinessLevel > 20) {
					break;
				}
			 task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "Pet Tasks", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "feed", "water", "walk" }, null);
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void feedPet() {
		JOptionPane.showMessageDialog(null, "Your pet ate the food and is no longer starving");
		happinessLevel++;
		
	}
	public static void waterPet() {
		JOptionPane.showMessageDialog(null, "Your pet is thoroughly nourished with dihydrogen monoxide");
		happinessLevel=happinessLevel + 2;
	}
	
	public static void walkPet() {
		JOptionPane.showMessageDialog(null, "Your pet is now ripped");
		happinessLevel=happinessLevel + 3;
	}
}
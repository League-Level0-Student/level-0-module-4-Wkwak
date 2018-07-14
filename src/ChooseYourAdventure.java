import javax.swing.JOptionPane;

public class ChooseYourAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "here is a story");
		String end = JOptionPane.showInputDialog("do you want to continue ... please say no");
		if (end.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Too bad I don't feel like thinking of a story");
		}
		if (end.equals("no")) {
			JOptionPane.showMessageDialog(null, "Right thanks");
		}
	}
}

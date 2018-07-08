import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What is your test score?");
		double truescore = Double.parseDouble(score);
		if (truescore < 50) {
			JOptionPane.showMessageDialog(null, "hey that's pretty good!");
		}
		if (truescore > 90) {
			JOptionPane.showConfirmDialog(null, "eh could've done better");
		}
	}
}

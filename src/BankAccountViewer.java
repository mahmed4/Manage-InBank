import javax.swing.JFrame;
import javax.swing.JPanel;


public class BankAccountViewer {

	public static void main(String[] args) {
		// Md Ahmed
		BankAccount b = new BankAccount(00);
		 JFrame frame = new BankAccountFrame(b);
		
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}

}

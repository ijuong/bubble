package bubble.test.ex01;

import javax.swing.JFrame;
import javax.swing.JButton;

public class BubbleFrame extends JFrame {
	
	public BubbleFrame() {
		setSize(1000, 640);
		getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(53, 63, 117, 29);
		getContentPane().add(btnNewButton);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BubbleFrame();

	}
}


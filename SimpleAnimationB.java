package try1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//circle can change color

public class SimpleAnimationB {
	JFrame frame;
	boolean m = true;

	public static void main(String[] args) {
		SimpleAnimationB gui = new SimpleAnimationB();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton Button = new JButton("Change Color");
		Button.addActionListener(new ButtonListener());
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, Button);
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}

	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			if (m) {
				g.setColor(Color.white);
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				g.setColor(Color.green);
				g.fillOval(70, 70, 40, 40);
				m = false;

			} else {
				g.setColor(Color.white);
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				g.setColor(Color.orange);
				g.fillOval(70, 70, 40, 40);
				m = true;
			}
		}
	}

}

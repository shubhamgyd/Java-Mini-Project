package GroceryItems;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GroceryBillingSystem extends JFrame implements ActionListener {

	GroceryBillingSystem() {
//		setSize(1107, 458);
//		setLocation(400, 240);
		setBounds(400, 240, 1107, 458);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("a1/first.jpg.png"));
		JLabel image = new JLabel(i1);
		image.setBounds(0, 0, 1107, 458); // location'x', location'y', length,
		// breadth
		add(image);

		JLabel text = new JLabel("Grocery Billing System");
		text.setBounds(20, 300, 1000, 100);
		text.setForeground(Color.BLACK);
		text.setFont(new Font("serif", Font.PLAIN, 70));
		image.add(text);

		JButton next = new JButton("Next");
		next.setBounds(900, 300, 150, 50);
		next.setForeground(Color.RED);
		next.addActionListener(this);
		next.setFont(new Font("serif", Font.BOLD, 30));

		image.add(next);
		setVisible(true);

		while (true) {
			text.setVisible(false);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			text.setVisible(true);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new login();
	}
	public static void main(String[] args) {

		new GroceryBillingSystem();

	}


}

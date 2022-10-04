package GroceryItems;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class dashboard extends JFrame {
	dashboard() {
		setBounds(0, 0, 1550, 1000);
		setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("a1/third.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 1550, 1000);
		add(image);

		JLabel text = new JLabel("THE D-MART WELCOMES YOU");
		text.setBounds(450, 80, 1000, 70);
		text.setFont(new Font("Tahoma", Font.PLAIN, 70));
		text.setForeground(Color.white);
		image.add(text);

		JMenuBar mb = new JMenuBar();
		mb.setBounds(0, 0, 1550, 30);
		image.add(mb);

		JMenu grocery = new JMenu("GROCERY MANAGMENT");
		grocery.setForeground(Color.red);
		mb.add(grocery);
//Adding items to menu grocery
		JMenuItem Save = new JMenuItem("ADD ITEM");
		grocery.add(Save);

		JMenuItem Edit = new JMenuItem("EDIT ITEM");
		grocery.add(Edit);

		JMenuItem Print = new JMenuItem("PRINT BILL");
		grocery.add(Print);

		JMenu admin = new JMenu("ADMIN");
		admin.setForeground(Color.BLUE);

		JMenuItem Ad = new JMenuItem("ADD NEW USER");
		admin.add(Ad);

		JMenuItem Ediit = new JMenuItem("EDIT USER");
		admin.add(Ediit);

		mb.add(admin);

		setVisible(true);
	}

	public static void main(String[] args) {
		new dashboard();
	}
}

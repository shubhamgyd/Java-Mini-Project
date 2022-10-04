package GroceryItems;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class adduser extends JFrame implements ActionListener
{

	JTextField txt1, txt2, txt3, txt4, txt5;
	JRadioButton rbmale, rbfemale;
	JButton submit;

	adduser() {
		setBounds(30, 30, 1500, 900);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("a1/fourth.jpg"));
		Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(800, 150, 450, 450);
		add(image);

	setLayout(null);
	JLabel ab = new JLabel("Name");
	ab.setBounds(30, 40, 100, 30);
	ab.setFont(new Font("Tahoma", Font.PLAIN, 20));
	add(ab);

	txt1 = new JTextField("");
	txt1.setBounds(140, 40, 300, 30);
	txt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	add(txt1);

	JLabel ad1 = new JLabel("Address: ");
	ad1.setBounds(30, 80, 90, 30);
	ad1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	add(ad1);

	txt2 = new JTextField();
	txt3 = new JTextField();
	txt2.setBounds(140, 80, 700, 30);
	txt3.setBounds(140, 110, 700, 30);
	txt2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	txt3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	add(txt2);
	add(txt3);

	JLabel ad2 = new JLabel("Mobile Number: ");
	ad2.setBounds(30, 150, 200, 30);
	ad2.setFont(new Font("Calibri", Font.BOLD, 20));
	add(ad2);

	txt4 = new JTextField();
	txt4.setBounds(220, 150, 200, 30);
	txt4.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(txt4);

	JLabel ad3 = new JLabel("Email Id:");
	ad3.setBounds(30, 190, 200, 30);
	ad3.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(ad3);

	txt5 = new JTextField();
	txt5.setBounds(220, 190, 400, 30);
	txt5.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(txt5);
	setVisible(true);

	JLabel ad4 = new JLabel("Gender");
	ad4.setBounds(30, 240, 100, 30);
	ad4.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(ad4);

	rbfemale = new JRadioButton("Female");
	rbfemale.setBounds(140, 240, 70, 30);
	rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
	rbfemale.setBackground(Color.WHITE);
	add(rbfemale);

	rbmale = new JRadioButton("male");
	rbmale.setBounds(220, 240, 70, 30);
	rbmale.setFont(new Font("Tahoma", Font.PLAIN, 14));
	rbmale.setBackground(Color.WHITE);
	add(rbmale);

	ButtonGroup bg = new ButtonGroup();
	bg.add(rbfemale);
	bg.add(rbmale);

	submit = new JButton("SUBMIT");
	submit.setBackground(Color.blue);
	submit.setForeground(Color.gray);
	submit.setBounds(30, 290, 150, 30);
	submit.addActionListener(this);
	add(submit);
}

@Override
public void actionPerformed(ActionEvent ae) {
		String Name = txt1.getText();
		String address = txt2.getText();
		String Mobile = txt4.getText();
		String Email = txt5.getText();

		String gender = null;

		if (Name.equals("")) {
			JOptionPane.showMessageDialog(null, "Name should not be empty");
			return;
		}

		if (rbmale.isSelected()) {
			gender = "Male";
		} else if (rbfemale.isSelected()) {
			gender = "Female";
		}
		try {
			Conn conn = new Conn();

			String query = "insert into User values('" + Name + "', '" + address + "', '" + Mobile + "', '" + Email
					+ "', '" + gender + "')";
			conn.s.executeUpdate(query);

			JOptionPane.showMessageDialog(null, "User added successfully");

			setVisible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	public static void main(String[] args) {
		new adduser();

	}


	

}

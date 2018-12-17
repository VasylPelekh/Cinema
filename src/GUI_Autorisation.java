import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class GUI_Autorisation extends JFrame {

	private JLabel LoginLabel = new JLabel("Login: ");
	private JTextField LoginInput = new JTextField();

	private JLabel PasswordLabel=new JLabel("Password:");    
	private JPasswordField PasswordInput = new JPasswordField();   

	private JButton logginButton = new JButton("Log In");
	private JButton guestButton = new JButton("Guest");
	protected Component controllingFrame;

	public GUI_Autorisation() {
		super("Autorisation");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 2, 80, 80));

		container.add(LoginLabel);
		container.add(LoginInput);

		container.add(PasswordLabel);
		container.add(PasswordInput);

		container.add(logginButton);
		container.add(guestButton);


		guestButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				GUI_Guest app1 = new GUI_Guest();
				app1.setVisible(true);
			}
		});

		logginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Iterator<User> iter = Program.users.iterator();
				String log = LoginInput.getText();
				String pas = PasswordInput.getText();

				while (iter.hasNext()){
					User user = iter.next();

					if (user.getLogin().equals(log)&&user.getParol().equals(pas)){
							GUI_Admin app = new GUI_Admin();
							app.setVisible(true);
							break;
						}else {
							JOptionPane.showMessageDialog(controllingFrame,
									"Invalid Username or Password. Try again.",
									"Error Message",
									JOptionPane.ERROR_MESSAGE);
						} 
				}
					
					
			}
		});
	}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package login;

import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.*;
/**
 *
 * @author jasonyitro
 */
public class LoginView {
	JButton jBtnLoginCustomer, jBtnLoginStaff;
	JTextField jTxtUsername;
	JPasswordField jTxtPassword;
	JPanel panel;

	public void GUI(JFrame frame) {
		panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel jLblLogin = new JLabel("WELCOME TO LOGIN MENU!!");
		
		JLabel jLblUsername = new JLabel("USERNAME: ");
		JLabel jLblPassword = new JLabel("PASSWORD: ");
		jTxtUsername = new JTextField(8);
		jTxtPassword = new JPasswordField(8);
		jBtnLoginCustomer = new JButton("CUSTOMER LOGIN");
		jBtnLoginStaff = new JButton("ADMIN LOGIN");
		
		
		Font font1 = new Font("SansSerif", Font.BOLD, 25);
		jLblLogin.setFont(font1);
		
		
		jLblLogin.setBounds(340, 90, 500, 30);
		jLblUsername.setBounds(330, 180, 100, 30);
		jTxtUsername.setBounds(490, 180, 200, 30);
		jLblPassword.setBounds(330, 250, 100, 30);
		jTxtPassword.setBounds(490, 250, 200, 30);
		
		jBtnLoginCustomer.setBounds(340, 350, 150, 30);
		jBtnLoginStaff.setBounds(530, 350, 150, 30);
		
		
		
		panel.add(jLblLogin);
		panel.add(jLblUsername);
		panel.add(jTxtUsername);
		panel.add(jLblPassword);
		panel.add(jTxtPassword);
		panel.add(jBtnLoginCustomer);
		panel.add(jBtnLoginStaff);

		panel.setSize(1000, 700);
		frame.add(panel);
	}

	public String getUsername() throws IOException {
                Date date = new Date();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
            
                FileWriter fileWriter = new FileWriter("./src/resources/loginActivity.txt", true);
                PrintWriter out = new PrintWriter(fileWriter);
                out.println(jTxtUsername.getText().trim() + " " + dtf.format(now));
                out.close();
            
		return jTxtUsername.getText().trim();
	}

	public String getPassword() {
		return jTxtPassword.getText().trim();
	}

	public JPanel getPanel() {
		return this.panel;
	}
}

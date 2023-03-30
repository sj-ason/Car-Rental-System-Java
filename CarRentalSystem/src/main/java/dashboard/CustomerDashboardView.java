/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package dashboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import user.User;
/**
 *
 * @author jasonyitro
 */
public class CustomerDashboardView {
	JPanel panel, userDataPanel, hiredVehiclePanel;
	JFrame frame;
	JList<String> list1, list2, list3, hiredVehicleList;
	JButton jBtnRequestVehicle, jBtnViewProfile, jBtnDisplayVehicles, jBtnDisplayHiredVehicles, jBtnLogout;
	JLabel jLblIdentificationNumber, jLblIdentificationNumberValue, jLblCorporationName, jLblCorporationNameValue,
			jLblAddress, jLblAddressValue, jLblPhoneNumber, jLblPhoneNumberValue, jLblEmail, jLblEmailValue,
			jLblUsername, jLblUsernameValue, jLblCarTitle, jLblLorryTitle, jLblMinibusTitle, jLblHiredVehicle, jLblProfileTitle;
	JScrollPane carScrollPane, lorryScrollPane, minibusScrollPane;

	public void GUI(JFrame frame) {
		//customer dashboard
		this.frame = frame;
		panel = new JPanel();
		panel.setLayout(null);

		jBtnRequestVehicle = new JButton("REQUEST TO RENT");
		jBtnViewProfile = new JButton("VIEW PROFILE");
		jBtnDisplayVehicles = new JButton("DISPLAY VEHICLES");
		jBtnDisplayHiredVehicles = new JButton("DISPLAY RENTED VEHICLES");
		jBtnLogout = new JButton("LOG OUT");

		jBtnViewProfile.setBounds(190, 10, 200, 30);
		jBtnRequestVehicle.setBounds(400, 10, 200, 30);
		jBtnDisplayVehicles.setBounds(400, 10, 200, 30);
		jBtnDisplayHiredVehicles.setBounds(610, 10, 200, 30);
		jBtnLogout.setBounds(10, 620, 200, 30);

		jBtnDisplayVehicles.setVisible(false);

		panel.add(jBtnViewProfile);
		panel.add(jBtnRequestVehicle);
		panel.add(jBtnDisplayVehicles);
		panel.add(jBtnDisplayHiredVehicles);
		panel.add(jBtnLogout);
		panel.setSize(1000, 700);
		frame.add(panel);
	}

	public void displayVehicles(DefaultListModel<String> l1, DefaultListModel<String> l3, DefaultListModel<String> l2,
			ArrayList<String> list) {
		carScrollPane = new JScrollPane();
		lorryScrollPane = new JScrollPane();
		minibusScrollPane = new JScrollPane();
		
		jLblCarTitle = new JLabel("CARS FOR RENT");
		jLblLorryTitle = new JLabel("LORRY FOR RENT");
		jLblMinibusTitle = new JLabel("MINIBUS FOR RENT");
		
		list1 = new JList<>(l1);
		carScrollPane.setViewportView(list1);
		carScrollPane.setBounds(150, 90, 700, 100);
		jLblCarTitle.setFont(new Font("Serif", Font.BOLD, 20));
		jLblCarTitle.setBounds(415, 60, 200, 30);
		panel.add(jLblCarTitle);
		panel.add(carScrollPane);

		// display Lorry on JList
		
		list2 = new JList<>(l2);
		lorryScrollPane.setViewportView(list2);
		lorryScrollPane.setBounds(150, 240, 700, 100);
		jLblLorryTitle.setFont(new Font("Serif", Font.BOLD, 20));
		jLblLorryTitle.setBounds(415, 200, 200, 30);
		panel.add(lorryScrollPane);
		panel.add(jLblLorryTitle);

		// display Minibus on JList
		list3 = new JList<>(l3);
		minibusScrollPane.setViewportView(list3);
		minibusScrollPane.setBounds(150, 390, 700, 100);
		
		jLblMinibusTitle.setFont(new Font("Serif", Font.BOLD, 20));
		jLblMinibusTitle.setBounds(415, 350, 200, 30);
		panel.add(minibusScrollPane);
		panel.add(jLblMinibusTitle);
	}

	public void displayUserData(User user) {
		userDataPanel = new JPanel();
		
		jLblIdentificationNumber = new JLabel("IDENTIFICATION NUMBER: ");
		jLblIdentificationNumberValue = new JLabel(user.getIdentificationNumber());
		jLblCorporationName = new JLabel("CORPORATION NAME: ");
		jLblCorporationNameValue = new JLabel(user.getCorporationName());
		jLblAddress = new JLabel("ADDRESS: ");
		jLblAddressValue = new JLabel(user.getAddress());
		jLblPhoneNumber = new JLabel("PHONE NUMBER: ");
		jLblPhoneNumberValue = new JLabel(user.getPhoneNumber());
		jLblEmail = new JLabel("EMAIL: ");
		jLblEmailValue = new JLabel(user.getEmail());
		jLblUsername = new JLabel("USERNAME: ");
		jLblUsernameValue = new JLabel(user.getUsername());

		userDataPanel.setLayout(new BoxLayout(userDataPanel, BoxLayout.Y_AXIS));
		jLblProfileTitle = new JLabel("YOUR INFORMATION");
		userDataPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		userDataPanel.add(jLblIdentificationNumber);
		userDataPanel.add(jLblIdentificationNumberValue);
		userDataPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		userDataPanel.add(jLblCorporationName);
		userDataPanel.add(jLblCorporationNameValue);
		userDataPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		userDataPanel.add(jLblAddress);
		userDataPanel.add(jLblAddressValue);
		userDataPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		userDataPanel.add(jLblPhoneNumber);
		userDataPanel.add(jLblPhoneNumberValue);
		userDataPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		userDataPanel.add(jLblEmail);
		userDataPanel.add(jLblEmailValue);
		userDataPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		userDataPanel.add(jLblUsername);
		userDataPanel.add(jLblUsernameValue);
		userDataPanel.setVisible(true);
		jLblProfileTitle.setVisible(true);

		jLblProfileTitle.setFont(new Font("Serif", Font.BOLD, 20));
		userDataPanel.setBounds(400, 120, 300, 400);
		jLblProfileTitle.setBounds(420, 90, 275, 30);
		panel.add(jLblProfileTitle);
		panel.add(userDataPanel);
	}

	//display errors using joptionpane
	public void displayError(String error) {
		JOptionPane.showMessageDialog(frame, error, "ERROR", JOptionPane.WARNING_MESSAGE);
	}

	//getter from panel
	public JPanel getPanel() {
		return this.panel;
	}

	//function to display all hired vehicles
	public void displayHiredVehicles(DefaultListModel<String> l1) {
		hiredVehiclePanel = new JPanel();
		jLblHiredVehicle = new JLabel("CURRENTLY RENTED VEHICLES");
		hiredVehiclePanel.setLayout(null);
		hiredVehicleList = new JList<>(l1);
		hiredVehicleList.setBounds(0, 0, 600, 400);
		hiredVehiclePanel.add(hiredVehicleList);

		hiredVehiclePanel.setBounds(200, 150, 600, 400);
		jLblHiredVehicle.setBounds(365, 100, 350, 30);
		panel.add(hiredVehiclePanel);
		panel.add(jLblHiredVehicle);
		jLblHiredVehicle.setFont(new Font("Serif", Font.BOLD, 20));
		hiredVehiclePanel.setVisible(true);
		jLblHiredVehicle.setVisible(true);
		hiredVehiclePanel.setBackground(Color.white);
	}

	public void displaySuccessMessage() {
		//display success message using JOptionPane
		JOptionPane.showMessageDialog(frame, "VEHICLE HAS BEEN REQUESTED FOR RENT!", "SUCCESS",
				JOptionPane.INFORMATION_MESSAGE);
	}
}

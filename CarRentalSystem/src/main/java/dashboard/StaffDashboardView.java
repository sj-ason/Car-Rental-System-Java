/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package dashboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import car.Car;
import lorry.Lorry;
import minibus.MiniBus;
import user.User;
/**
 *
 * @author jasonyitro
 */
public class StaffDashboardView {
	JButton jBtnAddVehicle, jBtnRegisterCustomer, jBtnRemoveVehicle, jBtnRegisterStaff, jBtnLoginActivity, jBtnAddCar, jBtnAddMiniBus,
			jBtnAddLorry, jBtnDisplayAllCustomer, jBtnDisplayHireRequest, jBtnHireOut, jBtnReturnVehicle,
			jBtnHiredVehicle, jBtnLogout, jBtnDisplayVehicles;
	JPanel panel, displayVehicleData, displayCustomerData, displayHireRequestPanel, displayLoginActivityPanel;
	JFrame frame;

	JList<String> list1, list2, list3, list4, list5, list6, list7, list10, list30;

	JPanel carPanel;

	JScrollPane carScrollPane, lorryScrollPane, minibusScrollPane, customerScrollPane, carRequestPane,
			minibusRequestPane, lorryRequestPane, displayHiredVehiclePane, loginActivityScrollPane, loginActivityPane;

	JLabel jLblMakeValue, jLblMake, jLblModel, jLblModelValue, jLblTopSpeed, jLblTopSpeedValue, jLblRegistrationNumber,
			jLblRegistrationNumberValue, jLblDailyHireRate, jLblDailyHireRateValue, jLblFuelType, jLblFuelTypeValue,
			jLblNumberOfDoors, jLblNumberOfDoorsValue, jLblLoadCapacity, jLblLoadCapacityValue, jLblSeatingCapacity,
			jLblSeatingCapacityValue, jLblCarTitle, jLblLorryTitle, jLblMinibusTitle, jLblIdentificationNumber,
			jLblIdentificationNumberValue, jLblCorporationName, jLblCorporationNameValue, jLblAddress, jLblAddressValue,
			jLblPhoneNumber, jLblPhoneNumberValue, jLblEmail, jLblEmailValue, jLblVehicleDetails, jLblCustomerListTitle,
			jLblCustomerDetailsTitle, jLblUsername, jLblUsernameValue, jLblLoginActivityTitle;

	//GUI function displays the staff dashboard
	public void GUI(JFrame frame) {
		this.frame = frame;
		panel = new JPanel();
		panel.setLayout(null);

		jLblCarTitle = new JLabel("CARS");
		jLblLorryTitle = new JLabel("LORRY");
		jLblMinibusTitle = new JLabel("MINIBUS");

		jBtnRegisterCustomer = new JButton("REGISTER A NEW CUSTOMER");
		jBtnRegisterStaff = new JButton("REGISTER A NEW STAFF");
		jBtnAddVehicle = new JButton("ADD NEW VEHICLE");
		jBtnRemoveVehicle = new JButton("REMOVE VEHICLE");
                jBtnLoginActivity = new JButton("LOGIN ACTIVITY IN FILE FOLDER");
		jBtnAddCar = new JButton("ADD CAR");
		jBtnAddMiniBus = new JButton("ADD MINIBUS");
		jBtnAddLorry = new JButton("ADD LORRY");
		jBtnDisplayAllCustomer = new JButton("DISPLAY ALL CUSTOMERS");
		jBtnDisplayHireRequest = new JButton("RENT REQUEST");
		jBtnHireOut = new JButton("RENT OUT");
		jBtnReturnVehicle = new JButton("RETURN VEHICLE");
		jBtnHiredVehicle = new JButton("VIEW ALL HIRED VEHICLES");
		jBtnLogout = new JButton("LOG OUT");
		jBtnDisplayVehicles = new JButton("DISPLAY ALL VEHICLES");

		jBtnAddVehicle.setBounds(10, 90, 200, 30);
		jBtnRemoveVehicle.setBounds(10, 130, 200, 30);
                jBtnLoginActivity.setBounds(10, 250, 200, 30);
		jBtnRegisterCustomer.setBounds(10, 170, 200, 30);
		jBtnRegisterStaff.setBounds(10, 210, 200, 30);
		jBtnDisplayVehicles.setBounds(10, 10, 200, 30);

		jBtnHireOut.setBounds(260, 10, 170, 30);
		jBtnReturnVehicle.setBounds(230, 10, 200, 30);
		jBtnDisplayHireRequest.setBounds(440, 10, 170, 30);
		jBtnDisplayAllCustomer.setBounds(620, 10, 170, 30);
		jBtnHiredVehicle.setBounds(800, 10, 170, 30);
		jBtnLogout.setBounds(10, 620, 200, 30);

		jBtnAddCar.setBounds(10, 290, 200, 30);
		jBtnAddMiniBus.setBounds(10, 330, 200, 30);
		jBtnAddLorry.setBounds(10, 370, 200, 30);

		jLblCarTitle.setBounds(450, 80, 200, 30);
		jLblCarTitle.setFont(new Font("Serif", Font.BOLD, 20));

		jLblLorryTitle.setBounds(450, 240, 200, 30);
		jLblLorryTitle.setFont(new Font("Serif", Font.BOLD, 20));

		jLblMinibusTitle.setBounds(450, 400, 200, 30);
		jLblMinibusTitle.setFont(new Font("Serif", Font.BOLD, 20));

		displayVehicleData = new JPanel();

		jLblMake = new JLabel("MAKE: ");
		jLblMakeValue = new JLabel("--");
		jLblModel = new JLabel("MODEL: ");
		jLblModelValue = new JLabel("--");
		jLblTopSpeed = new JLabel("TOP SPEED: ");
		jLblTopSpeedValue = new JLabel("--");
		jLblRegistrationNumber = new JLabel("REGISTRATION NUMBER: ");
		jLblRegistrationNumberValue = new JLabel("--");
		jLblDailyHireRate = new JLabel("DAILY HIRE RATE: ");
		jLblDailyHireRateValue = new JLabel("--");
		jLblFuelType = new JLabel("FUEL TYPE: ");
		jLblFuelTypeValue = new JLabel("--");
		jLblNumberOfDoors = new JLabel("NUMBER OF DOORS: ");
		jLblNumberOfDoorsValue = new JLabel("--");
		jLblLoadCapacity = new JLabel("LOAD CAPACITY: ");
		jLblLoadCapacityValue = new JLabel("--");
		jLblSeatingCapacity = new JLabel("SEATING CAPACITY: ");
		jLblSeatingCapacityValue = new JLabel("--");

		jLblVehicleDetails = new JLabel("DETAILS");

		displayVehicleData.setLayout(new BoxLayout(displayVehicleData, BoxLayout.Y_AXIS));
		displayVehicleData.add(jLblMake);
		displayVehicleData.add(jLblMakeValue);
		displayVehicleData.add(jLblModel);
		displayVehicleData.add(jLblModelValue);
		displayVehicleData.add(jLblTopSpeed);
		displayVehicleData.add(jLblTopSpeedValue);
		displayVehicleData.add(jLblRegistrationNumber);
		displayVehicleData.add(jLblRegistrationNumberValue);
		displayVehicleData.add(jLblDailyHireRate);
		displayVehicleData.add(jLblDailyHireRateValue);
		displayVehicleData.add(jLblFuelType);
		displayVehicleData.add(jLblFuelTypeValue);
		displayVehicleData.add(jLblNumberOfDoors);
		displayVehicleData.add(jLblNumberOfDoorsValue);
		displayVehicleData.add(jLblLoadCapacity);
		displayVehicleData.add(jLblLoadCapacityValue);
		displayVehicleData.add(jLblSeatingCapacity);
		displayVehicleData.add(jLblSeatingCapacityValue);
		displayVehicleData.setBounds(770, 150, 200, 600);

		jLblVehicleDetails.setBounds(770, 100, 200, 30);
		jLblVehicleDetails.setFont(new Font("Serif", Font.BOLD, 20));

		panel.add(displayVehicleData);

		panel.add(jLblVehicleDetails);
		panel.add(jLblCarTitle);
		panel.add(jLblLorryTitle);
		panel.add(jLblMinibusTitle);
		panel.add(jBtnAddVehicle);
		panel.add(jBtnRemoveVehicle);
                panel.add(jBtnLoginActivity);
		panel.add(jBtnRegisterCustomer);
		panel.add(jBtnRegisterStaff);
		panel.add(jBtnDisplayAllCustomer);
		panel.add(jBtnDisplayHireRequest);
		panel.add(jBtnHireOut).setVisible(false);
		panel.add(jBtnReturnVehicle).setVisible(false);
		panel.add(jBtnHiredVehicle);
		panel.add(jBtnLogout);
		panel.add(jBtnDisplayVehicles).setVisible(false);

		panel.add(jBtnAddCar).setVisible(false);
		panel.add(jBtnAddMiniBus).setVisible(false);
		panel.add(jBtnAddLorry).setVisible(false);

		panel.setSize(1000, 700);

		frame.add(panel);
	}

	public JPanel getPanel() {
		return this.panel;
	}
	
	public void displayVehicles(final DefaultListModel<String> l1, final DefaultListModel<String> l2,
			final DefaultListModel<String> l3) {

		carScrollPane = new JScrollPane();
		lorryScrollPane = new JScrollPane();
		minibusScrollPane = new JScrollPane();

		list1 = new JList<>(l1);
		carScrollPane.setViewportView(list1);
		carScrollPane.setBounds(240, 120, 500, 100);
		panel.add(carScrollPane);

		list2 = new JList<>(l2);
		lorryScrollPane.setViewportView(list2);
		lorryScrollPane.setBounds(240, 280, 500, 100);
		panel.add(lorryScrollPane);

		list3 = new JList<>(l3);
		minibusScrollPane.setViewportView(list3);
		minibusScrollPane.setBounds(240, 440, 500, 100);
		panel.add(minibusScrollPane);
	}

	public void displayError(String error) {
		JOptionPane.showMessageDialog(frame, error, "ERROR", JOptionPane.WARNING_MESSAGE);
	}

	public JPanel getVehicleDataDisplayPanel() {
		return displayVehicleData;
	}

	public void displayCustomerList(final DefaultListModel<String> l4) {
		jLblCustomerListTitle = new JLabel("CUSTOMERS");
		customerScrollPane = new JScrollPane();

		list4 = new JList<>(l4);

		jLblCustomerListTitle.setFont(new Font("Serif", Font.BOLD, 20));

		customerScrollPane.setViewportView(list4);
		customerScrollPane.setBounds(240, 130, 500, 400);
		jLblCustomerListTitle.setBounds(440, 80, 200, 30);
		panel.add(customerScrollPane);
		panel.add(jLblCustomerListTitle);

	}

	public void displayCustomerDetail() {
		displayCustomerData = new JPanel();

		jLblCustomerDetailsTitle = new JLabel("CUSTOMER'S DETAILS");

		jLblIdentificationNumber = new JLabel("IDENTIFICATION NUMBER: ");
		jLblIdentificationNumberValue = new JLabel("--");
		jLblCorporationName = new JLabel("CORPORATION NAME: ");
		jLblCorporationNameValue = new JLabel("--");
		jLblUsername = new JLabel("USERNAME: ");
		jLblUsernameValue = new JLabel("--");
		jLblAddress = new JLabel("ADDRESS : ");
		jLblAddressValue = new JLabel("--");
		jLblPhoneNumber = new JLabel("PHONE NUMBER: ");
		jLblPhoneNumberValue = new JLabel("--");
		jLblEmail = new JLabel("EMAIL: ");
		jLblEmailValue = new JLabel("--");

		displayCustomerData.setLayout(new BoxLayout(displayCustomerData, BoxLayout.Y_AXIS));

		displayCustomerData.add(jLblIdentificationNumber);
		displayCustomerData.add(jLblIdentificationNumberValue);
		displayCustomerData.add(jLblCorporationName);
		displayCustomerData.add(jLblCorporationNameValue);
		displayCustomerData.add(jLblUsername);
		displayCustomerData.add(jLblUsernameValue);
		displayCustomerData.add(jLblAddress);
		displayCustomerData.add(jLblAddressValue);
		displayCustomerData.add(jLblPhoneNumber);
		displayCustomerData.add(jLblPhoneNumberValue);
		displayCustomerData.add(jLblEmail);
		displayCustomerData.add(jLblEmailValue);
		displayCustomerData.setBounds(770, 130, 200, 600);

		jLblCustomerDetailsTitle.setFont(new Font("Serif", Font.BOLD, 20));
		jLblCustomerDetailsTitle.setBounds(770, 80, 200, 30);

		panel.add(displayCustomerData);
		panel.add(jLblCustomerDetailsTitle);
	}
	public void displayHireRequests(final DefaultListModel<String> l5, final DefaultListModel<String> l6,
			final DefaultListModel<String> l7) {
		displayHireRequestPanel = new JPanel();
		displayHireRequestPanel.setLayout(null);

		carRequestPane = new JScrollPane();
		lorryRequestPane = new JScrollPane();
		minibusRequestPane = new JScrollPane();

		list5 = new JList<>(l5);

		carRequestPane.setViewportView(list5);
		carRequestPane.setBounds(0, 120, 600, 100);

		JLabel jLblCarRequestTitle = new JLabel("CAR REQUEST");
		jLblCarRequestTitle.setBounds(220, 80, 200, 30);
		jLblCarRequestTitle.setFont(new Font("Serif", Font.BOLD, 20));

		displayHireRequestPanel.add(carRequestPane);
		displayHireRequestPanel.add(jLblCarRequestTitle);

		list6 = new JList<>(l6);

		lorryRequestPane.setViewportView(list6);
		lorryRequestPane.setBounds(0, 280, 600, 100);
		displayHireRequestPanel.add(lorryRequestPane);

		JLabel jLblLorryRequestTitle = new JLabel("LORRY REQUEST");
		jLblLorryRequestTitle.setBounds(220, 240, 200, 30);
		jLblLorryRequestTitle.setFont(new Font("Serif", Font.BOLD, 20));

		displayHireRequestPanel.add(jLblLorryRequestTitle);

		list7 = new JList<>(l7);

		minibusRequestPane.setViewportView(list7);
		minibusRequestPane.setBounds(0, 440, 600, 100);
		displayHireRequestPanel.add(minibusRequestPane);

		JLabel jLblMiniBusRequestTitle = new JLabel("MINIBUS REQUEST");
		jLblMiniBusRequestTitle.setBounds(220, 400, 200, 30);
		jLblMiniBusRequestTitle.setFont(new Font("Serif", Font.BOLD, 20));

		displayHireRequestPanel.add(jLblMiniBusRequestTitle);

		displayHireRequestPanel.setBounds(250, 0, 600, 600);

		panel.add(displayHireRequestPanel);
	}
        public void displayLoginActivity(String[] loginActivity) {
            jLblLoginActivityTitle = new JLabel("LOGIN ACTIVITY");
            loginActivityScrollPane = new JScrollPane();
                        
            
            
            displayLoginActivityPanel.add(loginActivityScrollPane);
            displayLoginActivityPanel.add(jLblLoginActivityTitle);
            
            int i = 1;
            //display Login Activity on JList
            final DefaultListModel<String> l30 = new DefaultListModel<>();
            l30.addElement("USERNAME          DATE          TIME");
            
            if (loginActivity == null) {
                l30.addElement("NO RECORDED LOGIN ACTIVITY");
            } else {
		for (String data : loginActivity) {
                    String[] splittedData = data.split("\\s+");
                    l30.addElement(splittedData[0] + "          " + splittedData[1]);
                    }
            }
            jLblLoginActivityTitle.setFont(new Font("Serif", Font.BOLD, 20));
            jLblLoginActivityTitle.setBounds(440, 80, 200, 30);
            loginActivityScrollPane.setViewportView(list30);
            loginActivityScrollPane.setBounds(0, 120, 600, 440);
            panel.add(loginActivityScrollPane);
            panel.add(jLblLoginActivityTitle);
        }
        public void displayHiredVehicles(String[] hiredVehicles) {
		jBtnReturnVehicle.setVisible(true);
		displayHiredVehiclePane = new JScrollPane();

		int i = 1;
		// display Customers on JList
		final DefaultListModel<String> l10 = new DefaultListModel<>();
		l10.addElement("S.N                              REGISTRATION NUMBER                              HIRED BY                                   VEHICLE TYPE");
		String vehicleType;
		if (hiredVehicles == null) {
			l10.addElement("NO VEHICLE HAS BEEN HIRED!");
		} else {
			for (String data : hiredVehicles) {
				String[] splittedData = data.split("\\s+");
				if (splittedData[0].contentEquals("car")) {
					vehicleType = "Car";
				} else if (splittedData[0].contentEquals("lorry")) {
					vehicleType = "Lorry";
				} else {
					vehicleType = "Minibus";
				}
				l10.addElement(
						i + "                                  " + splittedData[1] + "                                                  "
								+ splittedData[2] + "                                " + vehicleType);
				i++;
			}
		}
		list10 = new JList<>(l10);
		displayHiredVehiclePane.setViewportView(list10);

		displayHiredVehiclePane.setBounds(250, 100, 600, 500);

		panel.add(displayHiredVehiclePane);
	}
}

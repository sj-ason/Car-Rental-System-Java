/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import dashboard.CustomerDashboardView;
import dashboard.Dashboard;
import dashboard.DashboardController;
import dashboard.StaffDashboardView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.User;
/**
 *
 * @author jasonyitro
 */
public class LoginController implements ActionListener {
	private LoginView view;
	private Login model;
	private JFrame frame;

	public LoginController(LoginView view, Login model, JFrame frame) {
		this.view = view;
		this.model = model;
		this.frame = frame;

		view.GUI(frame);
		view.jBtnLoginCustomer.addActionListener(this);
		view.jBtnLoginStaff.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.jBtnLoginCustomer) {
			// creating a User class object to get all the users in the file and then
			// storing in the User ArrayList.
			User userModel = new User();

			if (model.checkIfFileExists("./src/resources/customerObjects.dat")) {
				ArrayList<User> users = userModel.getObjects("./src/resources/customerObjects.dat");

				String status = null;
                            try {
                                status = model.validate(view.getUsername(), view.getPassword(), users);
                            } catch (IOException ex) {
                                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                            }
				if (status.contentEquals("Password Matched!")) {
					view.getPanel().setVisible(false);

					Dashboard dashboard = new Dashboard();
					StaffDashboardView staffDashboardView = new StaffDashboardView();
					CustomerDashboardView customerDashboardView = new CustomerDashboardView();
                                    try {
                                        DashboardController dashboardController = new DashboardController(staffDashboardView,
                                                customerDashboardView, dashboard, this.frame, "customer" , view.getUsername());
                                    } catch (IOException ex) {
                                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				} else {
					JOptionPane.showMessageDialog(frame, status, "Error", JOptionPane.WARNING_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(frame, "Username Does not Exist!", "Error", JOptionPane.WARNING_MESSAGE);
			}
		} else if (e.getSource() == view.jBtnLoginStaff) {
			User userModel = new User();

			if (model.checkIfFileExists("./src/resources/staffObjects.dat")) {
				ArrayList<User> users = userModel.getObjects("./src/resources/staffObjects.dat");

				String status = null;
                            try {
                                status = model.validate(view.getUsername(), view.getPassword(), users);
                            } catch (IOException ex) {
                                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                            }
				if (status.contentEquals("Password Matched!")) {
					view.getPanel().setVisible(false);

					Dashboard dashboard = new Dashboard();
					StaffDashboardView staffDashboardView = new StaffDashboardView();
					CustomerDashboardView customerDashboardView = new CustomerDashboardView();
                                    try {
                                        DashboardController dashboardController = new DashboardController(staffDashboardView,
                                                customerDashboardView, dashboard, this.frame, "staff" , view.getUsername());
                                    } catch (IOException ex) {
                                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				} else {
					JOptionPane.showMessageDialog(frame, status, "Error", JOptionPane.WARNING_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(frame, "Username Does not Exist!", "Error", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}

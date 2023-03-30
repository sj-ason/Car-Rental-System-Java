/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package car;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import dashboard.CustomerDashboardView;
import dashboard.Dashboard;
import dashboard.DashboardController;
import dashboard.StaffDashboardView;
import user.User;
/**
 *
 * @author jasonyitro
 */
public class CarController implements ActionListener {
	private CarView view;
	private Car model;
	private String username;

	public CarController(CarView carView, Car carModel, JFrame frame, String username) {
		this.view = carView;
		this.model = carModel;
		this.username = username;
		
		//call the addCarGUI if the CarController is called
		view.addCarGUI(frame);

		view.jBtnAddCar.addActionListener(this);
		view.jBtnCancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.jBtnAddCar) {

			ArrayList<String> errors = new ArrayList<String>();

			//get errors from the model after validating
			errors = model.validateCar(view.jTxtmake.getText(), view.jTxtmodel.getText(), view.jTxttopSpeed.getText(),
					view.jTxtregistrationNumber.getText(), view.jTxtdailyHireRate.getText(),
					view.jTxtfuelType.getText(), view.jTxtnumberOfDoors.getText());

			// the error variable is checked if it consists of errors.
			// if it is empty then the user input is used to register a new user
			if (errors.size() == 0) {
				Car car = new Car(view.getMake(), view.getModel(), view.getTopSpeed(), view.getRegistrationNumber(),
						view.getDailyHireRate(), view.getFuelType(), view.getNumberOfDoors());
				model.storeObject(car, "./src/resources/carObjects.dat");
				
				homepage();
				view.displaySuccessMessage();
			} else {
				// if the user input contains errors then the errors are displayed in the
				// JOptionPane as Alert
				view.displayError(errors);
			}
		} else if(e.getSource() == view.jBtnCancel) {
			homepage();
		}
	}
	
	public void homepage() {
		//display the homepage
		view.addCarPanel.setVisible(false);
		Dashboard dashboard = new Dashboard();
		StaffDashboardView staffDashboardView = new StaffDashboardView();
		CustomerDashboardView customerDashboardView = new CustomerDashboardView();
		DashboardController dashboardController = new DashboardController(staffDashboardView, customerDashboardView,
				dashboard, view.frame, "staff", username);
	}
}

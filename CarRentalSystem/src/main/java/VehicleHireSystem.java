/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import login.LoginView;
/**
 *
 * @author jasonyitro
 */
public class VehicleHireSystem {
	public static void main(String[] args) {
		//initializing VehicleHireSystem view, model and controller 
		VehicleHireSystemView view = new VehicleHireSystemView();
		VehicleHireSystemModel model = new VehicleHireSystemModel();
		// the controller uses view and model to control the program
		VehicleHireSystemController controller = new VehicleHireSystemController(view, model);
	}
}

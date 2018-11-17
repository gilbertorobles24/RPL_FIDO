package app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class EngineController implements Initializable{

	@FXML
	private AnchorPane enginePane;
	
	@FXML
	private Button backToMain;
	
	static Stage window;
	
	@FXML
	private void changeScene(ActionEvent event) throws IOException{
		enginePane = FXMLLoader.load(getClass().getResource("/view/MainFXML.fxml"));

		Scene scene = new Scene(enginePane);
	    scene.getStylesheets().add("/styles.css");

	    ///DISPLAY WINDOW
	    window = new Stage();
	    window.setTitle("RPL");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
	    window.setScene(scene);
	    window.show();
		
	}
	
	private void closeProgram() {
		Boolean answer = ConfirmBox.display("Exit Request", "Are you sure you want to close this window?");
		if (answer) {
			window.close();
		} else {

		}
	}
	
	//  TANK LABELS
	  
	 //  thermo couplers
	
	@FXML
	private Label thermo_coupler1;
	
	@FXML
	private Label thermo_coupler2;
	
	@FXML
	private Label thermo_coupler3;
	
	@FXML
	private Label thermo_coupler4;
	
	@FXML
	private Label thermo_coupler5;
	
	@FXML
	private Label thermo_coupler6;
	
	@FXML
	private Label thermo_coupler7;
	
	  //  pressure transducers
	
	@FXML
	private Label pressure_transducer1;
	
	@FXML
	private Label pressure_transducer2;
	
	@FXML
	private Label pressure_transducer3;
	
	@FXML
	private Label pressure_transducer4;
	
	@FXML
	private Label pressure_transducer5;
	
	@FXML
	private Label pressure_transducer6;
	
	@FXML
	private Label pressure_transducer7;
	
	
	/////
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//boolean retrieveData = true;
		double d = 91.0;
		
		thermo_coupler1.setText(Double.toString(d));  //add value from sensors here
		
		// Error Handling
		
		  //  THERMO COUPLER ERROR WINDOWS
		String highTemp = "High Temperature!";
		
		if(Double.parseDouble(thermo_coupler1.getText()) >= 90.00) {
			errorAlert(highTemp, "Thermo Coupler 1 is too hot");
		}
		if(Double.parseDouble(thermo_coupler2.getText()) >= 90.00) {
			errorAlert(highTemp, "Thermo Coupler 2 is too hot");
		}
		if(Double.parseDouble(thermo_coupler3.getText()) >= 90.00) {
			errorAlert(highTemp, "Thermo Coupler 3 is too hot");
		}
		/*if(Double.parseDouble(thermo_coupler4.getText()) >= 90.00) {
			errorAlert(highTemp, "Thermo Coupler 4 is too hot");
		}*/
		if(Double.parseDouble(thermo_coupler5.getText()) >= 90.00) {
			errorAlert(highTemp, "Thermo Coupler 5 is too hot");
		}
		if(Double.parseDouble(thermo_coupler6.getText()) >= 90.00) {
			errorAlert(highTemp, "Thermo Coupler 6 is too hot");
		}
		/*if(Double.parseDouble(thermo_coupler7.getText()) >= 90.00) {
			errorAlert(highTemp, "Thermo Coupler 7 is too hot");
		}*/
		
	      //  PRESSURE TRANSDUCERS ERROR WINDOWS
		String highPress = "High Pressure!";
		
		if(Double.parseDouble(pressure_transducer1.getText()) >= 90.00) {
			errorAlert(highPress, "Pressure Transducer 1 has high pressure!");
		}
		if(Double.parseDouble(pressure_transducer2.getText()) >= 90.00) {
			errorAlert(highPress, "Pressure Transducer 2 has high pressure!");
		}
		if(Double.parseDouble(pressure_transducer3.getText()) >= 90.00) {
			errorAlert(highPress, "Pressure Transducer 3 has high pressure!");
		}
		/*if(Double.parseDouble(pressure_transducer4.getText()) >= 90.00) {
			errorAlert(highPress, "Pressure Transducer 4 has high pressure!");
		}*/
		if(Double.parseDouble(pressure_transducer5.getText()) >= 90.00) {
			errorAlert(highPress, "Pressure Transducer 5 has high pressure!");
		}
		if(Double.parseDouble(pressure_transducer6.getText()) >= 90.00) {
			errorAlert(highPress, "Pressure Transducer 6 has high pressure!");
		}
		if(Double.parseDouble(pressure_transducer7.getText()) >= 90.00) {
			errorAlert(highPress, "Pressure Transducer 7 has high pressure!");
		}
		
	}
	

	public static void errorAlert(String header, String messageError) {
        Alert alert = new Alert(AlertType.WARNING);
        
        alert.setTitle("WARNING!");
        alert.setHeaderText(header);
        alert.setContentText(messageError);
 
        alert.showAndWait();
	}

}








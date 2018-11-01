package app;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.net.MalformedURLException;
import com.fazecast.jSerialComm.SerialPort;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable{
       //this file basically takes widget objects from the FXML file and allows                                                                                                                                                              you to create methods to make them interactive

       // ALTITUDE CHART //
       @FXML
       private LineChart<String, Number> AltitudeChart;

       @FXML
       private CategoryAxis altitudeX;

       @FXML
       private NumberAxis altitudeY;


       // VELOCITY CHART //
       @FXML
       private LineChart<String,Number> VelocityChart;

       @FXML
       private CategoryAxis velocityX;

       @FXML
       private NumberAxis velocityY;
       
       @FXML
       private WebView webView;
       
//       @FXML
//       private ComboBox<String> portList;


       public void initialize(URL url, ResourceBundle rb) {
           //  add elements to altitude chart
           XYChart.Series<String, Number> altitudeSeries = new XYChart.Series<>();

           altitudeSeries.getData().add(new XYChart.Data<>("1", 23));
           altitudeSeries.getData().add(new XYChart.Data<>("2", 65));
           altitudeSeries.getData().add(new XYChart.Data<>("3", 34));
           altitudeSeries.getData().add(new XYChart.Data<>("4", 98));
           altitudeSeries.getData().add(new XYChart.Data<>("5", 12));

           AltitudeChart.getData().add(altitudeSeries);


           //  add elements to altitude chart
           XYChart.Series<String, Number> velocitySeries = new XYChart.Series<>();

           velocitySeries.getData().add(new XYChart.Data<>("1", 23));
           velocitySeries.getData().add(new XYChart.Data<>("2", 123));
           velocitySeries.getData().add(new XYChart.Data<>("3", 9));
           velocitySeries.getData().add(new XYChart.Data<>("5", 150));
           velocitySeries.getData().add(new XYChart.Data<>("6", 132));
           velocitySeries.getData().add(new XYChart.Data<>("9", 0));

           VelocityChart.getData().add(velocitySeries);
       
  
//           WebEngine engine = webView.getEngine();
//           File file = new File(“./eclipse-workspace/Java/RPL-FIDO/src/MapView.html”);
//           try {
//               URL fileUrl = file.toURI().toURL();
//               engine.load(fileUrl.toString());
//           } catch (Exception e) {
//               System.out.print(e);
//           }
           //hello
           
           
           //create a combobox that displays the available ports on the computer
           ComboBox<String> portList = new ComboBox<String>();
           
           //get ports from system
           SerialPort [] portNames = SerialPort.getCommPorts();
           //loop through all the ports from the system and display them on the screen
           for (int i = 0; i < portNames.length; i++) {
        	   portList.getItems().add(portNames[i].getSystemPortName().toString());
        	   
        	   System.out.println(portNames[i].getSystemPortName().toString());
           }
           
           
       }
}

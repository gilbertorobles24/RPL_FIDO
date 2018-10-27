package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

       static Stage window;
       static Scene scene1;

       ////////MAIN METHOD/////////////
       public static void main(String[] args){
               //The Java launcher loads and initializes the specified Applicat                                                                                                                                                             ion class on the JavaFX Application Thread.
               launch(args);
       }

       ///////// START METHOD /////////
       @Override
       public void start(Stage primaryStage) throws Exception {
               Parent root = (Parent) FXMLLoader.load(getClass().getResource("/MainFXML.fxml")); //gets the correct fxml file associated with this file
               window = primaryStage; //a stage is a window
               window.setTitle("RPL");
               window.setOnCloseRequest(e -> {
                       e.consume();
                       closeProgram();  //I created a confirm box that asks you                                                                                                                                                              if you are sure you want to close the window when you click "X"
               });

               scene1 = new Scene(root); //a scene is what is displayed in the                                                                                                                                                              window
               scene1.getStylesheets().add("styles.css");

               ///DISPLAY WINDOW
               window.setScene(scene1);
               window.show();  //actually displays window with scene in it
       }



       //Close Method
       private void closeProgram() {
               Boolean answer = ConfirmBox.display("Exit Request", "Are you sure you want to close this window?");
               if (answer) {
                       window.close();
               }
               else {

               }
       }
}
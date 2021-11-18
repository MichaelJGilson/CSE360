package com.mycompany.cseproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;


public class LoginController {

	
	private TextField fullName;
	private TextField dateOfBirth;

   private Stage stage;
   private Scene scene;
   private Parent root;
   private Button loginClicked;
	
	
	String nameEntered = fullName.getText();
	String birthdayEntered = dateOfBirth.getText();
	int birthdayNumber = Integer.parseInt(dateOfBirth.getText());
	
    @FXML
 private void loginClicked(ActionEvent event) throws IOException {
    	

	 root = FXMLLoader.load(getClass().getResource("patientMenu.fxml"));
	 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	 scene = new Scene(root);
	 stage.setScene(scene);
	 stage.show();
	
}
    	
    }

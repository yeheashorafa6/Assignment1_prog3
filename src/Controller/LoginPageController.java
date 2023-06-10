/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class LoginPageController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginToSystem(ActionEvent event) throws IOException {
        if(username.getText().equals("yehea") && password.getText().equals("123123")){
            ViewManager.closeLoginPage();
            ViewManager.openSystemPage();
        }else{
            Alert alertWarning = new Alert(AlertType.WARNING);
//            alertWarning.setTitle("invalid data");
            alertWarning.setHeaderText("Invalid Data");
            alertWarning.setContentText("incorrect username or password !!");
            alertWarning.showAndWait();
        }
    }
    
}

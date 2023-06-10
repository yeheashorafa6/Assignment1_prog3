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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class SystemPageController implements Initializable {

    @FXML
    private Button logoutBtn;
    @FXML
    private Button converBtn;
    @FXML
    private TextField nisTF;
    @FXML
    private TextField usdTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutFromSystem(ActionEvent event) throws IOException {
        ViewManager.closeSystemPage();
        ViewManager.openLoginPage();
    }

    @FXML
    private void convertCurrency(ActionEvent event) {
        if(usdTF.getText().isEmpty() && nisTF.getText().isEmpty()){
            Alert alertWarning = new Alert(Alert.AlertType.WARNING);
            alertWarning.setHeaderText("Both two fields are empty!");
            alertWarning.setContentText("You should fill one of them to continue.");
            alertWarning.showAndWait();
        }else if(!usdTF.getText().isEmpty()){
            double usdValue = Double.parseDouble(usdTF.getText());
            nisTF.setText(String.valueOf((usdValue * 3.60)));
        }else if(!nisTF.getText().isEmpty()){
            double nisValue = Double.parseDouble(nisTF.getText());
            usdTF.setText(String.valueOf((nisValue / 3.60)));
        }
    }
    
}

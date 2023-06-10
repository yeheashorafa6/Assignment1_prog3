package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginPageView extends Stage{
    
    public LoginPageView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage/loginPage.fxml"));
        
        Scene scene = new Scene(root);
        this.setScene(scene);
    }
}

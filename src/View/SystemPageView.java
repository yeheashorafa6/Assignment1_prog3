package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SystemPageView extends Stage{
    
    public SystemPageView() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SystemPage/systemPage.fxml"));
        
        Scene scene = new Scene(root);
        this.setScene(scene);
    }
}

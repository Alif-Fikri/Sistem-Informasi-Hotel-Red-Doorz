package id.ac.mercubuana.sisfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) {
    	try {
            
            FXMLLoader loader = new FXMLLoader
            		(getClass()
            		.getResource
            		("UIHalamanUtama.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Halaman Utama");
            stage.show();

            ((Node)(event.getSource()))
            .getScene().getWindow().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

package com.petproj.budgettracker.Controller;

import com.petproj.budgettracker.FinanceTrackerApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
    @FXML
    public TextField usernameTf;

    @FXML
    public PasswordField passTf;

    @FXML
    public Button submitLoginBtn;
    @FXML
    public Button clearLoginBtn;
    @FXML
    public Text resultTf;

//    @FXML
//    public void handleSubmitLoginBtnAction(){
//        String realUsername = "user";
//        String realPassword = "pass";
//
//        if(usernameTf.getText().equals(realUsername) && passTf.getText().equals(realPassword)){
//            resultTf.setText("User authenticated");
//        }
//        else{
//            resultTf.setText("Incorrect username or password");
//        }
//    }

    @FXML
    public void handleClearLoginBtnAction(){
        usernameTf.clear();
        passTf.clear();
    }

    @FXML
    public void switchToMainPage(ActionEvent event) throws IOException {
        Parent mainPageParent = (FXMLLoader.load(Objects.requireNonNull(FinanceTrackerApplication.class.getResource("main-page.fxml"), "main-page.fxml cannot be found")));
        Scene mainPageScene = new Scene(mainPageParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainPageScene);
        window.show();
    }
}

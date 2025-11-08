package com.petproj.budgettracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FinanceTrackerApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(FinanceTrackerApplication.class.getResource("hello-view.fxml"));
        Parent root = FXMLLoader.load(Objects.requireNonNull(FinanceTrackerApplication.class.getResource("hello-view.fxml"), "hello-view.fxml cannot be found"));
        Scene scene = new Scene(root, 1080, 720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}

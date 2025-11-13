package com.petproj.budgettracker.Controller;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class MainPageController {
    private SimpleIntegerProperty remaining = new SimpleIntegerProperty(2500);
    private int budget = 6000;

    public int getRemaining() {
        return remaining.get();
    }

    public SimpleIntegerProperty remainingProperty() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining.set(remaining);
    }

    @FXML
    public Label remainingTf;

    @FXML
    public Text savingsTF;

    @FXML
    public Button editBudgetBtn;

    @FXML
    public Button addSavingsBtn;

//    edit this later, not linked to database yet

    public MainPageController() {
        setRemainingTf(remainingProperty());
    }

    @FXML
    public void setRemainingTf(SimpleIntegerProperty remaining) {
        this.remainingTf.setText(String.valueOf(remaining));
    }


    private int savings = 0;
    public void addToSavings(){
        savings  += getRemaining();
        setRemaining(budget);

        savingsTf.setText(String.valueOf(savings));
        remainingTf.setText(String.valueOf(remaining));

    }

//    edit this later
    @FXML public void editBudget() {
    }
}

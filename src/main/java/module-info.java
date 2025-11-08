module com.petproj.budgettracker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.base;
    requires javafx.graphics;
//    requires com.petproj.budgettracker;

    opens com.petproj.budgettracker to javafx.fxml;
    exports com.petproj.budgettracker;
    exports com.petproj.budgettracker.Controller;
    opens com.petproj.budgettracker.Controller to javafx.fxml;
}
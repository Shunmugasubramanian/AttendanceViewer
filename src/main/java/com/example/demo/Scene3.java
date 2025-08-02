package com.example.demo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Scene3 {
    public static void display(String name, String regNo, int attendancePercent) {
        Stage stage=new Stage();
        AnchorPane anchor1=new AnchorPane();

        Label label = new Label("NAME: " + name);
        label.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        AnchorPane.setLeftAnchor(label, 120.0);
        AnchorPane.setTopAnchor(label, 80.0);
        anchor1.getChildren().add(label);

        Label label1 = new Label("REGISTRATION NUMBER: " + regNo);
        label1.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        AnchorPane.setLeftAnchor(label1, 120.0);
        AnchorPane.setTopAnchor(label1, 130.0);
        anchor1.getChildren().add(label1);

        Label label2 = new Label("ATTENDANCE: " + attendancePercent + "%");
        label2.setFont(Font.font("Poppins", FontWeight.BOLD, 20));
        AnchorPane.setLeftAnchor(label2, 120.0);
        AnchorPane.setTopAnchor(label2, 180.0);
        anchor1.getChildren().add(label2);

        //Scene
        Scene scene1=new Scene(anchor1,600,300);
        stage.setTitle("UPDATE DETAILS");
        stage.setScene(scene1);
        stage.show();
    }
}
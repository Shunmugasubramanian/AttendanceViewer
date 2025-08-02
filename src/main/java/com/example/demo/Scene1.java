package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import java.sql.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Scene1 extends Application {

    @Override
    public void start(Stage stage) {
        AnchorPane anchor1=new AnchorPane();

        Label label1=new Label("ATTENDANCE DATABASE");
        label1.setFont(Font.font("Poppins", FontWeight.BOLD,25));
        label1.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label1, 0.0);
        AnchorPane.setRightAnchor(label1, 0.0);
        label1.setAlignment(Pos.CENTER);
        anchor1.getChildren().add(label1);

        //LoginID
        Label label2=new Label("Login ID:");
        label2.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label2.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label2, 125.0);
        AnchorPane.setTopAnchor(label2,80.0);
        label2.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label2);

        //Password
        Label label3=new Label("Password:");
        label3.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label3.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label3, 125.0);
        AnchorPane.setTopAnchor(label3,115.0);
        label3.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label3);

        //TextField
        TextField txt1=new TextField();
        txt1.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(txt1, 200.0);
        AnchorPane.setTopAnchor(txt1, 80.0);
        anchor1.getChildren().add(txt1);

        //PasswordField
        PasswordField pass=new PasswordField();
        txt1.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(pass, 200.0);
        AnchorPane.setTopAnchor(pass, 115.0);
        anchor1.getChildren().add(pass);

        //Login Button
        Button button=new Button("Login");
        button.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(button, 310.0);
        AnchorPane.setTopAnchor(button, 150.0);
        anchor1.getChildren().add(button);
        button.setOnAction(e-> {
            String loginId = txt1.getText();
            String password = pass.getText();

            if (isValidUser(loginId, password)) {
                Scene2.display();
                stage.close();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login Failed");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Login ID or Password.");
                alert.showAndWait();
            }
        });

        //ForgotPassword Button
        Button button1=new Button("Forgot Password");
        button1.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(button1, 200.0);
        AnchorPane.setTopAnchor(button1, 150.0);
        anchor1.getChildren().add(button1);

        // Register Button
        Button registerBtn = new Button("Register");
        AnchorPane.setLeftAnchor(registerBtn, 200.0);
        AnchorPane.setTopAnchor(registerBtn, 190.0);
        anchor1.getChildren().add(registerBtn);

        registerBtn.setOnAction(e -> {
            String loginId = txt1.getText();
            String password = pass.getText();

            if (!loginId.isEmpty() && !password.isEmpty()) {
                registerUser(loginId, password);
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Missing Fields");
                alert.setHeaderText(null);
                alert.setContentText("Please enter both Login ID and Password.");
                alert.showAndWait();
            }
        });

        //Scene
        Scene scene1=new Scene(anchor1,500,500);
        stage.setTitle("ATTENDANCE DATABASE");
        stage.setScene(scene1);
        stage.setResizable(false);
        stage.show();
    }

    private boolean isValidUser(String loginId, String password) {
        System.out.println("Login Attempt:");
        System.out.println("Login ID: " + loginId);
        System.out.println("Password: " + password);
        try (Connection conn = DBUtil.getConnection()) {
            String query = "SELECT * FROM student WHERE login_id = ? AND password = ?";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, loginId);
            stmt.setString(2, password);
            var rs = stmt.executeQuery();
            return rs.next(); // true if user exists
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void registerUser(String loginId, String password) {
        try (Connection conn = DBUtil.getConnection()) {
            String query = "INSERT INTO student (login_id, password) VALUES (?, ?)";
            var stmt = conn.prepareStatement(query);
            stmt.setString(1, loginId);
            stmt.setString(2, password);
            stmt.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("User registered successfully!");
            alert.showAndWait();

        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Could not register user.");
            alert.showAndWait();
        }
    }


    //Main
    public static void main(String[] args) {
        launch();
    }
}

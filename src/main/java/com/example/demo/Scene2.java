package com.example.demo;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class Scene2 {
    public static void display() {
        Stage stage=new Stage();
        AnchorPane anchor1=new AnchorPane();

        //Name
        Label label1=new Label("Name:");
        label1.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label1.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label1, 45.0);
        AnchorPane.setTopAnchor(label1,80.0);
        label1.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label1);

        //TextField1
        TextField txt1=new TextField();
        txt1.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(txt1, 120.0);
        AnchorPane.setTopAnchor(txt1, 80.0);
        anchor1.getChildren().add(txt1);

        //Registration number
        Label label2=new Label("Reg.Num:");
        label2.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label2.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label2, 45.0);
        AnchorPane.setTopAnchor(label2,115.0);
        label2.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label2);

        //TextField2
        TextField txt2=new TextField();
        txt2.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(txt2, 120.0);
        AnchorPane.setTopAnchor(txt2, 115.0);
        anchor1.getChildren().add(txt2);

        //Department
        Label label3=new Label("Dept:");
        label3.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label3.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label3, 45.0);
        AnchorPane.setTopAnchor(label3,150.0);
        label3.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label3);

        //Choicebox for Department
        ChoiceBox<String> cb=new ChoiceBox<>();
        cb.getItems().addAll("CSE","IT","ECE","EEE","MECH","CIVIL");
        cb.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(cb, 120.0);
        AnchorPane.setTopAnchor(cb, 150.0);
        anchor1.getChildren().add(cb);

        //Year
        Label label4=new Label("Year:");
        label4.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label4.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label4, 45.0);
        AnchorPane.setTopAnchor(label4,180.0);
        label4.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label4);

        //TextField3
        TextField txt3=new TextField();
        txt3.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(txt3, 120.0);
        AnchorPane.setTopAnchor(txt3, 180.0);
        anchor1.getChildren().add(txt3);

        //Gender
        Label label5=new Label("Gender:");
        label5.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label5.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label5, 45.0);
        AnchorPane.setTopAnchor(label5,210.0);
        label5.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label5);

        //Toggle for Gender
        ToggleGroup genderToggleGroup = new ToggleGroup();

        // Radio button for Male
        RadioButton maleRadioButton = new RadioButton("Male");
        maleRadioButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        maleRadioButton.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(maleRadioButton, 120.0);
        AnchorPane.setTopAnchor(maleRadioButton, 210.0);
        maleRadioButton.setToggleGroup(genderToggleGroup);
        anchor1.getChildren().add(maleRadioButton);

        // Radio button for Female
        RadioButton femaleRadioButton = new RadioButton("Female");
        femaleRadioButton.setFont(Font.font("Poppins", FontWeight.BOLD, 13));
        femaleRadioButton.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(femaleRadioButton, 190.0);
        AnchorPane.setTopAnchor(femaleRadioButton, 210.0);
        femaleRadioButton.setToggleGroup(genderToggleGroup);
        anchor1.getChildren().add(femaleRadioButton);

        //Skills
        Label label6=new Label("Skills:");
        label6.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label6.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label6, 45.0);
        AnchorPane.setTopAnchor(label6,240.0);
        label6.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label6);

        // Checkboxes for Skills
        CheckBox skill1 = new CheckBox("Java");
        CheckBox skill2 = new CheckBox("Python");
        CheckBox skill3 = new CheckBox("C");
        CheckBox skill4 = new CheckBox("C++");

        //Horizontal CheckBox
        HBox skillsBox = new HBox(5, skill1, skill2, skill3,skill4);
        skillsBox.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(skillsBox, 120.0);
        AnchorPane.setTopAnchor(skillsBox, 240.0);
        anchor1.getChildren().add(skillsBox);

        //Address
        Label label7=new Label("Address:");
        label7.setFont(Font.font("Poppins", FontWeight.BOLD,15));
        label7.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label7, 45.0);
        AnchorPane.setTopAnchor(label7,270.0);
        label7.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label7);

        //TextArea
        TextArea textArea=new TextArea();
        textArea.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(textArea, 120.0);
        AnchorPane.setTopAnchor(textArea, 270.0);
        anchor1.getChildren().add(textArea);

        //Button
        Button button=new Button("Submit");
        button.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(button, 500.0);
        AnchorPane.setTopAnchor(button, 540.0);
        anchor1.getChildren().add(button);
        button.setOnAction(e->{
            stage.close();
        });

        //MENUBAR
        MenuBar mb=new MenuBar();
        Menu fM=new Menu("FILE");
        MenuItem o=new MenuItem("OPEN");
        MenuItem s=new MenuItem("SAVE");
        MenuItem e=new MenuItem("EXIT");
        //ActionForOpen
        o.setOnAction(g->{
            FileChooser fC=new FileChooser();
            fC.setTitle("Open File");
            File selectedFile=fC.showOpenDialog(stage);
        });
        //ActionForSave
        s.setOnAction(r->{
            FileChooser fC1=new FileChooser();
            fC1.setTitle("Save File");
            File fileToSave=fC1.showSaveDialog(stage);
        });
        //ActionForExit
        e.setOnAction(event->{
            Platform.exit();
        });

        fM.getItems().addAll(o,s,new SeparatorMenuItem(),e);
        mb.getMenus().add(fM);
        AnchorPane.setTopAnchor(mb,0.0);
        anchor1.getChildren().add(mb);

        // Slider
        Label label8 = new Label("Slider Value:");
        label8.setFont(Font.font("Poppins", FontWeight.BOLD, 15));
        label8.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(label8, 45.0);
        AnchorPane.setTopAnchor(label8, 460.0);
        label8.setAlignment(Pos.TOP_LEFT);
        anchor1.getChildren().add(label8);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(50); // Initial value
        slider.setMaxWidth(Double.MAX_VALUE);
        AnchorPane.setLeftAnchor(slider, 135.0);
        AnchorPane.setTopAnchor(slider, 460.0);
        anchor1.getChildren().add(slider);

        button.setOnAction(f -> {
            String name = txt1.getText().trim();
            String regNo = txt2.getText().trim();

            // You can randomly generate or calculate attendance:
            int attendancePercent = (int)(Math.random() * 21) + 80; // Random between 80-100

            Scene3.display(name, regNo, attendancePercent);
            stage.close();
        });


        // ScrollPane
        ScrollPane scrollPane = new ScrollPane(anchor1);
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        // Scene
        Scene scene2 = new Scene(scrollPane, 550, 600);
        stage.setTitle("UPDATE DETAILS");
        stage.setScene(scene2);
        stage.show();
    }
}
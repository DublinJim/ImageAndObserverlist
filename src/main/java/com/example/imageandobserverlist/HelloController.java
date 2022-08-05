package com.example.imageandobserverlist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class HelloController implements Initializable {

    ObservableList<String> oblist = FXCollections.observableArrayList("Item1", "Item 2", "Item 3");
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private ComboBox<String> combo1;
    @FXML
    private ImageView imgWin;
    @FXML
    private Label lbl1;
    @FXML
    private ListView<String> list1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lbl1.setText("hello");
        combo1.setPromptText("Items picked here");
        list1.setItems(oblist);
        combo1.getItems().add("Item 1");
        combo1.getItems().add("Item 2");
        combo1.getItems().add("Item 3");


    }

    public void addTheItem(MouseEvent mouseEvent) {

        lbl1.setText("added");
        list1.getItems().add(combo1.getValue());
    }
}

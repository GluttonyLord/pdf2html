package com.gluttony.pdf2html.gui;

import com.gluttony.pdf2html.gui.mainpane.MainController;
import com.gluttony.pdf2html.gui.mainpane.MainPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main extends Application {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello World!");

        MainController mainController = new MainController();

        stage.setScene(new Scene(mainController.getMainPane(), 300, 250));
        stage.show();
    }
}

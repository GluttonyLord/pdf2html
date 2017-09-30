package com.gluttony.pdf2html.gui.mainpane;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPane extends StackPane {

    private static final Logger logger = LoggerFactory.getLogger(MainPane.class);

    public MainPane() {
        Button btn = new Button("Test");
        btn.setOnAction(actionEvent -> logger.info("Hello"));

        getChildren().add(btn);
    }
}

package com.devcolibri.mavenjavafxapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.apache.log4j.Logger;

public class MainController {

    final static Logger logger = Logger.getLogger(MainController.class);

    @FXML
    private Button btn;

    @FXML
    private TextArea area;

    @FXML
    public void onBtnClick(){
        area.appendText("Hello");
        logger.info("Hello");
    }

}

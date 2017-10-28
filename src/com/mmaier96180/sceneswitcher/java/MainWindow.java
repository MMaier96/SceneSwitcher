package com.mmaier96180.sceneswitcher.java;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainWindow {


	private Stage primaryStage;
	private static MainWindow instance;

	@FXML
	public void initialize() {
		//init window here
	}

	public MainWindow(Stage primaryStage) {
		this.primaryStage = primaryStage;
		if (instance == null) {
			instance = this;
		}
	}

	public static MainWindow getInstance() {
		return instance;
	}

}

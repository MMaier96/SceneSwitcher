package com.mmaier96180.sceneswitcher.java;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = null;
		MainWindow controller = new MainWindow(primaryStage);
		primaryStage.setTitle("Scene Switcher - MMaier96180 [Open Source]");
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/MainWindow.fxml"));
		loader.setController(controller);
		root = loader.load();
	    Scene scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("../css/MainWindow.css").toExternalForm());
	    primaryStage.setScene(scene);
	    primaryStage.setResizable(false);
	    primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		System.exit(0);
	}
}

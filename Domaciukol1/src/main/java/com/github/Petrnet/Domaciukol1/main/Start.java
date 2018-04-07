package com.github.Petrnet.Domaciukol1.main;
import com.github.Petrnet.Domaciukol1.logika.Game;
import com.github.Petrnet.Domaciukol1.ui.Homecontroller;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Start extends Application  {


	public static void main(String[] args) {
		
	    {
	    	launch(args);
	    }
	}

	  @Override
		public void start(Stage primaryStage) throws Exception {
			FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(getClass().getResource("/ui/Mainwindow.fxml"));    	
	    	Parent root = loader.load();

	    	Homecontroller controller = loader.getController(); 	
	    	Game game = new Game();
	    	controller.inicializuj(game, this);

	    	primaryStage.setScene(new Scene(root));
	    	primaryStage.show();
	    	primaryStage.setTitle("Game");
		}
	}

package com.github.Petrnet.Domaciukol1.ui;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.Petrnet.Domaciukol1.logika.Vocabulary;
import com.github.Petrnet.Domaciukol1.logika.Game;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Homecontroller 
{
private Map<String, Vocabulary> button;
private List<Vocabulary> seznamSlovicek;
private Game game;
private boolean guess1 = false;
@FXML private Button button1;
@FXML private Button button2;
@FXML private Button button3;
@FXML private Button button4;
@FXML private Button button5;
@FXML private Button button6;
@FXML private Tooltip tooltip1;
@FXML private Tooltip tooltip2;
@FXML private Tooltip tooltip3;
@FXML private Tooltip tooltip4;
@FXML private Tooltip tooltip5;
@FXML private Tooltip tooltip6;
@FXML private Button newword;
@FXML private ImageView pic1;
@FXML private ImageView pic2;
@FXML private ImageView pic3;
@FXML private ImageView pic4;
@FXML private ImageView pic5;
@FXML private ImageView pic6;
@FXML private TextArea vystupniText;




public void odesliPrikaz() {
	vystupniText.clear();
	String answer = 	"Správná odpověď: " + game.getCorrect() + "\n" +
						"Špatně uhadnuté: " + game.getMistake();
	vystupniText.appendText(answer);
}

public void inicializuj(Game game) {
	this.game = game;
	button = new HashMap<String, Vocabulary>();
	seznamSlovicek = game.getSeznamSlovicek();
	
	button.put(button1.getId(), seznamSlovicek.get(0));
	String URI = seznamSlovicek.get(0).getUriObrazku();
	Image pic = new Image (getClass().getResourceAsStream(URI));
	pic1.setImage(pic);
	tooltip1.setText(button.get("button1").getCesky());
	
	button.put(button2.getId(), seznamSlovicek.get(1));
	URI = seznamSlovicek.get(1).getUriObrazku();
	pic = new Image (getClass().getResourceAsStream(URI));
	pic2.setImage(pic);
	tooltip2.setText(button.get("button2").getCesky());
	
	button.put(button3.getId(), seznamSlovicek.get(2));
	URI = seznamSlovicek.get(2).getUriObrazku();
	pic = new Image (getClass().getResourceAsStream(URI));
	pic3.setImage(pic);
	tooltip3.setText(button.get("button3").getCesky());
	
	button.put(button4.getId(), seznamSlovicek.get(3));
	URI = seznamSlovicek.get(3).getUriObrazku();
	pic = new Image (getClass().getResourceAsStream(URI));
	pic4.setImage(pic);
	tooltip4.setText(button.get("button4").getCesky());
	
	button.put(button5.getId(), seznamSlovicek.get(4));
	URI = seznamSlovicek.get(4).getUriObrazku();
	pic = new Image (getClass().getResourceAsStream(URI));
	pic5.setImage(pic);
	tooltip5.setText(button.get("button5").getCesky());
	
	button.put(button6.getId(), seznamSlovicek.get(5));
	URI = seznamSlovicek.get(5).getUriObrazku();
	pic = new Image (getClass().getResourceAsStream(URI));
	pic6.setImage(pic);
	tooltip6.setText(button.get("button6").getCesky());
		
}

@FXML public void clickGuess(ActionEvent arg0) {
	if (!guess1) {
		game.chooseWord();
		String word = game.getGuessWord();
		newword.setText(word);
		guess1 = true;
	}
}

@FXML public void newword(ActionEvent arg0) {
	if (guess1) {
		String guess = ((Node) arg0.getTarget()).getId();
		guess = button.get(guess).getAnglicky();
		if (newword.getText().equals(guess)) {
			game.score(guess);
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Result");
			alert.setHeaderText(null);
			alert.setContentText("Correct");
			alert.showAndWait();
		}
		else 
		{	
			game.score(guess);
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Výsledek hádání");
			alert.setHeaderText("Hádané slovo je špatně");
			alert.showAndWait();
		}
    guess1 = false;
    newword.setText("odpověz");
	this.odesliPrikaz();
	}
}
}




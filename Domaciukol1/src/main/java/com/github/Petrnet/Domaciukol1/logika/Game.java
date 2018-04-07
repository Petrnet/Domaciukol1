package com.github.Petrnet.Domaciukol1.logika;
import java.util.*;



public class Game 
{
private List<Vocabulary> seznamSlovicek;
private String guessWord;
private boolean konecHry;
private int correct;
private int mistake;


    public Game(){
    {
    	seznamSlovicek = new ArrayList<Vocabulary>();
        
    	Vocabulary banana = new Vocabulary("banán","banana","/ui/banana.jpg");
    	Vocabulary apple = new Vocabulary("jablko","apple","/ui/apple.jpg");
    	Vocabulary lemon = new Vocabulary("citrón","lemon","/ui/lemon.jpg");
    	Vocabulary onion = new Vocabulary("cibule","onion","/ui/onion.jpg");
    	Vocabulary pepper = new Vocabulary("paprika","pepper","/ui/pepper.jpg");
    	Vocabulary potatoes = new Vocabulary("brambory","potatoes","/ui/potatoes.jpg");
    	
    	seznamSlovicek.add(banana);
    	seznamSlovicek.add(apple);
    	seznamSlovicek.add(lemon);
    	seznamSlovicek.add(onion);
    	seznamSlovicek.add(pepper);
    	seznamSlovicek.add(potatoes);
    }
    }
    public List<Vocabulary> getSeznamSlovicek(){
     return seznamSlovicek; 
}

    public int getMistake() {
    	return mistake;
    }
    
    public boolean rightGuess(String word) {
    	if (word.equals(guessWord)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    	
    	
    	public void score(String word){
        	if (word.equals(guessWord)) {
        		
        		mistake = mistake + 1;
        	}
        	else {
        		correct = correct + 1;
        	}
    }
    
    public void chooseWord() {
    	Random randomWord = new Random();
    	guessWord = seznamSlovicek.get(randomWord.nextInt(seznamSlovicek.size())).getAnglicky();
    }
    
    public int getCorrect() {
    	return correct;
    }
    
    public String getGuessWord() {
    	return guessWord;
    }
    
    public boolean konecHry() {
    	return konecHry;
    }
    
    
}
package app;

import gui.*;

import java.util.ArrayList;

import bll.*;

public class Start {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Task> tasks = new ArrayList<Task>();
/*		
		Task montag = new Tas(Wochentag.Montag, "Nudelsuppe", "Cordon Bleu", "Apfelstrudel");
		Task dienstag = new Menü(Wochentag.Dienstag, "Frittatensuppe", "Pizza Margherita", "Vanilleeis");
		Task mittwoch = new Menü(Wochentag.Mittwoch, "Griesnockerlsuppe", "Wiener Schnitzel", "Palatschinken");
		Task donnerstag = new Menü(Wochentag.Donnerstag, "Kirchtagssuppe", "Gefülltes Lamm", "Erdbeersorbet");
		Task freitag = new Menü(Wochentag.Freitag, "Brokkolicremesuppe", "Schweinemedaillons mit Spätzle", "Indianer mit Schlag");
*/
		/*
		tasks.add(montag);
		tasks.add(dienstag);
		tasks.add(mittwoch);
		tasks.add(donnerstag);
		tasks.add(freitag);
		*/
		
		MainFrame frame = new MainFrame("Taskplaner", tasks); 
		
	}
}

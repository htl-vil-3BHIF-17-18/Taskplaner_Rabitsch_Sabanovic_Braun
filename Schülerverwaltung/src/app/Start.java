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
		Task dienstag = new Men�(Wochentag.Dienstag, "Frittatensuppe", "Pizza Margherita", "Vanilleeis");
		Task mittwoch = new Men�(Wochentag.Mittwoch, "Griesnockerlsuppe", "Wiener Schnitzel", "Palatschinken");
		Task donnerstag = new Men�(Wochentag.Donnerstag, "Kirchtagssuppe", "Gef�lltes Lamm", "Erdbeersorbet");
		Task freitag = new Men�(Wochentag.Freitag, "Brokkolicremesuppe", "Schweinemedaillons mit Sp�tzle", "Indianer mit Schlag");
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

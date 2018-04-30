package bll;

import java.util.Date;

public class Task {
	private int id = 0;
	private Art art = Art.Hausaufgabe;
	private Fach fach = Fach.AM;
	private Date datum = null;
	private String beschreibung = "";
	
	public Task(int id, Art art, Fach fach, Date datum, String beschreibung) {
		super();
		this.id = id;
		this.art = art;
		this.fach = fach;
		this.datum = datum;
		this.beschreibung = beschreibung;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Art getArt() {
		return art;
	}

	public void setArt(Art art) {
		this.art = art;
	}

	public Fach getFach() {
		return fach;
	}

	public void setFach(Fach fach) {
		this.fach = fach;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", art=" + art + ", fach=" + fach + ", datum=" + datum + ", beschreibung="
				+ beschreibung + "]";
	}
	
	
	
	
}

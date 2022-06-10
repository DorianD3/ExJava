package exempleok;

import java.util.ArrayList;

public class Processus {
	private String ProcessusNom;
	private ArrayList<Thread> Threadlist;
	
	//
	public Processus(String Nom, ArrayList<Thread> list) {
		this.ProcessusNom = Nom;
		this.Threadlist =list;
	}
	//
	public String getNom() {
		return ProcessusNom;
	}
	public void setNom(String nom) {
		this.ProcessusNom = nom;
	}
	public void addThread(Thread th) {
		this.Threadlist.add(th);
	}
	@Override
	public String toString() {
		return "Processus [ProcessusNom=" + ProcessusNom + ", Threadlist=" + Threadlist + "]";
	}
}

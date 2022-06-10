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
	
	public void displayProcessus() {
		System.out.println("Processus "+ this.ProcessusNom + " contient les thread : \n");
		if (Threadlist.isEmpty()) {
		System.out.println("No thread");
		}
		else {
			for (Thread th : Threadlist) {
			th.displayThread();
			System.out.println("\n");
		    }
		}
	}
}

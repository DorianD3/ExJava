package exempleok;

import java.util.ArrayList;


public class Processeur {
	private String ProcesseursNom;
	private ArrayList<Processus> ProcessusList;
	
	public Processeur(String Nom, ArrayList<Processus> list ) {
		this.ProcesseursNom = Nom;
		this.ProcessusList = list;
	}
	
	public String getNom() {
		return ProcesseursNom;
	}
	public void setNom(String processeursNom) {
		ProcesseursNom = processeursNom;
	}
	public ArrayList<Processus> getProcessusList() {
		return ProcessusList;
	}
	public void setProcessusList(ArrayList<Processus> processusList) {
		ProcessusList = processusList;
	}
	public void addProcessus(Processus processus) {
		this.ProcessusList.add(processus);
	}
	public void displayProcesseur() {
		System.out.println("processeur " + this.ProcesseursNom + " contains " + ProcessusList.size() + "processus \n" );
		if (ProcessusList.isEmpty()) {
			System.out.println("noProcessus");
		}
		else {
			for (Processus p : ProcessusList) {
				p.displayProcessus();
			}
		}
	}
	

}

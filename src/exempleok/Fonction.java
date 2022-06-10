package exempleok;

import java.util.ArrayList;

public class Fonction {
	//instance
	private String Nom;
	private FonctionKind Kind;
	private ArrayList<String> Parameters;
	private ArrayList<Fonction> subFonctionList;

	//--------------constructeurs-----------------------------
	public Fonction(String Nom, ArrayList<String> parameters, FonctionKind kind, ArrayList<Fonction> subfonctionlist) {
		this.Nom = Nom;
		this.Parameters = parameters;
		this.subFonctionList = subfonctionlist;
		this.Kind = kind;

	}
	public Fonction(String Nom, ArrayList<String> parameters, ArrayList<Fonction> subfonctionlist) {
		this.Nom = Nom;
		this.Parameters = parameters;
		this.subFonctionList = subfonctionlist;
	}
	
	
	public Fonction(String Nom, ArrayList<String> parameters) {
		this.Nom = Nom;
		this.Parameters = parameters;
	}
	
	public Fonction(String Nom) {
		this.Nom = Nom;
	}

	//--------------getters&setters--------------------------------
	//NomFonction
	public String getNom() {
		return Nom;
	}
	public void setNom(String Nom) {
		this.Nom = Nom;
	}
	//parametres
	//ajout parametre
	public void addParameters(String parameter) {
		this.Parameters.add(parameter);
	}
	//verification présence parametre
	public boolean checkParameter(String parameter) {
		return this.Parameters.contains(parameter);
	}
	
	//type de fonction 
	public FonctionKind getKind() {
		return this.Kind;
	}
	//gestion 
	public void ajoutsousFonction (Fonction f) {
		this.subFonctionList.add(f);
	}
	public void displayParameters() {
		System.out.println( this.Nom + " paramaeters are ");
		for (String param : Parameters) {
			System.out.println("- " + param);
		}
	}
	public void displaySubfonction() {
		System.out.println( this.Nom + "subFunctions are");
		if (this.subFonctionList.isEmpty()) {
			System.out.println("no subFunction");
		}
		else {
			for (Fonction f : this.subFonctionList) {
			System.out.println("- " + f.Nom);
		    }
		}
	}
	public void dispayFonction() {
		System.out.println("Fonction " + this.Nom +", Kind : "+ this.Kind);
		this.displayParameters();
		this.displaySubfonction();
	}
}
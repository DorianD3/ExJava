package exempleok;
import java.util.ArrayList;

public class Thread {
	// variables d'instance
	private String Threadnom;
	private ArrayList<Fonction> Functionlist;
	private Activationmode Modeactivation;
	private int Timebudget;
	private Unit Timebudgetunit;
	private int Timeperiod;
	private Unit Timeperiodunit;

	// constructeurs
	public Thread(String threadnom,ArrayList<Fonction> functionList) {
		this.Threadnom = threadnom;
		this.Functionlist = functionList;
	}
	//getters&setters
	public void setNom(String nthreadnom) {
		this.Threadnom = nthreadnom;
	}
	public String getNom() {
		return Threadnom;
	}
	///Timebudget/period
	public void setTimebudget(int time,Unit unit) {
		this.Timebudget= time;
		this.Timebudgetunit = unit;
	}
	public void setTimebudget(int time) {
		this.Timebudget= time;
	}
	public String getTimebudget() {
		return "Timebudget =" + Timebudget + " " + Timebudgetunit ;
	}
	///
	public void setTimeperiod(int time,Unit unit) {
		this.Timeperiod= time;
		this.Timeperiodunit = unit;
	}
	public void setTimeperiod(int time) {
		this.Timeperiod= time;
	}
	public String getTimeperiod() {
		return "Timeperiod =" + Timeperiod + " " + Timeperiodunit ;
	}
	///mode avtivation
	public void setModeactivation(Activationmode am) {
		this.Modeactivation = am;
		}
	public Activationmode getModeactivation() {
		return Modeactivation;
	}
	//méthodes
	//ajout d'une fonction dans functiunlist
	public void ajoutFonction (Fonction f) {
		this.Functionlist.add(f);
	}
	@Override
	public String toString() {
		return "Thread [Threadnom=" + Threadnom + ", Functionlist=" + Functionlist + "]";
	}
	
}

package exempleok;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

	//initf1
	ArrayList<String> paramf1 = new ArrayList<>();
	ArrayList<Fonction> subf1 = new ArrayList<>();
	Fonction f1 = new Fonction("f1", paramf1, FonctionKind.Route , subf1);
	Fonction f11 = new Fonction("f11",paramf1);
	Fonction f12 = new Fonction("f12",paramf1);
	System.out.println(f1.toString());
	f1.addParameters("in1");
	f1.addParameters("in2");
	f1.addParameters("out1");	
	f1.ajoutsousFonction(f11);
	f1.ajoutsousFonction(f12);
	System.out.println(f1.toString());
	
	//initf2
	ArrayList<String> paramf2 = new ArrayList<>();
	ArrayList<Fonction> subf2 = new ArrayList<>();
	Fonction f2 = new Fonction("f2 ",paramf2, FonctionKind.Gather , subf2);
	System.out.println(f1);
	f2.addParameters("in3");
	f2.addParameters("out2");
	f2.addParameters("in44");
	System.out.println(f2);
	
	//initf3
	ArrayList<String> paramf3 = new ArrayList<>();
	ArrayList<Fonction> subf3 = new ArrayList<>();
	Fonction f3 = new Fonction("f3",paramf3, subf3);
	System.out.println(f3);
	f3.addParameters("AGE");
	f3.addParameters("Poids");
	f3.addParameters("Nom");
	System.out.println(f1);
	
	//initf4
	ArrayList<String> paramf4 = new ArrayList<>();
	ArrayList<Fonction> subf4 = new ArrayList<>();
	Fonction f4 = new Fonction("f4 ",paramf4, subf4);
	System.out.println(f4);
	f4.addParameters("taille");
	f4.addParameters("Poids");
	f4.addParameters("Nom");
	System.out.println(f4);
	
	//initt t1
	ArrayList<Fonction> Lf1 = new ArrayList<>();
	Lf1.add(f1);
	Lf1.add(f2);
	System.out.println("Lf1 :"  + Lf1);
	Thread th1 = new Thread("Thread1", Lf1);
	th1.setTimebudget(1, Unit.ms);
	th1.setTimeperiod(200, Unit.ns);
	th1.setModeactivation(Activationmode.sporadic );
	System.out.println("thread1" + th1.toString());
	System.out.println(th1.getTimebudget());
	
	//initt t2
	ArrayList<Fonction> Lf2 = new ArrayList<>();
	Lf2.add(f3);
	Lf2.add(f4);
	System.out.println("Lf2 :"  + Lf2);
	Thread th2 = new Thread("Thread2", Lf2);
	th2.setTimebudget(2, Unit.ms);
	th2.setTimeperiod(250, Unit.ns);
	th2.setModeactivation(Activationmode.periodic );
	System.out.println("thread2" + th2.toString());
	System.out.println(th2.getTimebudget());
	
	//initProcessus
	ArrayList<Thread> Lth = new ArrayList<>();
	//Lth.add(th1,th2);/// .add
	Lth.add(th1);
	Lth.add(th2);
	Processus p1 = new Processus("P1", Lth);
	System.out.println(p1.toString());
	
	//initprocesseur
	ArrayList<Processus> Lp = new ArrayList<>(); 
	Lp.add(p1);
	Processeur pp1 = new Processeur("processeur1", Lp);
	
	//visualisation d'ensemble
	pp1.displayProcesseur();
	}
}

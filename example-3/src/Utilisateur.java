import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Utilisateur implements Observable{

	Set<Observer> observers = new HashSet<Observer>();
	private String nom;
	private String message;
 
	public Utilisateur(String nom) {
		super();
		this.nom = nom;
	}
	
	@Override
	public void rejoignerChat(Observer o) {
		observers.add(o);
	}

	@Override
	public void quitterChat(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifierUtilisateurs() {
		for (Observer o : observers) {
			o.montrerMessage(this);
		}
	}

	public Set<Observer> getObservers() {
		return observers;
	}

	public void setObservers(Set<Observer> observers) {
		this.observers = observers;
	}

	public String getNom() {
		return nom;
	}

	public String getMessage() {
		return message;
	}

	public void envoiMessage(String message) {
		this.message = message;
		notifierUtilisateurs();
	}
}

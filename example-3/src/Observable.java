
public interface Observable {
	
	void rejoignerChat(Observer o);
	
	void quitterChat(Observer o);
	
	void notifierUtilisateurs();
	
}
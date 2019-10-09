
public class Application {

	public static void main(String[] args) {
		
		Utilisateur u1 = new Utilisateur("Achraf");
		Utilisateur u2 = new Utilisateur("Hassan");
		
		Observer salle = new Salle();
		
		u1.rejoignerChat(salle);
		u2.rejoignerChat(salle);
		
		u1.envoiMessage("Hello!");
		u2.envoiMessage("hi!");
		
	}

}


public class SimpleTag extends Tag{
	
	public SimpleTag(String contenu, String debutTag, String finTag) {
		super(contenu, debutTag, finTag);
	}
	
	@Override
	public void afficherHTML() {
        System.out.println("\t"+debutTag+""+contenu+""+finTag);
	}
	
}

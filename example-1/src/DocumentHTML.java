
public class DocumentHTML extends Document{
	
	String contenu;
	
	public DocumentHTML(String contenu) {
		super();
		this.contenu = contenu;
	}

	public DocumentHTML() {}
	
	@Override
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	@Override
	public void Dessine() {
		System.out.println("DocHTML dessiné");
	}

	@Override
	public void Imprime() {
		System.out.println("DocHTML imprimé");
	}

	
	
	
}


public abstract class Tag {
	protected String contenu;
	protected String debutTag;
	protected String finTag;
		
	public Tag(String contenu, String debutTag, String finTag) {
		this.contenu = contenu;
		this.debutTag = debutTag;
		this.finTag = finTag;
	}

	public Tag(String debutTag, String finTag) {
		this.debutTag = debutTag;
		this.finTag = finTag;
	}

	public abstract void afficherHTML();
	
	public void addTag(Tag t) {}
	public void removeTag(Tag t) {}
}

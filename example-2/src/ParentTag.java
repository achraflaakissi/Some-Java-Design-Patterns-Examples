import java.util.ArrayList;
import java.util.List;

public class ParentTag extends Tag{

	List<Tag> Tags = new ArrayList<Tag>();
	
	public ParentTag(String debutTag, String finTag) {
		super(debutTag, finTag);
	}
	
	@Override
	public void afficherHTML() {
		System.out.println(this.debutTag);
		for(Tag t:Tags) {
			t.afficherHTML();
		}
		System.out.println(this.finTag);
	}
	
	public void addTag(Tag t){
		Tags.add(t);
	}
	
	public void removeTag(Tag t){
		Tags.remove(t);
	}
}

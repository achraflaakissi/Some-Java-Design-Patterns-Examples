
public class Application {
	public static void main(String[] args) {
		
		Biscuit b1 = new DecChocolat(new DecCaramel(new DecFraise(new BiscuitSimple())));
		System.out.println(b1.preparer());
		
		Biscuit b2 = new DecCaramel(new BiscuitSimple());
		System.out.println(b2.preparer());
		
		Biscuit b3 = new BiscuitSimple();
		System.out.println(b3.preparer());
	}
}
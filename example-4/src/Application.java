
public class Application {
	public static void main(String[] args) {
		
		Context t = new Context();
		t.lampe = new Allumee();
		t.appliquerEtat();
		t.lampe = new Eteinte();
		t.appliquerEtat();
		t.lampe = new Allumee();
		t.appliquerEtat();
	}
}
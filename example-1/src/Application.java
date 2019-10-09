
public class Application {

	public static void main(String[] args) {
		
		System.out.println("---- Document HTML ----");
		Document dhtml = new DocumentHTML();
		dhtml.setContenu("index.html");
		dhtml.Dessine();
		dhtml.Imprime();

		System.out.println("---- Document PDF ----");

		Document dpdf = new ComposantPDFAdapter();
		dpdf.setContenu("exp.pdf");
		dpdf.Dessine();
		dpdf.Imprime();
	}

}

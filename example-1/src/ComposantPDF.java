
public class ComposantPDF {
	String contenu;
	
	public ComposantPDF(String contenu) {
		this.contenu = contenu;
	}

	public ComposantPDF() {}
	
	public void pdfFixeContenu(String contenu) {
		this.contenu = contenu;
	}

	public void pdfPrepareAffichage() {
		System.out.println("ComposantPDF pdfprepareaffichage");
	}
	
	public void pdfRafraichit() {
		System.out.println("ComposantPDF pdfrafraichit");
	}

	public void pdfTermineAffichage() {
		System.out.println("ComposantPDF pdftermineaffichage");
	}

	public void pdfEnvoiImprimante() {
		System.out.println("ComposantPDF pdfEnvoiimprimante");
	}
}

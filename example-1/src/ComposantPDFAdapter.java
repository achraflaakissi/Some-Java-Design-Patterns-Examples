
public class ComposantPDFAdapter extends Document{
	ComposantPDF c;
	
	public ComposantPDFAdapter(String contenu) {
		c = new ComposantPDF(contenu);
	}

	public ComposantPDFAdapter() {
		c = new ComposantPDF();
	}

	@Override
	public void setContenu(String contenu) {
		c.pdfFixeContenu(contenu);
	}

	@Override
	public void Dessine() {
		c.pdfPrepareAffichage();
		c.pdfRafraichit();
		c.pdfTermineAffichage();
	}

	@Override
	public void Imprime() {
		c.pdfEnvoiImprimante();
	}

}

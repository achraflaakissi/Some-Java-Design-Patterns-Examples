import java.text.SimpleDateFormat;
import java.util.Date;

public class Salle implements Observer{

	@Override
	public void montrerMessage(Observable o) {
		Date datetime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MM/yyyy HH:mm:ss");
		String datenow = sdf.format(datetime);
		System.out.println("#"+((Utilisateur)o).getNom() +"("+datenow+") : "+ ((Utilisateur)o).getMessage());
	}

}


public class DecCaramel extends BiscuitDecorator {

	private final Biscuit biscuit;
	
	
	public DecCaramel(Biscuit biscuit) {
		this.biscuit = biscuit;
	}


	@Override
	public String preparer() {
		return biscuit.preparer()+" \n \t Couche Caramel";
	}

}

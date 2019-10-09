
public class DecChocolat extends BiscuitDecorator {

	private final Biscuit biscuit;
	
	
	public DecChocolat(Biscuit biscuit) {
		this.biscuit = biscuit;
	}


	@Override
	public String preparer() {
		return biscuit.preparer()+" \n \t Couche Chocolat";
	}

}

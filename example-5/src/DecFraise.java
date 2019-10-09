
public class DecFraise extends BiscuitDecorator {

	private final Biscuit biscuit;
	
	
	public DecFraise(Biscuit biscuit) {
		this.biscuit = biscuit;
	}


	@Override
	public String preparer() {
		return biscuit.preparer()+" \n \t Couche Fraise";
	}

}

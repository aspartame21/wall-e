
public class LookingForBottle implements Precept {

	@Override
	public void next(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("Looking for bottle");
		ctx.setPrecept(new GoingForBottle());
	}

}

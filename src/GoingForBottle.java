
public class GoingForBottle implements Precept {

	@Override
	public void next(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("Bottle detected");
		ctx.setPrecept(new Touching());
	}

}

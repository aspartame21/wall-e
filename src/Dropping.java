
public class Dropping implements Precept {

	@Override
	public void next(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("Dropping bottle");
		ctx.collectBottle();
		ctx.setPrecept(new LookingForBottle());
	}

}

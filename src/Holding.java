
public class Holding implements Precept {

	@Override
	public void next(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("Looking for drop");
		ctx.setPrecept(new GoingToDrop());
	}

}


public class GoingToDrop implements Precept {

	@Override
	public void next(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("Drop found");
		ctx.setPrecept(new Dropping());
	}

}

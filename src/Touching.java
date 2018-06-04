
public class Touching implements Precept {

	@Override
	public void next(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("Picking up the bottle");
		ctx.setPrecept(new Holding());
	}

}

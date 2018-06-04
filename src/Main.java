
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context ctx = new Context();
		for (int i = 0; ctx.getCollectedBottles() < 5; i++) {
			int cycles = presentIndex(ctx.getCollectedBottles());
			if (i % 6 == 0)
				System.out.println("Cycle #" + cycles);
			ctx.next();
		}
	}

	private static int presentIndex(int i) {
		return i + 1;
	}

}

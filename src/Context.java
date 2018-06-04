
public class Context {
	private Precept currentPrecept;
	private int collectedBottles;
	
	public Context() {
		currentPrecept = new LookingForBottle();
		collectedBottles = 0;
	}
	
	public void setPrecept(Precept p) {
		currentPrecept = p;
	}
	
	public void next() {
		currentPrecept.next(this);
	}
	
	public void collectBottle() {
		collectedBottles += 1;
	}
	
	public int getCollectedBottles() {
		return collectedBottles;
	}
}

package prob3;

public abstract class Bird {
	protected String name;

	protected abstract void fly();

	protected abstract void sing();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
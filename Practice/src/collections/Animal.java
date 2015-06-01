package collections;

public abstract class Animal {

	public String makeNoise() {

		return "some sound";
	}

	public void sleep() {
		System.out.println("Animal sleeping.....");
	}

	public abstract void see();
}

package collections;

public class Dog extends Animal implements Pet{

	public String makeNoise2() {
		return "Woof Woof";
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void see() {
		// TODO Auto-generated method stub
		System.out.println(":->");
	}
}

package collections;

public class TestDrive {

	public static void main(String[] args) {
		/*
		Animal animal = new Dog();
		System.out.println(animal.makeNoise());
		animal.sleep();
		
		Pet pet = new Dog();*/
		
		String s= "Real Madrid:3:Juventus:13";
		s=s.replaceAll(":?Real Madrid:\\d+:?", "");
		System.out.println(s);
		/*String sL[]=s.split(":?Real Madrid:\\d+:?");
		String sL2[]=s.split(":?Juventus:\\d+:?");

	System.out.println("Input="+s);
		for (String s1 : sL) {
			System.out.println("sl:"+s1);
		}
		for (String s1 : sL2) {
			System.out.println("sl2:"+s1);
		}
		System.out.println(sL2[0].substring(0, sL2[0].indexOf(":")));
		*/
	}

}

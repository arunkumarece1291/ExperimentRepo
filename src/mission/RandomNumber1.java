package mission;



import java.util.Random;

public class RandomNumber1 {
	int randomInteger1;
	Random random1;

	

	public int Random_Number1() {
		// TODO Auto-generated method stub
		random1 = new Random();
		
		randomInteger1=random1.nextInt(3);
//		System.out.println(randomInteger1);
		
		return randomInteger1;
		
	}
}
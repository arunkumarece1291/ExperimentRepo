package mission;

import java.util.Random;

public class RandomNumber {
	int randomInteger;
	Random random;

	public int Random_Number() {
		random = new Random();
		
		randomInteger=random.nextInt(11);
//		System.out.println(randomInteger);
		
		return randomInteger;
		
	}
	

	}
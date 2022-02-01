package ocean.random;

import java.util.Random;

public class RandomNumbers {
   private Random rand; 
   
   public RandomNumbers(long seed) { 
		rand = new Random(seed);		
	}

	public Double randFreq() { 
		return rand.nextDouble();
	}
}

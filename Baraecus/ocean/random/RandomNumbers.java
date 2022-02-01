package ocean.random;

import java.util.Random;

public class RandomNumbers {
   private static Random rand; 
   
   public RandomNumbers(long seed) { 
		rand = new Random(seed);		
	}

	public static Double randFreq() {
		return rand.nextDouble();
	}
	
	public static int randInt(int m) {
		return rand.nextInt(m);
		
	}
}

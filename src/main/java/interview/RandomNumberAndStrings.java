package interview;

import java.util.Random;

public class RandomNumberAndStrings {

	public static void main(String[] args) {
		Random rand=new Random();
		int random=rand.nextInt(1000);
		System.out.println(random);
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextGaussian());
		
		System.out.println(Math.random());
	}

}

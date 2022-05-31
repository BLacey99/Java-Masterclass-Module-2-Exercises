
public class PlayingCat {

	public static void isCatPlaying(boolean summer, int temperature){
		if(summer == true && (temperature >=25 && temperature <=45)) {
			System.out.println("The cat is playing.");
			
		}
		else if (summer == false && (temperature >=25 && temperature <= 35)) {
			System.out.println("The cat is playing.");
		}
		else {
			System.out.println("The cat is not playing.");
		}
		
	}
}

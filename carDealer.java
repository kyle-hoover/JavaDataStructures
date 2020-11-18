package loopMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class carDealer {
	  
	public static void main(String[] args) {
		 
		HashMap<String, String> cars = new HashMap<String, String>();
		  
		cars.put("Camry", "Toyota");  
		cars.put("Wrangler", "Jeep");
		cars.put("Civic", "Honda");
		cars.put("E30", "BMW");
		
		Scanner carScanner = new Scanner(System.in);
		
		System.out.println("What model vehicle are you looking for?");
		String userModel = carScanner.nextLine(); //stores users desired model
		
		for (Map.Entry<String, String> entry : cars.entrySet()) {
			if (entry.getKey().equals(userModel)) {
				System.out.println("We have " + userModel + "s" + "right this way!");
				break;
			} else {
				System.out.println("I'm sorry, we don't have that model in our inventory!");
				break;
			}
		}
		
		carScanner.close();
		
	  }
}

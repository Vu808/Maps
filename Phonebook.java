import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Phonebook {

	public static void main (String[] args) {
		Map <String, Integer> phonebook = new HashMap<String, Integer>();
		Scanner scnr = new Scanner(System.in);
		boolean openApp = true;
		
		while (openApp) {
			System.out.println("Welcome to Vu's Virtual Phonebook!");
			System.out.println();
			System.out.println("Please select a letter option");
			System.out.println("-----------------------");
			System.out.println("[A]dd a new contact");
			System.out.println("[F]ind an existing contact");
			System.out.println("[S]ee all contacts");
			System.out.println("[E]xit Phonebook");
			String input = scnr.next();
			System.out.println();
			
			if (input.equalsIgnoreCase("A")) {
				System.out.println("Please input new contacts full name");
				String name = scnr.next();
				System.out.println();
				System.out.println("Please input " + name + "'s phone number (no special characters, no area code)");
				int number = scnr.nextInt();
				phonebook.put(name, number);
				System.out.println("You have added " + name + " (" + number + ") to  the phonebook!");
			}
			
			if (input.equalsIgnoreCase("F")) {
				System.out.println("Please Enter Contacts Name");
				String name = scnr.next();
				System.out.println();
				if (phonebook.containsKey(name)) {
					System.out.println(name + "'s phone number is " + phonebook.get(name));
				} else {
						System.out.println("That contact does not exist");
					}
				System.out.println();
				}
			if (input.equalsIgnoreCase("S")) {
				System.out.println("All contacts");
				System.out.println("------------------");
				phonebook.forEach((name, number) -> System.out.println(name + "\t" + number));
				System.out.println();
			}
			
			if (input.equalsIgnoreCase("E")) {
				System.out.println("See you again!");
				openApp = false;
			}
			
			else {
				System.out.println("That is not an option");
				System.out.println();
			}
			
		}
	}
	
}

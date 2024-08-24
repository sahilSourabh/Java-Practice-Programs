package javaPractice.BasicPrograms;

import java.util.ArrayList;

public class NameInitialsWithSurname {

	public static void main(String[] args) {
		
		String name = "Sourabh sahil singh";
		
		// split the name into parts
		String words[] = name.split(" ");
		ArrayList<String> nameList = new ArrayList<>();
		
		for(String word:words) {
			
			nameList.add(word);
		}
		
		// get the initials
		StringBuilder initials = new StringBuilder();
		
		for(int i=0; i<nameList.size()-1; i++) {
			
			initials.append(Character.toUpperCase(nameList.get(i).charAt(0))).append(". ");
		}
		
		//get the surname and make the first letter UpperCase
		String surname = nameList.get(nameList.size() - 1);
        surname = Character.toUpperCase(surname.charAt(0)) + surname.substring(1);
 
        // print the result
        System.out.println(initials.toString() + surname);
		
	}

}

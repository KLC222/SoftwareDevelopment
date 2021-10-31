import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word;
        String character;
        String firstname;
        String surname;
        String substring;
        String match;
        String match2;
        String x;

        System.out.println("==============");
        System.out.println("Requirement 1:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a word: ");
        word = input.next();
        System.out.println("Number of characters in "+word+" is: "+word.length());
		
        System.out.println();		
		System.out.println("==============");
        System.out.println("Requirement 2:");
        System.out.println("==============");
        System.out.println();
		
        System.out.println("First character of Number is: "+word.charAt(0)); 
        System.out.println("Last character of Number is: "+word.charAt(word.length() - 1)); 

        System.out.println();		
		System.out.println("==============");
        System.out.println("Requirement 3:");
        System.out.println("==============");
        System.out.println();

        System.out.println("Second character "+word.charAt(1)+" is located at "+word.indexOf(word.charAt(1)));

        System.out.println();		
		System.out.println("==============");
        System.out.println("Requirement 4:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter a character to check if its contained in the word you previously entered: ");
        character = input.next();
        System.out.println("This character is located at index: "+word.indexOf(character.charAt(0))+". Note: if index value of -1, "+word+" does not contain '"+character.charAt(0)+"'.");

        System.out.println();		
		System.out.println("==============");
        System.out.println("Requirement 5:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Enter firstname: ");
        firstname = input.next();
        System.out.print("Enter surname: ");
        surname = input.next();
        System.out.println("Name entered is: "+firstname.concat(" ").concat(surname));

        System.out.println();		
		System.out.println("==============");
        System.out.println("Requirement 6:");
        System.out.println("==============");
        System.out.println();

        System.out.print("Check if strings match");
        System.out.print("Enter first string: ");
        match = input.next();
        System.out.print("Enter second string: ");
        match2 = input.next();
        System.out.println("test matches "+match+": "+match.equals(match2));
        System.out.println("test matches (ignore case) "+match+": "+match.equalsIgnoreCase(match2));
        System.out.println();		
		System.out.println("==============");
        System.out.println("Requirement 7:");
        System.out.println("==============");
        System.out.println();
        System.out.print("create a substring from the 1st character to 3rd character");
        System.out.print("Enter a string to create substring from: ");
        substring = input.next();
        System.out.print("Substring from 1st to 3rd character of substring is: "+substring.substring(0, 3));

        System.out.println();		
		System.out.println("==============");
        System.out.println("Requirement 8:");
        System.out.println("==============");
        System.out.println();

        System.out.println("Enter a string, and if it contains any 'u' characters replace them with 'x' characters");
        System.out.println("Enter a string: ");
        x = input.next();
        System.out.println("autumn updated with 'u' characters(if they exist in the string) replaced by 'x' :");
        System.out.println("characters: "+x.replace("u","x"));


        input.close();
    }
}

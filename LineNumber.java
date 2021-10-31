import java.util.Scanner;

public class LineNumber{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int x = 0;
    System.out.print("Enter a line number: ");
    x = input.nextInt();

    System.out.println("number entered is: "+x);

    String sentence = "";
    System.out.print("Enter a sentence: ");
    sentence = input.nextLine();

    System.out.println(sentence);

    System.out.println(x+". "+sentence);

}


}
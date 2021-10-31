import java.util.Scanner;

public class Inputs{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String name = "";
    System.out.print("Enter your first name: ");
    name = input.next();

    System.out.println("your first name"+name);

int x = 0;
    System.out.print("Enter a whole number: ");
    x = input.nextInt();

    System.out.println("number entered is: "+x);

double number = 0;
    System.out.print("Enter a decimal number: ");
    number = input.nextDouble();

    System.out.println("number entered is: "+number);

    System.out.println(name + ", you entered the numbers "+x+" and "+number+".");



}


}
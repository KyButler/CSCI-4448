import java.util.Scanner; // for user input
import Zoo.Zoo;

public class Main {
  public static void main(String[] args) {
    // creates a scanner object for the user input
    Scanner scanner = new Scanner(System.in);

    // print out introduction as well as instruction
    System.out.println("Welcome to the Denver Zoo! Please, enter the amount of days: ");

    String userinput = scanner.nextLine();
    int days = Integer.parseInt(userinput);

    // close scanner, retrieved from https://www.tutorialspoint.com/java/util/scanner_close.htm
    scanner.close();

    Zoo denver = new Zoo();

    denver.go(days);

    System.out.println("Thank you for visiting the Denver Zoo! We hope you had a great last " + days + " days!");
    return;
  }
}

/**
 * Animal List:
 * 
 * Pachyderm - Rhino - Hippo - Elephant
 * 
 * Feline - Tiger - Lion - Cat
 * 
 * Canine - Dog - Wolf
 * 
 * Reptile - Snake - Turtle
 */
import java.util.Scanner;

public class HelloEveryone {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a new number: ");
    int input = sc.nextInt();
    System.out.println(input);
    sc.close();
  }
}
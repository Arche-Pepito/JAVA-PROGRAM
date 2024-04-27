import java.util.Scanner;

public class user_input {
  
  public static void main(String[] args) {
  

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Enter your address: ");
    String address = scanner.nextLine();

    System.out.print("Enter your email: ");
    String email = scanner.nextLine();

    System.out.print(" Enter your Password: ");
    String password = scanner.nextLine();

    System.out.println(name);
    System.out.println(age);
    System.out.println(address);
    System.out.println(email);
    System.out.println(password);
        

    scanner.close();
  
}

}

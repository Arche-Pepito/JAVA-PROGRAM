
import java.util.Scanner;
public class sum_of_two_num {
  public static void main (String a[]){

     Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a first digit number: ");
    int num1 = scanner.nextInt();
  
    System.out.print("Enter a second digit number: ");
    int num2 = scanner.nextInt();
     
    int result = num1 + num2;

    System.out.println("Result:" + result);

    scanner.close();  

  }
  
}

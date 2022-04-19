import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    //System.out.print("What is your current weight(kg): ");
    double weight = scan.nextDouble();

    //System.out.print("What is your current height(m): ");
    double height = scan.nextDouble();

    double BMI = weight / (height * height);
    System.out.println("Your BMI is: " + BMI);
  }
}

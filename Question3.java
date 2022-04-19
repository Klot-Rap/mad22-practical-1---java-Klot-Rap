import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //System.out.print("Please enter a integer: ");
    int userInt = sc.nextInt();

    int newInt = userInt * userInt;

    System.out.println(newInt);
  }
}

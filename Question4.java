import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter a integer: ");
    int userInt = sc.nextInt();


    
    for (int i=userInt; i > 0; i--){
      for (int k=0; k<i; k++){
        System.out.print('*');
      }
      System.out.println();
    }
    
  }
}

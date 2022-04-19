import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    //System.out.print("Please enter a number: ");
    int userInt = in.nextInt();
    
    
    ArrayList<Integer> allUserInput = new ArrayList<>();

    
    for (int i=0; i<userInt; i++){
      //System.out.print("Please enter another number: ");
      allUserInput.add(in.nextInt());
    }
    
    int t = 0;
    for(int i=0; i<allUserInput.size(); i++){
      for(int j=1; j<allUserInput.size()-i; j++){
            
        if(allUserInput.get(j-1) > allUserInput.get(j)){
          t = allUserInput.get(j-1);
          allUserInput.set(j-1,allUserInput.get(j));
          allUserInput.set(j,t);
        }
        
      }
    }
    
    int mode = allUserInput.get(0);
    System.out.println(mode);
    
  }
}

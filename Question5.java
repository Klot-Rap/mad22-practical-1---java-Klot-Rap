import java.util.Scanner;import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    ArrayList<Integer> userNum = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    
    //System.out.print("Enter integer: ");
    int counter = sc.nextInt();

    for(int i = 0; i < counter; i++){
      //System.out.print("Enter another integer: ");
      userNum.add(sc.nextInt());
    }

    

    int count1 = 0;
    int count2 = 0;
    int mode1 = 0;
    int mode2 = 0;

    for (int m = 0; m < userNum.size(); m++){
      
      mode1 = userNum.get(m);
      count1 = 0;
      
      for(int j = m + 1; j < userNum.size();j++){
        if (mode1 == userNum.get(j)) count1++;
      }
      if (count1 > count2){
        mode2 = mode1;
        count2 = count1;
      }  
      
    }

    System.out.print(mode2);
    
  }
}

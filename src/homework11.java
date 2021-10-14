import java.util.Scanner;

public class homework11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      //Prompt the user for input
      System.out.print("Enter an integer for seconds: ");
      int seconds = input.nextInt();
      int minutes = seconds/60 ; //Find minutes in seconds
      int remainingSeconds = seconds%60; //seconds remaining
      
      System.out.println(seconds+" sseconds is "+minutes+
    	" minutes and "+ remainingSeconds +" seconds");
	}

}

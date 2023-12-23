package CodSoft;
import java.util.Random;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**Hello everyone** \n Lets play a game where you have to Enter a random number from 1 to 100 \n If it matches with the system generated number then \n you will win** ");
		
	    lets_Play();
	    System.out.println("If You want to play again : Press 1");
		int p = sc.nextInt();
		if(p==1) {
			lets_Play();
		}
	    sc.close();	
	}
	
	public static void lets_Play() {
		boolean win=false;
		int count = 3;
		System.out.println("So Let's Play the game");
		while(!win) {
		
			Random random = new Random();
			Scanner sc = new Scanner(System.in);
			
					
			System.out.println("Enter a number");
			int n = sc.nextInt();
			
			int m = random.nextInt(100);

			System.out.println("The System generated number is "+m);
			if(count==1) {
				win = true;
				System.out.println("****************You failed**********************");
				break;
			}
			
			if(m==n) {
				win = true;
				System.out.println("*****************Congratulations You Won*************");
				System.out.println("Your Score is: " + count);
			}
			else{
				win = false;
				count--;
				System.out.println("Wrong Answer , Better Luck Next Time");
				System.out.println();
			}
		
		}
	  System.out.println("***Thanks for Playing***");
	  
	}
	
}

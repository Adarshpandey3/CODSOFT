package CodSoft;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Subjects");
		int n = sc.nextInt();
		
		int subject[] = new int [n];
		for ( int i=0;i<n;i++) {
			int j = i+1;
			System.out.println("Enter the Marks of Subject" + j);
			subject[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int j=0;j<n;j++) {
			sum = sum + subject[j];
		}
		System.out.println("Total Marks = " + sum);
		double avgPer = sum/n;
		System.out.println("Percentage = "+ avgPer);
		grades(avgPer);
		sc.close();
	}
	
	public static void grades(double per) {
		if(40>per&&per>30) {
			System.out.println("Grade D");
		}
		else if(per>30&&per<=50) {
			System.out.println("Grade C");
		}
		else if(60>per&&per>40) {
			System.out.println("Grade B");
		}
		else if(per>60) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("Failed**");
		}
		
	}
	

}

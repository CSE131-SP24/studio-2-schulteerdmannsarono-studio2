package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Starting Amount of Money?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is the win probability?");
		double winChance = in.nextDouble();
				
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		
		
		
		
		
		
		
		
		//for(double count = startAmount; count <= winLimit && count >= 0; count++);
		boolean win = false;
	while(!win)
		{
			double winningValue= Math.random()*(100-1+1)+1;
			if(winningValue <= winChance)
			{
				win= true;
			System.out.println("win");
			}
			else {
				System.out.println("lose");
			}
		}
		
	
		
	}

}

package ua.lviv.lgs;

import java.util.Scanner;

public class MyThread extends Thread
{
	Scanner scan = new Scanner(System.in);
	
	private void fibonacci()
	{
		int amount = scan.nextInt();
		
//		scan.close();
		
		StringBuilder numbers = new StringBuilder();
		
		int number1 = 1;
		int number2 = 1;
		
		for(int i = 0; i < amount; i++)
		{
			numbers.append(((Integer) number1).toString() + " ");
			
			int placeHolder = number1;
			
			number1 = number2;
			number2 = number2 + placeHolder;
		}
		
		System.out.println(numbers.toString());
	}
	
	@Override
	public void run()
	{
		fibonacci();
	}
}

package ua.lviv.lgs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main 
{

	public static void main(String[] args) 
	{

		
		//First part
		System.out.println("Please Enter amount of numbers");
		
		MyThread thread1 = new MyThread();
		thread1.start();
		
		Thread thread2 = new Thread(new RunnableThread());
		thread2.start();


		//Second Part	
		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i = 0; i < 3; i++)
		{
			executorService.execute(new RunnableThread());
		}
		executorService.shutdown();
		
		executorService = Executors.newFixedThreadPool(2);//2 - number of available threads
		for(int i = 0; i < 3; i++)
		{
			executorService.execute(new RunnableThread());
		}
		executorService.shutdown();
		
		executorService = Executors.newSingleThreadExecutor();//only one thread available
		for(int i = 0; i < 3; i++)
		{
			executorService.execute(new RunnableThread());
		}
		executorService.shutdown();
		
	}
		
}

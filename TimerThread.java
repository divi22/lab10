package lab10;

import java.time.LocalTime;
import java.util.Scanner;

public class TimerThread implements Runnable {
	static int n;
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter the number of time you want to repeat the timer:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TimerThread tt=new TimerThread();
		Thread t1=new Thread(tt);
		t1.start();
		sc.close();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			LocalTime time=LocalTime.now();
			System.out.println("Current time:"+time);
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println("Done");
		}
		
	}

}

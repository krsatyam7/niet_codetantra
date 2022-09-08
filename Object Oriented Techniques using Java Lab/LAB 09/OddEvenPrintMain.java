package q124;
import java.util.Scanner;
public class OddEvenPrintMain{
	boolean odd;
	int count = 1;
	static int MAX;
	//int MAX = 20;
	public void printOdd(){
		synchronized (this){
			while(count<MAX){
				System.out.println("Checking odd loop");
				while(!odd){
					try{
						System.out.println("Odd waiting : " + count);
						wait();
						System.out.println("Notified odd :" + count);
					}
					catch(InterruptedException e){
						//TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread :" + count);
				count++;
				odd = false;
				notify();
			}
		}
	}
	public void printEven(){
		try{
			Thread.sleep(20);
		}
		catch(InterruptedException e1){
			e1.printStackTrace();
		}
		synchronized(this){
			while(count<MAX){
				System.out.println("Checking even loop");
				while(odd){
					try{
						System.out.println("Even waiting: " + count);
						wait();
						System.out.println("Notified even:" + count);
					}
					catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				System.out.println("Even thread :" + count);
				count++;
				odd = true;
				notify();
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter MAX value: ");
		MAX = sc.nextInt();
		OddEvenPrintMain oep = new OddEvenPrintMain();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run(){
				oep.printEven();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run(){
				oep.printOdd();
			}
		});
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

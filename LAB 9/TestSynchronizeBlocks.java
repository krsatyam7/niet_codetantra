//JAVA program to synchronize the threads by using Synchronize statements and Synchronize block
//Read input from the user
package q125;
import java.util.Scanner;
class Table{
	void printTable(){
		synchronized(this){
			System.out.println("-----Current Thread:"+Thread.currentThread().getName()+"-------");
			System.out.print("enter number to print its table:");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			for(int i=1;i<=5;i++){
				System.out.println(n*i);
				try{
					Thread.sleep(100);
				}
				catch(Exception e){
					System.out.println(e);
				}}}
				
			}
		}
		class MyThread1 extends Thread{
			Table t;
			MyThread1(Table t){
				this.t=t;
			}
			public void run(){
				t.printTable();
			}
		}
		class MyThread2 extends Thread{
			Table t;
			MyThread2(Table t){
				this.t=t;
			}
			public void run(){
				t.printTable();
			}
		}
		public class TestSynchronizedBlock1{
			public static void main(String args[]){
				Table obj=new Table();
				MyThread1 t1=new MyThread1(obj);
				MyThread2 t2=new MyThread2(obj);
				t1.start();
				t2.start();
			}
		}

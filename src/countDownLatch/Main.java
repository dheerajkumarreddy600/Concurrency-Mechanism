package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Main {
	 public static void main(String args[]) {
	  
	      CountDownLatch countDownLatch = new CountDownLatch(4);

	      Thread thread1 = new Thread(new Application("1",  countDownLatch));
	      Thread thread2= new Thread(new Application("2",  countDownLatch));          
	      Thread thread3 = new Thread(new Application("3",  countDownLatch));
	      Thread thread4 = new Thread(new Application("4",  countDownLatch));  
	      
	      thread1.start();
	      thread2.start();
	      thread3.start();
	      thread4.start();

	      try {
	         
	         countDownLatch.await();            
	        
	         System.out.println("All applications are up and running.");
	      } catch(InterruptedException e) {
	         System.out.println(e.getMessage());
	      }        
	   }
	}

	class Application implements Runnable {
	   private String name;
	   private CountDownLatch countDownLatch;

	   public Application(String name, CountDownLatch countDownLatch) {
	      this.name = name;
	      this.countDownLatch = countDownLatch;
	   }

	   public void run() {
	      try {
	         System.out.println(name + " started. ");
	         Thread.sleep(1000);
	      } catch (InterruptedException e) {
	         System.out.println(e.getMessage());
	      }
	      System.out.println( name + " is Up and running.");
	    
	      countDownLatch.countDown();    
	   }
}

package cyclicBarrier;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier {
	

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " has started");
				
				CyclicBarrier barrier = new CyclicBarrier(4);
				
				Barrier p1 = new Barrier(1000, barrier, "1");
				Barrier p2 = new Barrier(2000, barrier, "2");
				Barrier p3 = new Barrier(3000, barrier, "3");
				Barrier p4 = new Barrier(4000, barrier, "4");
				p1.start();
				p2.start();
				p3.start();
				p4.start();
				
				System.out.println(Thread.currentThread().getName() + " has finished");
}

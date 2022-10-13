package cyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Barrier implements Runnable {
	private int duration;
	private CyclicBarrier barrier;

	public Barrier(int duration, CyclicBarrier barrier, String pname) {
		super();
		this.duration = duration;
		this.barrier = barrier;
	}

	
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName());
			
			int await = barrier.await();
			if(await == 0) {
				System.out.println("going to start..");	
			}
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}

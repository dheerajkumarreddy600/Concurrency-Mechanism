package blockingQueue;

public class Consumer  implements Runnable{
    BlockingQueue<String> blockingQueue = null;
	
	public Consumer(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}
	
	@Override
	public void run() {
		while(true) { 
			try {
				String element = this.blockingQueue.take();
				System.out.println("Consumedd element -> "+element);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

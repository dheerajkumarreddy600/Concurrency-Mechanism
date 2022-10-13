package blockingQueue;

public class Producer implements Runnable {
	BlockingQueue<String> blockingQueue = null;

	public Producer(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	
	public void run() {
		while (true) {
			long timeMillis = System.currentTimeMillis();

			try {
				this.blockingQueue.put("" + timeMillis);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

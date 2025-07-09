package concurrency.producerConsumerProblem;

public class ConsumerThread implements Runnable {
 private final SharedResource sharedResource;
 
 public ConsumerThread(SharedResource sr) {
	 this.sharedResource = sr;
 }
	@Override
	public void run() {
		for(int i = 0; i<10;i++) {
			try {
				sharedResource.consume();
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

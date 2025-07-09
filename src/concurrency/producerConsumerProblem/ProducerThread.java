package concurrency.producerConsumerProblem;

public class ProducerThread implements Runnable {
    private final SharedResource sharedResource;
    
    public ProducerThread(SharedResource sr) {
    	this.sharedResource = sr;
    }
	@Override
	public void run() {
		
	for(int i =0 ; i< 10 ; i++) {
		try {
			sharedResource.produce(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	}

}

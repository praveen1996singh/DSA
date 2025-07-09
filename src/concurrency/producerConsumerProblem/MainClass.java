package concurrency.producerConsumerProblem;

public class MainClass {

	public static void main(String[] args) {
		SharedResource sr = new SharedResource(5);
		Thread producerThread = new Thread(new ProducerThread(sr));
		
		Thread consumerThread = new Thread(new ConsumerThread(sr));
		
		producerThread.start();
		consumerThread.start();
	}
}

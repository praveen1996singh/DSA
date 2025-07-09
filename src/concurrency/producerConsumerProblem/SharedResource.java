package concurrency.producerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
	
	private final int maxSize;
	private final Queue<Integer> queue = new LinkedList<>();
	public SharedResource(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public  synchronized void produce(int value) throws InterruptedException {
		if(queue.size() == maxSize)
			wait();
		
		queue.add(value);
		System.out.println("Produced : "+ value);
		notifyAll();
	}
	
	public synchronized void consume() throws InterruptedException{
		if(queue.isEmpty())
			wait();
		
		System.out.println("Consumed :: "+queue.poll());
		notifyAll();
	
	}

}

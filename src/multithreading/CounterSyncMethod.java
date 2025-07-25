package multithreading;

public class CounterSyncMethod {
	private int count = 0;
	public synchronized void increament() {
		System.out.println("Synchronized Method - Start Increament ::"+Thread.currentThread().getName());
		
		count++;
		
		System.out.println("Synchronized Method - count value after Increament ::"+count);
		
		System.out.println("Synchronized Method - End Increament ::"+Thread.currentThread().getName());
	}

	public int getCount() {
		return count;
	}
}

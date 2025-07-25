package multithreading;

public class ConcurrencyTest {
	
	public static void main(String[] args) {
		CounterSyncMethod counter = new CounterSyncMethod();
		Thread[] threadArray = new Thread[5];
		
		for(int i = 0; i< 5; i++) {
			threadArray[i] = new Thread(()->{
				counter.increament();
			},"Thread-"+ i+1);
			
			threadArray[i].start();
		}
		
	}

}

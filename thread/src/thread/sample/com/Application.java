package thread.sample.com;

public class Application {

	public static void main(String[] args) {
	//Extends based method
		ThreadSample thread_1 = new ThreadSample();
		thread_1.setDaemon(true);
		thread_1.start();

	//Implements runnable method
		RunnableThread runnable = new RunnableThread();
		Thread thread_2 = new Thread(runnable);
		thread_2.setDaemon(true);
		thread_2.start();
		
		 for (int i=0;i<=5;i++){
	            System.out.println("== "+Thread.currentThread().getName()+" == "+i);
	        }
	//end main thread
		 System.out.println("*********************");
	}

}

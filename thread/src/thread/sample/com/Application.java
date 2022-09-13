package thread.sample.com;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSample thread_1 = new ThreadSample();
		thread_1.start();
		for(int j=0; j<50; j++) {
		System.out.println("main : "+j);
		}
	}

}

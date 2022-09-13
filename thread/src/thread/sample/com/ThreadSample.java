package thread.sample.com;

public class ThreadSample extends Thread {
@Override
public void start() {
	System.out.println("start child process...");
	super.start();
}
@Override
public void run() {
	for(int i=0; i<=100; i++) {
		System.out.println("child : "+i);
	}
}
}

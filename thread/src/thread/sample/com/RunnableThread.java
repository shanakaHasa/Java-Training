package thread.sample.com;

public class RunnableThread implements Runnable{
	 public void run(){
	        for (int i=0;i<=150;i++){
	            System.out.println("Runnable : "+i);
	        }

	    }
}

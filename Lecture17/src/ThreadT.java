
public class ThreadT extends Thread{

	public void run(){
		System.out.println("Thread running");
		for(int i=0;i<10;i++){
			System.out.println(getName());
			System.out.println(getState());
			System.out.println(isDaemon());
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args){
		ThreadT t = new ThreadT();
		t.start();
		
		
	}
}

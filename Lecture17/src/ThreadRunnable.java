
public class ThreadRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(new Thread(new ThreadRunnable())).start();
		ThreadRunnable t1 = new ThreadRunnable();
		Thread t = new Thread(t1);
		t.setName("name");
		t.start();
		for(int i=0;i<10;i++){
			System.out.println(t.getName());
			System.out.println(t.getState());
			System.out.println(t.isDaemon());
			try {
				t.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run");
		
	}

}

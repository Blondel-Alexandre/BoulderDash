package model;


public class GameLoop implements Runnable{
	public static boolean res = true;

	public void run() {
		
		int attente =15;
		while(res == true) {
			double start = System.nanoTime();
			double timePassed = System.nanoTime() - start;
			int wait = (int) (attente - timePassed/1000000);
			if (wait< 0) wait =0;
			
			try{
				Thread.sleep(wait);
			}
			catch(Exception e) {
				e.printStackTrace();
			}

			
		}
	}

}


package threadDemo;

public class OddNumberThread extends Thread{

	private ThreadEvenOdd obj;
	
	public OddNumberThread(ThreadEvenOdd obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.generateOddNumber();
	}

}

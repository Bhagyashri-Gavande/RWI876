package threadDemo;

public class EvenNumberThread extends Thread{
	
	private ThreadEvenOdd obj;
	
	public EvenNumberThread(ThreadEvenOdd obj){
		this.obj = obj;
	}
	
	public void run(){
		obj.generateEvenNumbers();
	}
}

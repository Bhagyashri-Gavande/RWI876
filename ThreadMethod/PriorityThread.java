package ThreadMethodDemo;

class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}

	public void run(){
		int i = 34;
		//while(true){
		System.out.println("Thank you.."+this.getName());
		//}
	}
}
	
public class PriorityThread{
	public static void main(String[] args) {
		
		MyThr t1 = new MyThr("Bhagya1 (less imp)");
		MyThr t2 = new MyThr("Bhagya2");
		MyThr t3 = new MyThr("Bhagya3");
		MyThr t4 = new MyThr("Bhagya4");
		MyThr t5 = new MyThr("Bhagya5 (most important)");
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}

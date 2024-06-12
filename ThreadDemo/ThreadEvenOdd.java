package threadDemo;

public class ThreadEvenOdd {
	public static int N = 10;
	int count = 1;
	 
	public void generateEvenNumbers()
	{
		synchronized (this){
			while(count < N){
				while(count%2==1){
					try{
						wait();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				System.out.println("Even number thread : "+count);
				count++;
				notify();
			}
		}
	}
	public void generateOddNumber()
	{
		synchronized (this){
			while(count < N){
				while(count%2==0){
					try{
						wait();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				System.out.println("Odd number thread : "+count);
				count++;
				notify();
			}
		}
	}
	public static void main(String[] args){
		ThreadEvenOdd obj = new ThreadEvenOdd();
		
		EvenNumberThread t1 = new EvenNumberThread(obj);
		OddNumberThread t2 = new OddNumberThread(obj);
		
		t1.start();
		t2.start();
		
	}
}

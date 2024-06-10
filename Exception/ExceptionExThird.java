package exceptionDemo;
import java.io.File;   
import java.util.Scanner; 
public class ExceptionExThird {

		public static void main(String[] args) {
			 try {  
		            File file = new File("First.txt");  
		            Scanner sc = new Scanner(file);  
		        } catch (Exception e) {    
		        	e.printStackTrace();
		        }  

		}

	}




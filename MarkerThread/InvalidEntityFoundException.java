package markerInterfaceDemo;

public class InvalidEntityFoundException extends Exception {

	private static final long serialVersionUID = 7458376893476937L;
	
	
	public InvalidEntityFoundException(String message){
		super(message);
	}
}

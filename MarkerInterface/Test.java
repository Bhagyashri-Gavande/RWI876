package markerInterfaceDemo;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee();
		try{
			new MarkerEntityService().save(emp);
		}
		catch(InvalidEntityFoundException e)
		{
			e.printStackTrace();
		}
	}

}

package markerInterfaceDemo;

public class MarkerEntityDAO {

	public boolean save(Object object) throws InvalidEntityFoundException {
		boolean isSaved = false;
		if(!(object instanceof MarkerEntity)){
			throw new InvalidEntityFoundException("Invalid exceptiopn found");
		}
		else{
			System.out.println("Object saved in database..");
			isSaved = true;
		}
		return isSaved;
	}

}

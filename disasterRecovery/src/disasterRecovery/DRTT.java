package disasterRecovery;

public class DRTT {
	// create the disaster recovery objects

	// Attributes
	private int drttID;
	private String drttName;
	private String drttDesc;
	
	public DRTT() {
		drttID = 0;
		drttName = "UNKNOWN";
		drttDesc = "UNKNOWN";
	}
	
	public DRTT(int id, String name, String desc) {
		setID(id);
		setName(name);
		setDesc(desc);
	}
	
	// Setters
	private void setID(int id) {
		drttID = id;
	}
	
	private void setName(String name) {
		drttName = name;
	}
	
	private void setDesc(String desc) {
		drttDesc = desc;
	}
	

}

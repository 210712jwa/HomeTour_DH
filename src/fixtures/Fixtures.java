package fixtures;

public abstract class Fixtures {

	public String fName;
	public String fShortDes;
	public String fLongDes;
		// TODO Auto-generated constructor stub
		// This abstract class will be used as a base for anything that can be looked at
		// or interacted with.

	public Fixtures(String fName, String fShortDes, String fLongDes) {
		//super();
		this.fName = fName;
		this.fShortDes = fShortDes;
		this.fLongDes = fLongDes;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfShortDes() {
		return fShortDes;
	}

	public void setfShortDes(String fShortDes) {
		this.fShortDes = fShortDes;
	}

	public String getfLongDes() {
		return fLongDes;
	}

	public void setfLongDes(String fLongDes) {
		this.fLongDes = fLongDes;
	}



}

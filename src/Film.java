import java.io.Serializable;

public class Film implements Serializable {
	private String fName;
	private int fYear;
	private String fZhanr;
	private String fQuality;
	
	public Film(String fName, int fYear, String fZhanr, String fQuality) {
		this.fName = fName;
		this.fYear = fYear;
		this.fZhanr = fZhanr;
		this.fQuality = fQuality;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getfYear() {
		return fYear;
	}
	public void setfYear(int fYear) {
		this.fYear = fYear;
	}
	public String getfZhanr() {
		return fZhanr;
	}
	public void setfZhanr(String fZhanr) {
		this.fZhanr = fZhanr;
	}
	public String getfQuality() {
		return fQuality;
	}
	public void setfQuality(String fQuality) {
		this.fQuality = fQuality;
	}
	@Override
	public String toString() {
		return "Film - " + fName + ", " + fYear + ", " + fZhanr + ", " + fQuality + "\n";
	}
	
	public String toStrings() {
		return "Film - " + fName + ", " + fYear + ", " + fZhanr + ", " + fQuality + "\n";
	}
}

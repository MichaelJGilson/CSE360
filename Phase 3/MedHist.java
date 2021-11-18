package hospitalCSE360;

import java.util.Date;

public class MedHist{
	
	private String username;
	private String pain;
	private String tiredness;
	private String nausea;
	private String depression;
	private String anxiety;
	private String drowsiness;
	private String appetite;
	private String wellbeing;
	private String shortnessOfBreath;
	
	private Date medDate;
	
	public MedHist(String username, String pain, String tiredness, String nausea, String depression, String anxiety, String drowsiness, String appetite, 
				   String wellbeing, String shortnessOfBreath){
		super();
		this.username = username;
		this.pain = pain;
		this.tiredness = tiredness;
		this.nausea = nausea;
		this.depression = depression;
		this.anxiety = anxiety;
		this.drowsiness = drowsiness;
		this.appetite = appetite;
		this.wellbeing = wellbeing;
		this.shortnessOfBreath = shortnessOfBreath;
		medDate = new Date();
	}
	
	
	//getters
	public String getUsername() {
		return username;
	}

	public String getPain() {
		return pain;
	}
	
	public String getTiredness() {
		return tiredness;
	}
	
	public String getNausea() {
		return nausea;
	}
	
	public String getDepression() {
		return depression;
	}
	
	public String getAnxiety() {
		return anxiety;
	}
	
	public String getDrowsiness() {
		return drowsiness;
	}
	
	public String getAppetite() {
		return appetite;
	}
	
	public String getWellbeing() {
		return wellbeing;
	}

	public String getShortnessOfBreath() {
		return shortnessOfBreath;
	}
	
	public Date getMeddate() {
		return medDate;
	}
	
	//setters
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPain(String pain) {
		this.pain = pain;
	}

	public void setTiredness(String tiredness) {
		this.tiredness = tiredness;
	}

	public void setNausea(String nausea) {
		this.nausea = nausea;
	}

	public void setDepression(String depression) {
		this.depression = depression;
	}

	public void setAnxiety(String anxiety) {
		this.anxiety = anxiety;
	}

	public void setDrowsiness(String drowsiness) {
		this.drowsiness = drowsiness;
	}

	public void setAppetite(String appetite) {
		this.appetite = appetite;
	}

	public void setWellbeing(String wellbeing) {
		this.wellbeing = wellbeing;
	}

	public void setShortnessOfBreath(String shortnessOfBreath) {
		this.shortnessOfBreath = shortnessOfBreath;
	}

	public void setMedDate(Date medDate) {
		this.medDate = medDate;
	}
	
}

package hospitalCSE360;

import java.util.List;

public class MedicalRecord{
	
	private String username;
	private List<MedHist> medHist;
	private List<BodyPartEffected> bodyPart;
	private List<Appointment> appointments;
	
	public MedicalRecord(String username, List<MedHist> medHist, List<BodyPartEffected> bodyPart, List<Appointment> appointments){
		super();
		this.username = username;
		this.medHist = medHist;
		this.bodyPart = bodyPart;
		this.appointments = appointments;
	}
	
	public String getUsername(){
		return username;
	}

	public List<MedHist> getMedHist(){
		return medHist;
	}

	public List<BodyPartEffected> getBodyPart(){
		return bodyPart;
	}

	public List<Appointment> getAppointments(){
		return appointments;
	}
}

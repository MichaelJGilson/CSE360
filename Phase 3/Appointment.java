package hospitalCSE360;

public class Appointment{
	
	private String date;
	private String username;
	private DoctorNurse doctor;
	
	public Appointment(String date, String username, DoctorNurse doctor){
		super();
		this.date = date;
		this.username = username;
		this.doctor = doctor;
	}
	
	public String getDate(){
		return date;
	}

	public String getUsername(){
		return username;
	}

	public DoctorNurse getDoctor(){
		return doctor;
	}
	
	/*
	public String getDoctorName() {
		
	}
	
	public String getPatientName() {
		
	}
	*/
	
}

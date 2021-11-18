import java.util.ArrayList;

// Header for the Patient  Class File

public class PatientClass extends User{
	//Pharmacy pharmacy;
	//ArrayList<MedHist> medicalHistory;
	DoctorNurse associatedDoctorNurse;
	ArrayList<String> messageList;
	String appointmentDate;
	
	public PatientClass(String name, String email, String phoneNum, String address, String password, String dateOfBirth, String dateOfVisit, Pharmacy pharmacyName, DoctorNurse docNurse){
		super(name, email, phoneNum, address, password, dateOfBirth, dateOfVisit);
		//pharmacy = pharmacyName;
		associatedDoctorNurse = docNurse;
		//medicalHistoryList = new ArrayList<MedHist>();
	}
	
	//getters
	
	/*
	public Pharmacy getPharmacy(){
		return pharmacy;
	}
	*/
	
	public Doctor getDoctor(){
		return associatedDoctorNurse;
	}
	
	public ArrayList<String> getMessageList(){
		return messageList;
	}
	
	public String getAppointmentTime() {
		return appointmentDate;
	}
	
	//acts as an inbox of messages 
	public void messageInbox(ArrayList<String> inbox){
		messageList = inbox;
	}
	
	//opens javaFX messaging page where the Doctor can select patient to view message history and send messages
	public void messageDoctor(String message){
		messageList.add(message);
	}
	
	//patient previous medical records like their medications and immunizations would be stored here and can be printed if needed.
	public static void printRecord(){
		
	}
}

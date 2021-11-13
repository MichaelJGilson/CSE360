// Header for the Doctor and Nurse Class File

//Doctor Class creation
// THIS IS THE FUNCTIONING PROTOTYPE FOR PHASE II REQUIREMENTS

import java.util.*;

public class DoctorNurse extends User{
	
	  int adminID; 
	  String hospital, specialization;
	  ArrayList<PatientClass> patientList;
	  
	  //constructor
	  public DoctorNurse(String name, String email, String phoneNum, String address, String password, String hosptialName){
		  super(name, email, phoneNum, address, password);
		  hospital = hosptialName;
		  patientList =  new ArrayList<PatientClass>();
	  }
	  
	  //getters
	  public String getHospital(){
		  return hospital;
	  }
	  public ArrayList<PatientClass> getPatientList(){
		  return patientList;
	  }
	  
	  //setters
	  public void setHosptial(String newHospital){
		  hospital = newHospital;
	  }
}

/* Doc class will include the following functions:

functions:

login(using doctorID)

  opens the javaFX login page
  asks user for id
  checks if id is correct
  
    if true
      allow user access to adminPanel
    if false
      print error
*/

//Nurse Class creation

/*
public class Nurse {
  int adminID;
}
*/

/*
functions:

login(using nurseID)

  opens the javaFX login page
  asks user for id
  
  checks if id is correct
  
     if true
      allow user access to adminPanel
     if false
      print error
*/


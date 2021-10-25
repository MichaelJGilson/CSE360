// Header for the Patient Panel Class File

//PatientPanel Class creation
/* Patient Panel class will include the following functions and vars:
ID - int

functions:
patientloginPage(using patientID)
  opens the javaFX login page
  asks user for id
  checks if id is correct
  
    if true
      allow user access to contact information and record of summary of patient visit
    if false
      print error
      
 messageUser():
  opens javaFX messaging page where the Doctor can select patient to view message history and send messages
  
 PatientMessageWindow():
    after successfully loggin in their portal patient can send message to doctor and nurse about health issues. 
 
 accountCreationWindow() :
    allows user to create new account
      asks and stores users first name
      asks and stores users last name
      asks and stores users birthday 
    
      if all information is finalized 
        account succesfully created
      else 
        if invalid data type, retry

editRecordWindow() : 
  asks user( 1 for first name, 2 for last name, 3 for birthday) what information they want to edit
    
    int c 
    
    switch(c)
    
      if case = 1 
          edit user first name
      if case = 2 
          edit user last name
      if case = 3
          edit user birthday
   
